package Tareas;

import java.util.Scanner;

public class ConteoDeCaractersConLength {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese una palabra para hacer el conteo de sus caracteres: ");
        String palabra = entrada.nextLine();

        System.out.println("palabra: " + palabra);
        System.out.println("total de caracteres: " + palabra.length());



    }
}
