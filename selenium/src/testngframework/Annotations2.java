package testngframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Annotations2 {
	WebDriver driver;
	// Annotations 
	
	// 4 Preconditions / prerequisite annotations
	
	
	
	// Before annotation
	@org.testng.annotations.BeforeMethod
	public void BeforeMethod() {
		System.out.println("Before Method Annotations");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\software testing\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com/");
	}
	
	// Test Cases 
	
	@Test 
	public void GoogleTitleTest() {
		String googleTitle = driver.getTitle();
		
		// Google
		Assert.assertEquals(googleTitle,"Google");
		}
	
	//@Test
	//public void GoogleSearchTest() {
	//	}
	//@Test
	//public void GoogleLogoTest() {
	//}
	
	//// 4 Post Conditions Annotations
	// AfterMethod Annotations

	@AfterMethod 
	public void aftermethod() {
		
		driver.close();
	}	

}
