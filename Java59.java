/* Butterfly Pattern  */

public class Java59 {

    public static void Butterfly(int n) {
        // upper butterfly
        for (int i = 1; i <= n; i++) {
            // one side" STAR
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Middle side using "2*(n-i)" SPACE
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // second side STAR
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower Butterfly

        for (int i = n; i >= 1; i--) {
            // one side" STAR
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Middle side using "2*(n-i)" SPACE
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // second side STAR
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Butterfly(10);

    }

}
