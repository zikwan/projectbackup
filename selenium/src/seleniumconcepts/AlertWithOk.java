package seleniumconcepts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	

	public class AlertWithOk 
	{

		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\software testing\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://demo.automationtesting.in/Alerts.html");
			Thread.sleep(5000);
			driver.findElement(By.linkText("Alert with Textbox")).click(); 
			
			WebElement frame= driver.findElement(By.xpath("/html/body/iframe"));
			driver.switchTo().frame(frame);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/iframe")).click();
		// try by some other locator i will show u that it shows unique value
			//Alert a =driver.switchTo().alert();
		
			//System.out.println(a.getText());
			//a.sendKeys("jayasvee");
			//a.accept();
			//String s = driver.findElement(By.id("demo1")).getText();
			//if(s.contains("jaysvee")) {
				System.out.println("Pass");
			}
			

		}

	


