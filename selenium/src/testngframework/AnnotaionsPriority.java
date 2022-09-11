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
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class AnnotaionsPriority {

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
		Thread.sleep(3000);
	
	}
	
	// Test Cases 
	// priority -> is about sequence of program execution
	// 			-> can we set 0 as priority ->> yes we can it will executed first 
	//			-> can we set priority as minus  ->> yes ( flow will be from - 0 +)
	
	// Include & ( Exclude -> (1) enabled = false )
	//						  (2) @Ignore 
	
	// innovation count = repeatedly
	
	//dependency 
	// dependsOnMethods = "googleTitleTest"
	
	// timeout
	
	// groups = {"RegressionTest","SanityTest"}
	// Html reports 
	// extends report
	// testing-failed.xml
	// we can run failed test cases
	
	@Test(priority = 2, invocationCount = 1, timeOut = 3000)
	public void GoogleTitleTest() {
		String googleTitle = driver.getTitle();
		Assert.assertEquals(googleTitle, "Google");
		
		int i;
		do {
			i = 0;
			System.out.println(i);
			
		}
		while(i<5);
	}
	
	
	@Test(priority = 3, groups = {"RegressionTest","SanityTest"})
	public void GoogleSearchTest() {
		System.out.println("Validated Google Search");
			
	}
	@Test(priority = 1,dependsOnMethods = "GoogleTitleTest")
	public void GoogleLogoTest() throws InterruptedException {
		System.out.println("Google Logo Test");
		Thread.sleep(3000);
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
