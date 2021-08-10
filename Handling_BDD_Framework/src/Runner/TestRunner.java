package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature",
glue={"StepDefination"},
tags={"@OptimizedwayScenario"},
plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/Automation.html"}
)
public class TestRunner {
	

}
