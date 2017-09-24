package sampleprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Options {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette",
				"D:\\D Backup\\D FOlder\\selenium downloads\\geckodriver-v0.15.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		WebElement ddl = driver.findElement(By.id("day"));
		Select sct = new Select(ddl);
		List<WebElement> ddlOptions = sct.getOptions();
		
		int size=ddlOptions.size();
		sct.selectByIndex(size-1);
		
		WebElement monthDDL=driver.findElement(By.id("month"));
		Select monthSct=new Select(monthDDL);
		
		List<WebElement> monthOptions= monthSct.getOptions();

		int mSize=monthOptions.size();
		monthSct.selectByIndex(mSize-1);
		
		/*for (int i = 0; i < ddlOptions.size(); i++) {
			WebElement ddlOption = ddlOptions.get(i);
			System.out.println(ddlOption.getText());
		}*/
		
		//System.out.println("Last Option: " +ddlOptions.size());
	}
}
