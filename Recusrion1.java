
//Find the factorial of n
public class Recusrion1 {
    public static int factorial(int n) {
        if (n == 0) {

            return 1;
        }
        int Fact_nm1 = factorial(n - 1);
        int fn = n * factorial(n - 1);
        return fn;

    }

    public static void main(String args[]) {
        int n = 5;
        System.out.println(factorial(n));

    }

}
