package cucumberOptions;



import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/java/features", glue="StepDefination")  // mapping features and Stepdefination package here

public class TestRunner 
{
	

}