package Tests;

import javax.xml.soap.SOAPMessage;
import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;

public class PrintSOAPResponse {
	public static void execute(SOAPMessage soapResponse) throws Exception {
	    TransformerFactory transformerFactory = TransformerFactory.newInstance();
	    Transformer transformer = transformerFactory.newTransformer();
	    Source sourceContent = soapResponse.getSOAPPart().getContent();
	    System.out.print("\nResponse SOAP Message = ");
	    StreamResult result = new StreamResult(System.out);
	    transformer.transform(sourceContent, result);
	}

}
