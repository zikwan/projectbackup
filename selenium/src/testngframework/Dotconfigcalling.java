package testngframework;
	
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

	public class Dotconfigcalling 
	{
		WebDriver driver;
		Properties prop;
		
		
		@org.testng.annotations.BeforeMethod
		public void BeforeMethod() throws IOException	{
			
			FileInputStream file = new FileInputStream("C:\\Users\\admin\\eclipse2-workspace\\selenium\\src\\testngframework\\config.properties");
			
			prop = new Properties();
			prop.load(file);
			
			System.out.println("Before Method Annotations");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\software testing\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(prop.getProperty("website"));
			
		
		}
		
		
		@Test
		public void ValidateLoginTest() throws InterruptedException{
	
		driver.findElement(By.name("txtUsername")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name("txtPassword")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		String homepageUrl = driver.getCurrentUrl();
		Assert.assertEquals(homepageUrl, prop.getProperty("expUrl"));
		}
		
	@AfterMethod 
	public void aftermethod() {
		System.out.println("After Method Annotation");
		driver.close();
		
		}

	}

