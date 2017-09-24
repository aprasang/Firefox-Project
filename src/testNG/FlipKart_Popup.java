package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FlipKart_Popup {
static	WebElement menu;
	@Test
	public static void hiddenDivisionPopup() {

		System.setProperty("webdriver.firefox.marionette",
				"D:\\D Backup\\D FOlder\\selenium downloads\\geckodriver-v0.15.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://www.flipkart.com");
		
		driver.findElement(By.linkText("Log In")).click();
		
		driver.findElement(By.xpath("//input[@class='_2zrpKA']")).sendKeys("9160407241",Keys.TAB);
		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv']")).sendKeys("ADI@335i",Keys.ENTER);
		
		 menu=	driver.findElement(By.xpath("//a[contains(text(),'My Account')]"));
		Actions act=new Actions(driver);
		act.moveToElement(menu).perform();
		driver.findElement(By.xpath("//a[contains(text(),'My Rewards')]")).click();
		 menu=	driver.findElement(By.xpath("//a[contains(text(),'My Account')]"));
		//act.moveToElement(menu).perform();
		
		driver.findElement(By.xpath("//a[text()='Log Out']")).click();
		driver.close();


	}
}
