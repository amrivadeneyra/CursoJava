public class WrapperOperadoresRelaciones {
    public static void main(String[] args) {

        Integer num1 = Integer.valueOf(10000);
        Integer num2 = num1;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("Son el mismo objeto? " + (num1 == num2));

        num2 = 10000;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        //compara por el objeto y non por el valor
        System.out.println("Son el mismo objeto? " + (num1 == num2));

        System.out.println("Tienen el mismo valor? " + (num1.equals(num2)));

        System.out.println("Tienen el mismo valor? " + (num1.intValue() == num2.intValue()));

        num2 = 5000;
        boolean condicion = num1 > num2;
        System.out.println("condicion = " + condicion);

        boolean condicion2 = num1.intValue() < num2.intValue();
        System.out.println("condicion2 = " + condicion2);
    }
}
