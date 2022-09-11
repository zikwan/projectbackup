package testngframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginPageTest42 {
	WebDriver driver;
	
	@Parameters("website")
	@org.testng.annotations.BeforeMethod
	public void BeforeMethod(String url)	{

		System.out.println("Before Method Annotations");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\software testing\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
	}
	
	@Parameters({"userid","password"})
	@Test
	public void ValidateLoginTest(String Username,String password) throws InterruptedException{
	
	driver.findElement(By.name("txtUsername")).sendKeys(Username);
	driver.findElement(By.name("txtPassword")).sendKeys(password);
	driver.findElement(By.id("btnLogin")).click();
	Thread.sleep(3000);
	String homepageUrl = driver.getCurrentUrl();
	Assert.assertEquals(homepageUrl, "https://opensource-demo.orangehrmlive.com/index.php");
	}
	
@AfterMethod 
public void aftermethod() {
	System.out.println("After Method Annotation");
	driver.close();
	
	}

}


