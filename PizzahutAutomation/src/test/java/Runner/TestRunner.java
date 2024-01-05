package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(strict = true,
		
		monochrome=true,
		plugin= {"pretty"},
		features = {"src/test/java/features"},
		glue = {"StepDefs"},
		tags= {"@Regressions"}
   
		)
		
public class TestRunner {
	

}

























































































