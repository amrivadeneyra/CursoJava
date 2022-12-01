public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Manuel";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase().replace("m", "M"));
        System.out.println("nombre.equals(\"Manuel\") = " + nombre.equals("Manuel"));
        System.out.println("nombre.equals(\"manuel\") = " + nombre.equals("manuel"));
        System.out.println("nombre.equalsIgnoreCase(\"manuel\") = " + nombre.equalsIgnoreCase("manuel"));
        System.out.println("nombre.compareTo(\"Manuel\") = " + nombre.compareTo("Manuel"));
        System.out.println("nombre.compareTo(\"Anderson\") = " + nombre.compareTo("Anderson"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(2) = " + nombre.charAt(2));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length() - 1));

        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1,4) = " + nombre.substring(5));
        System.out.println("-------------------------------------------------------------------------");
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas.replace("a","."));
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.indexOf('t') = " + trabalenguas.indexOf('t'));//acepta char y String
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t"));
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("tr"));
        System.out.println("trabalenguas.endsWith(\"s\") = " + trabalenguas.endsWith("s"));
        System.out.println("     trabalenguas    ");
        System.out.println("    trabalenguas    ".trim());//para quitar espacios

    }
}
