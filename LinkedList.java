// =======================================================================================================
// =======================================================================================================

import java.util.*;
public class LinkedList {
    public static class Node {
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    // addFirst :-
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail =  newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //addLast : - 
    public void addLast(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;

    }
 

    // Print : --
    public void print() {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
 

    // add :--
    public void add(int idx, int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
        }
        Node temp = head;
        int i = 0;

        while(i < idx-1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(6);

        ll.add(2, 3);
        ll.add(4, 5);

        ll.print();  //1->2->9->3->4
        System.out.println(ll.size);
    }
}

// =======================================================================================================
// =======================================================================================================

// public class LinkedList {
//     public void addFirst(int data) {
//         //step1 = create new node
//         Node newNode = new Node(data);

//         int temp = head;
//         int i = 2;
//         while()

//     } 

//     public static void main(String args[]) {
//         LinkedList ll = new LinkedList();
//         ll.addFirst(3);
//         ll.addFirst(1);
//         ll.addLast(4);

//     }
// }




















































































































































