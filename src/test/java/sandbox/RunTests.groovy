package sandbox;

import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

@RunWith(Cucumber.class)
@Cucumber.Options(
        features = "classpath:features",
        glue = "classpath:sandbox/steps",
        tags = "~@wip")
public class RunTests {

}
