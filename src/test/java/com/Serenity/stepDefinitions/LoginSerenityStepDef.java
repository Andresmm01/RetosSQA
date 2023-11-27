package com.Serenity.stepDefinitions;
/*
 * @(#) LoginSpotifyStepDef.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */


import com.Serenity.steps.LoginSteps;
import com.Serenity.steps.ProfileSteps;
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
    ProfileSteps profileSteps;

    @Given("User open the browser")
    public void userOpenTheBrowser() {
        loginSteps.openBrowser();


    }
    @When("User insert credentials {string} {string} and click on login")
    public void userInsertCredentialsAndClickOnLogin(String user, String pssw) {
        loginSteps.clear();
        loginSteps.sendCredencials();
        loginSteps.clickLogin();

    }
    @Then("User successfully accesses their profile")
    public void userSuccessfullyAccessesTheirProfile() {
        profileSteps.valedateProfile();

    }




}