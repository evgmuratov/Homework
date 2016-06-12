package myApps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestApp {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("www.google.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		WebElement myElement= driver.findElement(By.id("passwordField"));
		//List<WebElement> checkboxes= driver.findElements(By.className("checkbox"));
		// Click on your element
		myElement.click();
		// Enter any text or even send keystrokes
		myElement.sendKeys("Hello world!");
		myElement.sendKeys("Keys.CONTROL" + "v");
		driver.close();
		driver.quit();
	}
}
