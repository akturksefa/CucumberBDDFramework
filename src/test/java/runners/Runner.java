package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",//renkli yazzdirmak icin
                "html:target/cucumber-reports.html",
                "json:target/json-report/cucumber.json",
                "junit:target/resources/features"
        },
        features = "src/test/resources/features",
        glue = {"stepDefiniations","src/test/java/hook"},
        tags = "@ConfigReader or @Practice",
        dryRun = true
)
public class Runner {
}
