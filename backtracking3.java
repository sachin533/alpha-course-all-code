public class backtracking3 {

    public static void findpermutation(String str,String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //timecomplexity O(n * n!)
        //recursion
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            String Newstr = str.substring(0,i)+str.substring(i+1);
            findpermutation(Newstr, ans+curr);
        }
    }

    public static void main(String args[]){

        String str = "abc";
        findpermutation(str, "");

        


    }
    
}
