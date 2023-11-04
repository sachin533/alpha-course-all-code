public class Bit {

    public static void evenORodd(int n) {
        int Bitwise = 1;
        if ((n & Bitwise) == 0) {
            System.out.println("Is EVEN");
        } else {
            System.out.println("Is ODD");
        }

    }

    public static void main(String args[]) {

        evenORodd(3);
        evenORodd(10);
        evenORodd(5);

    }
}