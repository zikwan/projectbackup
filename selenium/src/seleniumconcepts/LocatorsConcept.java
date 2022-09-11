package seleniumconcepts;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {
	
	static ChromeDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\software testing\\chromedriver.exe");
	    driver = new ChromeDriver();		// we will create instance of chrome 
	    
	     linkTextLocator();
	    //cssSelectorLocator();
	
	}
	
	    private static void cssSelectorLocator() {
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.cssSelector("[placeholder='First Name']")).sendKeys("speedway");
		
		// or 
		//driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("speedway");
		
		WebElement malerdobtn = driver.findElement(By.name("radiooptions"));
		//malerdobtn.click();
		
		if(!malerdobtn.isSelected()) {
			driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		}
		else {
			
		}
		driver.findElement(By.cssSelector("#checkbox1")).click();
		driver.findElement(By.cssSelector("#checkbox2")).click();
		driver.findElement(By.cssSelector("#checkbox3")).click();
	    
	   
	    }

		public static void tagNameLocator()	{
	    	
	    	String website = "http://demo.automationtesting.in/Index.html";
		    driver.get(website);
		    
		    List<WebElement> links = driver.findElements(By.tagName("a"));  // to check links on web page
		    System.out.println(links.size());								// to print numbers of links
		    
	    }
	    public static void linkTextLocator() {
	    	
	    	driver.get("http://demo.automationtesting.in/WebTable.html");
	    	driver.findElement(By.linkText("Register")).click();
	    
	    }
	    public static void partialLinkTextLocator() {
	    	
	    	driver.get("http://demo.automationtesting.in/WebTable.html");
	    	driver.findElement(By.partialLinkText("Web")).click();
	    	}
	    
	    
	}


