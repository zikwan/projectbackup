package runner;
import org.junit.runner.RunWith;

import io.cucumber.testng.CucumberOptions;




@RunWith(Cucumber.class)

@CucumberOptions(
	
			// features file
			features ="C:\\Users\\admin\\eclipse2-workspace\\BDD\\src\\main\\java\\stepdef\\LoginPageDtepDef.java",
		
			//step defination file
			glue ="stepdefination"	
		)
public class TestRunner {

}