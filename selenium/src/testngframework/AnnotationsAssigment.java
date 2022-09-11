package testngframework;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AnnotationsAssigment {
	//find element of search/ input box
	// send keys
	//click on search button
	// validate the search by using assert

	
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\software testing\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("facebook");
	Thread.sleep(5000);
	driver.findElement(By.className("gNO89b")).click();
	Thread.sleep(3000);
	String Title = driver.getTitle();
			
	Assert.assertEquals(Title, "facebook - Google Search"," Test case Failed");
	System.out.println("Test Case passed");
	driver.close();
			}
}
