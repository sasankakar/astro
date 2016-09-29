<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format">
    <xsl:template match="/">
        <fo:root xmlns:fo="http://www.w3.org/1999/XSL/Format">
            <fo:layout-master-set>
                <fo:simple-page-master master-name="simple"
                    page-height="8.5in" page-width="11in" margin-top=".5in"
                    margin-bottom=".5in" margin-left=".5in" margin-right=".5in">
                    <fo:region-body margin-top="2cm" margin-bottom="2cm" />
                    <fo:region-before extent="2cm" overflow="hidden" />
                    <fo:region-after extent="1cm" overflow="hidden" />
                </fo:simple-page-master>
            </fo:layout-master-set>
            <fo:page-sequence master-reference="simple"
                initial-page-number="1">
                <fo:static-content flow-name="xsl-region-before">
                    <fo:block font-size="13.0pt" font-family="serif"
                        padding-after="2.0pt" space-before="4.0pt" text-align="center"
                        border-bottom-style="solid" border-bottom-width="1.0pt">
                        <xsl:text>Worth of a Man</xsl:text>
                    </fo:block>
                </fo:static-content>
                <fo:static-content flow-name="xsl-region-after">
                    <fo:block font-size="12.0pt" font-family="sans-serif"
                        padding-after="2.0pt" space-before="2.0pt" text-align="center"
                        border-top-style="solid" border-bottom-width="1.0pt">
                        <xsl:text>Page</xsl:text>
                        <fo:page-number />
                    </fo:block>
                </fo:static-content>
                <fo:flow flow-name="xsl-region-body">
                    <xsl:apply-templates select="data" />
                </fo:flow>
            </fo:page-sequence>
        </fo:root>
    </xsl:template>
    <xsl:template match="data">
        <fo:block text-align="center">
            <fo:table table-layout="fixed" width="100%">
                <fo:table-column column-width="3in" />
                <fo:table-column column-width="2in" />
                <fo:table-column column-width="1in" />
                <fo:table-body>
                    <fo:table-row keep-together.within-page="always">
                        <fo:table-cell>
                            <fo:block font-size="10pt" font-family="sans-serif"
                                background-color="grey" color="white" text-align="left"
                                padding-top="3pt">
                                Field
							</fo:block>
                        </fo:table-cell>
                        <fo:table-cell>
                            <fo:block font-size="10pt" font-family="sans-serif"
                                background-color="grey" color="white" text-align="left"
                                padding-top="3pt">
                                Data Entered
							</fo:block>
                        </fo:table-cell>
                    </fo:table-row>
                </fo:table-body>
            </fo:table>
            <fo:table table-layout="fixed" width="100%">
                <fo:table-column column-width="3in" />
                <fo:table-column column-width="2in" />
                <fo:table-column column-width="1in" />
                <fo:table-body>
                    <fo:table-row keep-together.within-page="always">
                        <fo:table-cell>
                            <xsl:apply-templates select="field" />
                        </fo:table-cell>
                        <fo:table-cell>
                            <xsl:apply-templates select="data-entered" />
                        </fo:table-cell>
                    </fo:table-row>
                </fo:table-body>
            </fo:table>
            <fo:table table-layout="fixed" width="100%">
                <fo:table-column column-width="4.2in" />
                <fo:table-column column-width="2in" />
                <fo:table-column column-width="2in" />
                <fo:table-body>
                    <fo:table-row keep-together.within-page="always">
                        <fo:table-cell padding="2pt" border="1pt solid black">
                            <fo:block font-size="10pt" font-family="sans-serif"
                                space-after.optimum="1pt" background-color="red" color="white"
                                text-align="left" padding-top="3pt">
                                Measure
							</fo:block>
                        </fo:table-cell>
                        <fo:table-cell padding="2pt" border="1pt solid black">
                            <fo:block font-size="10pt" font-family="sans-serif"
                                space-after.optimum="1pt" background-color="red" color="white"
                                text-align="left" padding-top="3pt">
                                Category
							</fo:block>
                        </fo:table-cell>
                    </fo:table-row>
                </fo:table-body>
            </fo:table>
            <fo:table table-layout="fixed" width="100%">
                <fo:table-column column-width="4.2in" />
                <fo:table-column column-width="2in" />
                <fo:table-column column-width="2in" />
                <fo:table-body>
                    <fo:table-row keep-together.within-page="always">
                        <fo:table-cell padding="2pt" border="1pt solid black">
                            <xsl:apply-templates select="measure" />
                        </fo:table-cell>
                        <fo:table-cell padding="2pt" border="1pt solid black">
                            <xsl:apply-templates select="category" />
                        </fo:table-cell>
                    </fo:table-row>
                </fo:table-body>
            </fo:table>
        </fo:block>
    </xsl:template>
    <xsl:template match="field">
        <fo:block font-size="9pt" font-family="sans-serif"
            space-after.optimum="1pt" text-align="justify">
            <xsl:value-of select="." />
        </fo:block>
    </xsl:template>
    <xsl:template match="data-entered">
        <fo:block font-size="9pt" font-family="sans-serif"
            space-after.optimum="1pt" text-align="justify">
            <xsl:value-of select="." />
        </fo:block>
    </xsl:template>
    <xsl:template match="measure">
        <fo:block font-size="9pt" font-family="sans-serif"
            space-after.optimum="1pt" text-align="justify">
            <xsl:value-of select="." />
        </fo:block>
    </xsl:template>
    <xsl:template match="category">
        <fo:block font-size="9pt" font-family="sans-serif"
            space-after.optimum="1pt" text-align="justify">
            <xsl:value-of select="." />
        </fo:block>
    </xsl:template>
</xsl:stylesheet>