public class Bit2 {
    public static int getIthBit(int n, int i) {
        int Bitwise = 1 << i;

        if ((n & Bitwise) == 0) {
            return 0;
        } else {
            return 1;
        }

    }

    public static void main(String args[]) {

        System.out.println(getIthBit(10, 3));

    }

}
