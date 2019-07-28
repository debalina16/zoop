/**
 * 
 */
package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author Debalina
 *
 */
public class testMaven {
	WebDriver driver = null;

	@BeforeMethod
	public void loginBrowser() {
		driver = new FirefoxDriver();
		driver.navigate().to("https://www.crmpro.com/index.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void loginTest() {

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("debalina");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Ddba72@@");
		driver.findElement(By.xpath("//input[@value='Login']")).submit();

	}

	@AfterMethod
	public void logoutBrowser() {
		driver.close();
	}
}
