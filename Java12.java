// Inaprogram,input3numbers:A,BandC.Youhavetooutputtheaverageofthese 3 numbers.

import java.util.Scanner;
public class Java12 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int average = (A+B+C)/3; 

        System.out.println(average);
    }
    
}
