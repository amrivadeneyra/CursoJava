package Tareas;

import java.util.Scanner;

public class EstanqueDeGasolina {
    public static void main(String[] args) {
        Scanner eg = new Scanner(System.in);

        double capacidadActual;

        System.out.println("Introduzca la capacidad actual del estanque (máx 70 litros): ");
        capacidadActual = eg.nextDouble();

        if (capacidadActual >= 0 && capacidadActual < 20) {
            System.out.println("Insuficiente");
        } else if (capacidadActual >= 20 && capacidadActual < 35) {
            System.out.println("Suficiente");
        } else if (capacidadActual >= 35 && capacidadActual < 40) {
            System.out.println("medio estanque");
        } else if (capacidadActual >= 40 && capacidadActual < 60) {
            System.out.println("Estanque 3/4");
        } else if (capacidadActual >= 60 && capacidadActual < 70) {
            System.out.println("Estanque casi lleno");
        } else if (capacidadActual == 70) {
            System.out.println("Estanque lleno");
        } else {
            System.out.println("Introduzca una cantidad de 0 a 70 litros");
        }


    }
}
