package com.co.konexinnovtion.question;

import com.co.konexinnovtion.ui.PageYoutube;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateTitleYoutube implements Question<Boolean> {

    public static ValidateTitleYoutube validateTitleSingYoutube() {
        return new ValidateTitleYoutube();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return PageYoutube.VALIDATE_TITLE_SING_YOUTUBE.resolveFor(actor).isPresent();
    }
}
