package com.co.konexinnovtion.task.youtube;

import com.co.konexinnovtion.interaction.AddYoutube;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class CreateAccountYoutube implements Task {

    public static CreateAccountYoutube with() {
        return Tasks.instrumented(CreateAccountYoutube.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                AddYoutube.access(),
                AddYoutube.createAccount()
        );


        actor.attemptsTo(
                AddYoutube.firstName("Miguel"),
                AddYoutube.lastName("Campo"),
                AddYoutube.following(),
                AddYoutube.day("06"),
                AddYoutube.month(),
                AddYoutube.year("1990"),
                AddYoutube.gender(),
                AddYoutube.following(),
                AddYoutube.email("prueba1208@kpnexinnoovation.com"),
                AddYoutube.following()
        );

    }
}
