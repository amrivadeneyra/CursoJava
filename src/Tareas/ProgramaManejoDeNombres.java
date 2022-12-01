package Tareas;

import java.util.Scanner;

/*Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos
  como argumentos de línea de comandos.

  Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter,
  pero convertido en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona.
  Por ejemplo para Andres debe quedar como ----- N.es  ------

  Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).

Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:

N.es_A.ia_E.pe*/
public class ProgramaManejoDeNombres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de un familiar:");
        String nombreF1 = scanner.nextLine(); //transforma todo a mayúsculas
        String nombreF1SecondCaracter = nombreF1.toUpperCase().charAt(1) + "." + nombreF1.substring(nombreF1.length() - 2);

        System.out.println(("Ingrese otro nombre:"));
        String nombreF2 = scanner.nextLine();
        String nombreF2SecondCaracter = nombreF2.toUpperCase().charAt(1) + "." + nombreF2.substring(nombreF2.length() - 2);

        System.out.println("Ingrese ultimo nombre:");
        String nombreF3 = scanner.nextLine();
        String nombreF3SecondCaracter = nombreF3.toUpperCase().charAt(1) + "." + nombreF3.substring(nombreF3.length() - 2);

        String resultadoFinal = nombreF1SecondCaracter + "_" + nombreF2SecondCaracter + "_" + nombreF3SecondCaracter;

        System.out.println(resultadoFinal);


    }
}
