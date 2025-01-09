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

    // Build BST  : --
    public static Node insert(Node root, int val) {
        if(root == null) {
            root = new Node(val);
            return root;
        }

        if(root.data > val) {
            //left subtree
            root.left = insert(root.left, val);
        } else {
            //right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if(root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Search in a BST  : ---
    public static boolean search(Node root, int val) {
        if(root == null) {
            return false;
        }

        if(root.data == val) {
            return true;
        }
        if(root.data > val) {
            return search(root.left, val);
        } else {
            return search(root.right, val);
        }
    }
    public static void main(String args[]) {
        int valuse[] = {5, 1, 3, 4, 2, 7};
        Node root = null;

        // for(int i=0; i<valuse.length; i++) {
        //     root = insert(root, valuse[i]);
        // }

        // inorder(root);

        if(search(root, 9)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}


// =======================================================================================================
