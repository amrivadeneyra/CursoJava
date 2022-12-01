public class OperadoresIncrementales {
    public static void main(String[] args) {
        //pre incremento+
        System.out.println("Pre incremento");
        int i = 1;
        int j = ++i; // i = i + 1
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //post incremento
        System.out.println("Post incremento");
        i= 2;
        j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //pre decremento
        System.out.println("Pre decremento");
        i= 3;
        j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //post decremento
        System.out.println("Post decremento");
        i= 4;
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}
