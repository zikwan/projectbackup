package seleniumconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	// static chromeDriver driver;
	static WebDriver driver;
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\software testing\\chromedriver.exe");
	    driver = new ChromeDriver();		// we will create instance of chrome 
	    driver.manage().window().maximize();
	    driver.get("https://demo.automationtesting.in/Windows.html");	// main page
		
		

	}

}
