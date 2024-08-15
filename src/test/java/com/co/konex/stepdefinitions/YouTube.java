package com.co.konex.stepdefinitions;

import com.co.konexinnovtion.exceptions.ExceptionGlobal;
import com.co.konexinnovtion.question.ValidateTitleYoutube;
import com.co.konexinnovtion.task.login.OpenNavigator;
import com.co.konexinnovtion.task.youtube.CreateAccountYoutube;
import com.co.konexinnovtion.task.youtube.Youtube;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;

import static com.co.konexinnovtion.utils.ConstantConf.YOUTUBE;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class YouTube {

    @Given("AutomationIA requiero ingresar a youtube")
    public void automationIARequieroIngresarAYoutube() {
        theActorInTheSpotlight().wasAbleTo(OpenNavigator.toOpenNavigator(YOUTUBE));
    }

    @When("la pagina sea visible buscar la cancion Locked out of heaven")
    public void cuandoLaPaginaEsVisble() {
        theActorInTheSpotlight().attemptsTo(
                Youtube.with()
        );
    }

    @Then("debera validar el titulo de la cancion")
    public void deberaValidarElTituloDeLaCancion() {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(ValidateTitleYoutube.validateTitleSingYoutube()).orComplainWith(ExceptionGlobal.class, ExceptionGlobal.TITLE_FAIL)
        );
    }

    @When("la pagina sea visible acceder al fomulario para crear la cuenta")
    public void creacionDeCuentaEnYoutube() {
        theActorInTheSpotlight().attemptsTo(
                CreateAccountYoutube.with()
        );
    }

    @Then("debera quedar la cuenta creada")
    public void deberaCrearLaCuenta() {
        theActorInTheSpotlight().should(
               // GivenWhenThen.seeThat(ValidateTitleYoutube.validateTitleSingYoutube()).orComplainWith(ExceptionGlobal.class, ExceptionGlobal.TITLE_FAIL)
        );
    }
}



