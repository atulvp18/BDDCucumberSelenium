package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue={"StepDefinations"},
monochrome = true, // Formatting purpose will be effective when there will be large no of steps in scenario

//plugin = {"pretty", "html:target/HtmlReports"},
//plugin = {"pretty","json:target/JSONReports/report.json"}
//plugin = {"pretty","junit:target/JUnitReports/report.xml"},

plugin= {"pretty","html:test-output",
		"json:target/cucumber-reports/cucumber.json",
		"de.monochromata.cucumber.report.PrettyReports:target/maven-cucumber-report"},

tags="@LoginCheck"
//tags = {"@LoginCheck","@SearchCourse"}

)

public class Runner {

}
