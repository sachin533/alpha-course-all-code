//WAF to find a frist occurence of an element in array
//WAF to find a last occurence of an element in array
public class Recusrion4 {
    public static int firstOccurence(int arr[], int key, int i) {
    if (i == arr.length) {
    return -1;
    }
    if (arr[i] == key) {
    return i;
    }

    return firstOccurence(arr, key, i + 1);
    }
    public static int lastOccurence(int arr[], int key, int i) {

        if (i == arr.length) {
            return -1;
        }
        int isfound = lastOccurence(arr, key, i + 1);
        if (isfound == -1 && arr[i] == key) {
            return i;
        }

        return isfound;

    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 4, 5, 6, 7, 8, 5, 7 ,8,9,3,5};
        int key = 5;
        System.out.println(lastOccurence(arr, 5, 0));
    }

}
