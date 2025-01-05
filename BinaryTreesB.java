// =======================================================================================================
// =======================================================================================================
// Build tree PreOrder :---

// import java.util.*;
// public class BinaryTreesB {
//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         Node(int data) { 
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     static class BinaryTree {
//         static int idx = -1;
//         public static Node buildTree(int nodes[]) {
//             idx++;
//             if(nodes[idx] == -1) {
//                 return null;
//             }

//             Node newNode = new Node (nodes[idx]);
//             newNode.left = buildTree(nodes);
//             newNode.right = buildTree(nodes);

//             return newNode;
//         }
//     }
//     public static void main(String args[]) {
//         int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

//         BinaryTree tree = new BinaryTree();
//         Node root = tree.buildTree(nodes);

//         System.out.println(root.data);
//     }
// }

// =======================================================================================================
// =======================================================================================================
// =======================================================================================================
// =======================================================================================================

//    Most important and long code 

// import java.util.*;
// public class BinaryTreesB {
//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     static class BinaryTree {
//         static int idx = -1;
//         public static Node buildTree(int nodes[]) {
//             idx++;
//             if(nodes[idx] == -1) {
//                 return null;
//             }

//             Node newNode = new Node (nodes[idx]);
//             newNode.left = buildTree(nodes);
//             newNode.right = buildTree(nodes);

//             return newNode;
//         }
//     }
// // =======================================================================================================

//     // // A. PreOrder Traversal  : ---
//     // public static void preorder(Node root) {
//     //     if(root == null) {
//     //         // System.out.print("-1 ");
//     //         return;
//     //     }

//     //     System.out.print(root.data + " ");
//     //     preorder(root.left);
//     //     preorder(root.right);
//     // }
// // =======================================================================================================

//     // // B. InOrder Traversal  : ---
//     // public static void inorder(Node root) {
//     //     if(root == null) {
//     //         return;
//     //     }

//     //     inorder(root.left);
//     //     System.out.print(root.data + " ");
//     //     inorder(root.right);
//     // }
// // =======================================================================================================

//     // // C. PostOrder Traversal : ---
//     // public static void postorder(Node root) {
//     //     if(root == null) {
//     //         return;
//     //     }

//     //     postorder(root.left);
//     //     postorder(root.right);
//     //     System.out.print(root.data + " ");
//     // }
// // =======================================================================================================

//     // D. Level Order Traversal :---

    // public static void levelOrder (Node root) {
    //     if(root == null) {
    //         return;
    //     }
    
    //     Queue<Node> q = new LinkedList<>();
    //     q.add(root);
    //     q.add(null);
    
    //     while(!q.isEmpty()) {
    //         Node currNode = q.remove();
    
    //         if(currNode == null) {
    //             System.out.println();
    //             if(q.isEmpty()) {
    //                 break;
    //             } else {
    //                 q.add(null);
    //             }
    //         } else {
    //             System.out.print(currNode.data + " ");
    //             if(currNode.left != null) {
    //                 q.add(currNode.left);
    //             }
    //             if(currNode.right != null) {
    //                 q.add(currNode.right);
    //             }
    //         }
    //     }
    // }


//     public static void main(String args[]) {
//         int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

//         BinaryTree tree = new BinaryTree();
//         Node root = tree.buildTree(nodes);

//         // preorder(root);
//         // inorder(root);
//         // postorder(root);
//         levelOrder(root);
//     }
// }

// =======================================================================================================
// =======================================================================================================
// =======================================================================================================
// =======================================================================================================
// //  Count height , Count Node , find sum of Node of Binary-Tree  :---

// import java.util.*;
// public class BinaryTreesB {
//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }
//     // height  :---
//     public static int height(Node root) {
//         if(root == null) {
//             return 0;
//         }
//         int lh = height(root.left);
//         int rh = height(root.right);
//         return Math.max(lh, rh) + 1;
//     }

//     // Count  :---
//     public static int count(Node root) {
//         if(root == null) {
//             return 0;
//         }
//         int Lcount = count (root.left);
//         int Rcount = count (root.right);
//         int total = (Lcount + Rcount) + 1;
//         return total;
//     }

//     // Sum  :---
//     public static int sum(Node root) {
//         if(root == null) {
//             return 0;
//         }
//         int leftSum = sum(root.left);
//         int rightSum = sum(root.right);

//         return (leftSum + rightSum) + root.data;
//     }
//     public static void main(String args[]) {

//             /* 
//                          1
//                         /  \
//                        2    3
//                       / \  / \
//                      4   5 6  7
//             */
//             Node root = new Node(1);
//             root.left = new Node (2);
//             root.right = new Node (3);
//             root.left.left = new Node(4);
//             root.left.right = new Node(5);
//             root.right.left = new Node(6);
//             root.right.right = new Node (7);


//             // System.out.println(height(root));
//             // System.out.println(count(root));
//             System.out.println(sum(root));
//     }
// }

// =======================================================================================================
// =======================================================================================================
// =======================================================================================================
// =======================================================================================================

// // Find Diameter of a Tree :----

// import java.util.*;
// public class BinaryTreesB {
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

//     // public static int height(Node root) {
//     //     if(root == null) {
//     //         return 0;
//     //     }
//     //     int lh = height(root.left);
//     //     int rh = height(root.right);
//     //     return Math.max(lh, rh) + 1;
//     // }

//     // // Find Diameter  : ---
//     // public static int diameter2(Node root) {   // O(n^2)
//     //     if(root == null) {
//     //         return 0;
//     //     }

//     //     int ld = diameter2(root.left);
//     //     int lh = height(root.left);
//     //     int rd = diameter2(root.right);
//     //     int rh = height(root.right);

//     //     int selfDiam = lh + rh + 1;

//     //     return Math.max(selfDiam, Math.max(ld, rd));
//     // }

//     // Approach 2  : ---
//     static class Info {
//         int diam;
//         int ht;

//         public Info(int diam, int ht) {
//             this.diam = diam;
//             this.ht = ht;
//         }
//     }
//     public static Info diameter(Node root) {  // O(n)
//         if(root == null) {
//             return new Info(0, 0);
//         }

//         Info leftInfo = diameter(root.left);
//         Info rightInfo = diameter(root.right);

//         int diam = Math.max(Math.max(leftInfo.diam, leftInfo.diam), rightInfo.ht + rightInfo.ht + 1);
//         int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

//         return new Info(diam, ht);
//     }

//     public static void main(String args[]) {
//             /* 
//                          1
//                         /  \
//                        2    3
//                       / \  / \
//                      4   5 6  7
//             */
//             Node root = new Node(1);
//             root.left = new Node (2);
//             root.right = new Node (3);
//             root.left.left = new Node(4);
//             root.left.right = new Node(5);
//             root.right.left = new Node(6);
//             root.right.right = new Node (7);

//             System.out.println(diameter2(root));
//             // System.out.println(diameter(root).diam);
//     }
// }

// =======================================================================================================
// =======================================================================================================

// // Find SubTree of a Tree :----

// import java.util.*;
// public class BinaryTreesB {
//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     public static boolean isIdentical(Node node, Node subRoot) {
//         if(node == null && subRoot == null) {
//             return true;
//         } else if(node == null || subRoot == null || node.data != subRoot.data) {
//             return false;
//         }

//         if(!isIdentical(node.left, subRoot.left)) {
//             return false;
//         }
//         if(!isIdentical(node.right, subRoot.right)) {
//             return false;
//         }

//         return true;
//     }
//     public static boolean isSubtree(Node root, Node subRoot) {
//         if(root == null) {
//             return false;
//         }
//         if(root.data == subRoot.data) {
//             if(isIdentical(root, subRoot)) {
//                 return true;
//             }
//         }

//         return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
//     }

//     public static void main(String args[]) {
//             /* 
//                          1
//                         /  \
//                        2    3
//                       / \  / \
//                      4   5 6  7
//             */
//             Node root = new Node(1);
//             root.left = new Node (2);
//             root.right = new Node (3);
//             root.left.left = new Node(4);
//             root.left.right = new Node(5);
//             root.right.left = new Node(6);
//             root.right.right = new Node (7);

//             /* 
//                        2    
//                       / \ 
//                      4   5
//             */
//             Node subRoot = new Node(2);
//             subRoot.left = new Node(4);
//             // subRoot.right = new Node(5);

//             System.out.println(isSubtree(root, subRoot));
//     }
// }

// =======================================================================================================
// =======================================================================================================
// Print Top view of a Tree  : ----

import java.util.*;
public class BinaryTreesB {
    static class Node {
        int data;
        Node left;
        Node right;

        Node (int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class Info {
        Node node;
        int hd;

        public Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }
    public static void topView(Node root) {
        //Level Order
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0, max = 0;
        q.add(new Info(root, 0));
        q.add(null);

        while(!q.isEmpty()) {
            Info curr = q.remove();

            if(curr == null) {
                if(q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if(!map.containsKey(curr.hd)) { // first time my hd is occurring
                    map.put(curr.hd, curr.node);
                }
    
                if(curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hd-1));
                    min = Math.min(min, curr.hd-1);
                }
    
                if(curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hd+1));
                    max = Math.max(max, curr.hd+1);
                }
            } 
        }

        for(int i=min; i<=max; i++) {
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();
    }
// =======================================================================================================


    // Print K - Level :  ----
    public static void KLevel(Node root, int level, int k) {
        if(root == null) {
            return;
        }
        if(level == k) {
            System.out.print(root.data + " ");
            return;
        }
        KLevel(root.left, level+1, k);
        KLevel(root.right, level+1, k);
    }
// =======================================================================================================


    public static void main(String args[]) {
         /* 
                         1
                        /  \
                       2    3
                      / \  / \
                     4   5 6  7
            */
            Node root = new Node(1);
            root.left = new Node (2);
            root.right = new Node (3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.left = new Node(6);
            root.right.right = new Node (7);

            // topView(root);
            KLevel(root, 1, 3);
    }
}