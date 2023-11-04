
// String 

public class Java75 {

    public static void printString(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {

        // Scanner sc = new Scanner(System.in);

        // String name;
        // name = sc.nextLine();
        // // System.out.println(name);

        // String fullname = "Sachin kamble";
        // System.out.println(fullname.length());

        String firstName = "Sachin";
        String SecondName = "Kamble";
        String fullName = firstName + " " + SecondName;
        printString(fullName);

        // System.out.println(fullName.charAt(0));

    }

}
