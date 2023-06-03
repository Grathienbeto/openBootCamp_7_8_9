package com.openbootcamp;

// 4.Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.

// Rta: El problema en ese caso es que se la capacidad de incremento por defecto del Vector, es del doble (10, 20, 40, 80, 160, 320, 640, 1280, etc).
// En el caso de querer agregar 1000 elementos a la misma, el Vector va a tener que hacer 7 operaciones de aumento de capacidad.
// En cada aumento de capacidad, lo que hace el Vector por detras es copiar su contenido a un array y rollover a escribir en otro, con la capacidad nueva.
// Esto es costoso, computacionalmente hablando. Una solucion sería implementar en el vector el tamaño inical lo mas cercano a lo que uno presuma que va a necesitar. Y un aumento de capacidad acorde.

import java.util.Vector;

public class Ej_4 {
    public static void main(String[] args) {
        Vector<Integer> integers = new Vector<>();
        System.out.println(integers.capacity());

        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);
        integers.add(8);
        integers.add(9);
        integers.add(0);
        integers.add(1);
        System.out.println(integers.capacity());
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);
        integers.add(8);
        integers.add(9);
        integers.add(0);
        integers.add(1);
        System.out.println(integers.capacity());

        System.out.println(integers);


    }
}
