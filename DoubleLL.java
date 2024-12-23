public class DoubleLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.next = null;
        }
    }
    public static  Node head;
    public static  Node tail;
    public static int size;

    // addFirst --
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // addLast --




    //print --
    public void print() {
        if(head == null) {
            System.out.println("dll is empty");
            return;
        }
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // removeFirst --
    public void removeFirst() {
        size--;
        if(head == null) {
            System.out.println("dll is empty");
            return;
        }
        if(head.next == null) {
            head = tail = null;
        }

        head = head.next;
        head.prev = null;
    }

    // removeLast --






    // reverse ---
    public void reverse() {
        Node curr = head;
        Node prev = null;
    
        while(curr != null) { 
            Node next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String args []) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.print();
        // System.out.println(dll.size);
        // dll.removeFirst();
        // dll.print();
        // System.out.println(dll.size);

        dll.reverse();
        dll.print();
    }
}
