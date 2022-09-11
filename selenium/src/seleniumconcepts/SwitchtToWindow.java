package seleniumconcepts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchtToWindow {

	static ChromeDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\software testing\\chromedriver.exe");
	    driver = new ChromeDriver();		// we will create instance of chrome 
	    driver.manage().window().maximize();
	    driver.get("https://demo.automationtesting.in/Windows.html");	// main page
	   
	    
	    String pwh = driver.getWindowHandle();    // parentwindowhandle
	    System.out.println(pwh);
	    
	    System.out.println("************************");
	    
	    driver.findElement(By.xpath("(//button[@class=\"btn btn-info\"])[1]")).click();
	   
	    Set<String> windows = driver.getWindowHandles();
	  													// PWH PARENT
	    														// CWH CHILD 
	    for(String win: windows) {
	    	System.out.println(win);
	    	if (!win.equals(pwh)) {
	    		driver.switchTo().window(win);
	    	}
	    }
	    
	    driver.findElement(By.xpath("(//a[@class=\"nav-link\"])[1]")).click();
	    
	}

}
