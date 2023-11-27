package com.Serenity.steps;

import java.util.Random;
import com.Serenity.pageObject.ChangePage;
import com.Serenity.utils.RandomClicker;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.util.List;


public class ChangeSteps {

    @Page
    ChangePage changePage;


    @Step ("Click en el boton de ordenes")
    public void OpenOrder() {
        changePage.getDriver().findElement(changePage.getBtnOpenOrder())
                .click();

    }

    @Step("Click en la orden")
    public void Order() {
        List<WebElementFacade> orden = changePage.divOrden;
        RandomClicker clicker = new RandomClicker(orden);
        clicker.clickRandomElement();


    }

    @Step("Click en el campo de empleados")
    public void Emple() {
        changePage.getDriver().findElement(changePage.getBtnEmple())
                .click();
    }

    @Step("Click en el empleado")
    public void Emplo() {
        List<WebElementFacade> Empleado = changePage.divEmplo;
        RandomClicker clicker = new RandomClicker(Empleado);
        clicker.clickRandomElement();


    }


    @Step("Click en guardar")
    public void Save(){
        changePage.getDriver().findElement(changePage.getBtnSave())
                .click();
    }

    @Step ("Click en guardar con exito")
    public void Exi() {
        changePage.getDriver().findElement(changePage.getBtnExi())
                .click();

    }

}
