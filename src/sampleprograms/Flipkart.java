package sampleprograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.marionette",
				"D:\\D Backup\\D FOlder\\selenium downloads\\geckodriver-v0.15.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");

		driver.findElement(By.name("q")).sendKeys("mobiles", Keys.ENTER);

		// code to check on checkbox

		/*
		 * WebElement checkbox1 = driver.findElement(By.xpath(
		 * "(//div[@class='_2lesQu']/div[@class='_2VmCve _1pNWV5']/span/div/label/div[@class='_1p7h2j'])[1]"
		 * )); checkbox1.click(); WebElement
		 * Mobilename=driver.findElement(By.xpath(
		 * "(//div[@class='col col-7-12']/div[@class='_3wU53n'])[1]")); String
		 * configuration= driver.findElement(By.xpath(
		 * "(//div[@class='col col-7-12']/div[@class='OiPjke'])[1]")).getText();
		 * 
		 * String mobText=Mobilename.getText();
		 * 
		 * System.out.println("Mobile name " + mobText); System.out.println(
		 * "configuration "+configuration);
		 */

		// code to get the size of checkboxes
		String xPath = "//div[@class='_2lesQu']/div[@class='_2VmCve _1pNWV5']/span/div/label/div[@class='_1p7h2j']";
		List<WebElement> checkboxes = driver.findElements(By.xpath(xPath));
		// System.out.println(checkboxes.size());
		for (int i = 3; i <= checkboxes.size(); i++) {
			
			WebElement Checkbox = driver.findElement(By.xpath("(" + xPath + ")[" + i + "]"));
			WebDriverWait wait=new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(Checkbox));
			Checkbox.click();
			System.out.println(Checkbox.toString());
		}
		driver.close();
	}
}
