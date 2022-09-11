package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\software testing\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();		// we will create instance of chrome 

	    String website = "https://opensource-demo.orangehrmlive.com/";
	    driver.get(website);
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.className("button")).click();

	}

}
