package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Yatra_calendarPopup {
	@Test
	public static void Calendar_Popup()
	{
		System.setProperty("webdriver.firefox.marionette",
				"D:\\D Backup\\D FOlder\\selenium downloads\\geckodriver-v0.15.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://www.yatra.com");
		
		//To click on previous dates
		/*driver.findElement(By.id("BE_flight_depart_date")).click();
		driver.findElement(By.id("a_2017_9_25")).click(); */
		
		driver.findElement(By.id("BE_flight_origin_city")).sendKeys("Bangalore",Keys.ENTER);
		driver.findElement(By.id("BE_flight_arrival_city")).sendKeys("Hyderabad",Keys.ENTER);
		
		//Date selection using javascript
		String departDate="document.getElementById('BE_flight_depart_date').value='29/09/2017'";
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript(departDate);
		
		String returnDate="document.getElementById('BE_flight_return_date').value='30/09/2017'";
		js.executeScript(returnDate);
		
		WebElement paxInfoBox =	driver.findElement(By.id("BE_flight_paxInfoBox"));
		paxInfoBox.click();
		
		Actions act=new Actions(driver);
		act.moveToElement(paxInfoBox).perform();
		
		driver.findElement(By.xpath("//div[@data-flightagegroup='adult']/div[2]/div[1]/span[@class='ddSpinnerPlus']")).click();
		driver.findElement(By.xpath("//div[@data-flightagegroup='child']/div[2]/div[1]/span[@class='ddSpinnerPlus']")).click();
		driver.findElement(By.xpath("//div[@data-flightagegroup='infant']/div[2]/div[1]/span[@class='ddSpinnerPlus']")).click();
		
		
		driver.findElement(By.xpath("//div[@id='flight_class_select_child']/ul/li/span[text()='Premium Economy']")).click();
		driver.findElement(By.xpath("//div[@class='be-ddn-footer']/span[text()='Done']")).click();
		driver.findElement(By.xpath("//input[@id='BE_flight_flsearch_btn']")).click();
		driver.close();		
	}
}
