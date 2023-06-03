package com.openbootcamp;

// 1. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.

public class Ej_1 {
    public static void main(String[] args) {
        String []palabras = {"Esto", "es", "una", "frase"};

        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}
