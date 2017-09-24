package testNG;

import java.util.Iterator;
//import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Irctc_windowHandle {
	@Test
	public static void windowHandle() throws InterruptedException {
		System.setProperty("webdriver.firefox.marionette",
				"D:\\D Backup\\D FOlder\\selenium downloads\\geckodriver-v0.15.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://www.irctc.co.in");

		/*
		 * String currentWindowID=driver.getWindowHandle();
		 * System.out.println(currentWindowID);
		 */
		driver.findElement(By.linkText("Flight Tickets")).click();

		Set<String> windowIds = driver.getWindowHandles();

		Iterator<String> it = windowIds.iterator();
		/*
		 * System.out.println(windowIds.size()); while(it.hasNext()) {
		 * System.out.println(it.next()); }
		 */

		String parentWindowId = it.next();
		String childWindowId = it.next();

		driver.switchTo().window(childWindowId);
		driver.findElement(By.id("international")).click();
		driver.findElement(By.id("originInt")).sendKeys("Adiyaman,TR-ADF");
		Thread.sleep(1500);

		driver.switchTo().window(parentWindowId);
		driver.findElement(By.xpath("//input[@id='usernameId']")).sendKeys("laxmi");
		Thread.sleep(1500);
		driver.close();

	}
}
