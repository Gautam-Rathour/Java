
// =======================================================================================================
// =======================================================================================================


// import java.util.ArrayList;
// public class Stacks {
//     static class Stack {
//         static ArrayList<Integer> list = new ArrayList<> ();

//         public static boolean isEmpty() {
//             return list.size() == 0;
//         }

//         //push
//         public static void push(int data) {
//             list.add(data);
//         }

//         //pop
//         public static int pop() {
//             if(isEmpty()) {
//                 return -1;
//             }

//             int top = list.get(list.size() - 1);
//             list.remove(list.size() - 1);
//             return top;
//         }

//         //peek
//         public static int peek() {
//             if(isEmpty()) {
//                 return -1;
//             }

//             int top = list.get(list.size() - 1);
//             return top;
//         }
//     }
//     public static void main (String args[]) {
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

// import java.util.*;
// public class Stacks {
//     static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }
//     static class Stack{
//         static Node head = null;

//         // isEmpty
//         public static boolean isEmpty() {
//             return head == null;
//         }

//         // push 
//         public static void push(int data) {
//             Node newNode = new Node(data);
//             if(isEmpty()) {
//                 head = newNode;
//                 return;
//             }
//             newNode.next = head;
//             head = newNode;
//         }

//         // pop
//         public static int pop() {
//             if(isEmpty()) {
//                 System.out.println("Stack is empty");
//                 return -1;
//             }
//             head = head.next;
//             return head.data;
//         }

//         // peek
//         public static int peek() {
//             if(isEmpty()) {
//                 System.out.println("Stack is empty");
//                 return -1;
//             }
//             return head.data;
//         }

//     }

// public static void main(String[] args) {
//     Stack s = new Stack();
//     s.push(1);
//     s.push(2);
//     s.push(3);

//     while(!s.isEmpty()) {
//         System.out.println(s.peek());
//         s.pop();
//     }
// }
// }

// // =======================================================================================================
// // =======================================================================================================

// import java.util.*;
// public class Stacks {

//     public static void main(String args[]) {
//         Stack<Integer> s = new Stack<>();
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

// // push any number at the bottom of the stack :---

// import java.util.*;
// public class Stacks {
//     public static void pushAtBottom(Stack<Integer> s, int data) {
//         if(s.isEmpty()) {
//             s.push(data);
//             return;
//         }
//         int top = s.pop();
//         pushAtBottom(s, data);
//         s.push(top);
//     }
//     public static void main(String args[]) {
//         Stack<Integer> s = new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);

//         pushAtBottom(s, 4);
//         while(!s.isEmpty()) {
//             System.out.println(s.pop());
//         }
//     }
// }


// =======================================================================================================
// =======================================================================================================

// // Reverse the String :--

// import java.util.*;
// public class Stacks {
//     public static String reverseString(String str) {
//         Stack<Character> s = new Stack<>();
//         int idx = 0;
//         while(idx < str.length()) {
//             s.push(str.charAt(idx));
//             idx++;
//         }

//         StringBuilder result = new StringBuilder("");
//         while(!s.isEmpty()) {
//             char curr = s.pop();
//             result.append(curr);
//         }
//         return result.toString();
//     }
//     public static void main(String args[]) {
//         String str = "HelloWorld";
//         String result = reverseString(str);
//         System.out.println(result);
//     }
// }
 
// =======================================================================================================
// =======================================================================================================

// // reverse a stack :--

// import java.util.*;
// public class Stacks {
//     public static void pushAtBottom(Stack<Integer> s, int data) {
//         if(s.isEmpty()) {
//             s.push(data);
//             return;
//         }
//         int top = s.pop();
//         pushAtBottom(s, data);
//         s.push(top);
//     }

//     // reverseStack ---
//     public static void reverseStack(Stack<Integer> s) {
//         if(s.isEmpty()) {
//             return;
//         }

//         int top = s.pop();
//         reverseStack(s);
//         pushAtBottom(s, top);
//     }

//     //print ---
//     public static void printStack(Stack<Integer> s) {
//         while(!s.isEmpty()) {
//             System.out.println(s.pop() + " ");
//         }
//     }
//     public static void main(String args[]) {
//         Stack<Integer> s = new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         //3, 2, 1

//         reverseStack(s);
//         printStack(s); // 1, 2, 3
//     }
// }

// =======================================================================================================
// =======================================================================================================

// // Stock span problem : --
// import java.util.*;
// public class Stacks {
//     public static void stockSpan(int stocks[], int span[]) {
//         Stack<Integer> s = new Stack<>();
//         span[0] = 1;
//         s.push(0);

//         for(int i=1; i<stocks.length; i++) {
//             int currPrice = stocks[i];
//             while(!s.isEmpty() && currPrice > stocks[s.peek()]) {
//                 s.pop();
//             }
//             if(s.isEmpty()) {
//                 span[i] = i+1;
//             } else {
//                 int prevHigh = s.peek();
//                 span[i] = i - prevHigh;
//             }

//             s.push(i);
//         }
//     }
//     public static void main(String args[]) {
//         int stocks[] = {100, 80, 60, 70, 60, 85, 100};
//         int span[] = new int [stocks.length];
//         stockSpan(stocks, span);

//         for(int i=0; i<span.length; i++) {
//             System.out.println(span[i] + " ");
//         }
//     }
// }

// =======================================================================================================
// =======================================================================================================
// =======================================================================================================
// =======================================================================================================
// Question : ----

// // Important but unable to Under-Stand

// import java.util.*;
// public class Stacks {

//     public static void main(String args[]) {
//         int arr[] = {6, 8, 0, 1, 3};
//         Stack<Integer> s = new Stack<>();
//         int nxtGreater[] = new int[arr.length];

//         for(int i = arr.length-1; i>=0; i--) {
//             //1 while
//             while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
//                 s.pop();
//             }

//             // 2 if-else
//             if(s.isEmpty()) {
//                 nxtGreater[i] = -1;
//             } else {
//                 nxtGreater[i] = arr[s.peek()];
//             }

//             //3 push in s
//             s.push(i);
//         }

//         for(int i=0; i<nxtGreater.length; i++) {
//             System.out.print(nxtGreater[i] + " ");
//         }
//         System.out.println();
//     }
// }

// =======================================================================================================
// =======================================================================================================
// =======================================================================================================
// =======================================================================================================

// // Valid Parentheses       -->  (({(})[])

// import java.util.*;
// public class Stacks {
//     public static boolean inValid(String str) {
//         Stack<Character> s = new Stack<>();
//         for(int i=0; i<str.length(); i++) {
//             char ch = str.charAt(i);

//             if(ch == '(' || ch == '{' || ch == '[') { // opening
//                 s.push(ch);
//             } else {
//                 //closing
//                 if(s.isEmpty()) {
//                     return false;
//                 }
//                 if( (s.peek() == '(' && ch == ')') //()
//                 || (s.peek() == '{' && ch == '}') // {}
//                 || (s.peek() == '[' && ch == ']') ) { //[]
//                     s.pop();
//                 } else {
//                     return false;
//                 }
//             }
//         }

//         if(s.isEmpty()) {
//             return true;
//         } else {
//             return false;
//         }
//     }
//     public static void main(String args[]) {
//         String str = "({()})[]";  //true
//         System.out.println(inValid(str));    
//     }
// }

// =======================================================================================================
// =======================================================================================================

// // Check Duplicate Parentheses

// import java.util.*;
// public class Stacks {
//     public static boolean isDuplicate(String str) {
//         Stack<Character> s = new Stack<>();

//         for(int i=0; i<str.length(); i++) {
//             char ch = str.charAt(i);

//             //closing
//             if(ch == ')') {
//                 int count = 0;
//                 while(s.peek() != '(') {
//                     s.pop();
//                     count++;
//                 }
//                 if(count < 1) {
//                     return true; // duplicate
//                 } else {
//                     s.pop();  // opening pair
//                 }
//             } else {
//                 // opening
//                 s.push(ch);
//             }
//         }
//         return false;
//     }

//     public static void main (String args[]) {
//         String str = "((a+b))"; //true
//         String str2 = "(a-b)"; // false
//         System.out.println(isDuplicate(str2));
//     }
// }

// =======================================================================================================
// =======================================================================================================

// // Max Area in Histogram  :--

// import java.util.Stack;
// public class Stacks {
//     public static void maxArea(int arr[]) {
//         int maxArea = 0;
//         int nsr[] = new int[arr.length];
//         int nsl[] = new int[arr.length];

//         // Next Smaller Right
//         Stack<Integer> s = new Stack<>();

//         for (int i = arr.length - 1; i >= 0; i--) {
//             while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
//                 s.pop();
//             }
//             if (s.isEmpty()) {
//                 nsr[i] = arr.length;
//             } else {
//                 nsr[i] = s.peek();
//             }
//             s.push(i);
//         }

//         // Next Smaller Left
//         s = new Stack<>();

//         for (int i = 0; i < arr.length; i++) {
//             while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
//                 s.pop();
//             }
//             if (s.isEmpty()) {
//                 nsl[i] = -1;
//             } else {
//                 nsl[i] = s.peek();
//             }
//             s.push(i);
//         }

//         // Current Area: width = j - i - 1
//         for (int i = 0; i < arr.length; i++) {
//             int height = arr[i];
//             int width = nsr[i] - nsl[i] - 1;
//             int currArea = height * width;
//             maxArea = Math.max(currArea, maxArea);
//         }
//         System.out.println("Max area in histogram = " + maxArea);
//     }
//     public static void main(String args[]) {
//         int arr[] = {2, 1, 5, 6, 2, 3};

//         maxArea(arr);
//     }
// }

// =======================================================================================================
// =======================================================================================================

// import java.util.*;
// public class Stacks {

//     public static void main(String args[]) {

//     } 
// }















