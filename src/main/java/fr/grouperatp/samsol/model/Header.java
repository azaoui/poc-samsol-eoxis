package fr.grouperatp.samsol.model;

import lombok.Data;

import javax.xml.bind.annotation.*;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Header", namespace = "http://example.com/ddt")
public class Header {

    @XmlAttribute(name = "operator")
    private String operator;

    @XmlAttribute(name = "dType")
    private String dType;

    @XmlAttribute(name = "dId")
    private String dId;

    @XmlAttribute(name = "veh")
    private String veh;

    @XmlAttribute(name = "cTs")
    private String cTs;

    @XmlAttribute(name = "counter")
    private String counter;

    @XmlAttribute(name = "diagVer")
    private String diagVer;

    @XmlAttribute(name = "releaseType")
    private String releaseType;

    @XmlElement(name = "DUnits", namespace = "http://example.com/ddt")
    private DUnits dUnits;

}
