package myApps;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class issuesPage {

	private final FirefoxDriver driver;

	public issuesPage(FirefoxDriver driver) {
		this.driver= driver;
	}
	public String updateIssue() {
		WebDriverWait wait3 = new WebDriverWait(driver,30);
	    wait3.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='stalker']/div/div")));
		driver.findElement(By.xpath(".//*[@id='edit-issue']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert();
		driver.findElement(By.id("description")).sendKeys("update info");
		driver.findElement(By.id("edit-issue-submit")).click();
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.alertIsPresent());
		Alert newAlert = driver.switchTo().alert();
		String creationResult = newAlert.getText();
		return creationResult.substring(Math.max(0, creationResult.length() - 8));
		}
	}
