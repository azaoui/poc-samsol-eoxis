package fr.grouperatp.samsol.model;

import lombok.Data;

import javax.xml.bind.annotation.*;
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "DUnit", namespace = "http://example.com/ddt")
public class DUnit {

    @XmlAttribute(name = "dPos")
    private String dPos;

    @XmlAttribute(name = "dId")
    private String dId;

    @XmlAttribute(name = "timetableNb")
    private String timetableNb;

    @XmlAttribute(name = "leadVeh")
    private String leadVeh;

    @XmlElement(name = "Vehicle", namespace = "http://example.com/ddt")
    private Vehicle vehicle;

    // getters and setters
}
