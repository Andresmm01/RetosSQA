package com.Serenity.stepDefinitions;
/*
 * @(#) LoginSpotifyStepDef.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */


import com.Serenity.steps.LoginSteps;
import com.Serenity.steps.ValidateSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class LoginSerenityStepDef {

    @Steps
    LoginSteps loginSteps;

    @Steps
    ValidateSteps validateSteps;

    @Given("User open the browser")
    public void userOpenTheBrowser() {
        loginSteps.openBrowser();


    }
    @When("User insert credentials and click on login")
    public void userInsertCredentialsAndClickOnLogin() {
        loginSteps.clear();
        loginSteps.sendCredencials();
        loginSteps.clickLogin();


    }
    @Then("User successfully accesses their profile")
    public void userSuccessfullyAccessesTheirProfile() {
    validateSteps.valedateProfile();

    }




}
