package com.Serenity.pageObject;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class ChangePage extends PageObject {


    private final By btnOpenOrder =By.xpath("//a[@class='card-footer' and @href='/Northwind/Order?shippingState=0']");


    @FindBy(how = How.XPATH, using ="//div[@class='slick-cell l0 r0 align-right']/a[@class='s-EditLink s-Demo-Northwind-OrderLink']")
    public List<WebElementFacade> divOrden;

    private final By btnEmple =By.id("s2id_Serenity_Demo_Northwind_OrderDialog15_EmployeeID");

     @FindBy(how = How.XPATH, using ="//ul[@id='select2-results-9']/li[@class='select2-results-dept-0 select2-result select2-result-selectable']")
    public List<WebElementFacade> divEmplo;

    private final By btnSave =By.xpath("//div[@class='tool-button apply-changes-button icon-tool-button']");

    private final By btnExi =By.xpath("//div[@class='tool-button save-and-close-button icon-tool-button']");



    public By getBtnOpenOrder() {
        return btnOpenOrder;
    }

    public By getBtnEmple() {
        return btnEmple;
    }

    public By getBtnSave() {
        return btnSave;
    }

    public By getBtnExi() {
        return btnExi;
    }
}
