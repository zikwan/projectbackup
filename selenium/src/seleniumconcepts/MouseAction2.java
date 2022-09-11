package seleniumconcepts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction2 {

	static ChromeDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\software testing\\chromedriver.exe");
	    driver = new ChromeDriver();		// we will create instance of chrome 
	    driver.manage().window().maximize();
	    driver.get("https://jqueryui.com/droppable/");	// main page
	    
	    driver.switchTo().frame(0);
	    
	    WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
	    WebElement lct = driver.findElement(By.xpath("//div[@id='droppable']"));
	    
	    Actions act = new Actions(driver);
	    
	    act.clickAndHold(src).moveToElement(lct).release().build().perform();
	    
	    Thread.sleep(2000);
	    driver.close();
	    
	    
	}
}
