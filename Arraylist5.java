import java.util.ArrayList;
import java.util.Collections;

public class Arraylist5 {

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(2);
        list.add(7);
        list.add(4);
        list.add(34);
        list.add(9);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        //desending
        Collections.sort(list , Collections.reverseOrder());
        System.out.println(list);

    }
}