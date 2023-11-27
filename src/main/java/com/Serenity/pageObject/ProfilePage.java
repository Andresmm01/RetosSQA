package com.Serenity.pageObject;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProfilePage extends PageObject {
    private final By btnProfile = By.xpath("//div[@id='s_sidebar_group1']/h5']");

    private final By divProfile = By.xpath("//div[@id='toast-container']/div[@class='show toast toast-success']/div[text()='Save success']");

    public By getBtnProfile() {
        return btnProfile;
    }

    public By getDivProfile() {
        return divProfile;
    }
}