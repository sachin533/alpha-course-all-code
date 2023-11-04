//find n natural number
public class Recusrion2 {

    public static int calcu(int n ){
        if (n == 1){
            return 1;
        }
        int sum1 = calcu(n-1);
        int sn = n + sum1;
        return sn;
    }
    public static void main(String args[]){
        int n = 5;
        System.out.println(calcu(n));
    }
    
}
