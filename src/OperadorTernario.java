import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        // variable = condición ? si es verdadero : si es falso
        String variable = 7 == 5 ? "si es verdadero" : "si es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 0.0;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese nota de matemáticas 0.0 - 20.0: ");
        matematicas = s.nextDouble();

        System.out.println("Ingrese nota de ciencia 0.0 - 20.0: ");
        ciencias = s.nextDouble();

        System.out.println("Ingrese nota de historia 0.0 - 20.0: ");
        historia = s.nextDouble();

        promedio = (matematicas + ciencias + historia) / 3;
        System.out.println("promedio = " + promedio);

        estado = promedio >= 10.5 ? "Aprovado" : "Desaprovado";
        System.out.println("estado = " + estado);

        /*if (promedio >= 10.5){
            estado = "aprovado";
        }else{
            estado = "desaprovado";
        }*/
    }
}
