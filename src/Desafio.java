import java.math.BigInteger;

public class Desafio {
    //Para llegar al resultado final, se trabaja directamente con el mod de cada numero concatenado
    // El resultado del valor 58184241583791680L  es 1675.

    final static BigInteger M = new BigInteger("2017");

    private static BigInteger compute(long n ) {
        String s = "";

        String a = new BigInteger(n+"").mod(M)+"";
        for (long i = 0; i < Integer.parseInt(a); i++) {
            s = s.concat(a);
            s = new BigInteger(s).mod(M)+"";
        }
        return new BigInteger(s).mod(M);
    }

    public static void main(String[] args) {
        for (long n : new long[] { 1L, 2L, 5L, 10L, 20L, 58184241583791680L }) {
            System.out.println("" + n + ": " + compute(n));
        }
    }
}
