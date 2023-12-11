package com.Alkosto.Task;

import com.Alkosto.Utils.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;


import static com.Alkosto.UI.HomeUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

//private final String search;
public class HomeTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            boolean visible = Btn_Cookie.resolveFor(actor).isCurrentlyVisible();

            if (visible) {
                Btn_Cookie.resolveFor(actor).click();
            }
        } catch (Exception ignored) {
        }
        actor.attemptsTo(
                Click.on(Txt_busqueda),
                Enter.theValue(Data.extractData().get(0).get("Lista")).into(Txt_busqueda).thenHit(Keys.ENTER)
               // WaitUntil.the(Txt_busqueda, isVisible()).forNoMoreThan(10).seconds(), // Espera de 10 segundos



        );
    }

    public static HomeTask search(){return instrumented(HomeTask.class);}
}
