package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.junit.runner.RunWith;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(features= "src/test/resources/features/uTest.feature",
            tags="@stories",
            glue="stepdefinitions",
            snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
