package toolsQa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo extends DBrowser{

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver",URL);
		
		driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/autocomplete/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		WebElement textBox = driver.findElement(By.xpath("//input[@id='tags']"));
		highlighter(textBox);
		textBox.clear();
		
		
		Actions actions = new Actions(driver)
		.keyDown(textBox,Keys.LEFT_SHIFT)
		.sendKeys("Test")
		.keyUp(Keys.LEFT_SHIFT);
		
		Action acn = actions.build();
		acn.perform();
		
		
		
		
		
		
	}
	


	public static void highlighter(WebElement element) throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
		Thread.sleep(2000);
		js.executeScript("arguments[0].setAttribute('style', 'background: white; border: 2px solid black;');", element);
	}

}
