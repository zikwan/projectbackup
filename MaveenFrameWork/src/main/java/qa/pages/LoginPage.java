package qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.testbase.TestBase;

public class LoginPage extends TestBase {

	// Element Respository 
	@FindBy(name = "username")
	WebElement usernametxt;
	

	@FindBy(name = "password")
	WebElement passwordtxt;
	

	@FindBy(xpath = "//button[@type='submit']")
	WebElement lgnbtn;
	

	@FindBy(xpath = "//div[@class='orangehrm-login-branding']/img")
	WebElement logo;
	
	@FindBy(xpath = "//div[@class='orangehrm-login-forgot']/p")
	WebElement forgotPasslink;
	// Actions or Methods 
	
	public void login(String userid,String pwd)  {
		usernametxt.sendKeys(userid);
		passwordtxt.sendKeys(pwd);
		lgnbtn.click();
		}
	
	public boolean isLogoDisplayed() {
		boolean logostatus = logo.isDisplayed();
		return logostatus;
	}
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
}
