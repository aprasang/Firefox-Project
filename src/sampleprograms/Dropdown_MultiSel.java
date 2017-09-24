package sampleprograms;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_MultiSel {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette",
				"D:\\D Backup\\D FOlder\\selenium downloads\\geckodriver-v0.15.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///D:/D%20Backup/D%20FOlder/Selenium%20Samples/Sample.html");

		WebElement ddl = driver.findElement(By.xpath("//select[@multiple='true']"));
		Select sct = new Select(ddl);
		
		//System.out.println(sct.isMultiple());

		//sct.selectByValue("01");
		sct.selectByIndex(0);
		sct.selectByVisibleText("order5");
		//sct.deselectAll();
		sct.deselectByIndex(1);
		//driver.close();
	}
}
