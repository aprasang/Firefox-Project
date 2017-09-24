package sampleprograms;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePage {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette",
				"D:\\D Backup\\D FOlder\\selenium downloads\\geckodriver-v0.15.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");
		WebElement searchbox = driver.findElement(By.id("lst-ib"));
		searchbox.sendKeys("java");
		searchbox.sendKeys(Keys.BACK_SPACE);
	}
}
