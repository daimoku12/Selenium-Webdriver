package webdriver_practice;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class practice {

	@Test
	public void pract()
	{
		
		System.setProperty("webdriver.chrome.driver", "./Driver_Exe/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
/*		driver.get("https://www.facebook.com");
		
		Actions action = new Actions (driver);
		action.moveToElement(driver.findElement(By.id("email"))).sendKeys("hello").build().perform();
		
		List <WebElement> month = driver.findElements(By.xpath("//select[@id='month']/option"));
		
		for (WebElement m : month)
		{
			if (m.getText().equalsIgnoreCase("may"))
			{
				m.click();
				break;
			}
		}
		
	    WebElement date = driver.findElement(By.xpath(".//*[@id='day']"));
		Select day = new Select (date);
	    day.selectByVisibleText("21");*/
		
/*		driver.get("https://www.visier.com/careers/test-development-manager-data-management/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(0,800)");
		
		driver.findElement(By.xpath("//a[@href='https://www.visier.com/clarity/']")).click();*/
		
		driver.get("http://www.gooogle.com");
		driver.findElement(By.id("lst-ib")).sendKeys("hello world");

		String str = driver.findElement(By.xpath("//ul[@class='sbsb_b' and @role='listbox']")).getText();
		System.out.println(str);
		String[] A = str.split("\n");
		
        for (int i=0; i < A.length; i++){
        	if (A[i].equalsIgnoreCase("hello world french")){
        		driver.findElement(By.id("lst-ib")).clear();
        		driver.findElement(By.id("lst-ib")).sendKeys(A[i]);
        		break;
        	}
        }
		
		driver.quit();
	}
}
