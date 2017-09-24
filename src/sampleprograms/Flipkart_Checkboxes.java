package sampleprograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart_Checkboxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette",
				"D:\\D Backup\\D FOlder\\selenium downloads\\geckodriver-v0.15.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");

		driver.findElement(By.name("q")).sendKeys("mobiles", Keys.ENTER);
		String Url = "//div[@class='_1p7h2j']";
		List<WebElement> checkboxes = driver.findElements(By.xpath(Url));
		for (int i = 1; i <= checkboxes.size(); i++) {
			WebElement checkbox = driver.findElement(By.xpath("(" + Url + ")[" + i + "]"));
			checkbox.click();
		}
		driver.close();
	}
}
