/*Find the number is prime or not prime */
public class Java48 {

    public static boolean isprime(int n) {

        boolean isprime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {

                isprime = false;
            }

        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isprime(8));
    }
}