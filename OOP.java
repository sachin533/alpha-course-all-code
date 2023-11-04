public class OOP {

    public static void main(String args[]) {
        pen p1 = new pen();
        p1.setColor("blue");
        System.out.println(p1.Color);
        p1.setTip(19);
        System.out.println(p1.Tip);


        Student s1 = new Student();
        s1.CalPercentage(78,56,67);
        System.out.println(s1.percentage);


        BankAccount myAcc = new BankAccount();
        myAcc.Username = "sachinkamble";
        myAcc.setPassword ( "abcdefghi"); 
    }


}

class BankAccount{
    public String Username;
    private String Password;
    public void setPassword(String pwd){
        Password = pwd;
    }

}

class pen {
    String Color;
    int Tip;

    void setColor(String newColor) {
        Color = newColor;
    }

    void setTip(int newTip) {
        Tip = newTip;
    }

}

 class Student{
    String name;
    int age;
    int percentage;

    void CalPercentage(int phy, int che, int math){
        percentage = (phy + che + math)/ 3;
    }
 }

