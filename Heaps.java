// =======================================================================================================
// =======================================================================================================

// import java.util.*;
// import java.util.PriorityQueue;
// public class Heaps {
//     public static void main(String args[]) {
//         PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

//         pq.add(3); // O(log n)
//         pq.add(4);
//         pq.add(1);
//         pq.add(7);

//         while(!pq.isEmpty()) {
//             System.out.println(pq.peek() + " "); // O(1)
//             pq.remove(); // O(log n)
//         }
//     }
// }

// =======================================================================================================
// =======================================================================================================

import java.util.*;
import java.util.PriorityQueue;
public class Heaps {
    static class Student implements Comparable<Student> {  //overriding
        String name;
        int rank;

        public Student (String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }
    public static void main(String args[]) {
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(new Student("A", 4)); // O(log n)
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 2));
        pq.add(new Student("D", 12));

        while(!pq.isEmpty()) {
            System.out.println(pq.peek().name + " -> " + pq.peek().rank); // O(1)
            pq.remove(); // O(log n)
        }
    }
}

// =======================================================================================================
// =======================================================================================================

// Insert in a Heap  :  ---
import java.util.*;
public class Heaps {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            //add atalast idx
            arr.add(data);

            int x = arr.size()-1;  // x is child index
            int par = (x-1)/2;  // par index

            while(arr.get(x) < arr.get(par)) {
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
            }
        }

        public int peek() {
            return arr.get(0);
        }

        private void heapify (int i) {
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx = i;

            if(left < arr.size() && arr.get(minIdx) > arr.get (left)) {
                minIdx = left;
            }

            if(right < arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }

            if(minIdx != i) {
                //swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        public int remove() {
            int data = arr.get(0);

            //step1 - swap first & last
            int temp = arr.get(0);
            arr.set(0, arr.size()-1);
            arr.set(arr.size()-1, temp);

            //step2 - delete last
            arr.remove(arr.size()-1);

            //step3 - heanify
            heapify(0);
            return data;
        }
    }
    public static void main(String args[]) {
        
    }
}
// =======================================================================================================
// =======================================================================================================
