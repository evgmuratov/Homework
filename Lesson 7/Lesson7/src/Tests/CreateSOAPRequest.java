package Tests;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;

public class CreateSOAPRequest {
	public static SOAPMessage request1() throws Exception {
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();
        /*
         <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:web="http://services.aonaware.com/webservices/">
   			<soapenv:Header/>
   			<soapenv:Body>
      			<web:LetterSolutions>
                	<web:anagram>testing</web:anagram>
      			</web:LetterSolutions>
   			</soapenv:Body>
		</soapenv:Envelope> 
         */
        SOAPPart soapPart = soapMessage.getSOAPPart();
        String serverURI = "http://services.aonaware.com/webservices/";
        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration("web", serverURI);
        SOAPBody soapBody = envelope.getBody();
        SOAPElement soapBodyElem = soapBody.addChildElement("LetterSolutions", "web");
        SOAPElement soapBodyElem1 = soapBodyElem.addChildElement("anagram", "web");
        soapBodyElem1.addTextNode("testing");
        MimeHeaders headers = soapMessage.getMimeHeaders();
        headers.addHeader("SOAPAction", serverURI  + "LetterSolutions");
        soapMessage.saveChanges();     
        return soapMessage;
    }
	public static SOAPMessage request2() throws Exception {
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();
        /*
         <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:web="http://services.aonaware.com/webservices/">
   			<soapenv:Header/>
   			<soapenv:Body>
      			<web:LetterSolutionsMin>
                  	<web:anagram>?</web:anagram>
         			<web:minLetters>?</web:minLetters>
      			</web:LetterSolutionsMin>
   			</soapenv:Body>
			</soapenv:Envelope>
         */
        SOAPPart soapPart = soapMessage.getSOAPPart();
        String serverURI = "http://services.aonaware.com/webservices/";
        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration("web", serverURI);
        SOAPBody soapBody = envelope.getBody();
        SOAPElement soapBodyElem = soapBody.addChildElement("LetterSolutionsMin", "web");
        SOAPElement soapBodyElem1 = soapBodyElem.addChildElement("anagram", "web");
        soapBodyElem1.addTextNode("testing");
        SOAPElement soapBodyElem2 = soapBodyElem.addChildElement("minLetters", "web");
        soapBodyElem2.addTextNode("4");
        MimeHeaders headers = soapMessage.getMimeHeaders();
        headers.addHeader("SOAPAction", serverURI  + "LetterSolutionsMin");
        soapMessage.saveChanges();    
        return soapMessage;
    }

}
