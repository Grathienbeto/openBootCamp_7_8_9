package com.openbootcamp;

// 5. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.

import java.util.ArrayList;
import java.util.LinkedList;

public class Ej_5 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Hola");
        lista.add("desde");
        lista.add("la");
        lista.add("lista");

        LinkedList<String> nuevaLista = new LinkedList<>(lista);

        for (String item : lista){
            System.out.println("Desde ArrayList: " + item);
        }
        for (String item : nuevaLista) {
            System.out.println("Desde LinkedList: " + item);
        }
    }
}
