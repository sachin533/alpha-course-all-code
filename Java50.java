import java.util.*;
/*Write a Java method to compute the average of three numbers */
public class Java50 {
    public static double Average(double x, double y, double z) {
        return x + y + z / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first no");
        double x = sc.nextDouble();

        System.out.println("Enter the Second no.");
        double y = sc.nextDouble();

        System.out.println("Enter the Second no.");
        double z = sc.nextDouble();

        System.out.println("Average the value of " + Average(x, y, z));

    }
}
