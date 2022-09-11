package seleniumconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	static ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\software testing\\chromedriver.exe");
	    driver = new ChromeDriver();		// we will create instance of chrome 
	    driver.manage().window().maximize();
	    driver.get("https://www.google.com/");
	    WebElement googleInputBox = driver.findElement(By.name("q"));
	    googleInputBox.sendKeys("Java");
	    Thread.sleep(1000);
	    
	    List<WebElement> options = driver.findElements(By.xpath("//ul[@jsname='bw4e9b']/li"));
	    
	     for (WebElement opt: options) {
	    	 
	    	String optvalue = opt.getText();		// to get text value from WebElement
	    	
	    	System.out.println(optvalue);			// printing value on console
	     
	    	if (optvalue.contains("javascript")) {
	    	opt.click();
	    	Thread.sleep(4000);
	    	driver.close();
	    	}
	    	
	     }
	 
	    // Alternative Method
	    
	  //  for (int i = 0;i<options.size();i++) {
	  //  	String optvalue = options.get(i).getText();
	  //  	//Thread.sleep(2000);
	  //  	System.out.println(optvalue);
	  //  }
	   	
	} 
}   

	