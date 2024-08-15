package com.co.konexinnovtion.question;

import com.co.konexinnovtion.ui.PageWikipedia;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateTitleWikipedia implements Question<Boolean> {

    public static ValidateTitleWikipedia successful() {
        return new ValidateTitleWikipedia();
    }

    @Override
    public Boolean answeredBy(Actor actor){
        return PageWikipedia.VALIDATE_TITLE_WIKIPEDIA.resolveFor(actor).isPresent();
    }
}
