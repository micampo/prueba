package com.co.konex.stepdefinitions;

import com.co.konexinnovtion.exceptions.ExceptionGlobal;
import com.co.konexinnovtion.question.ValidateTitleSistemaCeem;
import com.co.konexinnovtion.question.ValidateTitleWikipedia;
import com.co.konexinnovtion.task.login.OpenNavigator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;

import static com.co.konexinnovtion.utils.ConstantConf.WIKIPEDIA;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class Wikipedia {

    @Given("AutomationIA requiero ingresar a wikipedia")
    public void automationIARequieroIngresarAWikipedia() {
        theActorInTheSpotlight().wasAbleTo(OpenNavigator.toOpenNavigator(WIKIPEDIA));
    }

    @When("la pagina muestre el letrero de bienvenida")
    public void laPaginaMuestreElLetreroDeBienvenida() {
        theActorInTheSpotlight().attemptsTo(

        );
    }

    @When("ingreso la palabra sistema")
    public void cuandoIngresoLaPalabraSistema() {
        theActorInTheSpotlight().attemptsTo(
                com.co.konexinnovtion.task.wikipedia.Wikipedia.with()
        );
    }

    @Then("debera validar el titulo")
    public void deberaValidarElTitulo() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateTitleWikipedia.successful()).orComplainWith(ExceptionGlobal.class, ExceptionGlobal.TITLE_FAIL));
    }

    @Then("debera validar el titulo sistema ceem")
    public void deberaValidarElTituloSistemaCeem() {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(ValidateTitleSistemaCeem.validateTitleSistemaCeem()).orComplainWith(ExceptionGlobal.class, ExceptionGlobal.TITLE_FAIL)
        );
    }


    @When("ingreso a crear una cuenta con mi información")
    public void cuandoIngresoLaCuentaConMiInformacion() {
        theActorInTheSpotlight().attemptsTo(
                com.co.konexinnovtion.task.wikipedia.CreateAccountWikipedia
                        .with()
                        .user("Miguel campo salgado")
                        .password("123545+M")
                        .confirmPassword("123545+M")
                        .email("miguel@hotmail.com")
        );
    }


    @Then("deberia crear mi cuenta")
    public void deberiaCrearMiCuenta() {
        theActorInTheSpotlight().should(
                //GivenWhenThen.seeThat(ValidateTitleSistemaCeem.validateTitleSistemaCeem()).orComplainWith(ExceptionGlobal.class, ExceptionGlobal.TITLE_FAIL)
        );
    }

}
