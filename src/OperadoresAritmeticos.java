import javax.swing.*;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int i = 5, j = 4, suma = i + j;
        System.out.println("suma = " + suma);

        System.out.println("(i+j) = " + (i + j));

        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("(i-j) = " + (i - j));

        int multiplicacion = i * j;
        System.out.println("multiplicacion = " + multiplicacion);
        System.out.println("(i*j) = " + (i * j));

        float div = (float) 5 / 4;
        System.out.println("div = " + div);
        System.out.println("((float)i/j) = " + ((float) i / j));

        int residuo = i % j;
        System.out.println("residuo = " + residuo);

        residuo = 8 % 5;
        System.out.println("residuo = " + residuo);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        if (numero % 2 == 0) {
            System.out.println("numero par = " + numero);
        } else {
            System.out.println("numero impar = " + numero);
        }
    }
}
