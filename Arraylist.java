import java.util.ArrayList;
public class Arraylist {

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();

        //Add element 
        list.add(1); //0(1)
        list.add(2); //0(1)
        list.add(3); //0(1)
        list.add(5); //0(1)
        list.add(6); //0(1)

        System.out.println(list);


        //Get Operation //0(1)
        int element = list.get(2);

        System.out.println(element);

         //Delete 0(n)
        list.remove(2);
        System.out.println(list);

        //Set element 
        list.set(2,10);
        System.out.println(list);

        //Contain element
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));


    }
    
}
