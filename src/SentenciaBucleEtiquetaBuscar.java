import java.util.Scanner;

public class SentenciaBucleEtiquetaBuscar {
    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);
        System.out.println("Ingresa una letra o una palabra");

        String frase = "trigo tres tristes tigres tragan trigotrigo en un trigaltrigo";
        String palabra = "trigo";

        int maxPalabra = palabra.length();
        int maxFrase = frase.length() - maxPalabra;

        char letra = 'g';
        int cantidad = 0;
        buscar:
        for (int i = 0; i <= maxFrase; ) {
            int k = i;
            for (int j = 0; j < maxPalabra; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    i++;
                    continue buscar;
                }
            }
            cantidad++;
            i = i + maxPalabra;
        }
        System.out.println("Encontrado  = " + cantidad + " veces el caracter '" + palabra + "' en la frase");
    }
}
