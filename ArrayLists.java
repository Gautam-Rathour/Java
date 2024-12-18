// =======================================================================================================
// =======================================================================================================
 
// import java.util.ArrayList;
// public class ArrayLists {
//     public static void main(String args[]) {
//         ArrayList<Integer> list = new ArrayList<>();

//         // Add Element -O(1)
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(6);
//         System.out.println(list);

//         list.add(4, 5); // O(n)
//         list.add(0, 0); // O(n)
//         System.out.println(list);

//         // //Get Operation - O(1)
//         // int Element = list.get(2);
//         // System.out.println(Element);

//         // //Delete Element - O(n)
//         // list.remove(2);
//         // System.out.println(list);

//         // // remove one element and set another Element :-
//         // list.set(2, 10);
//         // System.out.println(list);

//         // // For check the number is availabel or not 
//         // System.out.println(list.contains(1));
//         // System.out.println(list.contains(11));

// // =======================================================================================================
//         // size :-
//         int size = list.size();
//         System.out.println(size);

//         //print the arraylist
//         for(int i=0; i<list.size(); i++) {
//             System.out.print(list.get(i) + ", ");
//         }
//         System.out.println();

//         //Reverse print
//         for(int i=list.size()-1; i>=0; i--) {
//             System.out.print(list.get(i) + ", ");
//         }
//         System.out.println();
//     }
// }

// =======================================================================================================
// =======================================================================================================
 
// import java.util.ArrayList;
// public class ArrayLists {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(2);
//         list.add(5);
//         list.add(9);
//         list.add(6);
//         list.add(8);
//         System.out.println(list);

//         // Find max number  -  O(n)
//         int max = Integer.MIN_VALUE;
//         for(int i=0; i<list.size(); i++) {
//             // if(max < list.get(i)) {
//             //     max = list.get(i);
//             // }
//             max = Math.max(list.get(i), max);
//         }
//         System.out.println(max);
//     }
// }

// // =======================================================================================================
// // =======================================================================================================

// // swap : -

// import java.util.ArrayList;
// public class ArrayLists {
//     public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
//         int temp = list.get(idx1);
//         list.set(idx1, list.get(idx2));
//         list.set(idx2, temp);
//     }
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(2);
//         list.add(5);
//         list.add(9);
//         list.add(3);
//         list.add(6);
//         System.out.println(list);

//         int idx1 = 1, idx2 = 3;

//         swap (list, idx1, idx2);
//         System.out.println(list);
//     }
// }

// =======================================================================================================
// =======================================================================================================

// // Sort with help of Collections : -

// import java.util.ArrayList;
// import java.util.Collections;
// public class ArrayLists {
//     public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
//         int temp = list.get(idx1);
//         list.set(idx1, list.get(idx2));
//         list.set(idx2, temp);
//     }
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(2);
//         list.add(5);
//         list.add(9);
//         list.add(3);
//         list.add(6);
//         System.out.println(list);

//         // Ascending 
//         Collections.sort(list);
//         System.out.println(list);

//         //descending 
//         Collections.sort(list, Collections.reverseOrder());
//         System.out.println(list);


          
//     }
// }

// // =======================================================================================================
// // =======================================================================================================


// // Multi dimensional array : -

// import java.util.ArrayList;
// import java.util.Collections;

// public class ArrayLists {
//     public static void main(String[] args) {
//         ArrayList<ArrayList<Integer>> mainList = new ArrayList();
//         ArrayList<Integer> list1 = new ArrayList();
//         list1.add(1); list1.add(2);
//         mainList.add(list1);

//         ArrayList<Integer> list2 = new ArrayList();
//         list2.add(3); list2.add(4);
//         mainList.add(list2);

//         System.out.println(mainList);
//         for(int i=0; i<mainList.size(); i++) {
//             ArrayList<Integer> currList = mainList.get(i);
//             for(int j=0; j<currList.size(); j++) {
//                 System.out.print(currList.get(j) + " ");
//             }
//             // System.out.println(mainList.get(i));
//             System.out.println();
//         }
          
//     }
// }

// =======================================================================================================
// =======================================================================================================

// // Sort with help of Collections : -

// import java.util.*;
// public class ArrayLists {
//     public static void main(String[] args) {
//         ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
//         ArrayList<Integer> list1 = new ArrayList<>();
//         ArrayList<Integer> list2 = new ArrayList<>();
//         ArrayList<Integer> list3 = new ArrayList<>();
        
//         for(int i=1; i<=5; i++) {
//             list1.add(i*1); // 1 2 3 4 5
//             list2.add(i*2); // 2 4 6 8 10
//             list3.add(i*3); // 3 6 9 12 15
//         }
//         mainList.add(list1);
//         mainList.add(list2);
//         mainList.add(list3);

//         list2.remove(3);
//         list2.remove(2);

//         // Nested loop :-
//         for(int i=0; i<mainList.size(); i++) {
//             ArrayList<Integer> currList = mainList.get(i);
//                 for(int j=0; j<currList.size(); j++) {
//                     System.out.print(currList.get(j) + " ");
//                 }
//                 System.out.println();
//         }
//     }
// }

// =======================================================================================================
// =======================================================================================================

// // Store Water : -

// import java.util.*;
// public class ArrayLists {
//     public static int storeWater(ArrayList<Integer> height) {
//         int maxWater = 0;
//         //brute force
//         for(int i=0; i<height.size(); i++) {
//             for(int j=i+1; j<height.size(); j++) {
                
//                 int ht = Math.min(height.get(i), height.get(j));
//                 int width = j - i;
//                 int currWater = ht * width;
//                 maxWater = Math.max(maxWater, currWater);
//             }
//         }
//         return maxWater;
//     }
//     public static void main(String args[]) {
//         ArrayList<Integer> height = new ArrayList<>();
//         // 1, 8, 6, 2, 5, 4, 8, 3, 7
//         height.add(1);
//         height.add(8);
//         height.add(6);
//         height.add(2);
//         height.add(5);
//         height.add(4);
//         height.add(8);
//         height.add(3);
//         height.add(7);
        
//         System.out.println(storeWater(height));
//     }
// }

// =======================================================================================================
// =======================================================================================================

import java.util.*;
public class ArrayLists {
    // 2 pointer approach :-
    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;
        int lp = 0;
        int rp = height.size()-1;

        while(lp < rp) {
            // calculater water area
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currWater = ht * width;
            maxWater = Math.max(currWater , maxWater);

            //update ptr
            if(height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }

    public static void main(String args[]) {
        ArrayList<Integer> height = new ArrayList<>();
        //  1, 8, 6, 2, 5, 4, 8, 3, 7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        
        System.out.println(storeWater(height));
    }
}















