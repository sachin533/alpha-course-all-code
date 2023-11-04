//Search for a key in Linked List.
//Return the position where it is found.
//if not found , return -1; 
public class LinkList2 {
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

    public void add(int idx, int data) {
        if (idx == 0) {
            addfirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

    }

    public int removeFirst() {

        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;

        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;

        }
        int val = head.data;
        head = head.next;
        size--;
        return val;

    }

    public int removelast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;

        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev = i=size-2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data;

        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int itrSearch(int key){
        Node temp = head;
        int i= 0;
        while(temp !=null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public static void main(String args[]) {
        LinkList ll = new LinkList();
        
        ll.addfirst(2);
        
        ll.addfirst(1);
        
        ll.addlast(3);
        
        ll.addlast(4);
        
       ll.print();
        
        System.out.println(ll.itrSearch(4));
        System.out.println(ll.itrSearch(8));
        

    }

}
