package com.Alkosto.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectproductUI {

    public static final Target LNK_Computador = Target.the( "List product " )
            .located( By.xpath("//a[@class='js-algolia-product-click js-algolia-product-title']"));

    public static final Target BTN_Add= Target.the( "btn add" )
            .located( By.xpath("//button[@id='addToCartButton']"));

    public static final Target next_shopping= Target.the( "btn continue shopping" )
            .located( By.xpath("//a[@class='continue-shopping-button__link js-sf-keep-shopping']"));




}
