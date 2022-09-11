package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	static ChromeDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\software testing\\chromedriver.exe");
	    driver = new ChromeDriver();		// we will create instance of chrome 
	    driver.manage().window().maximize();
	    driver.get("http://demo.automationtesting.in/Register.html");
	    
	    WebElement skillsDropDown = driver.findElement(By.cssSelector("#Skills"));
	    
	    Select sel = new Select(skillsDropDown);
	    //sel.selectByVisibleText("Java");
	    
	    //sel.selectByIndex(5);		// it will select value present at number 5 [index is for integer value]
	    sel.selectByValue("Art Design");
	}

}
