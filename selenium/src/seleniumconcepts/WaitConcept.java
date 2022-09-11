package seleniumconcepts;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitConcept {
	
	static ChromeDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\software testing\\chromedriver.exe");
	    driver = new ChromeDriver();		// we will create instance of chrome 
	    driver.manage().window().maximize();
	    
	    driver.get("https://the-internet.herokuapp.com/dynamic_controls");	// main page
	   
	    implicitlyWait();
	    ExplicitWait();
	}
	    private static void ExplicitWait() {
	    	WebDriverWait wait = new WebDriverWait(driver,5);
	    	
	    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Add']")));
	    	 driver.findElement(By.xpath("//*[text()='Add']")).click();
		
	}
		public static void implicitlyWait() {
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
	    driver.findElement(By.xpath("(//button[@type=\"button\"])[1]")).click();
	  //  driver.findElement(By.xpath("//*[text()='Add']")).click();
	}

	
}
