package com.Alkosto.Utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class Data {

    private static ArrayList<Map<String, String>> data = new ArrayList<>();

    public static ArrayList<Map<String, String>> extractData() {
        try {
            data = Excel.leerDatosDeHojaDeExcel("src/main/resources/Data/Alkosto.xlsx", "Productos");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return data;
    }


}



