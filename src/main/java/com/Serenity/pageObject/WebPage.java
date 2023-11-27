package com.Serenity.pageObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class WebPage extends PageObject {

     @FindBy(how = How.XPATH, using ="//div[@class='slick-cell l0 r0 align-right']/a[@class='s-EditLink s-Demo-Northwind-OrderLink']")
    public List<WebElementFacade> divOrden;

     @FindBy(how = How.XPATH, using ="//ul[@id='select2-results-9']/li[@class='select2-results-dept-0 select2-result select2-result-selectable']")
    public List<WebElementFacade> divEmplo;
}
