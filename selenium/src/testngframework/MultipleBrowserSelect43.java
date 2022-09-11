package testngframework;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultipleBrowserSelect43 {

	    WebDriver driver;
		Properties prop;
		String browser;
		
		@Parameters("browser")
		@org.testng.annotations.BeforeMethod
		public void BeforeMethod(String browser) throws IOException	{
			
			
			FileInputStream file = new FileInputStream("C:\\Users\\admin\\eclipse2-workspace\\selenium\\src\\testngframework\\config.properties");
			
			prop = new Properties();
			prop.load(file);
			
			
			//String browser = prop.getProperty("browser");
			
			if(browser.equalsIgnoreCase("msedge")) 
			{
				System.setProperty("webdriver.edge.driver", "C:\\Users\\admin\\Desktop\\software testing\\msedgedriver.exe");
				driver = new EdgeDriver();
				
		}
			
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Desktop\\software testing\\geckodriver.exe");
			driver = new FirefoxDriver();
			
			
				}

		else if(browser.equalsIgnoreCase("chrome"))	
		{	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\software testing\\chromedriver.exe");
			driver = new ChromeDriver();
			
				
				}
		else if(browser.equalsIgnoreCase("opera"))
		{
			System.setProperty("webdriver.opera.driver", "C:\\Users\\admin\\Desktop\\software testing\\operadriver.exe");
			driver = new OperaDriver();
			
			
				}

			else {
			
			System.out.println("Please select valid browser name");

			}
		
		 driver.get(prop.getProperty("website"));
		
				}
		
@Parameters({"userid","password","expUrl"})	
@Test
		public void ValidateLoginTest() throws InterruptedException{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		String homepageUrl = driver.getCurrentUrl();
		AssertJUnit.assertEquals(homepageUrl, prop.getProperty("expUrl"));
		}
		
@AfterMethod 
	public void aftermethod() {
		System.out.println("After Method Annotation");
		//driver.close();
		
		}

	}


