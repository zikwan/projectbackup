package seleniumconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropDownLangSelect {
	
	static ChromeDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\software testing\\chromedriver.exe");
	    driver = new ChromeDriver();		// we will create instance of chrome 
	    driver.manage().window().maximize();
	    driver.get("https://demo.automationtesting.in/Register.html");
	
	    LanguageSelect();
	  //  DateOfBirth();
	  //  Month();
	 //   Date();
	}
	    private static void LanguageSelect() throws InterruptedException {
	    
	    driver.findElement(By.xpath("//div[@id='msdd']")).click();
	    Thread.sleep(2000);
	    List<WebElement> options = driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']/li"));
	    System.out.println(options.size());
	    
	     for (WebElement opt: options) {
	    String optvalue = opt.getText();		// to get text value from WebElement
	  // System.out.println(optvalue);			// printing value on console
	    if (optvalue.contains("Hindi")) {
	   	opt.click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("//div[@class='container center']")).click();	
	    }
	   }
	 }
	    private static void DateOfBirth() throws InterruptedException {
	    	
	     driver.findElement(By.xpath("//select[@id='yearbox']")).click();
	        List<WebElement> allOptions = driver.findElements(By.xpath("//select[@id='yearbox']//option"));
	        //System.out.println(allOptions.size());
	        
	        for(int i = 0; i<=allOptions.size()-1; i++) {
	        if(allOptions.get(i).getText().contains("2010")) {
	    allOptions.get(i).click();
	   driver.findElement(By.xpath("//div[@class='container center']")).click();
        }        
       }
	  }
	    private static void Month() throws InterruptedException  {
	    	
	    	driver.findElement(By.xpath("//select[@placeholder='Month']")).click();
		    Thread.sleep(2000);
		    List<WebElement> options = driver.findElements(By.xpath("//select[@placeholder='Month']//option"));
		    for (WebElement opt: options) {
		    String optvalue = opt.getText();		// to get text value from WebElement
		    //System.out.println(optvalue.length());			// printing value on console
		    if (optvalue.contains("July")) {
		    	opt.click();
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//div[@class='container center']")).click();	
		    }
	    }
	    }
	    private static void Date() throws InterruptedException {
	    	
		     driver.findElement(By.xpath("//select[@placeholder='Day']")).click();
		        List<WebElement> allOptions = driver.findElements(By.xpath("//select[@placeholder='Day']//option"));
		        System.out.println(allOptions.size());
		        
		        for(int i = 0; i<=allOptions.size()-1; i++) {
		        if(allOptions.get(i).getText().contains("20")) {
		    allOptions.get(i).click();
		   driver.findElement(By.xpath("//div[@class='container center']")).click();
	        }        
	       }
		  }	    
}
   