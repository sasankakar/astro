package com.astro.horoscope.controlller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLConnection;
import java.nio.charset.Charset;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.astro.horoscope.domain.Address;
import com.astro.horoscope.domain.Astrologer;
import com.astro.horoscope.domain.Contacts;
import com.astro.horoscope.domain.God;
import com.astro.horoscope.domain.HoroscopeRequest;
import com.astro.horoscope.domain.Reference;
import com.astro.horoscope.domain.Shloka;
import com.astro.horoscope.report.request.Horoscope;
import com.astro.horoscope.report.request.HoroscopeReportRequest;
import com.astro.horoscope.service.HoroscopeService;
import com.astro.report.service.ReportService;
//import com.astro.horoscope.data.entity.Shloka;
//import com.astro.horoscope.domain.Horoscope;
//import com.astro.horoscope.data.entity.Shloka;
//import com.astro.horoscope.domain.Horoscope;

@RestController
@RequestMapping(value="/horoscope")
public class HoroscopeRestController {
	
	@Autowired
	HoroscopeService horoscopeService;
	
	//@Autowired
	ReportService reportService;
	
	/*@RequestMapping(value="/shlokas",method = RequestMethod.GET)
	public List<Shloka> getAllShlokas(){
		System.out.println("HoroscopeRestController - getting all shlokas...");
		return horoscopeService.getAllShlokas();
	}*/
	
	/*@RequestMapping(value="/report/prepare",method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<HoroscopeRequest> prepareHoroscope(@RequestBody HoroscopeRequest horoscopeReq){
		System.out.println("HoroscopeRestController.prepareHoroscope() POST called...");
		return new ResponseEntity<HoroscopeRequest>(horoscopeReq, HttpStatus.OK);
	}*/
	
	@RequestMapping(value="/report/prepare",method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void prepareHoroscopeReport(@RequestBody HoroscopeReportRequest horoscopeReportReq){
		System.out.println("HoroscopeRestController.prepareHoroscopeReport() POST called...");
		
		System.out.println("HoroscopeReportRequest ===>>> " + horoscopeReportReq);
	}
	
	
	private static final String INTERNAL_FILE="result/Result_O.pdf";
    private static final String EXTERNAL_FILE_PATH="C:/mytemp/SpringMVCHibernateManyToManyCRUDExample.zip";
    
	@RequestMapping(value="/report/download/{ref}/{lang}",method = RequestMethod.GET,produces=MediaType.APPLICATION_XML_VALUE)
	public void report(HttpServletResponse response, @PathVariable("ref") String ref, @PathVariable("lang") String lang) throws IOException{
		System.out.println("HoroscopeRestController report method called..."+ ref + lang);
		
		File file = null;
        
		// Read internal or external file
        /*if(type.equalsIgnoreCase("internal")){
            ClassLoader classloader = Thread.currentThread().getContextClassLoader();
            file = new File(classloader.getResource(INTERNAL_FILE).getFile());
        }else{
            file = new File(EXTERNAL_FILE_PATH);
        }*/
		
		// Read user's horoscope pdf file
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        file = new File(classloader.getResource("result/"+ref+"_"+lang+".pdf").getFile());
         
        if(!file.exists()){
            String errorMessage = "Sorry. The file you are looking for does not exist";
            System.out.println(errorMessage);
            OutputStream outputStream = response.getOutputStream();
            outputStream.write(errorMessage.getBytes(Charset.forName("UTF-8")));
            outputStream.close();
            return;
        }
         
        String mimeType= URLConnection.guessContentTypeFromName(file.getName());
        if(mimeType==null){
            System.out.println("mimetype is not detectable, will take default");
            mimeType = "application/octet-stream";
        }
         
        System.out.println("mimetype : "+mimeType);
         
        response.setContentType(mimeType);
         
        /* "Content-Disposition : inline" will show viewable types [like images/text/pdf/anything viewable by browser] right on browser 
            while others(zip e.g) will be directly downloaded [may provide save as popup, based on your browser setting.]*/
        response.setHeader("Content-Disposition", String.format("inline; filename=\"" + file.getName() +"\""));
 
         
        /* "Content-Disposition : attachment" will be directly download, may provide save as popup, based on your browser setting*/
        //response.setHeader("Content-Disposition", String.format("attachment; filename=\"%s\"", file.getName()));
         
        response.setContentLength((int)file.length());
 
        InputStream inputStream = new BufferedInputStream(new FileInputStream(file));
 
        //Copy bytes from source to destination(outputstream in this example), closes both streams.
        FileCopyUtils.copy(inputStream, response.getOutputStream());
		
		
		// =========== Horpscope Details DTO ========== //
		// God - set properties
		God god = new God();
		god.setName("****gúâ MùYgûd ^cü ****");
		god.setImg("../img/god/ganesha.png");
		
		// Shloka - set properties
		Shloka shloka = new Shloka();
		shloka.setLine1("@û\\òZýû\\ò Mâjûü iùað ^lZâûYò P eûgdü û");
		shloka.setLine2("\\úNðcûdê _âKêað«ê ~ùiýdõ R^à _ZâòKû   ûû");
		
		// Astrologer - set properties
		Astrologer astrologer = new Astrologer();
		astrologer.setName("Bansidhar Kar");
		astrologer.setOrganization("Anuradha Astro Research");
		astrologer.setAwards("Jyotish Darubrahma, Jyotish Vidya Bachaspati, Jyotish Ratna and Vastu Vikram");
		Contacts contacts = new Contacts();
		contacts.setMobileNo("9937609505");
		contacts.setEmail("bansidhara.kar@gmail.com");
		Address address = new Address();
		address.setHouseNo("Astro Pavilion");
		address.setStreet("Road Sahi");
		address.setVillage("B.D.Pur");
		address.setCity("B.D.Pur");
		address.setNearestTown("Bhanjanagar");
		address.setPostOffice("B.D.Pur");
		address.setPoliceStation("Jagannath prasad");
		address.setDistrict("Ganjam");
		address.setState("Odisha");
		address.setCountry("India");
		address.setPin("761120");
		contacts.setAddress(address);
		astrologer.setContacts(contacts);
		
		// Reference - set properties
		Reference reference = new Reference();
		reference.setSerialNo("1215/114/8");
		reference.setPreparedDate("04-Apr-2016");
		
		// Horoscope - set properties
		Horoscope horoscope = new Horoscope();
		horoscope.setGod(god);
		horoscope.setAstrologer(astrologer);
		horoscope.setShloka(shloka);
		horoscope.setReference(reference);
		
		
		//return horoscope;
	}
	
}
