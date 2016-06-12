package myApps;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class loggedInPage {
	private final FirefoxDriver driver;

	public loggedInPage(FirefoxDriver driver) {
		this.driver= driver;
	}
	public String createIssue(String issueName){
		driver.findElement(By.id("create_link")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert();
		driver.findElement(By.xpath(".//*[@id='issuetype-single-select']/span")).click();
		driver.findElement(By.id("bug-13")).click();
		driver.findElement(By.id("summary")).sendKeys(issueName);
		driver.findElement(By.id("create-issue-submit")).click();
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.alertIsPresent());
		Alert newAlert = driver.switchTo().alert();
		String creationResult = newAlert.getText();
		return creationResult.substring(Math.max(0, creationResult.length() - 8));
		}
	public String findIssue(String issueName){
		driver.findElement(By.id("quickSearchInput")).sendKeys(issueName);
		driver.findElement(By.id("quickSearchInput")).sendKeys(Keys.ENTER);
		return driver.findElement(By.id("summary-val")).getText();				
	}
	public issuesPage openIssue(String issueName){
		driver.findElement(By.id("quickSearchInput")).sendKeys(issueName);
		driver.findElement(By.id("quickSearchInput")).sendKeys(Keys.ENTER);
		return new issuesPage(driver);		
		}
	//method from lesson presentation
	public profilePage openProfile() {
		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[3]/ul/li[3]/a/span/span/img")).click();
		driver.findElement(By.id("view_profile")).click();
		return new profilePage(driver);
		}
	
	}