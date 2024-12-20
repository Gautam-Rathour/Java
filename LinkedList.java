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
        size++;
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
        size++;
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
        size++;
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

    //Remove First :- 
    public int removeFirst() {
        if(size == 0) {
            System.out.println("LinkedList is allready empty !");
            return Integer.MIN_VALUE;
        } else if(size == 1){
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

    //Remove Last :-
    public int removeLast() {
        if(size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //prev
        Node lastNode = head.next;
        Node secondLast = head;

        while (lastNode.next != null) {
            secondLast = lastNode;
            lastNode = lastNode.next;
        }
        int val = secondLast.next.data; //tail.data
        secondLast.next = null;
        tail = secondLast;
        size--;
        return val;
    }
    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(6);
        ll.addLast(8);

        ll.add(2, 3);
        ll.add(4, 5);
        ll.add(6, 7);

        ll.print();  //1->2->9->3->4
        // System.out.println(ll.size);
        ll.removeFirst();
        ll.removeLast();;
        ll.print();
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

// =======================================================================================================
// =======================================================================================================

// // Reverse LinkedList :--

// class Solution {
//     public ListNode reverseList(ListNode head) {
//         ListNode curr = head;
//         ListNode prev = null;

//         while (curr != null) {
//             ListNode temp = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = temp;
//         }
//         return prev;
//     }
// }

// =======================================================================================================
// =======================================================================================================





















































































































































