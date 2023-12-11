package com.Alkosto.Runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        tags = "@Successful",
        glue = "com.Alkosto.StepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class AlkostoRunners {
}


