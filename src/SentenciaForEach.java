public class SentenciaForEach {
    public static void main(String[] args) {

        int[] numeros = {1, 3, 5, 7, 9, 11, 13, 15};
        for (int num : numeros) {
            System.out.println("num = " + num);
        }

        String[] nombres = {"Manuel", "Anderson", "Lola", "Rosa", "Milo", "Carlos", "Michael", "Lucas"};
        int i = 0;

        for (String nombre : nombres) {

            System.out.println(i + ") " + "nombre = " + nombre);
            i++;
        }
    }
}
