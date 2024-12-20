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
// =======================================================================================================

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
 // =======================================================================================================


    // Print : --
    public void print() {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
 // =======================================================================================================


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
// =======================================================================================================

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
// =======================================================================================================

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
// =======================================================================================================

    // Search in LinkedList :-
    public int search(int key) {
        Node temp = head;
        int i = 0;
        
        while(temp != null) {
            if(temp.data == key) {
                System.out.println("Element is found on index = " + i);
                return i;
            } else {
                temp = temp.next;
                i++;
            }
        }
        return -1;
    }
// =======================================================================================================

    // Recursive Search :-
    public int helper(Node head, int key) {  // O(n)
        if(head == null) {
            return -1;
        }
        if(head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1) {
            return -1;
        }

        return idx+1;
    }
    public int recSearch(int key) {
        return helper(head, key);
    }
// =======================================================================================================
  
    //Reverse a Linked List :-
    public void reverseList() {
        Node prev = null;
        Node curr = head;

        while(curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head = prev;
    }
// =======================================================================================================
  
    // Delete Nth From End :-
    public void deleteNthfromEnd(int n) {
        // calculate size
        int sz = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            sz++;
        }
        
        if(n == sz) {
            head = head.next; //removeFirst
            return;
        }
        // sz-n
        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while(i < iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }
// =======================================================================================================
  

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(6);


        ll.add(2, 3);
        ll.add(4, 5);
        ll.add(6, 7);
        ll.print();  //1->2->9->3->4

        // // System.out.println(ll.size);
        // ll.removeFirst();
        // ll.print();

        // ll.removeLast();;
        // ll.print();

        // ll.search(7);
        // System.out.println(ll.recSearch(7));

        // ll.reverseList();
        // ll.print();

        ll.deleteNthfromEnd(4);
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





















































































































































