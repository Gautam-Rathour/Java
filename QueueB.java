// =======================================================================================================
// =======================================================================================================
// Queue use of Array :--

// import java.util.*;
// public class QueueB {
//     static class Queue {
//         static int arr[];
//         static int size;
//         static int rear;

//         Queue(int n) {
//             arr = new int[n];
//             size = n;
//             rear = -1;
//         }

//         public static boolean isEmpty() {
//             return rear == -1;
//         }

//         // add
//         public static void add(int data) {
//             if(rear == size-1) {
//                 System.out.println("Queue is full");
//                 return;
//             }
//             rear = rear + 1;
//             arr[rear] = data;
//         }

//         //remove
//         public static int remove() {
//             if(isEmpty()) {
//                 System.out.println("Queue is empty");
//                 return -1;
//             }
//             int front = arr[0];
//             for(int i=0; i<rear; i++) {
//                 arr[i] = arr[i+1];
//             }
//             rear = rear - 1;
//             return front;
//         }

//         //peek 
//         public static int peek() {
//             if(isEmpty()) {
//                 System.out.println("Queue is empty");
//                 return  -1;
//             }
//             return arr[0];
//         }
//     }
//     public static void main (String args[]) {
//         Queue q = new Queue(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         q.add(6);


//         while(!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }

// =======================================================================================================
// =======================================================================================================

// import java.util.*;
// public class QueueB {
//     static class Queue {
//         static int arr[];
//         static int size;
//         static int rear;
//         static int front;

//         Queue(int n) {
//             arr = new int[n];
//             size = n;
//             rear = -1;
//             front = -1;
//         }

//         public static boolean isEmpty() {
//             return rear == -1 && front == -1;
//         }
//         public static boolean isFull() {
//             return (rear+1) % size == front;
//         }

//         // add
//         public static void add(int data) {
//             if(isFull()) {
//                 System.out.println("Queue is full");
//                 return;
//             }

//             //add 1st element
//             if(front == -1) {
//                 front = 0;
//             }
//             rear = (rear + 1) % size;
//             arr[rear] = data;
//         }

//         //remove
//         public static int remove() {
//             if(isEmpty()) {
//                 System.out.println("Queue is empty");
//                 return -1;
//             }
//             int result = arr[front];
            
//             // last el delete
//             if(rear == front) {
//                 rear = front = -1;
//             } else {
//                 front = (front + 1) % size;
//             } 
//             return result;
//         }

//         //peek 
//         public static int peek() {
//             if(isEmpty()) {
//                 System.out.println("Queue is empty");
//                 return  -1;
//             }
//             return arr[front];
//         }
//     }
//     public static void main (String args[]) {
//         Queue q = new Queue(3);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         System.out.println(q.remove());
//         q.add(4);
//         System.out.println(q.remove());
//         q.add(5);



//         while(!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }

// =======================================================================================================
// =======================================================================================================

// public class QueueB {
//     static class Node {
//         int data;
//         Node next;

//         Node (int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }
//     static class Queue {
//         static Node head = null;
//         static Node tail = null;

//         public static boolean isEmpty() {
//             return head == null && tail == null;
//         }

//         // add
//         public static void add(int data) {
//             Node newNode = new Node(data);
//             if(head == null) {
//                 head = tail = newNode;
//                 return;
//             }
//             tail.next = newNode;
//             tail = newNode;
//         }

//         // remove
//         public static int remove() {
//             if(isEmpty()) {
//                 System.out.println("Empty queue");
//                 return -1;
//             }
//             int front = head.data;
//             //single element
//             if(tail == head ) { 
//                 tail = head = null;
//             } else {
//                 head = head.next;
//             } 
//             return front;
//         }

//         // Peek
//         public static int peek() {
//             if(isEmpty()) {
//                 System.out.println("Empty queue");
//                 return -1;
//             }

//             return head.data;
//         }
//     }

//     public static void main(String args[]) {
//         Queue q = new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);

//         while(!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }

// =======================================================================================================
// =======================================================================================================

// // collection fremWork :--
// import java.util.*;
// public class QueueB {

//     public static void main(String args[]) {
//         // Queue<Integer> q = new LinkedList<>();  
//         Queue<Integer> q = new ArrayDeque<>();  // ArrayDeque
//         q.add(1);
//         q.add(2);
//         q.add(3);

//         while(!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }

// =======================================================================================================
// =======================================================================================================

// // Queue with help of two stack :--

// import java.util.*;
// public class QueueB {
//     static class Queue {
//         static Stack<Integer> s1 = new Stack<>();
//         static Stack<Integer> s2 = new Stack<>();

//         public static boolean isEmpty() {
//             return s1.isEmpty();
//         }

//         // add
//         public static void add(int data) {
//             while(!s1.isEmpty()) {
//                 s2.push(s1.pop());
//             }

//             s1.push(data);
            
//             while(!s2.isEmpty()) {
//                 s1.push(s2.pop());
//             }
//         }

//         //remove
//         public static int remove() {
//             if(isEmpty()) {
//                 System.out.println("Queue is Empty");
//                 return -1;
//             }
//             return s1.pop();
//         }

//         public static int peek() {
//             if(isEmpty()) {
//                 System.out.println("Queue is Empty");
//                 return -1;
//             }
//             return s1.peek();
//         }
//     }
//     public static void main(String args[]) {
//         Queue q = new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);

//         while(!q.isEmpty()) {
//             System.out.println(q.remove());
//         }
//     }
// }

// =======================================================================================================
// =======================================================================================================

// import java.util.*;
// public class QueueB {
//     static class Stack {
//         static Queue<Integer> q1 = new LinkedList<>();
//         static Queue<Integer> q2 = new LinkedList<>();

//         public static boolean isEmpty() {
//             return q1.isEmpty() && q2.isEmpty();
//         }

//         public static void push(int data) {
//             if(!q1.isEmpty()) {
//                 q1.add(data);
//             } else {
//                 q2.add(data);
//             }
//         }

//         // pop
//         public static int pop() {
//             if(isEmpty()) {
//                 System.out.println("Empty stack");
//                 return -1;
//             }
//             int top = -1;

//             // case 1
//             if(!q1.isEmpty()) {
//                 while(!q1.isEmpty()) {
//                     top = q1.remove();
//                     if(q1.isEmpty()) {
//                         break;
//                     }
//                     q2.add(top);
//                 }
//             } else {   // case 2
//                 while(!q2.isEmpty()) {
//                     top = q2.remove();
//                     if(q2.isEmpty()) {
//                         break;
//                     }
//                     q1.add(top);
//                 }
//             }
//             return top;
//         }

//         //peek
//         public static int peek() {
//             if(isEmpty()) {
//                 System.out.println("Empty stack");
//                 return -1;
//             }
//             int top = -1;
            
//             // case 1
//             if(!q1.isEmpty()) {
//                 while(!q1.isEmpty()) {
//                     top = q1.remove();
//                     q2.add(top);
//                 }
//             } else { // case 2
//                 while(!q2.isEmpty()) {
//                     top = q2.remove();
//                     q1.add(top);
//                 }
//             }
//             return top;
//         }
//     }
//     public static void main(String args[]) {
//         Stack s = new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);

//         while(!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }

// =======================================================================================================
// =======================================================================================================

// // Find Non - Repeating Letter : --

// import java.util.*;
// public class QueueB {
//     public static void printNonRepeating(String str) {
//         int freq[] = new int[26];  // 'a'-'z'
//         Queue<Character> q = new LinkedList<>();

//         for(int i=0; i<str.length(); i++) {
//             char ch = str.charAt(i);
//             q.add(ch);
//             freq[ch - 'a']++;

//             while(!q.isEmpty() && freq[q.peek()-'a'] > 1) {
//                 q.remove();
//             }

//             if(q.isEmpty()) {
//                 System.out.print(-1 + " ");
//             } else {
//                 System.out.print(q.peek() + " ");
//             }
//         }
//         System.out.println();
//     }
//     public static void main(String args[]) {
//         String str = "aabccxb";

//         printNonRepeating(str);
//     }
// }

// =======================================================================================================
// =======================================================================================================

// // Interleave two halver of a Queue :--

// import java.util.*;
// public class QueueB {
//     public static void interLeave(Queue<Integer> q) {
//         Queue<Integer> firstHalf = new LinkedList<>();
//         int size = q.size();

//         for(int i=0; i<size/2; i++) {
//             firstHalf.add(q.remove());
//         }

//         while(!firstHalf.isEmpty()) {
//             q.add(firstHalf.remove());
//             q.add(q.remove());
//         }
//     }
//     public static void main(String args[]) {
//         Queue<Integer> q = new LinkedList<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         q.add(6);
//         q.add(7);
//         q.add(8);
//         q.add(9);
//         q.add(10);

//         interLeave(q);
//         //print Q
//         while(!q.isEmpty()) {
//             System.out.print(q.remove() + " ");
//         }
//         System.out.println();
//     }
// }

// =======================================================================================================
// =======================================================================================================

// // Reverse a Queue :--

// import java.util.*;
// public class QueueB {
//     public static void reverse(Queue<Integer> q) {
//         Stack<Integer> s = new Stack<>();

//         while(!q.isEmpty()) {
//             s.push(q.remove());
//         }

//         while(!s.isEmpty()) {
//             q.add(s.pop());
//         }
//     }

//     public static void main(String args[]) {
//         Queue<Integer> q = new LinkedList<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);

//         reverse(q);

//         while(!q.isEmpty()) {
//             System.out.print(q.remove() + " ");
//         }
//         System.out.println();
//     }
// }

// =======================================================================================================
// =======================================================================================================

// // Deque : --
// // Deque is a double-ended queue. It is a queue that allows elements to be added or....

// import java.util.*;
// public class QueueB {
//     public static void main(String args[]) {
//         Deque<Integer> deque = new LinkedList<>();
//         deque.addFirst(1);
//         deque.addFirst(2);
//         deque.addLast(3);
//         deque.addLast(4);

//         System.out.println(deque);;
//         deque.removeLast();
//         System.out.println(deque);

//         System.out.println("First el = " + deque.getFirst());
//         System.out.println("Last el = " + deque.getLast());
//     }
// }

// =======================================================================================================
// =======================================================================================================

// // Stack & Queue using Deque :--

// import java.util.*;
// public class QueueB {
//     static class Stack {
//         Deque<Integer> deque = new LinkedList<>();

//         public void push(int data) {
//             deque.addLast(data);
//         }

//         public int pop() {
//             return deque.removeLast();
//         }

//         public int  peek() {
//             return deque.getLast();
//         }
//     }
    

//     public static void main (String args[]) {
//         Stack s = new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);

//         System.out.println("Peek = " + s.peek());
//         System.out.println(s.pop());
//         System.out.println(s.pop());
//         System.out.println(s.pop());
//     }
// }

// =======================================================================================================
// =======================================================================================================

// // Stack & Queue using Deque :--

// import java.util.*;
// public class QueueB {
//     static class Queue {
//         Deque<Integer> deque = new LinkedList<>();

//         public void add(int data) {
//             deque.addLast(data);
//         }

//         public int remove() {
//             return deque.removeFirst();
//         }

//         public int peek() {
//             return deque.getFirst();
//         }
//     }
//     public static void main (String args[]) {
//         Queue q = new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);


//         System.out.println("Peek = " + q.peek());
//         System.out.println(q.remove());
//         System.out.println(q.remove());
//         System.out.println(q.remove());
//     }
// }

// =======================================================================================================
// =======================================================================================================

// // Reverse Half Queue  : ---

// import java.util.*;
// public class QueueB {
//     static void reverseQueueFirstKElementsUsingStack(Queue<Integer> queue, int k) {
//         if (queue.isEmpty() == true || k > queue.size())
//             return;
//         if (k <= 0)
//             return;

//             Stack<Integer> stack = new Stack<Integer>();

//             //push the first K elements into a Stack
//             for (int i=0; i<k; i++) {
//                 stack.push(queue.peek());
//                 queue.remove();
//             }

//             // Enqueue the contents of stack
//             // at the back of the queue
//             while (!stack.empty()) {
//                 queue.add(stack.peek());
//                 stack.pop();
//             }

//             // Remove the remaining elements and enqueue
//             // them at the end of the Queue
//             for(int i=0; i<queue.size() - k; i++) {
//                 queue.add(queue.peek());
//                 queue.remove();
//             }
//         }

//         // static void reverseQueueFirstKElementsUsingRecursion(Queue<Integer> queue, int k) {
//         //     helper(queue, k);   // Step 1 and 2
//         //     int sz = queue.size() - k;  // Step 3
//         //     while(sz-- > 0) {
//         //         int x = queue.poll();
//         //         queue.add(x);
//         //     }
//         // }
//         // static void helper(Queue<Integer> queue, int k) {
//         //     if(k == 0) return;
//         //     int front = queue.peek();
//         //     queue.poll();
//         //     helper(queue, k-1);
//         //     queue.add(front);
//         // }

//     public static void main(String args[]) {
//         Queue<Integer> queue = new LinkedList<>();
//         queue.add(10);
//         queue.add(20);
//         queue.add(30);
//         queue.add(40);
//         queue.add(50);
//         queue.add(60);
//         queue.add(70);
//         queue.add(80);
//         queue.add(90);
//         queue.add(100);

//         int k = 5;

//         reverseQueueFirstKElementsUsingStack(queue, k);

//         while(!queue.isEmpty()) {
//             System.out.print(queue.poll() + " ");
//         }
//         System.out.println();
//     }
// }

// =======================================================================================================
// =======================================================================================================

// Sliding window maximum :---

import java.util.*;
public class QueueB {
    static void printSlidingWindowMaximumBruteForce(int arr[], int N, int K) {
        for(int i=0; i<=N - K; i++) {
            int currMax = arr[i];

            for(int j = i; j< i + K; j++) {
                if(arr[j] > currMax)
                    currMax = arr[j];
            } 
            System.out.print(currMax + " ");
        }
    }
 
    public static void main(String args[]) {
        int arr[] = {1,3,-1,-3,5,3,6,7};
        int N = arr.length;
        int K = 3;
        printSlidingWindowMaximumBruteForce(arr, N, K);

    }
}

