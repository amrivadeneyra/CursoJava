public class SentenciaFor {
    public static void main(String[] args) {
        System.out.println("Primera iteración");
        for (int i = 0; i <= 10; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("Segunda iteración");
        for (int i = 10; i >= 0; i--) {
            System.out.println("i = " + i);
        }
        System.out.println("Tercera iteración");
        for (int i = 0, j = 10; i <= j; i++, j--) {
            System.out.println(i + " - " + j);
        }
        System.out.println("Cuarta iteración");
        for (int i = 0; i <= 10; i++){
            //números impares
            if (i % 2 == 0){
                continue;
            }
            System.out.println("i = " + i);
        }
        System.out.println("Quinta iteración");
        //se coloca 1 para que no cuente el 0 a la hora de iterar
        for (int i = 1; i <= 10; i++){
            //números pares
            if (!(i % 2 == 0)){
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
