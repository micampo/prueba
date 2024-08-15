package com.co.konex.hooks;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.model.util.EnvironmentVariables;

import static com.co.konex.utils.ConstantEnvironment.URL_WIKIPEDIA;
import static com.co.konex.utils.ConstantEnvironment.URL_YOUTUBE;
import static com.co.konex.utils.Memory.SESSION;

public class PreparedStage {

    private EnvironmentVariables environmentVariables;

    @Before(order = 1)
    public void setEnvironment(){

        URL_YOUTUBE =  environmentVariables.getProperty("urlYoutube");
        URL_WIKIPEDIA =  environmentVariables.getProperty("urlWikipedia");
    }

    @Before(order = 2)
    public void setTheActorAbility(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("AutomationIA");
        OnStage.theActorInTheSpotlight().remember(SESSION.toString(), OnStage.theActorCalled("AutomationIA"));
    }

}
