public class Bitmai {

    public static void main(String args[]) {

        // Add 1 to an integer using Bit Manipulation
        int a = 3;
        int i = 2;

        int bit = 1 << i;

        System.out.print(a | bit);

         // Convert Upper Char. to Lower Char, using Bit ?

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char) (ch | ' '));
            System.out.print(ch);
        }
    }

}
