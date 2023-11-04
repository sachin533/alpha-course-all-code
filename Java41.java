/*Syntex and parameter */
import java.util.*;

public class Java41 {
    public static void calculatesum(int a , int b) {//parameter or Formal parameter
      
        int sum = a + b;
        System.out.println("Sum is " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculatesum(a,b);//argument 

    }
}
