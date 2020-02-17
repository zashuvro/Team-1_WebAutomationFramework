package featurefilerunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = { "src/test/java/featuresfile/" },
        glue = { "stepdefination"},
        strict = true,        monochrome=true,
        tags={},
        plugin = {"pretty", "json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports"}


)

public class CucumberRunner extends AbstractTestNGCucumberTests {


}
