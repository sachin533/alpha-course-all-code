//setters and Getters

public class OOP2 {
    public static void main(String args[]) {
        pen p1 = new pen();
        p1.setcolor("Blue");
        System.out.println(p1.getcolor());
        p1.settip(5);
        System.out.println(p1.getTip());
        p1.setcolor("yellow");
        System.out.println(p1.getcolor());
7
    }
}

class pen {
    private String color;
    private int Tip;

    String getcolor() {
        return this.color;
    }

    int getTip() {
        return this.Tip;
    }

    void setcolor(String newcolor) {
        color = newcolor;
    }

    void settip(int newTip) {
        Tip = newTip;
    }

}
