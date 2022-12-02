import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
       /* String[] usernames = new String[3];
        String[] passwords = new String[3];

        usernames[0] = "manuel";
        passwords[0] = "12345";

        usernames[1] = "admin";
        passwords[1] = "admin";

        usernames[2] = "anderson";
        passwords[2] = "123";*/

        String[] usernames = {"manuel", "admin", "anderson"};
        String[] passwords = {"12345", "admin", "123"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");

        String usu = scanner.next();

        System.out.println("Ingrese el password");
        String pass = scanner.next();

        boolean esAutenticado = false;
        for (int i = 0; i < usernames.length; i++) {
            esAutenticado = (usernames[i].equals(usu) && passwords[i].equals(pass)) ? true : esAutenticado;
            /*if (usernames[i].equals(usu) && passwords[i].equals(pass)) {
                esAutenticado = true;
                break;
            }*/
        }

        String mensaje = esAutenticado ? "Bienvenido usuario ".concat(usu).concat("!") :
                "Username o contraseña  incorrecto!\nLo sentimos requiere, autenticación";
        System.out.println("mensaje = " + mensaje);

        /*if (esAutenticado) {
            System.out.println("Bienvenido usuario ".concat(usu).concat("!"));
        } else {
            System.out.println("Username o contraseña  incorrecto");
            System.out.println("Lo siento requiere, autenticación");
        }*/

    }
}