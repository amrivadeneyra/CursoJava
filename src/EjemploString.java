public class EjemploString {

    /*para comparar STRING usemos equals() o equalsIgnoreCase()*/

    public static void main(String[] args) {
        String curso = "Programación Java";
        String curso2 = new String("Programación Java");

        //para comparar con el objeto
        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2 = " + esIgual);

        //para comparar con el valor
        esIgual = curso.equals(curso2);
        System.out.println("curso.equals(curso2) = " + esIgual);


        String curso3 = "Programación Java";
        esIgual = curso == curso3;
        System.out.println("curso == curso3 = " + esIgual);
    }
}
