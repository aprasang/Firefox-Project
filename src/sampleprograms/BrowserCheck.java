package sampleprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserCheck {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.firefox.marionette",
				"D:\\D Backup\\D FOlder\\selenium downloads\\geckodriver-v0.15.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();
		String actulaTitle = driver.getTitle();
		String expectedTitle = "Google";
		String Url = driver.getCurrentUrl();
		System.out.println("title is" + actulaTitle);
		System.out.println("URL is " + Url);
		if (actulaTitle.equals(expectedTitle)) {
			System.out.println("Its google webpage");
		} else {
			System.out.println("not a google page");
		}
		Thread.sleep(1500);
		driver.navigate().refresh();
		driver.navigate().to("https://www.gmail.com");
		driver.navigate().back();

		driver.quit();

	}
}
