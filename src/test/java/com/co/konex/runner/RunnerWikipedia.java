package com.co.konex.runner;

import com.co.konex.utils.BeforeSuite;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(RunnerPersonalizado.class)
@CucumberOptions(features = "src/test/resources/features/search/wikipedia.feature",
        glue = {"com/co/konex/stepdefinitions", "com/co/konex/hooks"},
        tags = "@regresionWikipedia",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class RunnerWikipedia {

    @BeforeSuite
    public static void test() {
    }
}
