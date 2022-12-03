import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.println("Ingrese un numero del 1-3");
        int num = numero.nextInt();
        switch (num) {
            case 0:
                System.out.println("el numero es 0");
                break;
            case 1:
                System.out.println("el numero es 1");
                break;
            case 2:
                System.out.println("el numero es 2");
                break;
            case 3:
                System.out.println("el numero es 3");
                break;
            default:
                System.out.println("Número desconocido");

        }
        Scanner caracter = new Scanner(System.in);
        System.out.println("Escriba un nombre");
        String nombre = caracter.nextLine();
        switch (nombre) {
            case "admin":
                System.out.println("Hola admin");
                break;
            case "manuel":
                System.out.println("Hola manuel");
                break;
            default:
                System.out.println("Usuario desconocido");
        }
    }
}
