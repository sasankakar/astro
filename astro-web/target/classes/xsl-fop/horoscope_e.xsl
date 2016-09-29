<?xml version="1.0" encoding="iso-8859-1"?>
<xsl:stylesheet version="1.1"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format"
	exclude-result-prefixes="fo">
	
	<!-- global variables to be used accross templates -->
	<xsl:variable name="newline">&#x2028;</xsl:variable>
			
	<xsl:template match="horoscope">
		<fo:root xmlns:fo="http://www.w3.org/1999/XSL/Format"
			xmlns:pdf="http://xmlgraphics.apache.org/fop/extensions/pdf">
			<fo:layout-master-set>
				<fo:simple-page-master master-name="page1">
					<!-- order of body,before,after is important. body must appear before 'before/after' -->
					<fo:region-body region-name="xsl-region-body" margin="1in" />
					<!-- <fo:region-before region-name="xsl-region-before" extent="1in" /> -->
					<fo:region-after region-name="xsl-region-after" extent="1in" />
				</fo:simple-page-master>
				<fo:simple-page-master master-name="page2">
					<fo:region-body region-name="xsl-region-body" margin="1in" />
					<fo:region-after region-name="xsl-region-after" extent="1in" />
				</fo:simple-page-master>
			</fo:layout-master-set>

			<!-- Page1 -->
			<fo:page-sequence master-reference="page1">
				<!-- footer - Astrologer's Information -->
				<!-- <xsl:apply-templates select="footer" /> -->
				<fo:static-content flow-name="xsl-region-after">
					<fo:block border-top-width="1px" border-top-style="solid" border-top-color="grey" text-align="center"
						font-size="7pt" font-family="sans-serif"
						font-style="italic" color="grey"
						padding-top="3pt" space-after.optimum="1pt">
						
						<fo:inline><xsl:value-of select="astroger-info/title"/> <xsl:value-of select="$newline"/></fo:inline>
						<fo:inline>Astrologer : 
							<xsl:value-of select="astroger-info/astrologer"/>,
							<xsl:value-of select="astroger-info/address"/>
						 </fo:inline>
						 
						 <xsl:value-of select="$newline"/>
						 
						 <fo:inline>Contacts : 
							M - <xsl:value-of select="astroger-info/mobile"/>, 
							Email - <xsl:value-of select="astroger-info/email"/>
						 </fo:inline>
						 
						 <xsl:value-of select="$newline"/>
						 
						<fo:inline>Awards : <xsl:value-of select="astroger-info/awards"/></fo:inline>
					</fo:block>
				</fo:static-content>
		
				<fo:flow flow-name="xsl-region-body">
					<fo:block text-align="center" font-size="9pt">
						<xsl:value-of select="god-desc" />
					</fo:block>
					<fo:block text-align="center" font-size="9pt">
						<xsl:value-of select="shloka/line1" />
						<xsl:value-of select="$newline"/>
						<xsl:value-of select="shloka/line2" />
					</fo:block>
					<fo:block padding-top="10px" />
					<fo:block>
						<fo:table>
							<fo:table-body>
								<fo:table-row>
									<fo:table-cell text-align="left" width="1.5in">
										<fo:block font-size="8pt">
											Sl No. <xsl:value-of select="ref/serial-no"/>
											<xsl:value-of select="$newline"/>
											Date - <xsl:value-of select="ref/prepared-date"/>
										</fo:block>
									</fo:table-cell>
									<fo:table-cell text-align="left">
										<fo:block text-align="center">
											<fo:inline font-weight="bold">
												HOROSCOPE
											</fo:inline>
										</fo:block>
									</fo:table-cell>
									<fo:table-cell text-align="right" width="1.5in">
										<fo:block text-align="right">
											<fo:external-graphic
												src="url(file:///E:/Astrology/img/ganesha.jpg)"
												content-height="scale-to-fit" height="0.75in" content-width="1.25in"
												scaling="non-uniform" />
										</fo:block>
									</fo:table-cell>
								</fo:table-row>
							</fo:table-body>
						</fo:table>
					</fo:block>

					<!-- Horoscope Details -->
					<fo:block padding-top="10px" />
					<fo:block font-size="10pt" font-weight="bold" font-family="sans-serif"
						font-style="italic" background-color="green" color="white"
						text-align="center" padding-top="3pt" space-after.optimum="1pt">
						Horoscope Details
					</fo:block>
					<fo:block text-align="center">
						<fo:table table-layout="fixed" width="100%">
							<fo:table-body>
								<fo:table-row keep-together.within-page="always">
									<fo:table-cell padding="2pt" border="1pt solid grey"
										number-columns-spanned="4">
										<fo:block font-size="9pt" font-weight="bold" font-family="sans-serif"
											background-color="red" color="white" text-align="center"
											padding-top="3pt" space-after.optimum="1pt">
											Horoscope Details
										</fo:block>
									</fo:table-cell>
								</fo:table-row>
								<fo:table-row keep-together.within-page="always" font-size="8pt">
									<fo:table-cell padding="2pt" border="1pt solid grey">
										<fo:block font-family="sans-serif"
											background-color="grey" color="white" text-align="center"
											padding-top="3pt" space-after.optimum="1pt">
											Attribute
										</fo:block>
									</fo:table-cell>
									<fo:table-cell padding="2pt" border="1pt solid grey">
										<fo:block font-family="sans-serif"
											background-color="grey" color="white" text-align="center"
											padding-top="3pt" space-after.optimum="1pt">
											Value
										</fo:block>
									</fo:table-cell>
									<fo:table-cell padding="2pt" border="1pt solid grey">
										<fo:block font-family="sans-serif"
											background-color="grey" color="white" text-align="center"
											padding-top="3pt" space-after.optimum="1pt">
											Attribute
										</fo:block>
									</fo:table-cell>
									<fo:table-cell padding="2pt" border="1pt solid grey">
										<fo:block font-family="sans-serif"
											background-color="grey" color="white" text-align="center"
											padding-top="3pt" space-after.optimum="1pt">
											Value
										</fo:block>
									</fo:table-cell>
								</fo:table-row>
								<xsl:for-each select="./details">
									<fo:table-row font-size="8pt">
										<fo:table-cell border="solid 1px grey"
											text-align="left">
											<fo:block>
												<xsl:value-of select="item1/attribute" />
											</fo:block>
										</fo:table-cell>
										<fo:table-cell border="solid 1px grey"
											text-align="left">
											<fo:block>
												<xsl:value-of select="item1/value" />
											</fo:block>
										</fo:table-cell>
										<fo:table-cell border="solid 1px grey"
											text-align="left">
											<fo:block>
												<xsl:value-of select="item2/attribute" />
											</fo:block>
										</fo:table-cell>
										<fo:table-cell border="solid 1px grey"
											text-align="left">
											<fo:block>
												<xsl:value-of select="item2/value" />
											</fo:block>
										</fo:table-cell>
									</fo:table-row>
								</xsl:for-each>
							</fo:table-body>
						</fo:table>
					</fo:block>

				</fo:flow>
			</fo:page-sequence>
			
			<!-- Page2 -->
			<fo:page-sequence master-reference="page2">
				<!-- footer -->
				<!-- <xsl:apply-templates select="footer" /> -->
				<fo:static-content flow-name="xsl-region-after">
					<fo:block border-top-width="1px" border-top-style="solid" border-top-color="grey" text-align="center"
						font-size="7pt" font-family="sans-serif"
						font-style="italic" color="grey"
						padding-top="3pt" space-after.optimum="1pt">
						
						<fo:inline>Anuradha Astro Research <xsl:value-of select="$newline"/></fo:inline>
						<fo:inline>Astrologer : Sri Bansidhar Kar, B.D.Pur, Ganjam, ODISHA, PIN-761120 <xsl:value-of select="$newline"/></fo:inline>
						<fo:inline>Contact : M - 9937609505, Email - bansidhar.kar@gmail.com <xsl:value-of select="$newline"/></fo:inline>
						<fo:inline>Awards : Jyotish Darubrahma, Jyotish Vidya Bachaspati, Jyotish Ratna and Vastu Vikram</fo:inline>
					</fo:block>
				</fo:static-content>
				
				<!-- Kundali -->
				<fo:flow flow-name="xsl-region-body">
					<fo:block padding-top="10px" />
					<fo:block font-size="10pt" font-weight="bold" font-family="sans-serif"
						font-style="italic" background-color="green" color="white"
						text-align="center" padding-top="3pt" space-after.optimum="1pt">
						Kundali
					</fo:block>
					<fo:block text-align="center">
						<fo:table table-layout="fixed" width="100%">
							<fo:table-body>
								<fo:table-row keep-together.within-page="always">
									<fo:table-cell display-align="center" width="2.4in"
										border="solid 1px grey">
										<fo:block text-align="center">
											<fo:inline font-weight="bold" font-style="italic">
												Rashi
												Chakra
											</fo:inline>
										</fo:block>
										<fo:block text-align="center">
											<fo:external-graphic
												src="url(file:///E:/Astrology/img/kundali3.png)"
												content-height="scale-to-fit" height="2in" content-width="2in"
												scaling="non-uniform" />
										</fo:block>
										<fo:block-container absolute-position="absolute"
											left="18px" top="20px">
											<fo:table width="1.9in" font-size="9pt">
												<fo:table-body>
													<fo:table-row height="25px" >
														<fo:table-cell border="solid 0px black"
															display-align="center">
															<fo:block></fo:block>
														</fo:table-cell>
														<fo:table-cell border="solid 0px black"
															padding-before="5pt" display-align="after">
															<fo:block>B X</fo:block>
														</fo:table-cell>
														<fo:table-cell border="solid 0px black"
															display-align="center" number-rows-spanned="2">
															<fo:block>C C X</fo:block>
														</fo:table-cell>
														<fo:table-cell border="solid 0px black"
															padding-before="5pt" display-align="after">
															<fo:block>X Y</fo:block>
														</fo:table-cell>
														<fo:table-cell border="solid 0px black"
															display-align="center">
															<fo:block></fo:block>
														</fo:table-cell>
													</fo:table-row>
													<fo:table-row height="25px">
														<fo:table-cell border="solid 0px black"
															display-align="after" number-columns-spanned="2">
															<fo:block>A B</fo:block>
														</fo:table-cell>
														<fo:table-cell border="solid 0px black"
															display-align="after" number-columns-spanned="2">
															<fo:block>D E</fo:block>
														</fo:table-cell>
													</fo:table-row>
													<fo:table-row height="25px">
														<fo:table-cell border="solid 0px black"
															display-align="center" number-columns-spanned="2">
															<fo:block>A B X</fo:block>
														</fo:table-cell>
														<fo:table-cell border="solid 0px black"
															display-align="center">
															<fo:block>25/11</fo:block>
														</fo:table-cell>
														<fo:table-cell border="solid 0px black"
															display-align="center" number-columns-spanned="2">
															<fo:block>D E X</fo:block>
														</fo:table-cell>
													</fo:table-row>
													<fo:table-row height="25px">
														<fo:table-cell border="solid 0px black"
															display-align="center" number-columns-spanned="2">
															<fo:block>A B</fo:block>
														</fo:table-cell>
														<fo:table-cell border="solid 0px black"
															display-align="center" number-rows-spanned="2">
															<fo:block>C C X</fo:block>
														</fo:table-cell>
														<fo:table-cell border="solid 0px black"
															display-align="center" number-columns-spanned="2">
															<fo:block>D E</fo:block>
														</fo:table-cell>
													</fo:table-row>
													<fo:table-row height="25px">
														<fo:table-cell border="solid 0px black"
															display-align="center">
															<fo:block></fo:block>
														</fo:table-cell>
														<fo:table-cell border="solid 0px black"
															display-align="center">
															<fo:block>B X</fo:block>
														</fo:table-cell>
														<fo:table-cell border="solid 0px black"
															display-align="center">
															<fo:block>D X</fo:block>
														</fo:table-cell>
														<fo:table-cell border="solid 0px black"
															display-align="center">
															<fo:block></fo:block>
														</fo:table-cell>
													</fo:table-row>
												</fo:table-body>
											</fo:table>
										</fo:block-container>
									</fo:table-cell>

									<fo:table-cell display-align="center" width="1.5in"
										border="solid 1px grey">
										<fo:block text-align="center">
											<fo:external-graphic src="url(file:///E:/Astrology/img/om.jpg)"
												content-height="scale-to-fit" height="1.3in" content-width="1.2in"
												scaling="non-uniform" />
										</fo:block>
									</fo:table-cell>

									<fo:table-cell display-align="center" width="2.4in"
										border="solid 1px grey">
										<fo:block text-align="center">
											<fo:inline font-weight="bold" font-style="italic">
												Navansa
												Chakra
											</fo:inline>
										</fo:block>
										<fo:block text-align="center">
											<fo:external-graphic
												src="url(file:///E:/Astrology/img/kundali3.png)"
												content-height="scale-to-fit" height="2in" content-width="2in"
												scaling="non-uniform" />
										</fo:block>

										<fo:block-container absolute-position="absolute"
											left="18px" top="20px">
											<fo:table width="1.9in" font-size="9pt">
												<fo:table-body>
													<fo:table-row height="25px">
														<fo:table-cell border="solid 0px black"
															display-align="center">
															<fo:block></fo:block>
														</fo:table-cell>
														<fo:table-cell border="solid 0px black"
															padding-before="5pt" display-align="after">
															<fo:block>B X</fo:block>
														</fo:table-cell>
														<fo:table-cell border="solid 0px black"
															display-align="center" number-rows-spanned="2">
															<fo:block>C C X</fo:block>
														</fo:table-cell>
														<fo:table-cell border="solid 0px black"
															padding-before="5pt" display-align="after">
															<fo:block>X Y</fo:block>
														</fo:table-cell>
														<fo:table-cell border="solid 0px black"
															display-align="center">
															<fo:block></fo:block>
														</fo:table-cell>
													</fo:table-row>
													<fo:table-row height="25px">
														<fo:table-cell border="solid 0px black"
															display-align="after" number-columns-spanned="2">
															<fo:block>A B</fo:block>
														</fo:table-cell>
														<fo:table-cell border="solid 0px black"
															display-align="after" number-columns-spanned="2">
															<fo:block>D E</fo:block>
														</fo:table-cell>
													</fo:table-row>
													<fo:table-row height="25px">
														<fo:table-cell border="solid 0px black"
															display-align="center" number-columns-spanned="2">
															<fo:block>A B X</fo:block>
														</fo:table-cell>
														<fo:table-cell border="solid 0px black"
															display-align="center">
															<fo:block>25/11</fo:block>
														</fo:table-cell>
														<fo:table-cell border="solid 0px black"
															display-align="center" number-columns-spanned="2">
															<fo:block>D E X</fo:block>
														</fo:table-cell>
													</fo:table-row>
													<fo:table-row height="25px">
														<fo:table-cell border="solid 0px black"
															display-align="center" number-columns-spanned="2">
															<fo:block>A B</fo:block>
														</fo:table-cell>
														<fo:table-cell border="solid 0px black"
															display-align="center" number-rows-spanned="2">
															<fo:block>C C X</fo:block>
														</fo:table-cell>
														<fo:table-cell border="solid 0px black"
															display-align="center" number-columns-spanned="2">
															<fo:block>D E</fo:block>
														</fo:table-cell>
													</fo:table-row>
													<fo:table-row height="25px">
														<fo:table-cell border="solid 0px black"
															display-align="center">
															<fo:block></fo:block>
														</fo:table-cell>
														<fo:table-cell border="solid 0px black"
															display-align="center">
															<fo:block>B X</fo:block>
														</fo:table-cell>
														<fo:table-cell border="solid 0px black"
															display-align="center">
															<fo:block>D X</fo:block>
														</fo:table-cell>
														<fo:table-cell border="solid 0px black"
															display-align="center">
															<fo:block></fo:block>
														</fo:table-cell>
													</fo:table-row>
												</fo:table-body>
											</fo:table>
										</fo:block-container>
									</fo:table-cell>
								</fo:table-row>
							</fo:table-body>
						</fo:table>
					</fo:block>

					<!-- Planet Position, Dasha & Antardasha -->
					<fo:block padding-top="10px" />
					<fo:block font-size="10pt" font-weight="bold" font-family="sans-serif"
						font-style="italic" background-color="green" color="white"
						text-align="center" padding-top="3pt" space-after.optimum="1pt">
						Planet
						Position, Dasha and Antardasha
					</fo:block>
					<fo:block text-align="center">
						<fo:table table-layout="fixed" width="100%">
							<fo:table-body>
								<fo:table-row keep-together.within-page="always">
									<!-- Planet Position -->
									<fo:table-cell width="2.4in"
										border="solid 0px black">
										<fo:block text-align="center">
											<fo:table table-layout="fixed" width="100%">
												<fo:table-body>
													<fo:table-row keep-together.within-page="always">
														<fo:table-cell padding="2pt" border="1pt solid grey"
															number-columns-spanned="4">
															<fo:block font-size="9pt" font-weight="bold" font-family="sans-serif"
																background-color="red" color="white" text-align="center"
																padding-top="3pt" space-after.optimum="1pt">
																Planet Position
															</fo:block>
														</fo:table-cell>
													</fo:table-row>
													<fo:table-row keep-together.within-page="always">
														<fo:table-cell padding="2pt" border="1pt solid grey">
															<fo:block font-size="8pt" font-family="sans-serif"
																background-color="grey" color="white" text-align="center"
																padding-top="3pt" space-after.optimum="1pt">
																Rashi
															</fo:block>
														</fo:table-cell>
														<fo:table-cell padding="2pt" border="1pt solid grey">
															<fo:block font-size="8pt" font-family="sans-serif"
																background-color="grey" color="white" text-align="center"
																padding-top="3pt" space-after.optimum="1pt">
																Value1
															</fo:block>
														</fo:table-cell>
														<fo:table-cell padding="2pt" border="1pt solid grey">
															<fo:block font-size="8pt" font-family="sans-serif"
																background-color="grey" color="white" text-align="center"
																padding-top="3pt" space-after.optimum="1pt">
																Value2
															</fo:block>
														</fo:table-cell>
														<fo:table-cell padding="2pt" border="1pt solid grey">
															<fo:block font-size="8pt" font-family="sans-serif"
																background-color="grey" color="white" text-align="center"
																padding-top="3pt" space-after.optimum="1pt">
																Value3
															</fo:block>
														</fo:table-cell>
													</fo:table-row>
													<xsl:for-each select="./planet-pos/item">
														<fo:table-row font-size="8pt">
															<fo:table-cell border="solid 1px grey"
																text-align="center">
																<fo:block>
																	<xsl:value-of select="rashi" />
																</fo:block>
															</fo:table-cell>
															<fo:table-cell border="solid 1px grey"
																text-align="center">
																<fo:block>
																	<xsl:value-of select="value1" />
																</fo:block>
															</fo:table-cell>
															<fo:table-cell border="solid 1px grey"
																text-align="center">
																<fo:block>
																	<xsl:value-of select="value2" />
																</fo:block>
															</fo:table-cell>
															<fo:table-cell border="solid 1px grey"
																text-align="center">
																<fo:block>
																	<xsl:value-of select="value3" />
																</fo:block>
															</fo:table-cell>
														</fo:table-row>
													</xsl:for-each>
												</fo:table-body>
											</fo:table>
										</fo:block>
									</fo:table-cell>
									
									<!-- Dasha -->
									<fo:table-cell width="1.5in"
										border="solid 0px grey">
										<fo:block text-align="center">
											<fo:table table-layout="fixed" width="100%">
												<fo:table-body>
													<fo:table-row keep-together.within-page="always">
														<fo:table-cell padding="2pt" border="1pt solid grey">
															<fo:block font-size="9pt" font-weight="bold" font-family="sans-serif"
																background-color="red" color="white" text-align="center"
																padding-top="3pt" space-after.optimum="1pt">
																Dasha
															</fo:block>
														</fo:table-cell>
													</fo:table-row>
													<xsl:for-each select="./dasha/item">
														<fo:table-row font-size="8pt">
															<fo:table-cell border="solid 1px grey"
																text-align="center">
																<fo:block>
																	<xsl:value-of select="rashi" />
																	<xsl:value-of select="$newline"/>
																	<xsl:value-of select="duration" />
																</fo:block>
															</fo:table-cell>
														</fo:table-row>
													</xsl:for-each>
												</fo:table-body>
											</fo:table>
										</fo:block>
									</fo:table-cell>
									
									<!-- Antardasha -->
									<fo:table-cell width="2.4in"
										border="solid 0px grey">
										<fo:block text-align="center">
											<fo:table table-layout="fixed" width="100%">
												<fo:table-body>
													<fo:table-row keep-together.within-page="always">
														<fo:table-cell padding="2pt" border="1pt solid grey"
															number-columns-spanned="3">
															<fo:block font-size="9pt" font-weight="bold" font-family="sans-serif"
																background-color="red" color="white" text-align="center"
																padding-top="3pt" space-after.optimum="1pt">
																Antardasha
															</fo:block>
														</fo:table-cell>
													</fo:table-row>
													<xsl:for-each select="./antardasha/item">
														<fo:table-row font-size="8pt">
															<fo:table-cell border="solid 1px grey"
																text-align="center">
																<fo:block>
																	<xsl:value-of select="rashi1" />
																</fo:block>
															</fo:table-cell>
															<fo:table-cell border="solid 1px grey"
																text-align="center">
																<fo:block>
																	<xsl:value-of select="rashi2" />
																</fo:block>
															</fo:table-cell>
															<fo:table-cell border="solid 1px grey"
																text-align="center">
																<fo:block>
																	<xsl:value-of select="rashi3" />
																</fo:block>
															</fo:table-cell>
														</fo:table-row>
													</xsl:for-each>
												</fo:table-body>
											</fo:table>
										</fo:block>
									</fo:table-cell>
								</fo:table-row>
							</fo:table-body>
						</fo:table>
					</fo:block>
				</fo:flow>
			</fo:page-sequence>
					
		</fo:root>
	</xsl:template>
	
	<!-- reusable templates -->
	<xsl:template match="footer">
		<fo:static-content flow-name="xsl-region-after">
			<fo:block border-top-width="1px" border-top-style="solid" border-top-color="grey" text-align="center"
				font-size="7pt" font-family="sans-serif"
				font-style="italic" color="grey"
				padding-top="3pt" space-after.optimum="1pt">
				
				<fo:inline>Anuradha Astro Research <xsl:value-of select="$newline"/></fo:inline>
				<fo:inline>Astrologer : Sri Bansidhar Kar, B.D.Pur, Ganjam, ODISHA, PIN-761120 <xsl:value-of select="$newline"/></fo:inline>
				<fo:inline>Contact : M - 9937609505, Email - bansidhar.kar@gmail.com <xsl:value-of select="$newline"/></fo:inline>
				<fo:inline>Awards : Jyotish Darubrahma, Jyotish Vidya Bachaspati, Jyotish Ratna and Vastu Vikram</fo:inline>
			</fo:block>
		</fo:static-content>
	</xsl:template>
</xsl:stylesheet>