public class Java73 {

    public static void inserstionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > current) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = current;
        }
    }

    public static void PrintArr(int arr[]) {

        for (int i = 0; i <= arr.length-1; i++) {
            System.out.print(arr[i]);

        }
        System.out.println();
    }

    public static void main(String args[]) {

        int arr[] = { 5, 4, 1, 3, 2 };

        inserstionSort(arr);
        PrintArr(arr);
    }

}
