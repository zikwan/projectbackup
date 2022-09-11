package stepdef;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginPageDtepDef {
	WebDriver driver;

	@Given("^user should be on login page$") 
		public void user_On_Login_Page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\software testing\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		}
		
	@When("^user will enter username$")
	public void user_will_enter_username() {
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	}

	@When("^user will enter password$")
	public void user_will_enter_password() {
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}

	@And("^user will click on login button$")
	public void user_will_click_on_login_button() {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^uesr should be landed on Home Page$")
	public void uesr_should_be_landed_on_Home_Page() {
		WebElement msg = driver.findElement(By.id("spanMessage"));
		String massage = msg.getText();
		Assert.assertEquals("Invalid credentials", massage);
	}


	
}
