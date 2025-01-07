// Print Top view of a Tree  : ----

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

//     // Top view of Tree  : ---
//     static class Info {
//         Node node;
//         int hd;

//         public Info(Node node, int hd) {
//             this.node = node;
//             this.hd = hd;
//         }
//     }
//     public static void topView(Node root) {
//         //Level Order
//         Queue<Info> q = new LinkedList<>();
//         HashMap<Integer, Node> map = new HashMap<>();

//         int min = 0, max = 0;
//         q.add(new Info(root, 0));
//         q.add(null);

//         while(!q.isEmpty()) {
//             Info curr = q.remove();

//             if(curr == null) {
//                 if(q.isEmpty()) {
//                     break;
//                 } else {
//                     q.add(null);
//                 }
//             } else {
//                 if(!map.containsKey(curr.hd)) { // first time my hd is occurring
//                     map.put(curr.hd, curr.node);
//                 }
    
//                 if(curr.node.left != null) {
//                     q.add(new Info(curr.node.left, curr.hd-1));
//                     min = Math.min(min, curr.hd-1);
//                 }
    
//                 if(curr.node.right != null) {
//                     q.add(new Info(curr.node.right, curr.hd+1));
//                     max = Math.max(max, curr.hd+1);
//                 }
//             } 
//         }

//         for(int i=min; i<=max; i++) {
//             System.out.print(map.get(i).data + " ");
//         }
//         System.out.println();
//     }
// // =======================================================================================================


//     // Print K - Level :  ----
//     public static void KLevel(Node root, int level, int k) {
//         if(root == null) {
//             return;
//         }
//         if(level == k) {
//             System.out.print(root.data + " ");
//             return;
//         }
//         KLevel(root.left, level+1, k);
//         KLevel(root.right, level+1, k);
//     }
// // =======================================================================================================

//     //  Lowest Common Ancestor  : --  ( Approach-1 )
//     public static boolean getPath(Node root, int n, ArrayList<Node> path) {
//         if(root == null) {
//             return false;
//         }
//         path.add(root);

//         if(root.data == n) {
//             return true;
//         }

//         boolean foundLeft = getPath(root.left, n, path);
//         boolean foundRight = getPath(root.right, n, path);

//         if(foundLeft || foundRight) {
//             return true;
//         }

//         path.remove(path.size()-1);
//         return false;
//     }
//     public static Node lca (Node root, int n1, int n2) {  //O(n)
//         ArrayList<Node> path1 = new ArrayList<>();
//         ArrayList<Node> path2 = new ArrayList<>();

//         getPath(root, n1, path1);
//         getPath(root, n2, path2);

//         //last common ancestor
//         int i = 0;
//         for(; i<path1.size() && i<path2.size(); i++) {
//             if(path1.get(i) != path2.get(i)) {
//                 break;
//             }
//         }

//         //last wqual node -> i-1th
//         Node lca = path1.get(i-1);
//         return lca;
//     }
// // ==============================================
//     //  Lowest Common Ancestor  : --  ( Approach-2 )

// public static Node lca2(Node root, int n1, int n2) {
//     if(root == null || root.data == n1 || root.data == n2) {
//         return root;
//     }

//     Node leftLca = lca2(root.left, n1, n2);
//     Node rightLca = lca2(root.right, n1, n2);

//     //leftLCA = val   rightLCA = null
//     if(rightLca == null) {
//         return leftLca;
//     }
//     if(leftLca == null) {
//         return rightLca;
//     }

//     return root;
// }
// // =======================================================================================================


// // Find Minimum distance between two N  : ---
// public static int lcaDist(Node root, int n) {
//     if(root == null) {
//         return -1;
//     }
//     if(root.data == n) {
//         return 0;
//     }

//     int leftDist = lcaDist(root.left, n);
//     int rightDist = lcaDist(root.right, n);

//     if(leftDist == -1 && rightDist == -1) {
//         return -1;
//     } else if (leftDist == -1){
//         return rightDist+1;
//     } else {
//         return leftDist+1;
//     }
// }
//     public static int minDist(Node root, int n1, int n2) {
//         Node lca = lca2(root, n1, n2);
//         int dist1 = lcaDist(lca, n1);
//         int dist2 = lcaDist(lca, n2);

//         return dist1 + dist2;
//     }

//     public static void main(String args[]) {
//          /* 
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

//             // topView(root);
//             // KLevel(root, 1, 2);

//             // int n1 = 4, n2 = 6;
//             // System.out.println(lca2(root, n1, n2).data);

//             int n1 = 4, n2 = 5;
//             System.out.println(minDist(root, n1, n2));
//     }
// }
