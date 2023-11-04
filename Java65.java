/* Largest number finding  */
public class Java65 {

    public static int GetLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 1; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }

            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }

        System.out.println("Smallest number is " + smallest);
        return largest;
    }

    public static void main(String args[]) {

        int numbers[] = { 2, 8, 9, 5, 4, 3, 1 };

        System.out.println("Largest number is " + GetLargest(numbers));

    }

}
