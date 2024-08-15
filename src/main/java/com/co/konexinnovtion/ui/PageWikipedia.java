package com.co.konexinnovtion.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageWikipedia {

    public static final Target SEARCH_WIKIPEDIA = Target
            .the("input search wikipedia")
            .located(By.id("searchInput"));

    public static final Target BTN_SEARCH = Target
            .the("input search wikipedia")
            .located(By.xpath("//*[@id='searchform']/div/button"));


    public static final Target BTN_CREATE_ACCOUNT = Target
            .the("create account")
            .locatedBy("//*[@id='pt-createaccount-2']/a/span");


    public static final Target USER = Target
            .the("create user")
            .located(By.id("wpName2"));


    public static final Target PASSWORD = Target
            .the("create password")
            .located(By.id("wpPassword2"));


    public static final Target CONFIRM_PASSWORD = Target
            .the("confirm password")
            .located(By.id("wpRetype"));


    public static final Target EMAIL = Target
            .the("email")
            .located(By.id("wpEmail"));


    public static final Target BTN_CREATE_ACCOUNT_WIKIPEDIA = Target
            .the("create account wikipedia")
            .located(By.id("wpCreateaccount"));


    public static final Target VALIDATE_TITLE_WIKIPEDIA = Target.the("se verifica el titulo")
            .located(By.xpath("//*[@id='Bienvenidos_a_Wikipedia,']"));

    public static final Target SISTEMA_CEEM = Target.the("titulo de sistema ceem")
            .locatedBy("//*[@id='Análisis_CEEM']");


}
