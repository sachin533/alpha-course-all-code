//inheritance

public class OOP3 {
    public static void main(String args[]) {

        fish shark = new fish();
        shark.eat();

    }

}

// Base class .... Parent class
class Animal {
    String eat;
    String breath;
    String walk;

    void eat() {
        System.out.println("FOOD");
    }

    void breath() {
        System.out.println("OXGEN");
    }

    void walk() {
        System.out.println("Style");
    }

}

// Derived class/ subclass......child class
class fish extends Animal {

    int fins;

    void swim() {
        System.out.println("swimming");
    }

}
