import java.util.Scanner;

public class SentenciaSwitchCaseNumDiasMes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el número del mes de 1 - 12");
        int mes = s.nextInt();

        int numDias = 0;

        System.out.println("Ingrese el año (YYYY)");
        int anio = s.nextInt();

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDias = 30;
                break;
            case 2:
                if (anio % 400 == 0 || ((anio % 4 == 0) && !(anio % 100 == 0))) {
                    numDias = 29;
                    System.out.println("Es año bisiesto");
                } else {
                    numDias = 28;
                    System.out.println("No es año bisiesto");
                }
                break;
            default:
                numDias = 0;

        }
        System.out.println("El mes tiene "+numDias);

        /*if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            numDias = 31;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            numDias = 30;
        } else if (mes == 2) {
            if (anio % 400 == 0 || ((anio % 4 == 0) && !(anio % 100 == 0))) {
                numDias = 29;
                System.out.println("Es año bisiesto");
            } else {
                numDias = 28;
                System.out.println("No es año bisiesto");
            }
        }*/

    }
}