package Lab1;

/**
 * C2 (9313 mod 2) = 1 (O1 - "-");
 * C3 (9313 mod 3) = 1 (C = 1);
 * C5 (9313 mod 5) = 3 (O2 - "+");
 * C7 (9313 mod 7) = 3 (i, j - long);
 **/
public class lab1 {

    public static void main(String[] args) {
        double S = 0;
        int a = 1, b = 1;
        int m = 2, n = 2;
        int C = 1;

        if (a <= C && C <= n) {
            System.out.println("Zero dev");
            return;
        }

        if ((a <= n) && (b <= m)) {
            for (long i = a; i <= n; i++) {
                for (long j = b; j <= b; j++)
                    S += (double) (i + j) / (i - C);
            }
            System.out.println("s = " + S);

        } else System.out.println("Error");
    }
}
