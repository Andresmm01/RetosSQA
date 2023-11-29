package com.Serenity.pageObject;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class ChangePage extends PageObject {


    private final By btnOpenOrder =By.xpath("//a[@class='card-footer' and @href='/Northwind/Order?shippingState=0']");

    private final By btnEmple =By.id("s2id_Serenity_Demo_Northwind_OrderDialog15_EmployeeID");

    private final By btnSave =By.xpath("//div[@class='tool-button apply-changes-button icon-tool-button']");


    public By getBtnOpenOrder() {
        return btnOpenOrder;
    }

    public By getBtnEmple() {
        return btnEmple;
    }

    public By getBtnSave() {
        return btnSave;
    }


}
