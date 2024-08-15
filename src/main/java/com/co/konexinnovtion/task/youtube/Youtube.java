package com.co.konexinnovtion.task.youtube;

import com.co.konexinnovtion.interaction.AddYoutube;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Youtube implements Task {

    public static Youtube with() {
        return Tasks.instrumented(Youtube.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                AddYoutube.search("Locked out of heaven"),
                AddYoutube.btnSearchYoutube(),
                AddYoutube.lknSearchYoutube()
        );

    }
}
