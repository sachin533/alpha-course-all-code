//(Arraylist) imag screenshot these is qustion
import java.util.ArrayList;
public class Arraylist7 {
    public static int Storewater(ArrayList<Integer> hight){
        int maxWater = 0;

        //brute force 
        for(int i=0; i<hight.size(); i++){
            for(int j=i+1; j<hight.size(); j++){
                int ht = Math.min(hight.get(i) , hight.get(j));

                int width = j-i;
                int currWater = ht * width;
                maxWater = Math.max(maxWater , currWater);
            }
        }
        return maxWater;
    }
    public static void main(String args[]){
        ArrayList<Integer> hight = new ArrayList<>();

        hight.add(1);
        hight.add(8);
        hight.add(6);
        hight.add(2);
        hight.add(5);
        hight.add(4);
        hight.add(8);
        hight.add(3);
        hight.add(7);
        System.out.println(Storewater(hight));
       



    }
    
}
