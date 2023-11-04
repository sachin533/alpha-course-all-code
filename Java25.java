
/*Student are pass a fail "Ternary Operator" */
import java.util.*;

public class Java25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Marks = sc.nextInt();

        String Student = (Marks >= 33) ? "PASS" : "FAIL";

        System.out.println(Student);

    }

}
