package runner;

import org.junit.runner.RunWith;



import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features", glue= {"stepdescription","pages"},
monochrome=true,
plugin= {"pretty","html:CucumberReport"}, 
dryRun=false, snippets= SnippetType.CAMELCASE,
tags= {"@DuplicateLead"})
public class TestRunner 
{

}
