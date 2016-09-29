<?xml version="1.0" encoding="iso-8859-1"?>
<xsl:stylesheet version="1.1"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format"
	exclude-result-prefixes="fo">
	<xsl:template match="root">
		<fo:root xmlns:fo="http://www.w3.org/1999/XSL/Format"
			xmlns:pdf="http://xmlgraphics.apache.org/fop/extensions/pdf">
			<fo:layout-master-set>
				<fo:simple-page-master master-name="my-page">
					<fo:region-body margin="1in" />
				</fo:simple-page-master>
				<fo:simple-page-master master-name="content">
					<fo:region-body margin="1in" />
				</fo:simple-page-master>
			</fo:layout-master-set>

			<fo:page-sequence master-reference="my-page">
				<fo:flow flow-name="xsl-region-body">
					<fo:block>
						Hello,
						<xsl:value-of select="name" />
						!
					</fo:block>
					<fo:block>
						<fo:table>
							<fo:table-body>
								<fo:table-row>
									<fo:table-cell border="solid 1px black"
										text-align="center" font-weight="bold">
										<fo:block>
											No.
										</fo:block>
									</fo:table-cell>
									<fo:table-cell border="solid 1px black"
										text-align="center" font-weight="bold">
										<fo:block>
											Name
										</fo:block>
									</fo:table-cell>
									<fo:table-cell border="solid 1px black"
										text-align="center" font-weight="bold">
										<fo:block>
											Phone Number
										</fo:block>
									</fo:table-cell>
								</fo:table-row>
								<xsl:for-each select="./friend">
									<fo:table-row>
										<fo:table-cell border="solid 1px black"
											text-align="center">
											<fo:block>
												<xsl:value-of select="position()" />
											</fo:block>
										</fo:table-cell>
										<fo:table-cell border="solid 1px black"
											text-align="center">
											<fo:block>
												<xsl:value-of select="name" />
											</fo:block>
										</fo:table-cell>
										<fo:table-cell border="solid 1px black"
											text-align="center">
											<fo:block>
												<xsl:value-of select="phNo" />
											</fo:block>
										</fo:table-cell>
									</fo:table-row>
								</xsl:for-each>
							</fo:table-body>
						</fo:table>
					</fo:block>
					
					<!-- <fo:declarations> <pdf:embedded-file filename="rinki.jpg" src="url(file:///D:/my 
						photo/rinki.jpg)" description="My image" /> <pdf:embedded-file src="url(file:///D:/my 
						photo/rinki.jpg)" /> </fo:declarations> -->
				</fo:flow>

			</fo:page-sequence>
			<fo:page-sequence master-reference="content">
					<fo:flow flow-name="xsl-region-body">
						<fo:table table-layout="fixed" width="50%">
							<fo:table-column column-width="proportional-column-width(1)" />
							<fo:table-body>
								<fo:table-row height="100mm">
									<fo:table-cell display-align="center">
										<fo:block text-align="center">
											<fo:external-graphic src="url(file:///D:/my photo/rinki/rinki.jpg)" />
										</fo:block>
									</fo:table-cell>
								</fo:table-row>
							</fo:table-body>
						</fo:table>
					</fo:flow>
					</fo:page-sequence>
		</fo:root>
	</xsl:template>
</xsl:stylesheet>