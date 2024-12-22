// =======================================================================================================
// =======================================================================================================

// import java.util.*;
// public class LinkedList {
//     public static class Node {
//         int data;
//         Node next;
        
//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public static int size;

//     // addFirst :-
//     public void addFirst(int data) {
//         Node newNode = new Node(data);
//         size++;
//         if(head == null) {
//             head = tail =  newNode;
//             return;
//         }
//         newNode.next = head;
//         head = newNode;
//     }
// // =======================================================================================================

//     //addLast : - 
//     public void addLast(int data) {
//         Node newNode = new Node(data);
//         size++;
//         if(head == null) {
//             head = tail = newNode;
//         }
//         tail.next = newNode;
//         tail = newNode;

//     }
//  // =======================================================================================================


//     // Print : --
//     public void print() {
//         Node temp = head;

//         while(temp != null) {
//             System.out.print(temp.data + "-> ");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }
//  // =======================================================================================================


//     // add :--
//     public void add(int idx, int data) {
//         Node newNode = new Node(data);
//         size++;
//         if(head == null) {
//             head = tail = newNode;
//         }
//         Node temp = head;
//         int i = 0;

//         while(i < idx-1) {
//             temp = temp.next;
//             i++;
//         }
//         newNode.next = temp.next;
//         temp.next = newNode;
//     }
// // =======================================================================================================

//     //Remove First :- 
//     public int removeFirst() {
//         if(size == 0) {
//             System.out.println("LinkedList is allready empty !");
//             return Integer.MIN_VALUE;
//         } else if(size == 1){
//             int val = head.data;
//             head = tail = null;
//             size = 0;
//             return val;
//         }
//         int val = head.data;
//         head = head.next;
//         size--;
//         return val;
//     }
// // =======================================================================================================

//     //Remove Last :-
//     public int removeLast() {
//         if(size == 0) {
//             System.out.println("LL is empty");
//             return Integer.MIN_VALUE;
//         } else if(size == 1){
//             int val = head.data;
//             head = tail = null;
//             size = 0;
//             return val;
//         }
//         //prev
//         Node lastNode = head.next;
//         Node secondLast = head;

//         while (lastNode.next != null) {
//             secondLast = lastNode;
//             lastNode = lastNode.next;
//         }
//         int val = secondLast.next.data; //tail.data
//         secondLast.next = null;
//         tail = secondLast;
//         size--;
//         return val;
//     }
// // =======================================================================================================

//     // Search in LinkedList :-
//     public int search(int key) {
//         Node temp = head;
//         int i = 0;
        
//         while(temp != null) {
//             if(temp.data == key) {
//                 System.out.println("Element is found on index = " + i);
//                 return i;
//             } else {
//                 temp = temp.next;
//                 i++;
//             }
//         }
//         return -1;
//     }
// // =======================================================================================================

//     // Recursive Search :-
//     public int helper(Node head, int key) {  // O(n)
//         if(head == null) {
//             return -1;
//         }
//         if(head.data == key) {
//             return 0;
//         }
//         int idx = helper(head.next, key);
//         if(idx == -1) {
//             return -1;
//         }

//         return idx+1;
//     }
//     public int recSearch(int key) {
//         return helper(head, key);
//     }
// // =======================================================================================================
  
//     //Reverse a Linked List :-
//     public void reverseList() {
//         Node prev = null;
//         Node curr = head;

//         while(curr != null) {
//             Node temp = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = temp;
//         }
//         head = prev;
//     }
// // =======================================================================================================
  
//     // Delete Nth From End :-
//     public void deleteNthfromEnd(int n) {
//         // calculate size
//         int sz = 0;
//         Node temp = head;
//         while(temp != null) {
//             temp = temp.next;
//             sz++;
//         }
        
//         if(n == sz) {
//             head = head.next; //removeFirst
//             return;
//         }
//         // sz-n
//         int i = 1;
//         int iToFind = sz-n;
//         Node prev = head;
//         while(i < iToFind) {
//             prev = prev.next;
//             i++;
//         }

//         prev.next = prev.next.next;
//         return;
//     }
// // =======================================================================================================
  
//     // Find Mid :- ( Slow-Fast Approach)
//     public Node findMid(Node head) { //helper
//         Node slow = head;
//         Node fast = head;

//         while(fast != null && fast.next != null) {
//             fast = fast.next.next; // +2
//             slow = slow.next; //+1
//         }
//         return slow; // 
//     }

//     public boolean checkPalindrom() {
//         if(head == null || head.next == null) {
//             return true;
//         }
//         //step1 - find mid
//         Node midNode = findMid(head);

//         //step2 - reverse 2nd half
//         Node prev = null;
//         Node curr = midNode;
//         while (curr != null) {
//             Node temp = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = temp;
//         }

//         Node right = prev; // right half head
//         Node left = head;
//         //step3 - check left half & right half
//         while(right != null) {
//             if(left.data != right.data) {
//                 return false;
//             } 
//             left = left.next;
//             right = right.next;
//         }
//         return true;
//     }
//     public static void main(String args[]) {
//         LinkedList ll = new LinkedList();
//         // ll.addFirst(2);
//         // ll.addFirst(1);
//         // ll.addLast(4);
//         // ll.addLast(6);


//         // ll.add(2, 3);
//         // ll.add(4, 5);
//         // ll.add(6, 7);
//         // ll.print();  //1->2->9->3->4

//         // // // System.out.println(ll.size);
//         // // ll.removeFirst();
//         // // ll.print();

//         // // ll.removeLast();;
//         // // ll.print();

//         // // ll.search(7);
//         // // System.out.println(ll.recSearch(7));

//         // // ll.reverseList();
//         // // ll.print();

//         // ll.deleteNthfromEnd(4);
//         // ll.print();

//         // =======================================================================================================

//         ll.addLast(1);
//         ll.addLast(2);
//         ll.addLast(2);
//         // ll.addLast(1);

//         ll.print();  // 1->2->2->1
//         System.out.println(ll.checkPalindrom());
//     }
// }


// =======================================================================================================
// =======================================================================================================
// =======================================================================================================
// =======================================================================================================

//  // Secoond Lecture ;--

//     // Detecting Cycle code :----

// import java.util.*;
//  public class LinkedList {
//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }  
//     }
//     public static Node head;

//     public static boolean isCycle() { // Floy's CFA
//         Node slow = head;
//         Node fast = head;

//         while(fast != null && fast.next != null) {
//             fast = fast.next.next; // +2
//             slow = slow.next;  // +1
//             if(fast == slow) {
//                 return true; // isCycle 
//             }
//         }
//         return false;  // cycle doesn't exist
//     } 
// // =======================================================================================================

//     // Remove Cycle Code :--
//     public static void removeCycle() {
//         // detect cycle
//         Node slow = head;
//         Node fast = head;
//         boolean cycle = false;
//         while(fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//             if(fast == slow) {
//                 cycle = true;
//                 break;
//             }
//         }
//         if(cycle == false) {
//             return ;
//         }

//         //find meeting point :--
//         slow = head;
//         Node prev = null; // last node
//         while (slow != fast) {
//             prev = fast;
//             slow = slow.next;
//             fast = fast.next;
//         }

//         //remove cycle -> last.next = null
//         prev.next = null;
//     }
 
//     public static void main(String args[]) {
//         // LinkedList ll = new LinkedList();
//         head = new Node(1);
//         Node temp = new Node(2);
//         head.next = temp;
//         head.next.next = new Node(3);
//         head.next.next.next = temp;
//         // 1->2->3->2
//          System.out.println(isCycle());
//          removeCycle();
//          System.out.println(isCycle());
//     }
//  }

// =======================================================================================================
// =======================================================================================================


// import java.util.*;
// public class LinkedList {
//     public static class Node{
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }
//     public static Node head;

//     // check LL is in cycle or not :-
//     public static boolean isCycle() {
//         Node slow = head;
//         Node fast = head;

//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//             if(fast == slow) {
//                 return true;
//             }
//         }
//         return false;
//     }


//     // delete the ll cycle :--
//     public static void removeCycle() {
//         //check cycle or not --
//         Node slow = head;
//         Node fast = head;
//         boolean cycle = false;

//         while(fast.next != null && fast != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//             if(fast == slow) {
//                 cycle = true;
//                 break;
//             }
//         }
//         if(cycle = false) {
//             return;
//         }
        

//         // find the ll cycle connecting point --
//         slow = head;
//         Node prev = null;
//         while(slow != fast) {
//             prev = fast;
//             slow = slow.next;
//             fast = fast.next;
//         }

//         // delete the cunnection --
//         prev.next = null;

//     }
//     public static void main(String args[]) {
//         head = new Node (1);
//         Node temp = new Node (2);
//         head.next = temp;
//         head.next.next = new Node(3);
//         head.next.next.next = temp;

//         System.out.println(isCycle());
//         removeCycle();
//         System.out.println(isCycle());
//     }
// }

// // =======================================================================================================
// // =======================================================================================================

// import java.util.*;
// public class MyLinkedList {

//     public static void main(String args[]) {
//         //create -
//         LinkedList<Integer> ll = new LinkedList<>();

//         //add 
//         ll.addLast(1);
//         ll.addLast(2);
//         ll.addFirst(0);
//         //0->1->2
//         System.out.println(ll);
//         //remove
//         ll.removeLast();
//         ll.removeFirst();
//         System.out.println(ll);
//     }
// }

// =======================================================================================================
// =======================================================================================================

// merge sort in Linked-List : --

import java.util.*;
public class MyLinkedList {
    public static class Node{
        int data;
        Node next;

        public Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    // add-First :-
    public static void addFirst(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Print :--
    public static void print() {
        Node temp = head;

        while(temp != null) { 
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // //getMid :--
    // private Node getMid(Node head) {
    //     Node slow = head;
    //     Node fast = head.next;

    //     while(fast != null && fast.next != null) {
    //         slow = slow.next;
    //         fast = fast.next.next;
    //     }
    //     return slow; // mid node
    // }

    // private Node merge(Node head1, Node head2) {
    //     Node mergedLL = new Node(-1);
    //     Node temp = mergedLL;

    //     while(head1 != null && head2 != null) {
    //         if(head1.data <= head2.data) {
    //             temp.next = head1;
    //             head1 = head1.next;
    //             temp = temp.next;
    //         } else {
    //             temp.next = head2;
    //             head2 = head2.next;
    //             temp = temp.next;
    //         }
    //     }

    //     while(head1 != null) {
    //         temp.next = head1;
    //         head1 = head1.next;
    //         temp = temp.next;
    //     }

    //     while(head2 != null) {
    //         temp.next = head2;
    //         head2 = head2.next;
    //         temp = temp.next;
    //     }
    //     return mergedLL.next;
    // }
    // public Node mergeSort(Node head) {
    //     if(head == null || head.next == null) {
    //         return head;
    //     }
    //     //find mid
    //     Node mid = getMid(head);

    //     //left & right MS
    //     Node rightHead = mid.next;
    //     mid.next = null;
    //     Node newLeft = mergeSort(head);
    //     Node newRight = mergeSort(rightHead);

    //     //merge
    //     return merge (newLeft, newRight);
    // }

    // Find ZigZag LinkedList :--
    public void zigZag() {
        //find mid 
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next = null;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        //alt merge - zig-zag merge
        while(left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            //Update: -
            left = nextL;
            right = nextR;
        }
    }
    public static void main(String args[]) {
        MyLinkedList ll = new MyLinkedList();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        // 5->4->3->2->1

        // ll.print();
        // ll.head = ll.mergeSort(ll.head);
        // ll.print();

        ll.print();
        ll.zigZag();
        ll.print();
    }
}

// =======================================================================================================
// =======================================================================================================
// =======================================================================================================
// =======================================================================================================











































































































































