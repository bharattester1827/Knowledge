package Knowledge.KnowledgeTraining;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",
				format = {"html:target/CucumberReport","json:CucumberReport/cucumber.json"},
				tags = "@homepage",
				glue = "Knowledge.KnowledgeTraining"
		)

public class RunnerClass {

}
