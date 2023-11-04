//print x to power of n (optimized )
public class Recusrion6 {
    public static int OptimiedPower(int a, int n) {

        if (n == 0) {
            return 1;
        }
        //0(n)
        // int halfpowersq = OptimiedPower(a, n/2) * OptimiedPower(a, n/2);

        // if (n % 2 != 0){
        // halfpowersq = a * OptimiedPower(a, n/2);
        // }
        //

        //0(logn)

        int halfpower = OptimiedPower(a, n / 2);

        int halfpowersq = halfpower * halfpower;

        if (n % 2 != 0) {
            halfpowersq = a * OptimiedPower(a, n / 2);
        }
        return halfpowersq;
    }

    public static void main(String args[]) {

        int a = 2;
        int n = 4;
        System.out.println(OptimiedPower(a, n));

    }

}
