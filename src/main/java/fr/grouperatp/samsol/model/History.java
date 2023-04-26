package fr.grouperatp.samsol.model;
import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "History", namespace = "http://example.com/ddt")
public class History {

    @XmlAttribute(name = "cnt")
    private String cnt;

    @XmlAttribute(name = "fTs")
    private String fTs;

    @XmlAttribute(name = "lTs")
    private String lTs;

    @XmlElement(name = "Evt", namespace = "http://example.com/ddt")
    private List<Evt> evt;

    // getters and setters
}








