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

// Iteration on HashMap  :  ---
import java.util.*;
public class Hashing {

    public static void main(String args[]) {
        HashMap<String, Integer> hm = new HashMap <>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Indonesia", 6);
        hm.put("Nepal", 5);

        //Iterate 
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for(String k : keys) {
            System.out.println("key = " + k + ", value = " + hm.get(k));
        }
    }
}
// =======================================================================================================
// =======================================================================================================
