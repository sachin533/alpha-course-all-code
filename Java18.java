import java.util.Scanner;
public class Java18 {
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("Adult : Collage,Drive,vote ");
        }

        if(age > 13 && age < 18){
            System.out.println("Teenager");
        }

        else{
            System.out.println("Not Adult");
        }
        
    }
}
