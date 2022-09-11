package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameConcept {
	
	static ChromeDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\software testing\\chromedriver.exe");
	    driver = new ChromeDriver();		// we will create instance of chrome 
	    driver.manage().window().maximize();

	    driver.get("https://demo.automationtesting.in/Frames.html");	// main page
	  //  driver.switchTo().frame("SingleFrame");			// it will help to switch to frame
	   // driver.switchTo().frame(0);					// it will help to switch to frame by integer value
	
	    FrameInsideFrameConcept();
	}
	
	    public static void FrameConcept()		{
	    	WebElement frame = driver.findElement(By.id("singleframe"));
		    driver.switchTo().frame(frame);					// it will help to switch to frame webelement
		    
		    driver.findElement(By.xpath("(//input[@type='text'])")).sendKeys("zikwan123"); //it is inside the frame
		    
		    driver.switchTo().defaultContent();
		    driver.findElement(By.partialLinkText("ome")).click();
	    }
	    
	    private static void FrameInsideFrameConcept() throws InterruptedException {
	    	
	    	driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
	    	WebElement frame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		    driver.switchTo().frame(frame);					// it will help to switch to frame webelement
		    WebElement frame2 = driver.findElement(By.xpath("(//iframe[@src='SingleFrame.html'])"));
		    driver.switchTo().frame(frame2);
		    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("zikwan123"); //it is inside the frame
		    
		    driver.switchTo().defaultContent();
		    driver.findElement(By.partialLinkText("ome")).click();
		Thread.sleep(4000);
		driver.close();
		
	}

}
