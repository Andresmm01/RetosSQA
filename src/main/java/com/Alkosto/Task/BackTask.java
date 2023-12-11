package com.Alkosto.Task;

import com.Alkosto.Interactions.WindowsBack;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BackTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WindowsBack.Back()
        );

    }

    public static HomeTask Back(){return instrumented(HomeTask.class);}
}
