public class Java72 {

    public static void SelectionArr(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minValue = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minValue] > arr[j]) {
                    minValue = j;
                }
            }

            int temp = arr[minValue];
            arr[minValue] = arr[i];
            arr[i] = temp;
        }
    }

    public static void PrintArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();

    }

    public static void main(String args[]) {
        int arr[] = { 5, 4, 1, 3, 2 };

        SelectionArr(arr);
        PrintArr(arr);
    }

}
