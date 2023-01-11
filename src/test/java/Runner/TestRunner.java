package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
       features = "src\\main\\java\\Features",
        glue = "stepdefinitions",
        tags = "@Regression"

)
public class TestRunner {
}
