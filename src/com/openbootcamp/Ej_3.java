package com.openbootcamp;

//3. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.

import java.util.Vector;

public class Ej_3 {
    public static void main(String[] args) {
        Vector <String> deStrings = new Vector<>();
        deStrings.add("Primera");
        deStrings.add("Segunda");
        deStrings.add("Tercera");
        deStrings.add("Cuarta");
        deStrings.add("Quinta");

        deStrings.remove(1);
        deStrings.remove(2);
            // Al eliminar el segundo lugar, se corren uno para abajo.
            // Entonces al eliminar el tercer lugar, se elimina el que originalmente era el cuarto lugar
        System.out.println(deStrings);
    }
}
