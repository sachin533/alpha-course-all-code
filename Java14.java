import java.util.Scanner;

/*Entercostof3itemsfromtheuser(usingfloatdatatype)-apencil,apenandan eraser. You have to output the total cost of the items back to the user as their bill */
public class Java14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float total = pencil + pen + eraser;

        System.out.println("Bill is " + total);

        Float newtotal = total + (0.18f * total);

        System.out.println("18% add " + newtotal);

    }

}
