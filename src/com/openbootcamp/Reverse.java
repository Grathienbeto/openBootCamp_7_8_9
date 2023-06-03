package com.openbootcamp;

public class Reverse {

    public static void main(String[] args) {
        String frase = "Hola, como estas?";
        String reverse = reverse(frase);
        System.out.println(reverse);

    }

    // Fx que devuelve el string invertido
    public static String reverse(String texto){
// La sugerencia del editor me arroja este warning en el +=
//        StringBuilder dadoVuelta = new StringBuilder();
//        for(int i = texto.length()-1; i >= 0 ; i--){
//            dadoVuelta.append(texto.charAt(i));
//        }
//        return dadoVuelta.toString();

        String dadoVuelta = "";
        for(int i = texto.length()-1; i >= 0 ; i--){
            dadoVuelta += texto.charAt(i);
        }
        return dadoVuelta;
    }
}
