import StepDefinition.TestApplication;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = TestApplication.class)
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/"
        , format = {"json:target/destination/cucumber.json"},
        tags = {"@NearbyAPI"}
        )
public class BddRunner {

}