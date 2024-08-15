package com.co.konexinnovtion.task.login;

import com.co.konexinnovtion.utils.ConfigVariables;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenNavigator implements Task {

    public String urls;

    public OpenNavigator(String urls) {
        this.urls = urls;
    }

    public static OpenNavigator toOpenNavigator(String url) {
        return Tasks.instrumented(OpenNavigator.class, url);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        if (urls.equalsIgnoreCase("wikipedia")){
            actor.attemptsTo(
                    Open.url(ConfigVariables.gerUrlWikipedia())
            );
        }else{
            actor.attemptsTo(
                    Open.url(ConfigVariables.gerUrlYoutube())
            );
        }

    }
}
