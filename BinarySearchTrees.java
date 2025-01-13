// public class BinarySearchTrees {
//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         Node (int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     // Build BST  : --
//     public static Node insert(Node root, int val) {
//         if(root == null) {
//             root = new Node(val);
//             return root;
//         }

//         if(root.data > val) {
//             //left subtree
//             root.left = insert(root.left, val);
//         } else {
//             //right subtree
//             root.right = insert(root.right, val);
//         }
//         return root;
//     }

//     public static void inorder(Node root) {
//         if(root == null) {
//             return;
//         }

//         inorder(root.left);
//         System.out.print(root.data + " ");
//         inorder(root.right);
//     }

//     // Search in a BST  : ---
//     public static boolean search(Node root, int val) {
//         if(root == null) {
//             return false;
//         }

//         if(root.data == val) {
//             return true;
//         }
//         if(root.data > val) {
//             return search(root.left, val);
//         } else {
//             return search(root.right, val);
//         }
//     }
//     public static void main(String args[]) {
//         int valuse[] = {5, 1, 3, 4, 2, 7};
//         Node root = null;

//         // for(int i=0; i<valuse.length; i++) {
//         //     root = insert(root, valuse[i]);
//         // }

//         // inorder(root);

//         if(search(root, 9)) {
//             System.out.println("Found");
//         } else {
//             System.out.println("Not Found");
//         }
//     }
// }

// =======================================================================================================
// =======================================================================================================

// // Delete a node in a tree  : ---

// import java.util.*;
// public class BinarySearchTrees {
//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         Node (int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }
//     public static void inorder(Node root) {
//         if(root == null) {
//             return;
//         }
//         inorder(root.left);
//         System.out.print(root.data + " ");
//         inorder(root.right);
//     }
//     public static Node insert(Node root, int val) {
//         if (root == null) {
//             return new Node(val);
//         }
//         if (val < root.data) {
//             root.left = insert(root.left, val);
//         } else {
//             root.right = insert(root.right, val);
//         }
//         return root;
//     }

//     // Delete a node
//     public static Node delete(Node root, int val) {
//         if(root == null) {
//             return null;
//         }

//         if(root.data < val) {
//             root.right = delete(root.right, val);
//         } else if (root.data > val) {
//             root.left = delete(root.left, val);
//         } else { //voila
//             //case 1 = left node
//             if(root.left == null && root.right == null) {
//                 return null;
//             }

//             //case 2 - single child
//             if(root.left == null) {
//                 return root.right;
//             } else if(root.right == null) {
//                 return root.left;
//             }

//             //case 3 - both children
//             Node IS = findInorderSuccessor(root.right);
//             root.data = IS.data;
//             root.right = delete(root.right, IS.data);
//         }
//         return root;
//     }

//     public static Node findInorderSuccessor(Node root) {
//         while(root.left != null) {
//             root = root.left;
//         } 
//         return root;
//     }
// // =======================================================================================================

//     //Print  In Range  : --
//     public static void printInRange(Node root, int k1, int k2) {
//         if(root == null) {
//             return;
//         }

//         if(k1 <= root.data && root.data <= k2) {
//             printInRange(root.left, k1, k2);
//             System.out.print(root.data + " ");
//             printInRange(root.right, k1, k2);
//         } else if (root.data <= k1){
//             printInRange(root.right, k1, k2);
//         } else {
//             printInRange(root.left, k1, k2);
//         }
//     }
// // =======================================================================================================

//     // Print Root to leaf  :---
//     public static void printPath(ArrayList<Integer> path) {
//         for(int i=0; i<path.size()-1; i++) {
//             System.out.print(path.get(i) + "->");
//         }
//         System.out.println("Null");
//     }
//     public static void printRoot2leaf(Node root, ArrayList<Integer> path) {
//         if(root == null) {
//             return;
//         }
//         path.add(root.data);
//         if(root.left == null && root.right == null) {
//             printPath(path);
//         }
//         printRoot2leaf(root.left, path);
//         printRoot2leaf(root.right, path);
//     }
// // =======================================================================================================

//     // Find Valid BST or not  : ---
//     public static boolean isValidBST(Node root, Node min, Node max) {
//         if(root == null) {
//             return true;
//         }

//         if(min != null && root.data <= min.data) {
//             return false;
//         }
//         else if(max != null && root.data >= max.data) {
//             return false;
//         }

//         return isValidBST(root.left, min, root)
//          && isValidBST(root.right, root, max);
//     }
// // =======================================================================================================

//     // Mirror a BST  : ---
//     public static Node mirror(Node root) {
//         if(root == null) {
//             return null;
//         }
//         Node leftAns = mirror(root.left);
//         Node rightAns = mirror(root.right);

//         root.left = leftAns;
//         root.right = rightAns;
//         return root;
//     }

//     public static void preorder(Node root) {
//         if(root == null) {
//             return;
//         }
//         System.out.print(root.data + " ");
//         preorder(root.left);
//         preorder(root.right);
//     }
//     public static void main(String args[]) {
//         // int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
//         int values[] = {8, 5, 3, 6, 10, 11, 14};
//         Node root   = null;

//         for(int i=0; i<values.length; i++) {
//             root = insert(root, values[i]);
//         }

//         inorder(root);
//         System.out.println();

//         // // root = delete(root, 4);
//         // // System.out.println();
//         // // inorder(root);

//         // // printInRange(root, 9, 12);

//         // // printRoot2leaf(root, new ArrayList<>() );

//         // if(isValidBST(root, null, null)) {
//         //     System.out.println("Valid");
//         // } else {
//         //     System.out.println("Not Valid");
//         // }

//         root = mirror(root);
//         preorder(root);
//     }
// }

// =======================================================================================================
// =======================================================================================================
// =======================================================================================================
// =======================================================================================================
// =======================================================================================================
// =======================================================================================================

//  Next Lecture   :  -----

// public class BinarySearchTrees {
//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         Node (int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }
//     public static void preorder(Node root) {
//         if(root == null) {
//             return;
//         }
//         System.out.print(root.data + " ");
//         preorder(root.left);
//         preorder(root.right);
//     }

//     public static Node createBST(int arr[], int start, int end) {
//         if(start > end) {
//             return null;
//         }

//         int mid = (start + end) / 2;
//         Node root = new Node(arr[mid]);
//         root.left = createBST(arr, start, mid - 1);
//         root.right = createBST(arr, mid + 1, end);
//         return root;
//     }

//     // Make a Balance BST
//     public static void getInorder(Node root, ArrayList<Integer> inorder) {
//         if(root == null) {
//             return;
//         }

//         getInorder(root.left, inorder);
//         inorder.add(root.data);
//         getInorder(root.right, inorder);
//     }
//     public static Node balanceBST(Node root) {
//         //inorder seq
//         ArrayList<Integer> inorder = new ArrayList<> ();

//         // sorted inorder -> balanced BST
//     }

//     public static void main(String args[]) {
//         int arr [] = {3, 5, 6, 8, 10, 11, 12};
//         int start = 0;
//         int end = arr.length-1;

//         Node root = createBST(arr, start, end);
//         preorder(root);
//     }
// }
// =======================================================================================================
// =======================================================================================================

//     // Make a Balance BST  :: ---
// import java.util.*;
// public class BinarySearchTrees {
//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         Node (int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }
//     public static void preorder(Node root) {
//         if(root == null) {
//             return;
//         }
//         System.out.print(root.data + " ");
//         preorder(root.left);
//         preorder(root.right);
//     }

//     // Make a Balance BST
//     public static void getInorder(Node root, ArrayList<Integer> inorder) {
//         if(root == null) {
//             return;
//         }
//         getInorder(root.left, inorder);
//         inorder.add(root.data);
//         getInorder(root.right, inorder);
//     }

//     public static Node createBST(ArrayList<Integer> inorder, int start, int end) {
//         if(start > end) {
//             return null;
//         }

//         int mid = (start + end) / 2;
//         Node root = new Node(inorder.get(mid));
//         root.left = createBST(inorder, start, mid - 1);
//         root.right = createBST(inorder, mid + 1, end);
//         return root;
//     }
//     public static Node balanceBST(Node root) {   // - O(n)
//         //inorder seq
//         ArrayList<Integer> inorder = new ArrayList<> ();
//         getInorder(root, inorder);

//         // sorted inorder -> balanced BST
//         root = createBST (inorder, 0, inorder.size()-1);
//         return root;
//     }

//     public static void main(String args[]) {
//         // int arr [] = {3, 5, 6, 8, 10, 11, 12};
//         // int start = 0;
//         // int end = arr.length-1;

//         /*
//                     8
//                    / \
//                   6   10
//                  /      \
//                 5        11
//                /           \
//               3             12
//         given BST
//          */

//         Node root = new Node(8);
//         root.left = new Node(6);
//         root.left.left = new Node(5);
//         root.left.left.left = new Node(3);

//         root.right = new Node(10);
//         root.right.right = new Node(11);
//         root.right.right.right = new Node(12);
//             /*
//                             8
//                            / \
//                           5   11
//                          / \   / \
//                         3   6 10 12
//                 expected BST

//          */

//         root = balanceBST(root);
//         preorder(root);
//     }
// }
// =======================================================================================================
// =======================================================================================================
// //  Find - largest BST :  ---

// public class BinarySearchTrees {
//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         Node (int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }
    
//     static class Info {
//         boolean isBST;
//         int size;
//         int min;
//         int max;

//         public Info(boolean isBST, int size, int min, int max) {
//             this.isBST = isBST;
//             this.size = size;
//             this.min = min;
//             this.max = max;
//         }
//     }
//     public static int maxBST = 0;
//     public static Info largestBST(Node root) {
//         if(root == null) {
//             return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
//         }
//         Info leftInfo = largestBST(root.left);
//         Info rightInfo = largestBST(root.right);
//         int size = leftInfo.size + rightInfo.size + 1;
//         int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
//         int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

//         if(root.data <= leftInfo.max || root.data >= rightInfo.min) {
//             return new Info(false, size, min, max);
//         }

//         if(leftInfo.isBST && rightInfo.isBST) {
//             maxBST = Math.max(maxBST, size);
//             return new Info(true, size, min, max);
//         }
//         return new Info(false, size, min, max);
//     }

//     public static void main(String args[]) {
//         /*               50
//                         /  \
//                        30   60
//                     /   \   / \
//                    5    20 45 70
//                            /    \
//                          65      80
//                 given BST
//  */
//         Node root = new Node(50);
//         root.left = new Node(30);
//         root.left.left = new Node(5);
//         root.left.right = new Node (20);

//         root.right = new Node(60);
//         root.right.left = new Node(45);
//         root.right.right = new Node(70);
//         root.right.right.left = new Node(65);
//         root.right.right.right = new Node(80);

//                 /*            60
//                              / \
//                             45 70
//                            /     \
//                           65     80 
//             expected BST  : size  = 5
//                 */

//         Info info = largestBST (root);
//         System.out.println("largest BST size = " + maxBST);
//     }
// }

// =======================================================================================================
// =======================================================================================================

// // Merge 2 BST :  --
// import java.util.*;
// public class BinarySearchTrees {
//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         Node (int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }
//     public static void getInorder(Node root, ArrayList<Integer> arr) {
//         if(root == null) {
//             return;
//         }
//         getInorder(root.left, arr);
//         arr.add(root.data);
//         getInorder(root.right, arr);
//     }
//     public static Node createBST(ArrayList<Integer> arr, int st, int end) {
//         if(st > end) {
//             return null;
//         }
//         int mid = (st+end) / 2;
//         Node root = new Node(arr.get(mid));
//         root.left = createBST(arr, st, mid-1);
//         root.right = createBST(arr, mid+1, end);
//         return root;
//     }
//     public static Node mergeBSTs(Node root1, Node root2) {
//         //step1
//         ArrayList<Integer> arr1 = new ArrayList<>();
//         getInorder(root1, arr1);

//         // step2
//         ArrayList<Integer> arr2 = new ArrayList <>();
//         getInorder(root2, arr2);

//         //merge
//         int i=0, j=0;
//         ArrayList<Integer> finalArr = new ArrayList<>();
//         while(i<arr1.size() && j<arr2.size()) {
//             if(arr1.get(i) <= arr2.get(j)) {
//                 finalArr.add(arr1.get(i));
//                 i++;
//             } else {
//                 finalArr.add(arr2.get(j));
//                 j++;
//             }
//         }

//         while(i<arr1.size()) {
//             finalArr.add(arr1.get(i));
//             i++;
//         }

//         while(j<arr2.size()) {
//             finalArr.add(arr2.get(j));
//             j++;
//         }

//         //sorted AL -> balanced BST
//         return createBST(finalArr, 0, finalArr.size()-1);
//     }
//     public static void preorder(Node root) {
//         if(root == null) {
//             return;
//         }
//         System.out.print(root.data + " ");
//         preorder(root.left);
//         preorder(root.right);
//     }
//     public static void main (String args[]) {
//         /*
//             2
//            /  \
//           1    4
//          */
//         Node root1 = new Node(2);
//         root1.left = new Node(1);
//         root1.right = new Node(4);

//           /*
//             9
//            /  \
//           3    12
//          */
//         Node root2 = new Node(9);
//         root2.left = new Node(3);
//         root2.right = new Node(12);

//     /*
//             3
//            /  \
//           1    9
//            \  /  \
//            2 4    12
//         final ans : BST
//     */

//     Node root = mergeBSTs(root1, root2);
//     preorder(root);
//     }
// }

// =======================================================================================================
// =======================================================================================================
