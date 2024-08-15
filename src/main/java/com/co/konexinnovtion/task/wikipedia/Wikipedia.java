package com.co.konexinnovtion.task.wikipedia;

import com.co.konexinnovtion.interaction.AddWikipedia;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.co.konexinnovtion.ui.PageWikipedia.SISTEMA_CEEM;

public class Wikipedia implements Task {

    public static Wikipedia with() {
        return Tasks.instrumented(Wikipedia.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                AddWikipedia.search("Sistema"),
                AddWikipedia.btn_search(),
                Scroll.to(SISTEMA_CEEM)
        );

    }
}
