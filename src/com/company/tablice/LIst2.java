package com.company.tablice;

import java.util.ArrayList;
import java.util.List;

public class LIst2 {
    public static void main(String[] args) {
        List<String> listaMoja = new ArrayList<String>();
        listaMoja.add("Marcin");
        listaMoja.add("Alicja");
        List<String> listaCzyjas = new ArrayList<>();
        listaCzyjas.add("Elżbieta");
        listaCzyjas.add("Wojciech");
        List<String> lista = new ArrayList<String>();
        lista.addAll(listaCzyjas);
        lista.addAll(listaMoja);
        System.out.println(lista);
    }
}
