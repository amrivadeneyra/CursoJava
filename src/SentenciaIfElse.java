public class SentenciaIfElse {
    public static void main(String[] args) {

        float promedio = 5.5f;

        if (promedio >= 6.5) {
            System.out.println("Felicidades, excelente promedio!");
        } else if (promedio >= 6.0) {
            System.out.println("Reprobaste!");
        } else if (promedio >= 5.5) {
            System.out.println("Buen promedio!");
        } else if (promedio >= 5.0) {
            System.out.println("Regular, necesitas esforzate un poco más!");
        } else if (promedio >= 4.0) {
            System.out.println("Insuficiente, necesitas estudiar más!");
        } else {
            System.out.println("Reprobado");
        }
        System.out.println("Tu promedio es: " + promedio);
    }
}
