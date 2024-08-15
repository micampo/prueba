package com.co.konexinnovtion.interaction;

import com.co.konexinnovtion.ui.PageWikipedia;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.konexinnovtion.ui.PageWikipedia.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


public class AddWikipedia {

    public static Performable search(String search) {
        return Task.where("{0} add a search #search",
                WaitUntil.the(SEARCH_WIKIPEDIA, isClickable())
                        .then(Enter.theValue(search)
                                .into(SEARCH_WIKIPEDIA))
        );
    }

    public static Performable btn_search() {
        return Task.where("Click btn search",
                Click.on(PageWikipedia.BTN_SEARCH)
        );
    }

    public static Performable btnCreateAccount() {
        return Task.where("Click btn create account",
                Click.on(PageWikipedia.BTN_CREATE_ACCOUNT)
        );
    }

    public static Performable user(String user) {
        return Task.where("enter user",
                        Enter.theValue(user).into(USER))
                .with("user").of(user);
    }


    public static Performable password(String password) {
        return Task.where("enter password",
                        Enter.theValue(password).into(PASSWORD))
                .with("password").of(password);
    }

    public static Performable confirmPassword(String confirmPassword) {
        return Task.where("enter confirm password",
                        Enter.theValue(confirmPassword).into(CONFIRM_PASSWORD))
                .with("confirmPassword").of(confirmPassword);
    }

    public static Performable email(String email) {
        return Task.where("enter email",
                        Enter.theValue(email).into(EMAIL))
                .with("email").of(email);
    }

    public static Performable btnCreateAccountWikipedia() {
        return Task.where("Click btn create account",
                Click.on(BTN_CREATE_ACCOUNT_WIKIPEDIA)
        );
    }

}
