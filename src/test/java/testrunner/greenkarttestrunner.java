package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",
		glue="stepdefinitions",
		tags="@Seltest",
		plugin= {"pretty", "html:target/myhtmlreport", "json:target/myjsonreport.json", "junit:target/report.xml"},
		monochrome=true
		)
public class greenkarttestrunner {

}
