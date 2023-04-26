<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:output method="xml" indent="yes"/>

    <xsl:template match="/">
        <employees>
            <xsl:for-each select="employees/employee">
                <employee>
                    <id><xsl:value-of select="id"/></id>
                    <name><xsl:value-of select="name"/></name>
                    <salary><xsl:value-of select="salary"/></salary>
                </employee>
            </xsl:for-each>
        </employees>
    </xsl:template>

</xsl:stylesheet>
