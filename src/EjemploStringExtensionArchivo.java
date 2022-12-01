import java.util.Scanner;

public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        String archivo = "alguna.imagen.tipo.pdf";
        int i = archivo.lastIndexOf(".");//agarra la ultima peticion "."
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(i+1) = " + archivo.substring(i+1));



    }
}
