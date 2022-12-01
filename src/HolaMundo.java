public class HolaMundo {
    public static void main(String[] args) {
        String saludar = "Hola Mundo en Java";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());
        //valores primitivos
        int num = 10;
        double num2 = 20;
        byte num3 = 50;
        char carac = 'a';

        //valores con tipo clase
        Integer numero4 = 10;
        System.out.println("numero = " + numero4);


        var numero = 10;

        String nombre;

        nombre = "Manuel";

        if (numero >= 10) {
            nombre = "Anderson";
        }

        System.out.println("nombre = " + nombre);

        int edadPersona = 5;

    }
}
