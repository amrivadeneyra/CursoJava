package Tareas;

import java.util.Scanner;

public class TareaFacturaConScanner {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese el nombre de su factura");
        String nombre = lectura.nextLine();

        System.out.println("1) Ingrese el precio del producto:");
        double n1Precio = lectura.nextDouble();

        System.out.println("2) Ingrese el precio del producto:");
        double n2Precio = lectura.nextDouble();

        double totalB = n1Precio + n2Precio;
        double IGV = totalB * 0.19;
        double totalN = totalB + IGV;

        String detalleFactura = "La factura " + nombre + " tiene un total de $" + totalB + ", con un impuesto" +
                " de $" + IGV + " y el monto incluyendo el impuesto es de  $"+ totalN ;

        System.out.println(detalleFactura);


    }
}
