package seleniumconcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	
	static ChromeDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\software testing\\chromedriver.exe");
	    driver = new ChromeDriver();		// we will create instance of chrome 
	    driver.manage().window().maximize();
	    
	    // AlertConcept();
	   // Alert_with_OK_And_Cancel();
	    Alert_with_Textbox();
	}
	
	    public static void AlertConcept() throws InterruptedException {	
	    
	    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");	// main page
	    driver.findElement(By.xpath("//input[@name='login']")).sendKeys("Admin");

	   // Thread.sleep(2000);
	   // driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("Password");
	    
	    driver.findElement(By.xpath("//input[@name='proceed']")).click();
	   
	    Thread.sleep(2000);
	   // driver.switchTo().alert().accept();    // 1 st method
	     
	  //  Alert alt = driver.switchTo().alert();		// 2nd method
	  //  alt.accept();
	    
	    Alert alt = driver.switchTo().alert();			// 3rd method
	   String alrt_Text = alt.getText();
	   System.out.println(alrt_Text); 
	   alt.accept();
	    
	   if(alrt_Text.contains("Please enter your password")) 
	   {System.out.println("Test is pass");}
	   else 
	   { System.out.println("Test is failed");}
 }
	    
	    public static void Alert_with_OK_And_Cancel() {
	  
	    	driver.get("https://demo.automationtesting.in/Alerts.html");
	    	driver.findElement(By.xpath("//a[@href=\"#CancelTab\"]")).click();
	    	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	    	
	    	driver.switchTo().alert().dismiss();
	    }
	    
	    public static void Alert_with_Textbox() throws InterruptedException {
	 	   
	    		driver.get("https://demo.automationtesting.in/Alerts.html");
	 	    	driver.findElement(By.xpath("//a[@href=\"#Textbox\"]")).click();
	 	    	driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
	 	    	Thread.sleep(2000);
	 	    	
	 	   	 Alert alt = driver.switchTo().alert();			// 3rd method
	 	 	   String alrt_Text = alt.getText();
	 	 	   System.out.println(alrt_Text); 
	 	 	   alt.sendKeys("speedway123");
	 	 	   Thread.sleep(2000);
	 	 	   alt.accept();
	      }  
}
