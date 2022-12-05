public class WrapperInteger {
    public static void main(String[] args) {

            //es más recomendable convertir de lo más bajo a lo más alto en las Clases
        //para convertir un primitivo a una referencia y viceversa
        int intPrimitivo = 32768;
        //Explicita
        Integer intObjeto = Integer.valueOf(intPrimitivo);
        //Implicíta
        Integer intObjeto2 = 32768;
        System.out.println("intObjeto = " + intObjeto);

        int num = intObjeto;
        System.out.println("num = " + num);
        int num2 = intObjeto.intValue();
        System.out.println("num2 = " + num2);
        
        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        Short shortObjeto = 32767;
        String valorShort = String.valueOf(shortObjeto);
        System.out.println("valorShort = " + valorShort);

        //tienen problemas al convertir
        System.out.println("\n=======================================================================");
        System.out.println("PERDIDA DE DATOS");
        Short shortObjeto2 = intObjeto.shortValue();
        System.out.println("byteObjeto = " + shortObjeto2);

        //tienen problemas al convertir
        Byte byteObjeto2 = intObjeto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto2);
        System.out.println("=======================================================================");
        
        Long longObjeto = intObjeto.longValue();
        System.out.println("\nlongObjeto = " + longObjeto);
    }
}
