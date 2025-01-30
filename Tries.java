// ========================================================================================================
// ========================================================================================================
 
// import java.util.*;
// public class Tries {
//     static class Node {
//         Node children[] = new Node[26]; //'a' - 'z'
//         boolean isEndOfWord;

//         public Node() {
//             for(int i=0; i<26; i++) {
//                 children[i] = null;
//             }
//         }
//     }

//     public static Node root = new Node();

//     //  Insert  :  --
//     public static void insert(String word) {
//         Node curr = root;
//         for(int level=0; level<word.length(); level++) {
//             int idx = word.charAt(level) - 'a';
//             if(curr.children[idx] ==  null) {
//                 curr.children[idx] = new Node();
//             }
//             curr = curr.children[idx];
//         }

//         curr.isEndOfWord = true;   
//     }

//     //  Search  : ---
//     public static boolean search(String key) {
//         Node curr = root;
//         for(int level=0; level<key.length(); level++) {
//             int idx = key.charAt(level) - 'a';
//             if(curr.children[idx] ==  null) {
//                 return false;
//             }
//             curr = curr.children[idx];
//         }

//         return curr.isEndOfWord = true;
//     }


//     // Word Break  :  ---
//     public static boolean wordBreak(String key) {
//         if(key.length() == 0) {
//             return true;
//         }
//         for(int i=1; i<=key.length(); i++) {
//             if(search(key.substring(0, i)) && 
//             wordBreak(key.substring(i))) {
//                 return true;
//             }
//         }

//         return false;
//     }

//     public static void main(String args[]) {
//         // String words[] = {"the", "a", "there", "their", "any", "thee"};
//         String arr[] = {"i", "like", "sam", "samsung", "mobile", "ice"};

//         for(int i=0; i<arr.length; i++) {
//             insert(arr[i]);
//         }

//         // System.out.println(search("any"));
//         // System.out.println(search("an"));

//         String key = "ilikesamg";
//         System.out.println(wordBreak(key));
//     }
// }

// ========================================================================================================
// ========================================================================================================
 
public class Tries {

    static class Node {
        Node[] children = new Node[26];  // 'a' to 'z'
        boolean eow = false;
        int freq;

        public Node() {
            for(int i=0; i<children.length; i++) {
                children[i] = null;
            }
            freq = 1;
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for(int i=0; i<word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null) {
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    public static void findPrefix(Node root, String ans) { //O(L)
        if(root == null) {
            return;
        }

        if(root.freq == 1) {
            System.out.println(ans);
            return;
        }

        for(int i=0; i<root.children.length; i++) {
            if(root.children[i] != null) {
                findPrefix(root.children[i], ans+(char)(i+'a'));
            }
        }
    }

    public static void main(String args[]) {
        String arr[] = {"zebra", "dog", "duck", "dove"};
        for(int i=0; i<arr.length; i++) {
            insert(arr[i]);
        }

        root.freq = -1;

        findPrefix(root, "");
    }
}

// ========================================================================================================
// ========================================================================================================
 