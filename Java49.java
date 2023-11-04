public class Java49 {
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;

        }
        return f;
    }

    public static int BinCoef(int n, int r) {

        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        int BinCoef = fact_n / fact_r * fact_nmr;

        return BinCoef;
    }

    public static void main(String[] args) {
        System.out.println(factorial(8));

        System.out.println(BinCoef(5, 2));
    }
}