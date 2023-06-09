package fr.grouperatp.samsol.model.sample;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
@XmlRootElement(name = "employees")
public class Employees {

    private List<Employee> employees;

    public Employees() {}

    public Employees(List<Employee> employees) {
        this.employees = employees;
    }

    @XmlElement(name = "employee")
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

}

