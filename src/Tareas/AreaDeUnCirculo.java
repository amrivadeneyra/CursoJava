package Tareas;


import java.util.Scanner;

public class AreaDeUnCirculo {
    public static void main(String[] args) {
        Scanner ing = new Scanner(System.in);

        System.out.println("Ingresa el radio de algún circulo");
        double radio = ing.nextDouble();
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area de una circunferencia de radio  " + radio + " es: " + area);
    }
}
