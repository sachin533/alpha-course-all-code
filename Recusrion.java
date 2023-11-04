//print number from n to 1 (Decresing oder)\
//print number from n to 1 (Decresing oder)
public class Recusrion {

    // public static void printDc(int n) {
    //     if (n == 1) {
    //         System.out.println(1);
    //         return;
    //     }
    //     System.out.print(n + " ");
    //     printDc(n - 1);
    // }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(1+ " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");

    }

    public static void main(String args[]) {
        int n = 10;
        printInc(n);
    }

}
