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

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class ValidateSteps {
    @Page
    ValidatePage profilePage;

    @Step("Validacion login ")
    public void valedateProfile(){

        Assert.assertTrue(
                profilePage.getDriver().findElement(profilePage.getBtnProfile()).isDisplayed()
        );

    }

    @Step("Validacion de los cambios")
    public void cambios(){
        WebDriverWait wait = new WebDriverWait(profilePage.getDriver(), Duration.ofSeconds(2));

        // Esperar a que el elemento sea visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(profilePage.getDivProfile()));

        Assert.assertTrue(
                profilePage.getDriver().findElement(profilePage.getDivProfile()).isDisplayed()
        );

    }
}