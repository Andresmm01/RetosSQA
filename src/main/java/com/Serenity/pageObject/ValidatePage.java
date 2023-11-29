package com.Serenity.pageObject;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ValidatePage extends PageObject {
    private final By btnProfile = By.xpath("//h6[@class='s-sidebar-section-title']");

    private final By divProfile = By.xpath("//div[@id='s2id_Serenity_Demo_Northwind_OrderDialog15_EmployeeID']//span[@class='select2-chosen']");

    public By getBtnProfile() {
        return btnProfile;
    }

    public By getDivProfile() {
        return divProfile;
    }
}