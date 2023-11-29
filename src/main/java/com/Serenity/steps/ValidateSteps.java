package com.Serenity.steps;
/*
 * @(#) ProfileSteps.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import com.Serenity.pageObject.ValidatePage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.By;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class ValidateSteps {
    @Page
    ValidatePage validatePage;

    @Step("Validacion login ")
    public void valedateProfile(){

        Assert.assertTrue(
                validatePage.getDriver().findElement(validatePage.getBtnProfile()).isDisplayed()
        );

    }

    @Step("Validacion de los cambios")
    public void Cambios() {
        Assert.assertTrue(
                validatePage.getDriver().findElement(validatePage.getDivProfile()).isDisplayed()
        );
    }



}