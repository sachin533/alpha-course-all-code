/*Write a Java program to check if a number is a palindrome in Java? ( 121 is a palindrome, 321 is not)
A number is called a palindrome if the number is equal to the reverse of a number e.g., 121 is a
palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a
palindrome because the reverse of 321 is 123, which is not equal to 321. */

import java.util.Scanner;

public class Java52 {

    public static boolean isPalindrome(int number) {

        int Palindrome = number;

        int Reverse = 0;

        while (Palindrome != 0) {
            int remainder = Palindrome % 10;
            Reverse = Reverse * 10 + remainder;
            Palindrome = Palindrome / 10;

            if (number == Reverse) {
                return true;
            }

        }
        return false;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Palindrome Number : ");
        int palindrome = sc.nextInt();

        if (isPalindrome(palindrome)) {
            System.out.println("Number : " + palindrome + " is a palindrome");
        } else {
            System.out.println("Number : " + palindrome + " is not a palindrome");
        }

    }
}
