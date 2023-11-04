/*Marks of phy,chem,math is Calculate in ARRYS  */

import java.util.Scanner;

public class Java62 {
    public static void main(String args[]){
      int marks[] = new int[100];
      Scanner sc = new Scanner(System.in);
     
  


       marks[0] = sc.nextInt();
       marks[1] = sc.nextInt();
       marks [2] = sc.nextInt();

       System.out.println("phy mark = " + marks[0]);
       System.out.println("chem mark = " + marks[1]);
       System.out.println("Math mark = " + marks[2]);

       marks[2] = marks[2]+1;
       System.out.println("Math real Mark = "+ marks[2]);


       int percentage = (( marks[0] + marks[1] + marks[3] ) / 3);
       System.out.println("percentage is = "+ percentage + "%");

    }
    
}
