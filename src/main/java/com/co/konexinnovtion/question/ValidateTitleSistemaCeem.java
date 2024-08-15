package com.co.konexinnovtion.question;

import com.co.konexinnovtion.ui.PageWikipedia;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateTitleSistemaCeem implements Question<Boolean> {

    public static ValidateTitleSistemaCeem validateTitleSistemaCeem() {
        return new ValidateTitleSistemaCeem();
    }

    @Override
    public Boolean answeredBy(Actor actor){
        return PageWikipedia.SISTEMA_CEEM.resolveFor(actor).isPresent();
    }
}
