// ========================================================================================================
// ========================================================================================================
 
import java.util.*;
public class Tries {
    static class Node {
        Node children[] = new Node[26];
        boolean isEndOfWord;

        Node() {
            for(int i=0; i<26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    //  Insert  :  --
    public static void insert(String word) {
        Node curr = root;
        for(int level=0; level<word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] ==  null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }

        curr.isEndOfWord = true;   
    }

    //  Search  : ---
    public static boolean search(String key) {
        Node curr = root;
        for(int level=0; level<key.length(); level++) {
            int idx = key.charAt(level) - 'a';
            if(curr.children[idx] ==  null) {
                return false;
            }
            curr = curr.children[idx];
        }

        return curr.isEndOfWord = true;
    }

    public static void main(String args[]) {
        String words[] = {"the", "a", "there", "their", "any", "thee"};

        for(int i=0; i<words.length; i++) {
            insert(words[i]);
        }

        System.out.println(search("any"));
        System.out.println(search("an"));
    }
}

// ========================================================================================================
// ========================================================================================================
 