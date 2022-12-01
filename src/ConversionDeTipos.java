public class ConversionDeTipos {
    public static void main(String[] args) {

        //convertir cualquier tipo String a tipo primitivo

        String numeroStr = "50";

        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "98765.43e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "True";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);
        System.out.println("----------------------------------------------");

        //convertir cualquier tipo primitivo a String
        //1era forma
        int otroNumeroInt = 100;

        System.out.println("otroNumeroInt = " + otroNumeroInt);

        //2da forma
        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        //3era forma
        otroNumeroStr = String.valueOf(otroNumeroInt + 10);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        //4ta forma
        double otroRealDouble = 1.23456e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        //5ta forma
        otroRealStr = String.valueOf(1.23456e2f);
        System.out.println("otroRealStr = " + otroRealStr);

        System.out.println("----------------------------------------");

        int i = 22768;
        //casting o forzar la conversion
        short s = (short) i; //siempre usando CAST
        System.out.println("s = " + s);

        long l = i;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);
        char c = (char) i;
        System.out.println("c = " + c);
        float f = i;
        System.out.println("f = " + f);

    }
}
