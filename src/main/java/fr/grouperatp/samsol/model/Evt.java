package fr.grouperatp.samsol.model;
import lombok.Data;

import javax.xml.bind.annotation.*;
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public  class Evt {
    @XmlAttribute
    private String id;
    @XmlAttribute
    private String lv;
    @XmlAttribute
    private String veh;
    @XmlAttribute
    private String st;
    @XmlAttribute
    private String gTs;
    @XmlAttribute
    private String dTs;
    @XmlAttribute
    private String oSt;
    @XmlAttribute
    private String tNb;
    @XmlElement(name = "EnvD")
    private String envD;

    // Constructor, getters, and setters
}

