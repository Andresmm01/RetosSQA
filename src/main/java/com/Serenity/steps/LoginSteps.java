package com.Serenity.steps;


import com.Serenity.pageObject.LoginPage;
import com.Serenity.utils.Data;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Map;


public class LoginSteps {

    @Page
    LoginPage loginPage;

    @Step
    public void openBrowser(){
        loginPage.openUrl("https://demo.serenity.is/");
    }

    @Step
    public void clear() {
        WebElement userNameField = loginPage.getDriver().findElement(loginPage.getTxtUserName());
        WebElement passwordField = loginPage.getDriver().findElement(loginPage.getTxtPassword());

        // Verifica si el campo de nombre de usuario tiene algún valor antes de limpiarlo
        if (!userNameField.getAttribute("value").isEmpty()) {
            userNameField.clear();
        }

        // Verifica si el campo de contraseña tiene algún valor antes de limpiarlo
        if (!passwordField.getAttribute("value").isEmpty()) {
            passwordField.clear();
        }
    }


    @Step
    public void sendCredencials() {
        ArrayList<Map<String, String>> credenciales = Data.extractTo();

        loginPage.getDriver().findElement(loginPage.getTxtUserName())
                .sendKeys(credenciales.get(0).get("Usuario"));

        loginPage.getDriver().findElement(loginPage.getTxtPassword())
                .sendKeys(credenciales.get(0).get("Clave"));

    }

    @Step
    public void clickLogin(){
        loginPage.getDriver().findElement(loginPage.getBtnLogin())
                .click();

    }



}
