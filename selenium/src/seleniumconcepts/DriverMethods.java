package seleniumconcepts;

import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethods {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\software testing\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();		// we will create instance of chrome 

	    String website = "https://opensource-demo.orangehrmlive.com/";
	    driver.get(website);
	    
	    String Url = driver.getCurrentUrl();
	    
	    System.out.println("*******************************");
	    
	    System.out.println("current url :" + Url);

	    
	    System.out.println("*******************************");
	    
	    if (Url.equalsIgnoreCase("https://opensource-demo.orangehrmlive.com/")) {
	    	System.out.println("Test case passed");
	    	}
	    else {
	    	System.out.println("Test case failed ");
	    }
	    
	    
	    
	    //driver.findElementByName("txtUsername");
	    
	}

}
