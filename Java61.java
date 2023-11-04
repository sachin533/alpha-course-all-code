/* Diamond Pattern */
public class Java61 {

    public static void Diamond(int n){
//Upper side
        for(int i=1; i<=n; i++){
            //n-1 for SPACE
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // 2*i-1 for STAR
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Lower Side

        for(int i=n; i>=1; i--){
            //n-1 for SPACE
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // 2*i-1 for STAR
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        
    }

    public static void main(String args[]) {
    Diamond(9);

    }
}