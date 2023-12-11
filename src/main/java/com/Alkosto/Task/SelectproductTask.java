package com.Alkosto.Task;

import com.Alkosto.Interactions.RandomSelect;
import com.Alkosto.Interactions.WindowsBack;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.WebDriver;


import static com.Alkosto.UI.CartUI.BTN_Cart;
import static com.Alkosto.UI.SelectproductUI.BTN_Add;
import static com.Alkosto.UI.SelectproductUI.next_shopping;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class SelectproductTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                RandomSelect.click(),
                Click.on(BTN_Add),
                Click.on(next_shopping),
                BackTask.Back(),
                RandomSelect.click(),
                Click.on(BTN_Add)

        );


    }

    public static SelectproductTask select(){
        return instrumented(SelectproductTask.class);
    }
}
