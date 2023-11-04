
/*Keep entering number till user enters multiple of 10 */
import java.util.*;

public class Java35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter the number ");

            int n = sc.nextInt();
            
            if (n % 10 == 0) {
                break;
            }

        } while (true);

    }

}
