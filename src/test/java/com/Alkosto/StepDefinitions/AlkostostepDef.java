package com.Alkosto.StepDefinitions;


import com.Alkosto.Questions.Validate;
import com.Alkosto.Task.CartTask;
import com.Alkosto.Task.HomeTask;
import com.Alkosto.Task.OpenBrowserTask;
import com.Alkosto.Task.SelectproductTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.is;


public class AlkostostepDef {

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        setTheStage(new OnlineCast());
    }
    @Given("that the user opens the browser and searches for a product through the search bar.")
    public void thatTheUserOpensTheBrowserAndSearchesForAProductThroughTheSearchBar() {
        theActorCalled("usuario").wasAbleTo(
                OpenBrowserTask.open(),
                    HomeTask.search()
        );

    }
    @When("the user can select two products randomly and add them to the cart")
    public void theUserCanSelectTwoProductsRandomlyAndAddThemToTheCart() {
        theActorCalled("usuario").wasAbleTo(
                SelectproductTask.select(),
                CartTask.Cart()
        );

    }
    @Then("the user should be able to view the products in the shopping cart")
    public void theUserShouldBeAbleToViewTheProductsInTheShoppingCart() {
        theActorInTheSpotlight().should(
                seeThat(
                        Validate.validate(), Matchers.equalTo(true)
                )
        );

    }
}
