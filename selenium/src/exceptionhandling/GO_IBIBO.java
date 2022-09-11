package exceptionhandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GO_IBIBO {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\software testing\\chromedriver.exe");
	    driver = new ChromeDriver();		// we will create instance of chrome 
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://www.goibibo.com/");
	    
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   // driver.findElement(By.xpath("//span[@class='sc-GEbAx izHSju']")).click();
	    WebElement text = driver.findElement(By.xpath("//p[@class='sc-iJKOTD iipKRx fswWidgetPlaceholder'][1]"));
	    Actions act = new Actions(driver);
	    act.click(text).perform();
	    act.sendKeys(text, "Bengaluru").perform();
	    act.pause(5000).perform();
	  //  act.sendKeys(text, Keys.ARROW_DOWN).perform();
	    act.sendKeys(Keys.ENTER).perform();
	   // WebElement text1 = driver.findElement(By.xpath("//p[@class='sc-iJKOTD iipKRx fswWidgetPlaceholder'][2]"));
	   // act.click(text1).perform();
	    act.sendKeys("Delhi").perform();
	    act.pause(2000).perform();
	  //  act.sendKeys(text, Keys.ARROW_DOWN).perform();
	    act.sendKeys(Keys.ENTER).perform();
	    
	   // driver.quit();
	    
	 

	}
}