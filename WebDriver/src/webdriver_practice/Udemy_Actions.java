package webdriver_practice;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Udemy_Actions {
			
		public static void main(String[] args) throws Exception {
			
			System.setProperty("webdriver.chrome.driver", "././Driver_Exe/chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			//driver.manage().window().maximize();
			
			driver.get("https://www.udemy.com/");
			Actions action = new Actions (driver);
			
			action.moveToElement(driver.findElementByClassName("ellipsis")).build().perform();
			action.moveToElement(driver.findElementByXPath("//span[text()='Development']")).build().perform();
			action.moveToElement(driver.findElementByXPath("//span[text()='Web Development']")).click().build().perform();
			
			/*WebDriverWait wait = new WebDriverWait (driver,10);			
			WebElement button = driver.findElementByXPath("//span[text()='Web Development']");
			wait.until(ExpectedConditions.elementToBeClickable(button));
			button.click();*/
			
			
		
	}

}
