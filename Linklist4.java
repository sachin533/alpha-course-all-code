//LinkList are cycle or not
public class Linklist4 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = next;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirst(int data) {
        // step1 = Create new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;

        }

        // step2 = newNode next = head
        newNode.next = head; // link

        // step3 = head = newNode
        head = newNode;

    }

    public void addlast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;

        }
        tail.next = newNode;
        tail = newNode;

    }

    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

 
    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!= null){
            slow = slow.next;//+1
            fast = fast.next.next;//+2
            if(slow==fast){
                return true; //cycle exists
            }
        }
        return false;
    }



    public static void main(String args[]) {

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head;

        System.out.println(isCycle());
  

}
}
