package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adds_Click {
	
	static ChromeDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\software testing\\chromedriver.exe");
	    driver = new ChromeDriver();		// we will create instance of chrome 
	    driver.manage().window().maximize();
	    driver.get("https://demo.automationtesting.in/Windows.html");	// main page

	    WebElement frame = driver.findElement(By.xpath("//iframe[@id='aswift_0']"));
	    driver.switchTo().frame(frame);					// it will help to switch to frame webelement
	    
	    driver.findElement(By.xpath("//div[@id=\"cbb\"]")).click();
	}

}
