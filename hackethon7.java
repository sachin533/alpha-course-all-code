
class Solution {

    public static void main (string args[]){
    int reverse(int x) {
           bool negative = false;
           if(x<0){
               negative = true;
                 x= x*(-1);
           }
           int max_val = Integer.MAX_VALUE ;
           int rev = 0;
   
           while(x!=0){
               int rem = x%10;
               if(rev>(maz_val-(x%10))/10) return 0;
               rev = rev*10 + rem;
               System.out.println(rev);
               x =x/10;
           }
           if(negative == true){
               rev = rev*(-1);
           }
   
           return rev;
         
           
        }
       }
   };