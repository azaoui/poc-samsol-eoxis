package fr.grouperatp.samsol.model;


import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "DiagnosticDataTransmission", namespace = "http://example.com/ddt")
public class DiagnosticDataTransmission {

    @XmlAttribute(name = "schemaVer")
    private String schemaVer;

    @XmlAttribute(name = "id")
    private String id;

    @XmlElement(name = "Header", namespace = "http://example.com/ddt")
    private Header header;

    @XmlElement(name = "History", namespace = "http://example.com/ddt")
    private History history;

    // getters and setters
}



