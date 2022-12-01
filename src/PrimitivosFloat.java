public class PrimitivosFloat {

    public static void main(String[] args) {
        
        float realFloat = 0.00000000015F;//1.5E-10F;
        System.out.println("realFloat = " + realFloat);
        System.out.println("float corresponde en bytes a  = " + Float.BYTES);
        System.out.println("float corresponde en bites a  = " + Float.SIZE);
        System.out.println("maximo valor para float = " + Float.MAX_VALUE);
        System.out.println("menor valor para float = " + Float.MIN_VALUE);

        double realDouble = 1.7976931348623157E308;
        System.out.println("\nrealDouble = " + realDouble);
        System.out.println("double corresponde en bytes a  = " + Double.BYTES);
        System.out.println("double corresponde en bites a  = " + Double.SIZE);
        System.out.println("maximo valor para double = " + Double.MAX_VALUE);
        System.out.println("menor valor para double = " + Double.MIN_VALUE);

        float varFlotante =3.1416f;
        System.out.println("\nvarFlotante = " + varFlotante);

    }
}
