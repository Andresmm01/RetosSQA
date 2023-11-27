package com.Serenity.stepDefinitions;

import com.Serenity.steps.ChangeSteps;
import com.Serenity.steps.LoginSteps;
import com.Serenity.steps.ProfileSteps;
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
    ProfileSteps profileSteps;


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
        changeSteps.Order();
    }
    @When("Selects a new employee for the order")
    public void selectsANewEmployeeForTheOrder() {
        changeSteps.Emple();
        changeSteps.Emplo();
    }
    @When("Applies the changes")
    public void appliesTheChanges() {
        changeSteps.Save();
        changeSteps.Exi();
        profileSteps.cambios();

    }
    @Then("The changes are validated")
    public void theChangesAreValidated() {



    }
}
