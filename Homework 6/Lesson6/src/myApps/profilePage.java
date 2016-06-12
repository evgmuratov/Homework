package myApps;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
public class profilePage {

	private FirefoxDriver driver;

	public profilePage(FirefoxDriver driver) {
		this.driver= driver;
	}
	public Object getUserName() {
		return driver.findElement(By.id("up-user-title-name")).getText();
		}
	}