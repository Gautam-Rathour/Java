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

// Delete a node in a tree  : ---

import java.util.*;
public class BinarySearchTrees {
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
    public static void inorder(Node root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // Delete a node
    public static Node delete(Node root, int val) {
        if(root == null) {
            return null;
        }

        if(root.data < val) {
            root.right = delete(root.right, val);
        } else if (root.data > val) {
            root.left = delete(root.left, val);
        } else { //voila
            //case 1 = left node
            if(root.left == null && root.right == null) {
                return null;
            }

            //case 2 - single child
            if(root.left == null) {
                return root.right;
            } else if(root.right == null) {
                return root.left;
            }

            //case 3 - both children
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while(root.left != null) {
            root = root.left;
        } 
        return root;
    }
// =======================================================================================================

    //Print  In Range  : --
    public static void printInRange(Node root, int k1, int k2) {
        if(root == null) {
            return;
        }

        if(k1 <= root.data && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        } else if (root.data <= k1){
            printInRange(root.right, k1, k2);
        } else {
            printInRange(root.left, k1, k2);
        }
    }
// =======================================================================================================

    // Print Root to leaf  :---
    public static void printPath(ArrayList<Integer> path) {
        for(int i=0; i<path.size()-1; i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println("Null");
    }
    public static void printRoot2leaf(Node root, ArrayList<Integer> path) {
        if(root == null) {
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null) {
            printPath(path);
        }
        printRoot2leaf(root.left, path);
        printRoot2leaf(root.right, path);
    }
// =======================================================================================================

    // Find Valid BST or not  : ---
    public static boolean isValidBST(Node root, Node min, Node max) {
        if(root == null) {
            return true;
        }

        if(min != null && root.data <= min.data) {
            return false;
        }
        else if(max != null && root.data >= max.data) {
            return false;
        }

        return isValidBST(root.left, min, root)
         && isValidBST(root.right, root, max);
    }
// =======================================================================================================

    // Mirror a BST  : ---
    public static Node mirror(Node root) {
        if(root == null) {
            return null;
        }
        Node leftAns = mirror(root.left);
        Node rightAns = mirror(root.right);

        root.left = leftAns;
        root.right = rightAns;
        return root;
    }

    public static void preorder(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String args[]) {
        // int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        int values[] = {8, 5, 3, 6, 10, 11, 14};
        Node root   = null;

        for(int i=0; i<values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();

        // // root = delete(root, 4);
        // // System.out.println();
        // // inorder(root);

        // // printInRange(root, 9, 12);

        // // printRoot2leaf(root, new ArrayList<>() );

        // if(isValidBST(root, null, null)) {
        //     System.out.println("Valid");
        // } else {
        //     System.out.println("Not Valid");
        // }

        root = mirror(root);
        preorder(root);
    }
}

// =======================================================================================================
// =======================================================================================================
