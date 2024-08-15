package com.co.konexinnovtion.task.wikipedia;

import com.co.konexinnovtion.interaction.AddWikipedia;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.ArrayList;
import java.util.List;

public class CreateAccountWikipedia implements Task {

    public CreateAccountWikipedia(List<Performable> itemsWikipedia) {
        this.itemsWikipedia = itemsWikipedia;
    }

    public static CreateAccountWikipedia with() {
        return Tasks.instrumented(CreateAccountWikipedia.class);
    }

    public CreateAccountWikipedia() {
        itemsWikipedia = new ArrayList<>();
    }


    public CreateAccountWikipedia user(String user) {
        this.itemsWikipedia.add(AddWikipedia.user(user));
        return this;
    }

    public CreateAccountWikipedia password(String password) {
        this.itemsWikipedia.add(AddWikipedia.password(password));
        return this;
    }

    public CreateAccountWikipedia confirmPassword(String confirmPassword) {
        this.itemsWikipedia.add(AddWikipedia.confirmPassword(confirmPassword));
        return this;
    }

    public CreateAccountWikipedia email(String email) {
        this.itemsWikipedia.add(AddWikipedia.email(email));
        return this;
    }


    private final List<Performable> itemsWikipedia;


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                AddWikipedia.btnCreateAccount()
        );

        actor.attemptsTo(
                wikipediaActions()
        );

    }

    private Performable[] wikipediaActions() {
        this.itemsWikipedia.add(AddWikipedia.btnCreateAccountWikipedia());
        return this.itemsWikipedia.toArray(new Performable[this.itemsWikipedia.size()]);
    }
}
