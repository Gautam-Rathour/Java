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

// //  LinkedHashMap  :  --
// import java.util.*;
// public class Hashing {

//     public static void main(String args[]) {
//         LinkedHashMap <String, Integer> lhm = new LinkedHashMap<>();
//         lhm.put("India", 100);
//         lhm.put("China", 150);
//         lhm.put("US", 50);

//         HashMap<String, Integer> hm = new HashMap<>();
//         hm.put("India", 100);
//         hm.put("China", 150);
//         hm.put("US", 50);

//         System.out.println(hm);
//         System.out.println(lhm);
//     }
// }

// // =======================================================================================================
// =======================================================================================================
// // TreeMap  :  --

// import java.util.*;
// public class Hashing {
//     public static void main(String args[]) {
//         TreeMap <String, Integer> tm = new TreeMap<>();
//         tm.put("India", 100);
//         tm.put("China", 150);
//         tm.put("US", 50);
//         tm.put("Indonesia", 6);

//         HashMap<String, Integer> hm = new HashMap<>();
//         hm.put("India", 100);
//         hm.put("China", 150);
//         hm.put("US", 50);

//         System.out.println(hm);
//         System.out.println(tm);
//     }
// }

// // =======================================================================================================
// =======================================================================================================
//   // Majority Element  :  --

// import java.util.*;
// public class Hashing {
  
//     public static void main(String args[]) {
//         int arr[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
//         HashMap<Integer, Integer> map = new HashMap<> ();

//         for(int i=0; i<arr.length; i++) {
//         //     if(map.containsKey(arr[i])) {
//         //         map.put(arr[i], map.get(arr[i]) + 1);
//         //     } else {
//         //         map.put(arr[i], 1);
//         //     }

//         map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
//         }



//         for(Integer key : map.keySet()) {
//             if(map.get(key) > arr.length/3) {
//                 System.out.println(key);
//             }
//         }
//     }
// }

// =======================================================================================================
// =======================================================================================================
//  // Valid Anagram  :  --

//  import java.util.*;
//  public class Hashing {
//     public static boolean isAnangram(String s, String t) { 
//         if(s.length() != t.length()) {
//             return false;
//         }

//         HashMap<Character, Integer> map = map = new HashMap<>();

//         for(int i=0; i<s.length(); i++) {
//             char ch = s.charAt(i);
//             map.put(ch, map.getOrDefault(ch, 0) + 1);
//         }

//         for(int i=0; i<t.length(); i++) {
//             char ch = t.charAt(i);
//             if(map.get(ch) != null) {
//                 if(map.get(ch) == 1) {
//                     map.remove(ch);
//                 } else {
//                     map.put(ch, map.get(ch) - 1);
//                 }
//             } else {
//                 return false;
//             }
//         }

//         return map.isEmpty();
//     }
//     public static void main(String args[]) {
//         String s = "race";
//         String t = "care";

//         System.out.println(isAnangram(s, t));
//     }
//  }

// =======================================================================================================
// =======================================================================================================

// // Hash - set   :  -----

// import java.util.*;
// public class Hashing {

//     public static void main(String args[]) { 
//         HashSet<Integer> set = new HashSet<> ();
//         set.add(1);
//         set.add(2);
//         set.add(4);
//         set.add(2);
//         set.add(1);

//         System.out.println(set);
//         set.clear();
//         System.out.println(set.size());
//         System.out.println(set.isEmpty());

//         set.remove(2);
//         if(set.contains(2)) {
//             System.out.println("Set contains 2");
//         }
//         if(set.contains(3)) {
//             System.out.println("Set contains 3");
//         }
//     }
// }

// =======================================================================================================
// =======================================================================================================

// // Iteration on HashSet  : ---

// import java.util.*;
// public class Hashing {

//     public static void main(String args[]) {
//         HashSet<String> cities = new HashSet<>();
//         cities.add("Delhi");
//         cities.add("Mumbai");
//         cities.add("Noida");
//         cities.add("Bengalure");

//         // Iterator it = cities.iterator();
//         // while(it.hasNext()) {
//         //     System.out.println(it.next());
//         // }

//         for(String city : cities) {
//             System.out.println(city);
//         }
//     }
// }

// =======================================================================================================
// =======================================================================================================

// // LinkedHashSet :  ---

// import java.util.*;
// public class Hashing {
//     public static void main(String args[]) {
//         HashSet<String> cities = new HashSet<>();
//         cities.add("Delhi");
//         cities.add("Mumbai");
//         cities.add("Noida");
//         cities.add("Bengalure");
//         System.out.println(cities);

//         LinkedHashSet<String> lhs = new LinkedHashSet<>();
//         lhs.add("Delhi");
//         lhs.add("Mumbai");
//         lhs.add("Noida");
//         lhs.add("Bengalure");
//         System.out.println(lhs);

//         // Tree - Set : ---- ( Sorted format ) -
//         TreeSet<String> ts = new TreeSet<>();
//         ts.add("Delhi");
//         ts.add("Mumbai");
//         ts.add("Noida");
//         ts.add("Bengalure");
//         System.out.println(ts);

     
//     }
// }

// =======================================================================================================
// =======================================================================================================

// // Count Distinct Elements  :  ---

// import java.util.*;
// public class Hashing {
//     public static void main(String args[]) {
//         int num[] = {4, 3, 2, 5, 6, 7, 3, 4, 2, 1};
//         HashSet<Integer> set = new HashSet<>();

//         for(int i=0; i<num.length; i++) {
//             set.add(num[i]);
//         }

//         System.out.println("Ans = " + set.size());
//     }
// }

// =======================================================================================================
// =======================================================================================================

// // Union & Intersection of 2 arrays  : ---
// import java.util.*;
// public class Hashing {
//     public static void main(String args[]) {
//         int arr1[] = {7, 3, 9};
//         int arr2[] = {6, 3, 9, 2, 9, 4};
//         HashSet<Integer> set = new HashSet<>();

//         //  Union
//         for(int i=0; i<arr1.length; i++) {
//             set.add(arr1[i]);
//         }
//         for(int i=0; i<arr2.length; i++) {
//             set.add(arr2[i]);
//         }

//         System.out.println("Union = " + set.size());

//         // Intersection
//         set.clear();
//         for(int i=0; i<arr1.length; i++) {
//             set.add(arr1[i]);
//         }
//         int count = 0;
//         for(int i=0; i<arr2.length; i++) {
//             if(set.contains(arr2[i])) {
//                 count++;
//                 set.remove(arr2[i]);
//             }
//         }
//         System.out.println("Intersection = " + count);
//     }
// }

// =======================================================================================================
// =======================================================================================================




