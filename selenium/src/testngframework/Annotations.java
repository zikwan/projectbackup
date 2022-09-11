package testngframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	WebDriver driver;
	// Annotations 
	
	// 4 Preconditions / prerequisite annotations
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("Beforesuite annotations");
	}
	
	
	@BeforeTest
	public void beforetest() {
		System.out.println("BeforeTest annotation");
	}
	
	@BeforeClass 
	public void beforeclass() {
		System.out.println("beforeclass annotation"); 
	}
	
	
	// Before annotation
	@org.testng.annotations.BeforeMethod
	public void BeforeMethod() throws InterruptedException {
		System.out.println("Before Method Annotations");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\software testing\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		Thread.sleep(5000);
	
	}
	
	// Test Cases 
	
	@Test 
	public void test1() {
		System.out.println("Google Title Test");
	}
	
	@Test
	public void test2() {
		System.out.println("Google Search Test");
			
	}
	@Test
	public void test3() throws InterruptedException {
		System.out.println("Google Logo Test");
		Thread.sleep(5000);
		boolean Googlelogo = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")).isDisplayed();
		Assert.assertEquals(Googlelogo, true);
	}
	
	// 4 Post Conditions Annotations
	// AfterMethod Annotations

	@AfterMethod 
	public void aftermethod() {
		System.out.println("After Method Annotation");
		driver.close();
	}
	
	@AfterClass
	
	public void afterclass() {
		System.out.println("Afterclass annotations");
	}
	
	@AfterTest 
	public void aftertest() {
	System.out.println("AfterTest annotations");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite annotation");
	}
}