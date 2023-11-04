// Is Palindrome or Not

import java.util.Scanner;

public class Java76 {

    public static boolean ispalindrone(String str) {
        int n = str.length();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                System.out.println("Not Palindrome");
                return false;
            }
        }
        return true;

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(ispalindrone(str));
    }

}
