public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {

        int cont = 0;

        bucle:
        for (int i = 1; i <= 7; i++) {
            int j = 1;
            while (j <= 8) {

                if (i == 6 || i == 7) {
                    System.out.println("Día " + i + ": descanso de fin de semana!");
                    continue bucle;
                }
                System.out.println("Día " + i + ": trabajando a las " + j + "hrs. ");
                j++;
                cont++;
            }

        }
        System.out.println("================================================================");
        int contador = 0;

        bucle1:
        for (int i = 0; i < 5; i++) {

            System.out.println();
            for (int j = 0; j < 5; j++) {

                if (i == 2) {
                    continue bucle1;
                }
                System.out.println(contador + ") " + "i = " + i + ", j = " + j);
                contador++;
            }

        }
        System.out.println("================================================================");

        int contador0 = 0;

        bucle1:
        for (int i = 0; i < 5; i++) {

            System.out.println();
            int j = 0;
            while (j < 5) {

                if (i == 2) {
                    continue bucle1;
                }
                System.out.println(contador0 + ") " + "i = " + i + ", j = " + j);
                j++;
                contador0++;
            }

        }
        System.out.println("================================================================");

        int contador2 = 0;
        etiqueta:
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {

                if (i == 2) {
                    break etiqueta;
                }
                System.out.println(contador2 + ") " + "i = " + i + ", j = " + j);
                contador2++;
            }

        }
    }
}
