package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/login.feature",
        glue = "steps",
        plugin = {"html:target/report.html","json:target/cucumber.json"}
)
public class TestRunner {
}
