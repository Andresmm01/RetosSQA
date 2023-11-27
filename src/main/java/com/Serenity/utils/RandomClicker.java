package com.Serenity.utils;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.Random;

public class RandomClicker {

    // Suponiendo que 'orden' es una lista de elementos web
    private List<WebElementFacade> orden;

    // Constructor que acepta la lista de elementos
    public RandomClicker(List<WebElementFacade> orden) {
        this.orden = orden;
    }

    // Método para hacer clic en un elemento aleatorio
    public void clickRandomElement() {
        Random random = new Random();
        int randomIndex = random.nextInt(orden.size());
        orden.get(randomIndex).click();
    }


}
