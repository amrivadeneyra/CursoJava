public class EjemploStringTestRendimientoConcat {

    /* .currentTimeMillis() es para calcular el tiempo enn milisegundos
    *  StringBuilder y lo unes con .append() para concatenar es mucho más rápido
    * */

    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            //c = c.concat(a).concat(b).concat("\n"); // 500 => 2ms, 1000 => 6ms
            //c += a + b + "\n"; //500 => 17ms,1000 =>19ms
            sb.append(a).append(b).append("\n"); //500 => 0ms , 1000 => 0ms
        }

        long fin = System.currentTimeMillis();

        System.out.println(fin - inicio);

        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
    }
}
