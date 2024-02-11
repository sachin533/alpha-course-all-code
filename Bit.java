public class Bit {

    public static void main(String args[]) {
        // Using + and - to Swaping
        int a = 6;
        int b = 5;

        a = a + b; // 11
        b = a - b; // 6
        a = a - b; // 5

        System.out.println("A = " + a);
        System.out.println("B = " + b);

        // Using XOR
        int x = 5;
        int y = 7;

        x = x ^ y; // x = 5 ^ 6 results in x = 3 (binary 101 ^ 110 = 011).
        y = x ^ y; // y = 3 ^ 6 results in y = 5 (binary 011 ^ 110 = 101).
        x = x ^ y; // x = 3 ^ 5 results in x = 6 (binary 011 ^ 101 = 110).

        System.out.println(x);
        System.out.println(y);
    }
}