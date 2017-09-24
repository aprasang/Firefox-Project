package sampleprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_javaLnk {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette",
				"D:\\D Backup\\D FOlder\\selenium downloads\\geckodriver-v0.15.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.navigate().to("https://www.google.com");
		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		// driver.findElement(By.linkText("Download Free Java
		// Software")).click();
		// driver.findElement(By.linkText("Free Java Download")).click();

		// capture title
		driver.findElement(By.id("lst-ib")).sendKeys("java",Keys.ENTER);
		driver.findElement(By.linkText("java.com: Java + You")).click();
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.titleContains("java.com:"));
		String title = driver.getTitle();
		System.out.println(title);
	}
}
