//Find The linklist in cycle or not then remove 

public class LinkList5 {

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
        // step1 = Create new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;

        }

        // step2 = newNode next = head
        newNode.next = tail; // link

        // step3 = head = newNode
        tail = newNode;

    }

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;// +1
            fast = fast.next.next;// +2
            if (slow == fast) {
                return true; // cycle exists
            }
        }
        return false;
    }

    public static void removeCycle() {
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                cycle = true;
                break;
            }
        }

        if (cycle == false) {
            return;
        }

        // find meeting foint
        slow = head;
        Node prev = null; // last node
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;

        }

        prev.next = null;

    }

    public static void main(String args[]) {

        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;

        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());

    }

}
