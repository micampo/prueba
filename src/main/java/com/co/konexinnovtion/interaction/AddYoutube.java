package com.co.konexinnovtion.interaction;

import com.co.konexinnovtion.ui.PageYoutube;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.co.konexinnovtion.ui.PageYoutube.CREATE_ACCOUNT;
import static com.co.konexinnovtion.ui.PageYoutube.ITEM_ACCOUNT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


public class AddYoutube {

    public static Performable search(String search) {
        return Task.where("{0} add a search #search",
                Enter.theValue(search)
                        .into(PageYoutube.SEARCH_YOUTUBE)
                        .thenHit(Keys.ENTER));

    }

    public static Performable btnSearchYoutube() {
        return Task.where("Click btn search youtube",
                Click.on(PageYoutube.BTN_SEARCH_YOUTUBE)
        );
    }


    public static Performable lknSearchYoutube() {
        return Task.where("Click btn search youtube",
                Click.on(PageYoutube.LINK_YOUTUBE_SING)
        );
    }

    public static Performable access() {
        return Task.where("Click btn access",
                Click.on(PageYoutube.ACCESS)
        );
    }

    public static Performable createAccount() {
        return Task.where("click btn createAccount",
                Click.on(CREATE_ACCOUNT)
                        .then(WaitUntil.the(ITEM_ACCOUNT, isClickable()))
                        .then(Click.on(ITEM_ACCOUNT))
        );
    }

    public static Performable firstName(String firstName) {
        return Task.where("{0} add a first name #firstName",
                Click.on(PageYoutube.FIRST_NAME).then(Enter.theValue(firstName).into(PageYoutube.FIRST_NAME))
        ).with("firstName").of(firstName);
    }

    public static Performable lastName(String lastName) {
        return Task.where("{0} add a last name #lastName",
                Click.on(PageYoutube.LAST_NAME).then(Enter.theValue(lastName).into(PageYoutube.LAST_NAME))
        ).with("lastName").of(lastName);
    }


    public static Performable day(String day) {
        return Task.where("{0} add a day #day",
                Click.on(PageYoutube.DAY).then(Enter.theValue(day).into(PageYoutube.DAY))
        ).with("day").of(day);
    }

    public static Performable month() {
        return Task.where("{0} add a month #month",
                Click.on(PageYoutube.MONTH)
        );
    }


    public static Performable year(String year) {
        return Task.where("{0} add a year #year",
                Click.on(PageYoutube.YEAR).then(Enter.theValue(year).into(PageYoutube.YEAR))
        ).with("year").of(year);
    }


    public static Performable gender() {
        return Task.where("{0} add a gender #gender",
                Click.on(PageYoutube.GENDER));
    }


    public static Performable email(String email) {
        return Task.where("{0} add a email #email",
                Click.on(PageYoutube.EMAIL).then(Enter.theValue(email).into(PageYoutube.EMAIL))
        ).with("email").of(email);
    }


    public static Performable following() {
        return Task.where("Click in following ",
                Click.on(PageYoutube.FOLLOWING)
        );
    }


}
