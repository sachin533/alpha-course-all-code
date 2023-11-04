import java.util.Scanner;

public class Java11 {
    public static void main (String[] Args){

        Scanner sc = new Scanner(System.in);
// 1]    Right way to conersion 
       /*  int a = 20;
        long b = a;

        System.out.println(b);
        */

// 2]     Wrong way to conversion 
    // ( incompatible types: possible lossy conversion from long to int )
     /*  
           long a = 20;
           int b = a ;  
           
           System.out.println(b);

     */ 
// 3]    Wrong way to conversion
       /*  int a = sc.nextFloat();
        System.out.println(a);
        */
// 4]   right way to conversion
            float a = sc.nextInt();
          System.out.println(a);

        
    }

    
}
