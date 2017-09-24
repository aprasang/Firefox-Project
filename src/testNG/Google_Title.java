package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Google_Title {
	@Test
	public static void googleTitle()
	{
		System.setProperty("webdriver.firefox.marionette",
				"D:\\D Backup\\D FOlder\\selenium downloads\\geckodriver-v0.15.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.navigate().to("https://www.google.com");
		
		String actualTitle=driver.getTitle();
		String expTitle="Google";
		//Assert.assertNotEquals(actualTitle, expTitle);
		Assert.assertNotNull(expTitle);
		Assert.assertNotNull(actualTitle);
		driver.close();
	}
	

}
