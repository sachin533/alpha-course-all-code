/*Inverted half pyramind with Number */
public class Java56 {
    public static void Number_Pyramind(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Number_Pyramind(7);

    }

}
