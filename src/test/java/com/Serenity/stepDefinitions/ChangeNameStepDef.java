package com.Serenity.stepDefinitions;

import com.Serenity.steps.ChangeSteps;
import com.Serenity.steps.LoginSteps;
import com.Serenity.steps.ValidateSteps;
import com.Serenity.steps.WebSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ChangeNameStepDef {

    @Steps
    ChangeSteps changeSteps;

    @Steps
    LoginSteps loginSteps;

    @Steps
    ValidateSteps validateSteps;

    @Steps
    WebSteps webSteps;


    @Given("User opens the browser")
    public void userOpensTheBrowser() {
        loginSteps.openBrowser();
    }
    @When("User inserts credentials and clicks on login")
    public void userInsertsCredentialsAndClicksOnLogin() {
        loginSteps.clear();
        loginSteps.sendCredencials();

    }

    @When("The user clicks on Open Orders")
    public void theUserClicksOnOpenOrders() {
        loginSteps.clickLogin();
    }
    @When("The user selects a specific order")
    public void theUserSelectsASpecificOrder() {
        changeSteps.OpenOrder();
        webSteps.Order();
    }
    @When("Selects a new employee for the order")
    public void selectsANewEmployeeForTheOrder() {
        changeSteps.Emple();
        webSteps.Emplo();
    }
    @When("Applies the changes")
    public void appliesTheChanges() {
        changeSteps.Save();



    }
    @Then("The changes are validated")
    public void theChangesAreValidated() {
        validateSteps.Cambios();


    }
}
