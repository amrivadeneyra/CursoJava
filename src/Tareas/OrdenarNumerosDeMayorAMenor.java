package Tareas;

import java.util.Scanner;

public class OrdenarNumerosDeMayorAMenor {
    public static void main(String[] args) {
        Scanner pedir = new Scanner(System.in);

        System.out.print("Ingrese primer numero: ");
        double num1 = pedir.nextDouble();

        System.out.print("Ingrese segundo numero: ");
        double num2 = pedir.nextDouble();

        String resultado = num1 > num2 ? num1 + " y " + num2 : num2 + " y " + num1;
        System.out.print("El orden es: " + resultado);
    }
}
