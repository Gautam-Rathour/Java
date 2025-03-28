// =======================================================================================================
// =======================================================================================================

// Creation of Segment Trees  :  -----

// public class Segment_Trees {
//     static int tree[];

//     public static void init(int n) {
//         tree = new int[4*n];
//     }

//     public static int buildST(int arr[], int i, int start, int end) {
//         if(start == end) {
//             tree[i] = arr[start];
//             return arr[start];
//         }

//         int mid = (start + end) / 2;
//         buildST(arr, 2*i+1, start, mid); // left subtree - 2*i+1
//         buildST(arr, 2*i+2, mid+1, end); // right subtree - 2*i+2
//         tree[i] = tree[2*i+1] + tree[2*i+2];
//         return tree[i];
//     }
//     public static void main(String args[]) {
//         int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
//         int n = arr.length;

//         init(n);
//         buildST(arr, 0, 0, n-1);

//         for(int i=0; i<tree.length; i++) {
//             System.out.print(tree[i] + " ");
//         }
//     }
// }

// =======================================================================================================
// =======================================================================================================

// // Queries on Segment Trees  :  -------

// import java.util.*;
// public class Segment_Trees {
//     static int tree[];

//     public static void init(int n) {
//         tree = new int[4*n];
//     }

//     public static int buildST(int arr[], int i, int start, int end) {
//         if(start == end) {
//             tree[i] = arr[start];
//             return arr[start];
//         }

//         int mid = (start + end) / 2;
//         buildST(arr, 2*i+1, start, mid); // left subtree - 2*i+1
//         buildST(arr, 2*i+2, mid+1, end); // right subtree - 2*i+2
//         tree[i] = tree[2*i+1] + tree[2*i+2];
//         return tree[i];
//     }

//     public static int getSumUtil(int i,int si, int sj, int qi, int qj) {
//         if(qj <= si || qi >= sj) { //non overlapping
//             return 0;
//         } else if(si >= qi && sj <= qj) { //complete overlap
//             return tree[i];
//         } else { // partial overlap
//             int mid = (si + sj) / 2;
//             int left = getSumUtil(2*i+1, si, mid, qi, qj);
//             int right = getSumUtil(2*i+2, mid+1, sj, qi, qj);
            
//             return left + right;
//         }
//     }
//     public static int getSum(int arr[], int qi, int qj) {
//         int n = arr.length;
//         return getSumUtil(0, 0, n-1, qi, qj);
//     }
//     public static void main(String args[]) {
//         int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
//         int n = arr.length;
//         init(n);
//         buildST(arr, 0, 0, n-1);

//         System.out.println(getSum(arr, 2, 5));
//     }
// }

// =======================================================================================================
// =======================================================================================================

// // // Update on Segment Trees  : ----

// import java.util.*;
// public class Segment_Trees {
//     static int tree[];

//     public static void init(int n) {
//         tree = new int[4*n];
//     }
//     public static int buildST(int arr[], int i, int start, int end) {
//         if(start == end) {
//             tree[i] = arr[start];
//             return arr[start];
//         }

//         int mid = (start + end) / 2;
//         buildST(arr, 2*i+1, start, mid); // left subtree - 2*i+1
//         buildST(arr, 2*i+2, mid+1, end); // right subtree - 2*i+2
//         tree[i] = tree[2*i+1] + tree[2*i+2];
//         return tree[i];
//     }

//     public static int getSumUtil(int i,int si, int sj, int qi, int qj) {
//         if(qj <= si || qi >= sj) { //non overlapping
//             return 0;
//         } else if(si >= qi && sj <= qj) { //complete overlap
//             return tree[i];
//         } else { // partial overlap
//             int mid = (si + sj) / 2;
//             int left = getSumUtil(2*i+1, si, mid, qi, qj);
//             int right = getSumUtil(2*i+2, mid+1, sj, qi, qj);
            
//             return left + right;
//         }
//     }
//     public static int getSum(int arr[], int qi, int qj) {
//         int n = arr.length;
//         return getSumUtil(0, 0, n-1, qi, qj);
//     }

//     public static void updateUtil(int i, int si, int sj, int idx, int diff) { //O(log n)
//         if(idx > sj || idx < si) {
//             return;
//         }

//         tree[i] += diff;
//         if(si != sj) {
//             int mid = (si + sj) / 2;
//             updateUtil(2*i+1, si, mid, idx, diff); //left
//             updateUtil(2*i+2, mid+1, sj, idx, diff); //right
//         }
//     }
//     public static void update(int arr[], int idx, int newVal) {
//         int n = arr.length;
//         int diff = newVal - arr[idx];
//         arr[idx] = newVal;

//         updateUtil(0, 0, n-1, idx, diff);  // segment tree updation
//     }
//     public static void main(String args[]) {
//         int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
//         int n = arr.length;
//         init(n);
//         buildST(arr, 0, 0, n-1);

//         System.out.println(getSum(arr, 2, 5));
//         update(arr, 2, 2);
//         System.out.println(getSum(arr, 2, 5));
//     }
// }

// =======================================================================================================
// =======================================================================================================

//   Max/Min Segment Tree -- (Creation)    ---------------

// public class Segment_Trees {
//     static int tree[];
//     public static void init(int n) {
//         tree = new int[4*n];
//     }
//     public static void buildTree(int i, int si, int sj, int arr[]) {
//         if(si == sj) {
//             tree[i] = arr[si];
//             return;
//         }

//         int mid = (si+sj) / 2;
//         buildTree(2*i+1, si, mid, arr);
//         buildTree(2*i+2, mid+1, sj, arr);

//         tree[i] = Math.max(tree[2*i+1], tree[2*i+2]);
//     }

//     public static void main(String args[]) {
//         int arr[] = {6, 8, -1, 2, 17, 1, 3, 2, 4};
//         int n = arr.length;
//         init(n);
//         buildTree(0, 0, n-1, arr);

//         for(int i=0; i<tree.length; i++) {
//             System.out.print(tree[i] + " ");
//         }
//     }
// }

// =======================================================================================================
// =======================================================================================================

//   Max/Min Segment Tree  ============================   (Query/Update)    ---------------

public class Segment_Trees {
    static int tree[];
    public static void init(int n) {
        tree = new int[4*n];
    }
    public static void buildTree(int i, int si, int sj, int arr[]) { // O(n)
        if(si == sj) {
            tree[i] = arr[si];
            return;
        }

        int mid = (si+sj) / 2;
        buildTree(2*i+1, si, mid, arr);
        buildTree(2*i+2, mid+1, sj, arr);

        tree[i] = Math.max(tree[2*i+1], tree[2*i+2]);
    }

    public static int getMax(int arr[], int qi, int qj) {
        int n = arr.length;
        return getMaxUtil(0, 0, n-1, qi, qj);
    }

    public static int getMaxUtil(int i, int si, int sj, int qi, int qj) { //O(log n)
        if(si > qj || sj < qi) { //no overlap
            return Integer.MIN_VALUE;
        } else if(si >= qi && sj <= qj) { //complete overlap
            return tree[i];
        } else {  // partial overlap
            int mid = (si + sj) / 2;
            int leftAns = getMaxUtil(2*i+1, si, mid, qi, qj);
            int rightAns = getMaxUtil(2*i+2, mid+1, sj, qi, qj);
            return Math.max(leftAns, rightAns);
        }
    }

    //============
    public static void update(int arr[], int idx, int newVal) { //O(log n)
        arr[idx] = newVal;
        int n = arr.length;
        updateUtil(0, 0, n-1, idx, newVal);
    }

    public static void updateUtil(int i, int si, int sj, int idx, int newVal) {
        if(idx < si || idx > sj) {
            return;
        }

        tree[i] = Math.max(tree[i], newVal);
        if(si != sj) {
            int mid = (si+sj) / 2;
            updateUtil(2*i+1, si, mid, idx, newVal); //left
            updateUtil(2*i+2, mid+1, sj, idx, newVal); //right
        }
    }
    public static void main(String args[]) {
        int arr[] = {6, 8, -1, 2, 17, 1, 3, 2, 4};
        int n = arr.length;
        init(n);
        buildTree(0, 0, n-1, arr);

        // for(int i=0; i<tree.length; i++) {
        //     System.out.print(tree[i] + " ");
        // }

        int max = getMax(arr, 2, 5);
        System.out.println(max); //-1

        update(arr, 2, 20);

        max = getMax(arr, 2, 5);
        System.out.println(max); //1
    }
}


// =======================================================================================================
// =======================================================================================================
// =======================================================================

