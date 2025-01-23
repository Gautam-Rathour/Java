// =======================================================================================================
// =======================================================================================================

// import java.util.*;
// public class Hashing {
//     public static void main(String args[]) {
//         //Create
//         HashMap<String, Integer> hm = new HashMap<>();

//         //Insert  - O(1)
//         hm.put("India", 100);
//         hm.put("China", 150);
//         hm.put("US", 50);

//         System.out.println(hm);

//         // //Get - O(1)
//         // int population = hm.get("India");
//         // System.out.println(population);
//         // System.out.println(hm.get("Indonesia"));

//         // // ContainsKey - O(1)
//         // System.out.println(hm.containsKey("India")); //true
//         // System.out.println(hm.containsKey("Indonesia")); //false

//         // remove  : --
//         System.out.println(hm.remove("China"));
//         System.out.println(hm);

//         // size  :  --
//         System.out.println(hm.size());

//         // Is Empty
//         hm.clear();
//         System.out.println(hm.isEmpty());
//     }
// }

// =======================================================================================================
// =======================================================================================================

// // Iteration on HashMap  :  ---
// import java.util.*;
// public class Hashing {

//     public static void main(String args[]) {
//         HashMap<String, Integer> hm = new HashMap <>();
//         hm.put("India", 100);
//         hm.put("China", 150);
//         hm.put("US", 50);
//         hm.put("Indonesia", 6);
//         hm.put("Nepal", 5);

//         //Iterate 
//         Set<String> keys = hm.keySet();
//         System.out.println(keys);

//         for(String k : keys) {
//             System.out.println("key = " + k + ", value = " + hm.get(k));
//         }
//     }
// }
// =======================================================================================================
// =======================================================================================================
// =======================================================================================================
// =======================================================================================================

// //// HashMap Implementation Code --  ( IMP )  :  ---

// import java.util.*;
// public class Hashing {
//     static class HashMap<K, V> { //generic
//         private class Node {
//             K key;
//             V value;

//             public Node(K key, V value) {
//                 this.key = key;
//                 this.value = value;
//             }
//         }

//         private int n; //n
//         private int N;
//         private LinkedList<Node> buckets[]; //N = buckets.length

//         @SuppressWarnings("unchecked")
//         public HashMap() {
//             this.N = 4;
//             this.buckets = new LinkedList[4];
//             for(int i=0; i<4; i++) {
//                 this.buckets[i] = new LinkedList<>();
//             }
//         }

//         private int hashFunction(K key) {
//             int hc = key.hashCode();
//             return Math.abs(hc) % N;
//         }

//         private int SearchInLL(K key, int bi) {
//             LinkedList<Node> ll = buckets[bi];
//             int di = 0;

//             for(int i=0; i<ll.size(); i++) {
//                 Node node = ll.get(i);
//                 if(node.key == key) {
//                     return di;
//                 }
//                 di++;
//             }
//             return -1;
//         }

//         @SuppressWarnings("unchecked")
//         private void rehash() {
//             LinkedList<Node> oldBuck[] = buckets;
//             buckets = new LinkedList[N*2];
//             N = 2*N;
//             for(int i=0; i<buckets.length; i++) {
//                 buckets[i] = new LinkedList<>();
//             }

//             //nodes -> add in bucket
//             for(int i=0; i<oldBuck.length; i++) {
//                 LinkedList<Node> ll = oldBuck[i];
//                 for(int j=0; j<ll.size(); j++) {
//                     Node node = ll.remove();
//                     put(node.key, node.value);
//                 }
//             }
//         }
//         public void put(K key, V value) { //O(lemda)
//             int bi = hashFunction(key); // 0 to 3
//             int di = SearchInLL(key, bi); // valid; -1

//             if(di != -1) {
//                 Node node = buckets[bi].get(di);
//                 node.value = value;
//             } else {
//                 buckets[bi].add(new Node (key, value));
//                 n++;
//             }

//             double lambda = (double)n/N;
//             if(lambda > 2.0) {
//                 rehash();
//             }
//         }

//         public boolean containsKey(K key) { //O(1)
//             int bi = hashFunction(key); // 0 to 3
//             int di = SearchInLL(key, bi); // valid; -1

//             if(di != -1) { // valid
//                 return true;
//             } else { //Not-valid
//                 return false;
//             }
//         }

//         public V remove(K key) { //O(1)
//             int bi = hashFunction(key); 
//             int di = SearchInLL(key, bi); 

//             if(di != -1) {
//                 Node node = buckets[bi].remove(di);
//                 n--;
//                 return node.value;
//             } else {
//                 return null;
//             }
//         }

//         public V get(K key) { //O(1)
//             int bi = hashFunction(key); 
//             int di = SearchInLL(key, bi); 

//             if(di != -1) {
//                 Node node = buckets[bi].get(di);
//                 return node.value;
//             } else {
//                 return null;
//             }
//         }

//         public ArrayList<K> keySet() {
//             ArrayList<K> keys = new ArrayList<>();

//             for(int i=0; i<buckets.length; i++) {
//                 LinkedList<Node> ll = buckets[i];
//                 for(Node node : ll) {
//                     keys.add(node.key);
//                 }
//             }
//             return keys;
//         }

//         public boolean isEmpty() {
//             return n == 0;
//         }
//     }
//     public static void main(String args[]) {
//         HashMap<String, Integer> hm = new HashMap<>();
//         hm.put("India", 100);
//         hm.put("China", 150);
//         hm.put("US", 50);
//         hm.put("Nepal", 5);

//         ArrayList<String> keys = hm.keySet();
//         for(String key : keys) {
//             System.out.println(key);
//         }
//         System.out.println();

//         System.out.println(hm.get("India"));
//     }
// }

// =======================================================================================================
// =======================================================================================================
// =======================================================================================================
// =======================================================================================================

import java.util.*;
public class Hashing {

    public static void main(String args[]) {
        LinkedHashMap <String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("US", 50);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);
        System.out.println(lhm);
    }
}