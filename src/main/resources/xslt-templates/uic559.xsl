<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:ddt="http://example.com/ddt">
  
  <xsl:output method="xml" indent="yes"/>
  
  <!-- Match the root element of the source XML file -->
  <xsl:template match="/">
    <xsl:apply-templates select="ddt:DDT"/>
  </xsl:template>
  
  <!-- Match the DDT element of the source XML file -->
  <xsl:template match="ddt:DDT">
    <DiagnosticDataTransmission schemaVer="1.0" id="{@id}">
      <xsl:apply-templates select="ddt:Header"/>
      <xsl:apply-templates select="ddt:History"/>
    </DiagnosticDataTransmission>
  </xsl:template>
  
  <!-- Match the Header element of the source XML file -->
  <xsl:template match="ddt:Header">
    <Header operator="{@operator}" dType="{@dType}" dId="{@dId}" veh="{@veh}" cTs="{@cTs}" counter="{@counter}" diagVer="{@diagVer}" releaseType="{@releaseType}">
      <DUnits dNb="{ddt:DUnits/@dNb}" myDPos="{ddt:DUnits/@myDPos}">
        <xsl:apply-templates select="ddt:DUnits/ddt:DUnit"/>
      </DUnits>
    </Header>
  </xsl:template>
  
  <!-- Match the DUnit element of the source XML file -->
  <xsl:template match="ddt:DUnit">
    <DUnit dPos="{@dPos}" dId="{@dId}" timetableNb="{@timetableNb}" leadVeh="{@leadVeh}">
      <xsl:apply-templates select="ddt:Vehicle"/>
    </DUnit>
  </xsl:template>
  
  <!-- Match the Vehicle element of the source XML file -->
  <xsl:template match="ddt:Vehicle">
    <Vehicle id="{@id}"/>
  </xsl:template>
  
  <!-- Match the History element of the source XML file -->
  <xsl:template match="ddt:History">
    <History cnt="{@cnt}" fTs="{@fTs}" lTs="{@lTs}">
      <xsl:apply-templates select="ddt:Evt"/>
    </History>
  </xsl:template>
  
  <!-- Match the Evt element of the source XML file -->
  <xsl:template match="ddt:Evt">
    <Evt id="{@id}" lv="{@lv}" veh="{@veh}" st="{@st}" gTs="{@gTs}" dTs="{@dTs}" oSt="{@oSt}" tNb="{@tNb}">
      <xsl:apply-templates select="ddt:EnvD"/>
    </Evt>
  </xsl:template>
  
  <!-- Match the EnvD element of the source XML file -->
  <xsl:template match="ddt:EnvD">
    <EnvD>
      <xsl:value-of select="."/>
    </EnvD>
  </xsl:template>
  
</xsl:stylesheet>
