public class EjemploClaseMath {
    public static void main(String[] args) {

        //son metodos estaticos
        
        int absuluto = Math.abs(-3);
        System.out.println("absuluto = " + absuluto);

        absuluto = Math.abs(3);
        System.out.println("absuluto = " + absuluto);

        double max = Math.max(3.5, 1.2);
        System.out.println("max = " + max);

        double min = Math.min(3.2, 1.2);
        System.out.println("min = " + min);

        //redondea hacia arriba
        double techo = Math.ceil( 3.2);
        System.out.println("techo = " + techo);

        //redondea hacia abajo
        double piso = Math.floor( 3.2);
        System.out.println("piso = " + piso);

        long entero = Math.round(Math.PI);
        System.out.println("entero = " + entero);
        
        double exp = Math.exp(2);
        System.out.println("exp = " + exp);
        
        double log = Math.log(10);
        System.out.println("log = " + log);
        
        double potencia = Math.pow(10,3);
        System.out.println("potencia = " + potencia);
        
        double raiz = Math.sqrt(25);
        System.out.println("raiz = " + raiz);
        
        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados);
        System.out.println("Convertir de radianes a grados = " + grados);

        double radianes = Math.toRadians(90.00);
        System.out.println("Convertir de grados a radianes" + radianes);

        System.out.println("sin(90) "+ Math.sin(radianes));
        System.out.println("cos(90) " + Math.cos(radianes));

        radianes = Math.toRadians(180);
        System.out.println("cos(180) " + Math.cos(radianes));

        radianes = Math.toRadians(0.00);
        System.out.println("cos(0) " + Math.cos(radianes));
    }
}
