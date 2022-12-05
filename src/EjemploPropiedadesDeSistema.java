import java.util.Properties;

public class EjemploPropiedadesDeSistema {
    public static void main(String[] args) {
        //para ver mi nombre de usuario en la PC
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);
        //ruta de usuario
        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        String javaVersion = System.getProperty("java.version");
        System.out.println("javaVersion = " + javaVersion);

        String lineSeparator = System.getProperty("line.separator");
        String lineSeparator2 = System.lineSeparator();

        System.out.println("lineSeparator = " + lineSeparator2 + " Una linea nuneva");

        //para imprimir todos los datos de java
        Properties p = System.getProperties();
        p.list(System.out);
    }
}
