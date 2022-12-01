public class EjemploStringConcatenacion {

    /*se evalua de izquierda a derecha
    * 
    * .concat() permite unir valores
    * */

    public static void main(String[] args) {
        String curso = " Programación Java";
        String profesor = "Manuel Rivadeneyra ";

        String detalle = curso + " con el instructor " + profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;
        System.out.println(detalle + (numeroA + numeroB));

        System.out.println(numeroA+numeroB +detalle);

        String detalle2 = curso.concat(" con ").concat(profesor);
        System.out.println("detalle2 = " + detalle2);

    }
}
