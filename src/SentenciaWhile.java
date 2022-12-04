public class SentenciaWhile {
    public static void main(String[] args) {
        //while 1° evalúa y ejecuta
        int i = 0;

        while (i <= 5) {
            System.out.println("i = " + i);
            i++;
        }

        i = 0;
        boolean prueba = true;

        while (prueba) {
            if (i == 7) {
                prueba = false;
            }
            System.out.println(i + ") " + "prueba = " + prueba);
            i++;
        }

        prueba = false;

        //do / while, primero ejecuta y luego evalúa
        do {
            System.out.println("Se ejecutará una sola vez");
        } while (prueba);

        prueba = true;
        i = 0;

        do {
            if(i==10){
                prueba=false;
            }
            System.out.println(i + ") " + "i = " + i);
            i++;
        } while (prueba);
    }
}
