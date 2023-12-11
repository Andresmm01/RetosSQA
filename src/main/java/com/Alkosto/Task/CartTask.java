package com.Alkosto.Task;

import com.Alkosto.UI.CartUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.Alkosto.UI.CartUI.BTN_Cart;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class CartTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CartUI.BTN_Cart, isVisible()),
                WaitUntil.the(BTN_Cart, isClickable()).forNoMoreThan(2).seconds(),

                Click.on(BTN_Cart)
        );
    }

    public static CartTask  Cart(){return instrumented(CartTask.class);}
}
