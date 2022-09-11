package seleniumconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWebPage {

	static ChromeDriver driver;
	
	public static void main(String[] arg)  {
		
		//configure;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\software testing\\chromedriver.exe");
	     driver = new ChromeDriver();		// we will create instance of chrome 
		
	    // or String website = "https://www.google.com/";
	    // driver.get(website);
	    
	    driver.get("https://www.google.com/"); 			// to visit the website 

		String title,zik;									// created String variable 
		title = driver.getTitle();						// assigned title of googlepage
		System.out.println(title);						// printing title variable
		
		zik = driver.getCurrentUrl();
		System.out.println(zik);
		
		
		if(title.contains("Google")) {
			System.out.println("test passed");
		}
		else 
		{
			System.out.println("Test failed");
		}
		
		driver.close();
	}
}