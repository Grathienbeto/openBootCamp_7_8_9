package com.openbootcamp;

// 6. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a
// recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.

import java.util.ArrayList;

public class Ej_6 {
    public static void main(String[] args) {
        // Lo hice Integar por que no me permite poner tipo de dato primitivo.
        ArrayList<Integer> lista = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            lista.add(i);
        }

        // No se si es la forma mas elegante de hacerlo, pero me sirvio.
        for (int i = 0; i <= lista.size(); i++){
            if (lista.get(i) % 2 == 0) {
                lista.remove(i);
            }
            if (i == lista.size()){
                break;
            }
            System.out.println(lista.get(i));
        }

    }
}
