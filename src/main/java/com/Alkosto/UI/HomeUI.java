package com.Alkosto.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeUI {

    public static final Target Txt_busqueda = Target.the( "input search" )
            .located( By.xpath("//input[@id='js-site-search-input']"));

    public static final Target Btn_Cookie = Target.the( "button cookie" )
            .located( By.xpath("//button[@class='button-primary js-cookie-notification-accept']"));



}
