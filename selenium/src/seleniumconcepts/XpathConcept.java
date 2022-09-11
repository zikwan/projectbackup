package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathConcept {
	
	static ChromeDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\software testing\\chromedriver.exe");
		    driver = new ChromeDriver();		// we will create instance of chrome 
		    driver.get(" http://demo.automationtesting.in/Register.html");

		     Absolute_Xpath();
		   // Relative_Xpath();
		   // Relative_Xpath_Method();
	}
	public static void Absolute_Xpath() {
		    // absolute xpath
		   driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[1]/input")).sendKeys("speedway");
	}   
		    
	public static void Relative_Xpath() {	
		// relative xpath
	     driver.findElement(By.xpath("// input[@placeholder='First Name']")).sendKeys("speedway");		
	}
		    
	public static void Relative_Xpath_Method() {
	// relative xpath method : text 
		  driver.findElement(By.xpath("//a[text()='Home']")).click();
	}
 
}
