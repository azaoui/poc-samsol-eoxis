package fr.grouperatp.samsol.model;
import lombok.Data;

import javax.xml.bind.annotation.*;
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Vehicle", namespace = "http://example.com/ddt")
public class Vehicle {

    @XmlAttribute(name = "id")
    private String id;
}
