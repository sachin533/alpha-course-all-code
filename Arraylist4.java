//swap 2 number
//O(n)

import java.util.ArrayList;

public class Arraylist4 {

    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {

        int temp = list.get(idx1);

        list.set(idx1, list.get(idx2));
        list.set(idx1, idx2);

    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(2);
        list.add(7);
        list.add(4);
        list.add(34);
        list.add(9);

        int idx1 = 1, indx2 = 3;
        System.out.println(list);

        swap(list, idx1, indx2);
        System.out.println(list);
    }

}
