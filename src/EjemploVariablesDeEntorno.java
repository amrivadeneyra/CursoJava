import java.util.Map;

public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {

        Map<String, String> varEnv = System.getenv();
        System.out.println("Variable de ambiento del sistema = " + varEnv);

        System.out.println("------------- Listado de variables de entorno de sistemas -------------");
        for (String key : varEnv.keySet()) {
            System.out.println(key + " => " + varEnv.get(key));
        }
        System.out.println("============================================================================");

        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String temDir = System.getenv("TEMP");
        System.out.println("temDir = " + temDir);

        String path = System.getenv("Path");
        System.out.println("Path = " + path);

        String path2 = varEnv.get("Path");
        System.out.println("path2 = " + path2);


        /*PARA CREAR UNA variable de entorno por consola se debe hacer escribir:
          setx <nombre_variable> "algún texto que desee"  */
        String hola = varEnv.get("SALUDAR_HOLA");
        System.out.println("path2 = " + path2);


    }
}
