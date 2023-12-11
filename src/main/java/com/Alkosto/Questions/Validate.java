package com.Alkosto.Questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.Alkosto.UI.CartUI.TXT_Vali;
import static com.Alkosto.UI.CartUI.TXT_Vali2;

public class Validate implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String product1 =actor.recall("product1");
        String product11 = TXT_Vali.resolveFor(actor).getText();
        Scroll.to(TXT_Vali2);
        String product2 =actor.recall("product2");
        String product22  = TXT_Vali2.resolveFor(actor).getText();
        return product1.equals(product11) && product2.equals(product22);
    }

    public static Question<Boolean> validate() { return new Validate();
    }

}
