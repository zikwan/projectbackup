package qa.testbase;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase()  {
	
		try {
			FileInputStream file = new FileInputStream("C:\\Users\\admin\\eclipse2-workspace\\MaveenFrameWork\\src\\main\\java\\qa\\config\\config.properties");
			prop = new Properties();
			prop.load(file);	}
		catch (Exception e) {
			e.printStackTrace();	}
	}
	
	public void initilization() {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
//      System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\software testing\\chromedriver.exe");
	    WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();	}
		
		else if(browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();	}
		
		else if(browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();	}
			
		else {
			System.out.println("please select valid browser name");
		}
		
		
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(prop.getProperty("website"));
        
//	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
	    
	    
	}

}
