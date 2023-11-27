package com.Serenity.steps;


import com.Serenity.pageObject.ChangePage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;



public class ChangeSteps {

    @Page
    ChangePage changePage;


    @Step ("Click en el boton de ordenes")
    public void OpenOrder() {
        changePage.getDriver().findElement(changePage.getBtnOpenOrder())
                .click();

    }

    @Step("Click en el campo de empleados")
    public void Emple() {
        changePage.getDriver().findElement(changePage.getBtnEmple())
                .click();
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
