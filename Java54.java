/*Write a code of Hollow Rectnagle print a star */
public class Java54 {

    public static void Hollow_Rectangle(int totalRow, int totalColu) {
        for (int i = 1; i <= totalRow; i++) {
            for (int j = 1; j <= totalColu; j++) {
                if (i == 1 || i == totalRow || j == 1 || j == totalColu) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Hollow_Rectangle(10, 4);

    }

}
