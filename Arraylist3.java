//Find the largest Number
// O(n)

import java.util.ArrayList;
public class Arraylist3 {

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(2);
        list.add(7);
        list.add(4);
        list.add(34);
        list.add(9);

        int max = Integer.MIN_VALUE;

        for(int i=0; i<list.size(); i++){
            // if(max < list.get(i)){
            //     max = list.get(i);
            // }
            max = Math.max(max , list.get(i));
        }
        System.out.println("max element = " + max);
    }

    
}
