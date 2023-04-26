package fr.grouperatp.samsol.config;

import fr.grouperatp.samsol.model.sample.Employee;
import fr.grouperatp.samsol.model.sample.Employees;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.camel.dataformat.bindy.csv.BindyCsvDataFormat;
import org.apache.camel.util.xml.StringSource;
import org.springframework.context.annotation.Configuration;

import javax.xml.bind.JAXB;
import java.io.StringWriter;
import java.util.ArrayList;

@Configuration
public class CsvToXMRouteConfig extends RouteBuilder {


    @Override
    public void configure(){

        BindyCsvDataFormat employeeDataFormat = new BindyCsvDataFormat(Employee.class);


        JaxbDataFormat jaxbDataFormat = new JaxbDataFormat();
        jaxbDataFormat.setContextPath(Employees.class.getPackage().getName());
        jaxbDataFormat.setPrettyPrint(true);
        jaxbDataFormat.setSchema("classpath:xsd/employees.xsd");


        from("file:{{csv.input.location}}?noop=true")
                .log("File reading completed; now transforming data...")

                // Unmarshal CSV data into ArrayList
                .unmarshal(employeeDataFormat)
                .log("CSV data transformed to ArrayList: ${body}")

                // Convert ArrayList to XML using XSLT
                .process(exchange -> {
                    ArrayList<Employee> employees = exchange.getIn().getBody(ArrayList.class);
                    StringWriter writer = new StringWriter();
                    JAXB.marshal(new Employees(employees), writer);
                    String xml = writer.toString();
                    exchange.getIn().setBody(new StringSource(xml));
                })
                .to("xslt:xslt-templates/csvToXml.xsl")
                .log("Data transformed using XSLT: ${body}")
                .to("validator:xsd/employees.xsd")

                // Write output to file
                .to("file:{{csv.output.location}}?fileName=employees.xml");
    }

}
