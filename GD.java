//Give two arrays and b of equal length n. pair each element of array A to an element
// in array B, such that sum S of absolute differneces of all the pairs is minimum.
import java.util.Arrays;

public class GD {

    public static void main(String args[]) {

      //  int A[] = { 1, 2, 3 };
      //  int B[] = { 3, 2, 1 };

        int A[] = { 1, 2, 3 ,4};
        int B[] = { 5, 6, 7 ,8};      


        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;

        for (int i = 0; i < A.length; i++) {
            minDiff += Math.abs(A[i] - B[i]);
        }

        System.out.println("min absolute diff od pairs = " + minDiff);
    }

}
