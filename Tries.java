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
 
// //  Find Prefix  :  -- 

// public class Tries {

//     static class Node {
//         Node[] children = new Node[26];  // 'a' to 'z'
//         boolean eow = false;
//         int freq;

//         public Node() {
//             for(int i=0; i<children.length; i++) {
//                 children[i] = null;
//             }
//             freq = 1;
//         }
//     }

//     public static Node root = new Node();

//     public static void insert(String word) {
//         Node curr = root;
//         for(int i=0; i<word.length(); i++) {
//             int idx = word.charAt(i) - 'a';
//             if(curr.children[idx] == null) {
//                 curr.children[idx] = new Node();
//             } else {
//                 curr.children[idx].freq++;
//             }
//             curr = curr.children[idx];
//         }

//         curr.eow = true;
//     }

//     public static void findPrefix(Node root, String ans) { //O(L)
//         if(root == null) {
//             return;
//         }

//         if(root.freq == 1) {
//             System.out.println(ans);
//             return;
//         }

//         for(int i=0; i<root.children.length; i++) {
//             if(root.children[i] != null) {
//                 findPrefix(root.children[i], ans+(char)(i+'a'));
//             }
//         }
//     }

//     public static void main(String args[]) {
//         String arr[] = {"zebra", "dog", "duck", "dove"};
//         for(int i=0; i<arr.length; i++) {
//             insert(arr[i]);
//         }

//         root.freq = -1;

//         findPrefix(root, "");
//     }
// }

// ========================================================================================================
// ========================================================================================================
 
// //  Starts With Prefix  :  ----

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

//     // Starts With Prefix
//     public static boolean startsWith(String prefix) {  // O(L)
//         Node curr = root;

//         for(int i=0; i<prefix.length(); i++) {
//             int idx = prefix.charAt(i) - 'a';
//             if(curr.children[idx] == null) {
//                 return false;
//             }

//             curr = curr.children[idx];
//         }

//         return true;
//     }
//     public static void main(String args[]) {
//         String words[] = {"apple", "app", "mango", "man", "woman"};
//         String prefix1 = "app";
//         String prefix2 = "moon";

//         for(int i=0; i<words.length; i++) {
//             insert(words[i]);
//         }

//         System.out.println(startsWith(prefix1));
//         System.out.println(startsWith(prefix2));
//     }
// }

// ========================================================================================================
// ========================================================================================================
 
// // Unique SubString : ---

// public class Tries {
//     static class Node {
//         Node children[] = new Node[26];
//         boolean isEndOfWord;

//         public Node() {
//             for(int i=0; i<26; i++) {
//                 children[i] = null;
//             }
//         }
//     }

//     public static Node root = new Node();

//     // Insert  : --
//     public static void insert(String word) {
//         Node curr = root;

//         for(int i=0; i<word.length(); i++) {
//             int idx = word.charAt(i) - 'a';
//             if(curr.children[idx] == null) {
//                 curr.children[idx] = new Node();
//             }
//             curr = curr.children[idx];
//         }
//         curr.isEndOfWord = true;
//     }

//     // Search  :  ---
//     public static boolean search (String word) {
//         Node curr = root;
//         for(int i=0; i<word.length(); i++) {
//             int idx = word.charAt(i) - 'a';
//             if(curr.children[idx] == null) {
//                 return false;
//             }
//             curr = curr.children[idx];
//         }
//         return curr.isEndOfWord = true;
//     }

//     public static int countNodes(Node root) {
//         if(root == null) {
//             return 0;
//         }

//         int count = 0;
//         for(int i=0; i<26; i++) {
//             if(root.children[i] != null) {
//                 count += countNodes(root.children[i]);
//             }
//         }
//         return count + 1;
//     }


//     public static void main(String args[]) {
//         String str = "apple";  // ans = 10

//         // suffix -> insert in trie
//         for(int i=0; i<str.length(); i++) {
//             String suffix = str.substring(i);
//             insert(suffix);
//         }

//         System.out.println(countNodes(root));
//     }
// }

// ========================================================================================================
// ========================================================================================================
 
// Longest word with all prefixes  :  ----
public class Tries {
    static class Node {
        Node children[] = new Node[26];
        boolean isEndOfWord;

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            isEndOfWord = false;  // Fix: Explicitly initializing
        }
    }

    public static Node root = new Node();
    public static String ans = "";

    // Insert method
    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.isEndOfWord = true;
    }

    // Search method
    public static boolean search(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.isEndOfWord;  // Fix: No assignment here
    }

    // Longest Word with All Prefixes
    public static void longestWord(Node root, StringBuilder temp) {
        if (root == null) {
            return;
        }

        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null && root.children[i].isEndOfWord) {
                char ch = (char) (i + 'a');
                temp.append(ch);

                // Fix: Ensure lexicographically smaller words are considered
                if (temp.length() > ans.length() ||
                        (temp.length() == ans.length() && temp.toString().compareTo(ans) < 0)) {
                    ans = temp.toString();
                }

                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length() - 1); // Backtrack
            }
        }
    }

    public static void main(String args[]) {
        String words[] = {"a", "banana", "app", "ap", "apply", "appl", "apple"};

        for (String word : words) {
            insert(word);
        }

        longestWord(root, new StringBuilder(""));
        System.out.println(ans);
    }
}

// ========================================================================================================
// ========================================================================================================
 