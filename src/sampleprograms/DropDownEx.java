package sampleprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette",
				"D:\\D Backup\\D FOlder\\selenium downloads\\geckodriver-v0.15.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		WebElement dayDDL=driver.findElement(By.id("day"));
		Select sctDay= new Select(dayDDL);
		sctDay.selectByValue("1");
				
		WebElement MonthDDl=driver.findElement(By.id("month"));
		Select sctMonth=new Select(MonthDDl);
		sctMonth.selectByIndex(4);
		
		WebElement yearDDl=driver.findElement(By.id("year"));
		Select sctYear=new Select(yearDDl);
		sctYear.selectByVisibleText("2014");
		
		System.out.println("Day "+ sctDay.isMultiple());	
		System.out.println("Month "+ sctMonth.isMultiple());
		System.out.println("Year "+ sctYear.isMultiple());

	}

}
