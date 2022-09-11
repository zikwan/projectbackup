package testngframework;
	
	import org.testng.annotations.Test;
	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.Test;

	public class HomePageTest42 {
	
		WebDriver driver;
		
		@org.testng.annotations.BeforeMethod
		public void BeforeMethod() throws InterruptedException {
			System.out.println("Before Method Annotations");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\software testing\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		
		@Test
		public void googlesearchTest() throws InterruptedException{
			driver.get("http://www.google.com/");
			Thread.sleep(5000);
			driver.findElement(By.name("q")).sendKeys("selenium parallel execution");
			Thread.sleep(5000);
		}
		
		@Test 
		public void bringSearchTest() throws InterruptedException	{
			driver.get("http://www.bing.com/");
			Thread.sleep(5000);
			driver.findElement(By.className("sb_form_q")).sendKeys("selenium cross browser testing");
			Thread.sleep(5000);
		}
		
	@AfterMethod 
	public void aftermethod() {
		System.out.println("After Method Annotation");
		driver.close();
		
		}

}
