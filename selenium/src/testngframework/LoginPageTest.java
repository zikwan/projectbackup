package testngframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class LoginPageTest {
	WebDriver driver;
	
	@org.testng.annotations.BeforeMethod
	public void BeforeMethod() throws InterruptedException {
		System.out.println("Before Method Annotations");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\software testing\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		Thread.sleep(3000);
	
	}
	
	
	@Test
	public void ValidateLoginTest(){
	
		System.out.println("Login successfully");
	}
	
@AfterMethod 
public void aftermethod() {
	System.out.println("After Method Annotation");
	driver.close();
	
	}

}