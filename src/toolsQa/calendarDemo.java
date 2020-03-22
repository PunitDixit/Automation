package toolsQa;


import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendarDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sumit\\Downloads\\Punit\\BrowserDrivers\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement ele = driver.findElement(By.id("datepicker"));
		//ele.sendKeys("02/10/2020"); // THIS IS POSSIBLE WHEN DATEPICKER FIELD IS NOT DISABLED
		fieldHighlighter(driver, ele);
		//table[@class='ui-datepicker-calendar']//a[node()=11]
		
		String month = driver.findElement(By.className("ui-datepicker-month")).getText();
		System.out.println(month);
		
		
	}
	
	static void fieldHighlighter(WebDriver driver, WebElement element) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].setAttribute('Style','Background : yellow;');", element);
		js.executeScript("arguments[0].setAttribute('value','02/10/2020')", element);
		
	}

}
