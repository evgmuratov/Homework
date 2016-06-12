package myApps;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.runners.MethodSorters;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JiraTestPage {
	private FirefoxDriver driver;
	String issueName = "Muratov issue";
	@Before
	public void startBrowser() {
		//System.setProperty ("webdriver.gecko.driver", "D:/Documents/Automation/BrowsersDrivers/geckodriver-v0.8.0-win32/wires.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(
		"https://id.atlassian.com/login?application=jac&continue=https%3A%2F%2Fjira.atlassian.com%2Fprojects%2FDEMO");
		driver.manage().window().maximize();
		}
	@After
	public void closeBrowser() {
		driver.close(); //or "driver.quit" like it is in video
	}
	/*@Test
	public void testANewIssueCreate(){
		startPage home = new startPage(driver);
		loggedInPage loggedin = home.login("testjira55@gmail.com", "life648100");
		assertTrue(loggedin.createIssue(issueName).equals("created."));
		}
	@Test
	public void testBExistingIssueFound(){
		startPage home = new startPage(driver);
		loggedInPage loggedin = home.login("testjira55@gmail.com", "life648100");
		assertTrue(loggedin.findIssue(issueName).equals("Muratov issue"));
		}*/
	@Test
	public void testCExistingIssueUpdate(){
		startPage home = new startPage(driver);
		loggedInPage loggedin = home.login("testjira55@gmail.com", "life648100");
		issuesPage issuePage = loggedin.openIssue(issueName);
		assertTrue(issuePage.updateIssue().equals("updated."));			 
	}
	}