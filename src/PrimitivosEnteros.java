public class PrimitivosEnteros {
    public static void main(String[] args) {

        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("valor maximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("valor minimo de un byte: " + Byte.MIN_VALUE);

        short numShort = 32767;
        System.out.println("\nnumShort = " + numShort);
        System.out.println("tipo byte corresponde en byte a " + Short.BYTES);
        System.out.println("tipo byte corresponde en bites a " + Short.SIZE);
        System.out.println("valor maximo de un byte: " + Short.MAX_VALUE);
        System.out.println("valor minimo de un byte: " + Short.MIN_VALUE);

        int numInt = 2147483647;
        System.out.println("\nnumInt = " + numInt);
        System.out.println("tipo byte corresponde en byte a " + Integer.BYTES);
        System.out.println("tipo byte corresponde en bites a " + Integer.SIZE);
        System.out.println("valor maximo de un byte: " + Integer.MAX_VALUE);
        System.out.println("valor minimo de un byte: " + Integer.MIN_VALUE);

        long numLong = 9223372036854775807L;
        System.out.println("\nnumLong = " + numLong);
        System.out.println("tipo byte corresponde en byte a " + Long.BYTES);
        System.out.println("tipo byte corresponde en bites a " + Long.SIZE);
        System.out.println("valor maximo de un byte: " + Long.MAX_VALUE);
        System.out.println("valor minimo de un byte: " + Long.MIN_VALUE);

        float numFloat = 3.4028235E38F;
        System.out.println("\nnumFloat = " + numFloat);
        System.out.println("tipo byte corresponde en byte a " + Float.BYTES);
        System.out.println("tipo byte corresponde en bites a " + Float.SIZE);
        System.out.println("valor maximo de un byte: " + Float.MAX_VALUE);
        System.out.println("valor minimo de un byte: " + Float.MIN_VALUE);

        var numVar= 127;
    }
}
