package com.co.konexinnovtion.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageYoutube {

    public static final Target SEARCH_YOUTUBE = Target
            .the("input search youtube")
            .locatedBy("(//*[@id='search'])[3]");

    public static final Target BTN_SEARCH_YOUTUBE = Target
            .the("btn search youtube")
            .locatedBy("//*[@id='search-icon-legacy']");

    public static final Target LINK_YOUTUBE_SING = Target
            .the("lkn sing youtube")
            .locatedBy("(//*[@id='video-title']/yt-formatted-string)[1]");

    public static final Target VALIDATE_TITLE_SING_YOUTUBE = Target.the("se verifica el titulo de la cancion")
            .located(By.xpath("//*[@id='title']/h1/yt-formatted-string"));



    public static final Target ACCESS = Target
            .the("btn access")
            .located(By.xpath("//*[@id='buttons']/ytd-button-renderer/yt-button-shape/a/yt-touch-feedback-shape/div/div[2]"));

    public static final Target CREATE_ACCOUNT = Target
            .the("create account")
            .located(By.xpath("//*[@id='yDmH0d']/c-wiz/div/div[3]/div/div[2]/div/div/div[1]/div/button/span"));


    public static final Target ITEM_ACCOUNT = Target
            .the("item account")
            .located(By.xpath("//*[@id='yDmH0d']/c-wiz/div/div[3]/div/div[2]/div/div/div[2]/div/ul/li[1]/span[3]"));


    public static final Target FIRST_NAME = Target
            .the("first name")
            .located(By.id("firstName"));

    public static final Target LAST_NAME = Target
            .the("Click btn")
            .located(By.id("lastName"));


    public static final Target DAY = Target
            .the("Click day")
            .located(By.id("day"));

    public static final Target MONTH = Target
            .the("Click month")
            .locatedBy("//*[@id='month']/option[13]");

    public static final Target YEAR = Target
            .the("Click year")
            .located(By.id("year"));

    public static final Target GENDER = Target
            .the("Click gender")
            .locatedBy("//*[@id='gender']/option[3]");


    public static final Target EMAIL = Target
            .the("Click email")
            .located(By.id("identifierId"));



    public static final Target FOLLOWING = Target
            .the("Click btn following")
            .located(By.xpath("//*[contains(text(),'Siguiente')]"));

}
