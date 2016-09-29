package com.astro.report.service;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamSource;

import net.sf.saxon.TransformerFactoryImpl;

import org.apache.fop.apps.FOPException;
import org.apache.fop.apps.FOUserAgent;
import org.apache.fop.apps.Fop;
import org.apache.fop.apps.FopFactory;
import org.apache.fop.apps.MimeConstants;

public class HoroscopePdfReport implements ReportService{
	public void generatePdfReport() throws Exception{
		
		// the XSL FO file
		File xsltfile = new File("../resources/xsl-fop/horoscope_o.xsl");
		// the XML file from which we take the name
		StreamSource source = new StreamSource(new File("../resources/xml-data/horoscope_o.xml"));
		// creation of transform source
		StreamSource transformSource = new StreamSource(xsltfile);
		// create an instance of fop factory
		FopFactory fopFactory = FopFactory.newInstance(new File("../resources/config/fop.xconf"));
		
		// a user agent is needed for transformation
		FOUserAgent foUserAgent = fopFactory.newFOUserAgent();
		// to store output
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();

		Transformer xslfoTransformer;
		try
		{
			xslfoTransformer = getTransformer(transformSource);
			// Construct fop with desired output format
		    Fop fop;
			try
			{
				fop = fopFactory.newFop(MimeConstants.MIME_PDF, foUserAgent, outStream);
				// Resulting SAX events (the generated FO) 
				// must be piped through to FOP
		        Result res = new SAXResult(fop.getDefaultHandler());

				// Start XSLT transformation and FOP processing
				try
				{
				    // everything will happen here..
					xslfoTransformer.transform(source, res);
					// if you want to get the PDF bytes, use the following code
					//return outStream.toByteArray();

					// if you want to save PDF file use the following code
					File pdffile = new File("E:/Projects/MyWorkspace/pdf.generator/src/main/resources/result/Result_O.pdf");
					OutputStream out = new java.io.FileOutputStream(pdffile);
		            out = new java.io.BufferedOutputStream(out);
                    FileOutputStream str = new FileOutputStream(pdffile);
                    str.write(outStream.toByteArray());
                    str.close();
                    out.close();

					// to write the content to out put stream
					byte[] pdfBytes = outStream.toByteArray();
		                        /*response.setContentLength(pdfBytes.length);
		                        response.setContentType("application/pdf");
		                        response.addHeader("Content-Disposition", 
							"attachment;filename=pdffile.pdf");
		                        response.getOutputStream().write(pdfBytes);
		                        response.getOutputStream().flush();*/
				}
				catch (TransformerException e) {
					throw e;
				}
			}
			catch (FOPException e) {
				throw e;
			}
		}
		catch (TransformerConfigurationException e)
		{
			throw e;
		}
		catch (TransformerFactoryConfigurationError e)
		{
			throw e;
		}

	}
	
	private Transformer getTransformer(StreamSource streamSource)
	{
		// setup the xslt transformer
		TransformerFactoryImpl transformerFactory = new TransformerFactoryImpl();

		try {
			return transformerFactory.newTransformer(streamSource);

		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		}
		return null;
	}
}
