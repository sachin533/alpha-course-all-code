public class OPP3 {
    public static void main(String args[]) {
        student s1 = new student();
        student s2 = new student("Sachin");
        System.out.println(s2.name);
        student s3 = new student(8);
        System.out.println(s3.Roll);
        //error
        // student s3 = new student("Sachin",08);
        

    }
}

class student {
    String name;
    int Roll;
//Non Parameterized Constructors
    student() {
        System.out.println("Constructors is called......");
    }

    student (String name){
        this.name = name;
    }

    student (int roll){
        this.Roll = roll;
    }
}
