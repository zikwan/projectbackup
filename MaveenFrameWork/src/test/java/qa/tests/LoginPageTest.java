package qa.tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.pages.LoginPage;
import qa.testbase.TestBase;

public class LoginPageTest extends TestBase{
	

	LoginPage loginpage;
	
	@BeforeMethod 
	public void SetUp() {
		initilization();
		loginpage = new LoginPage();
	}
	
	@Test 
	public void validatedLoginTest() throws InterruptedException {
//		loginpage.login("DEMO", "DEMO");
		loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		String ActUrl = driver.getCurrentUrl();
	//	AssertJUnit.assertEquals(ActUrl, prop.getProperty("expUrl"));
	//	Assert.assertEquals(ActUrl,prop.getProperty("expUrl"));
		Assert.assertEquals(ActUrl,prop.getProperty("expUrl"), "TestCase failed");
	}
	
	@Test
	public void validateLogoTest() {
		boolean logo = loginpage.isLogoDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertEquals(logo, true);
		}
	
	@AfterMethod
	public void CloseResources() throws InterruptedException{
	driver.close();
	}
}
