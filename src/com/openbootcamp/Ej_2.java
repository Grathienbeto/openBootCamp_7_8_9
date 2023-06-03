package com.openbootcamp;

// 2. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.

public class Ej_2 {
    public static void main(String[] args) {

        int[][] arrayBi = {
                {1, 2, 3},
                {7, 8, 9}
        };


        for (int i = 0; i < arrayBi.length; i++) {

            for (int j = 0; j < arrayBi[i].length; j++){
                System.out.println(arrayBi[i][j] + " | Posicion: " + i + " : " + j);
            }

        }

    }
}
