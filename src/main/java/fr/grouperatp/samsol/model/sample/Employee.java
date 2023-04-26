package fr.grouperatp.samsol.model.sample;

import lombok.Data;
import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

import javax.xml.bind.annotation.*;

@Data

@CsvRecord(separator = ",", skipFirstLine = true)
@XmlRootElement(name = "employee")
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {

    @XmlElement(name = "id")
    @DataField(name = "id", pos = 1)
    public Integer id;

    @XmlElement(name = "name")
    @DataField(name = "name", pos = 2)
    public String name;

    @XmlElement(name = "salary")
    @DataField(name = "salary", pos = 3)
    public Integer salary;
}

