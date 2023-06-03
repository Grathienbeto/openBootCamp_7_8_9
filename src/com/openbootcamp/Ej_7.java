package com.openbootcamp;

// 7. Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por
// ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".

public class Ej_7 {
    public static void main(String[] args) {

        int num = 5;
        try {
            dividePorCero(num);
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse: " + e.getMessage());
        } finally {
            System.out.println("Demo de codigo");
        }
    }
    public static void dividePorCero(int numero) throws ArithmeticException {
        System.out.println(numero / 0);
    }
}
