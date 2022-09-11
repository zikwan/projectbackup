package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
	
	static ChromeDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\software testing\\chromedriver.exe");
	    driver = new ChromeDriver();		// we will create instance of chrome 
	    driver.manage().window().maximize();
	    driver.get("https://www.moneycontrol.com/");	// main page
	   
	   WebElement loginlink = driver.findElement(By.linkText("Hello, Login"));
	   
	   Actions act = new Actions(driver);
	   act.moveToElement(loginlink).build().perform();
	   driver.findElement(By.linkText("My Profile")).click();
	}

}
