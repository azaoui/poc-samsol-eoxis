package fr.grouperatp.samsol.model;
import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "DUnits", namespace = "http://example.com/ddt")
public class DUnits {

    @XmlAttribute(name = "dNb")
    private String dNb;

    @XmlAttribute(name = "myDPos")
    private String myDPos;

    @XmlElement(name = "DUnit", namespace = "http://example.com/ddt")
    private List<DUnit> dUnit;

    // getters and setters
}

