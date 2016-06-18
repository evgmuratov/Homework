package Tests;
import org.junit.*;
import javax.xml.soap.*;
public class CheaterTest {
	SOAPConnection soapConnection;
	String url = "http://services.aonaware.com/CountCheatService/CountCheatService.asmx";
	@Before
	public void createConnection() {
		try {
            // Create SOAP Connection
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            soapConnection = soapConnectionFactory.createConnection();                      
        } catch (Exception e) {
            System.err.println("Error occurred while sending SOAP Request to Server");
            e.printStackTrace();
        }
	}
	@After
	public void closeConnection() {
		try {
			soapConnection.close();
		} catch (SOAPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void letterSolutions()throws Exception{
		SOAPMessage soapResponse = soapConnection.call(CreateSOAPRequest.request1(), url);
		PrintSOAPResponse.execute(soapResponse);
		}
	@Test
	public void letterSolutionsMin()throws Exception{
		SOAPMessage soapResponse = soapConnection.call(CreateSOAPRequest.request2(), url);
		PrintSOAPResponse.execute(soapResponse);
		}
	
	}