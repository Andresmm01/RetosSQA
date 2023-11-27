package com.Serenity.steps;

import com.Serenity.pageObject.WebPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import java.util.List;
import com.Serenity.utils.RandomClicker;
import net.serenitybdd.core.pages.WebElementFacade;


public class WebSteps {

    @Page
    WebPage webPage;



      @Step("Click en la orden")
    public void Order() {
        List<WebElementFacade> orden = webPage.divOrden;
        RandomClicker clicker = new RandomClicker(orden);
        clicker.clickRandomElement();


    }

    @Step("Click en el empleado")
    public void Emplo() {
        List<WebElementFacade> Empleado = webPage.divEmplo;
        RandomClicker clicker = new RandomClicker(Empleado);
        clicker.clickRandomElement();


    }
}
