/*Print the Reverse Number */
public class Java33 {
    public static void main (String[] args){
        int n = 18768;

        while(n>0){
            int lastdigit = n % 10;
            System.out.print(lastdigit);
            n /= 10;
        }

    }

    
}
