package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethod2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\software testing\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();		// we will create instance of chrome 

	    String website = "https://opensource-demo.orangehrmlive.com/";
	    driver.get(website);
	    
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[5]/div/a")).click();
	    
	    Thread.sleep(5000);
	    
	    driver.navigate().back();
	    
	    Thread.sleep(5000);
	    
	    driver.navigate().forward();
	    driver.close();

	}

}
