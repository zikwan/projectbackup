package datadriventesting;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.AssertJUnit;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;


public class HomePageTest {

	    WebDriver driver;
		Properties prop;
		SoftAssert softassert;
		
		
		//@Parameters("browser")
		@org.testng.annotations.BeforeMethod
		public void BeforeMethod() throws IOException	{
			
			
			FileInputStream file = new FileInputStream("C:\\Users\\admin\\eclipse2-workspace\\selenium\\src\\testngframework\\config.properties");
			
			prop = new Properties();
			prop.load(file);
			
			
			String browser = prop.getProperty("browser");
			
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

		else 
		{
			System.out.println("Please select valid browser name");
		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		driver.get(prop.getProperty("website"));
		}
		
	
	
	@DataProvider(name="data")
	public Object[][] dataReader() throws IOException {
	Object data [][]= DataReader.getdata();
	return data;
		}
	
@Test(dataProvider = "data")

		public void ValidateAddEmpTest(String firstname, String lastname, String EmpId) throws InterruptedException{
	
	driver.findElement(By.name("username")).sendKeys(prop.getProperty("username"));
	driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
	driver.findElement(By.xpath("//button[@type='submit']")).click();
		

	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	String homepageUrl = driver.getCurrentUrl();
	//softassert = new SoftAssert();
//	softassert.assertEquals(homepageUrl, "expUrl");
		
	// mouseover action 
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.findElement(By.className("oxd-icon-button.oxd-main-menu-button")).click();
	driver.findElement(By.xpath("//li[@class='oxd-topbar-body-nav-tab'][1]")).click();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebElement pim = driver.findElement(By.xpath("//input[@name='firstName']"));
		Actions act = new Actions(driver);
		act.moveToElement(pim).build().perform();
		//driver.findElement(By.linkText("Add Employee")).click();
		//driver.findElement(By.xpath("//button[@class='oxd-button.oxd-button--medium.oxd-button--secondary']")).click();
		driver.findElement(By.name("firstName")).sendKeys(firstname);
		driver.findElement(By.name("lastName")).sendKeys(lastname);
		//WebElement EmpID = driver.findElement(By.cssSelector("class=oxd-input.oxd-input--active]"));
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input"));
				//*[@id="app"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input
		 //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//EmpID.clear();
		//EmpID.sendKeys(EmpId);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		}
		
@AfterMethod 
	public void aftermethod() {
		
		driver.close();
		
		}

	}


