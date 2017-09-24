package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Alert_Popup {

	@Test
	public static void Alert() throws InterruptedException {
		System.setProperty("webdriver.firefox.marionette",
				"D:\\D Backup\\D FOlder\\selenium downloads\\geckodriver-v0.15.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// accept- click ok button
		/*
		 * driver.navigate().to("https://www.irctc.co.in");
		 * driver.findElement(By.id("loginbutton")).click(); Alert
		 * alt=driver.switchTo().alert(); Thread.sleep(1500); alt.accept();
		 * driver.close();
		 */

		// Confirmation pop up
		/*
		 * driver.get("http://www.javascriptkit.com/javatutors/alert2.shtml");
		 * driver.findElement(By.name("B3")).click(); Alert alt =
		 * driver.switchTo().alert(); Thread.sleep(1500); alt.accept();
		 * Thread.sleep(1500); alt.accept(); driver.close();
		 */

		// prompt pop up
		driver.get("http://www.javascriptkit.com/javatutors/alert2.shtml");
		driver.findElement(By.name("B4")).click();
		Alert alt = driver.switchTo().alert();
		alt.sendKeys("hello world");
		Thread.sleep(1000);
		alt.dismiss();
		Thread.sleep(1000);
		alt.accept();
		driver.close();
	}
}
