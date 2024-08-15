package com.co.konex.runner;

import com.co.konex.utils.BeforeSuite;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(RunnerPersonalizado.class)
@CucumberOptions(features = "src/test/resources/features/search/youtube.feature",
        glue = {"com/co/konex/stepdefinitions", "com/co/konex/hooks"},
        tags = "@regresionYoutube",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class RunnerYoutube {

    @BeforeSuite
    public static void test() {
    }
}
