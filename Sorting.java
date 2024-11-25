// // =======================================================================================================
// // =======================================================================================================

// Bubble short : - 

// public class Sorting {
//     public static void bubbleSort(int arr[]) {
//         for(int turn = 0; turn < arr.length-1; turn++) {
//             for(int j = 0; j < arr.length-1-turn; j++) {
//                 if(arr[j] > arr[j+1]) {
//                     //swap ---
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//     }
//     public static void printArr (int arr[]) {
//         for(int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
//     public static void main(String args[]) {
//         int arr[] = {5, 4, 1, 3, 2};
        
//         bubbleSort(arr);
//         printArr(arr);
//     }
// }


// =======================================================================================================
// =======================================================================================================

// // Selection short : - 

// import java.util.*;
// public class Sorting {
//     public static void selectionSort(int arr[]) {
//         int n = arr.length;
//         for(int i=0; i<n-1; i++) {
//             int minPos = i;
//             for(int j=i+1; j<=n-1; j++) {
//                 if(arr[minPos] > arr[j]) {
//                     minPos = j;
//                 }
//             }
//             // swap
//             int temp = arr[minPos];
//             arr[minPos] = arr[i];
//             arr[i] = temp;
//         }
//     }
//     public static void main(String args[]) {
//         int arr[] = {5, 4, 1, 3, 2};
//         selectionSort(arr);
//         for(int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

// =======================================================================================================
// =======================================================================================================
// // Selection short : -  ( Revise )

// import java.util.*;
// public class Sorting {
//     public static void selectionSort(int arr[]) {
//         for(int i=0; i<arr.length-1; i++) {
//             int minPon = i;
//             for(int j=i+1; j<arr.length; j++) {
//                 if(arr[minPon] > arr[j]) {
//                     minPon = j;
//                 }
//             }
//             // swap
//             int temp = arr[minPon];
//             arr[minPon] = arr[i];
//             arr[i] = temp;  
//         }
//     }
//     public static void main (String args[]) {
//         int arr[] = {5, 4, 1, 3, 2};

//         selectionSort(arr);
//         for(int i=0; i<arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }  
//     }
// }



// =======================================================================================================
// =======================================================================================================

// // Insertion Sort :-

// import java.util.*;
// public class Sorting {
//     public static void insertionSort(int arr[]) {
//         for(int i=1; i<arr.length; i++) {
//             int curr = arr[i];
//             int prev = i-1;
//             // finding out the correct pos to insert
//             while(prev >= 0 && arr[prev] > curr) {
//                 arr[prev+1] = arr[prev];
//                 prev--;
//             }
//             // insertion
//             arr[prev+1] = curr;
//         }
//     }
//     public static void main(String args[]) {
//         int arr[] = {5, 4, 1, 3, 2};
//         insertionSort(arr);
//         for(int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

// =======================================================================================================
// =======================================================================================================

// // Inbuilt short :-

// import java.util.Arrays;
// import java.util.Collections;
// public class Sorting {
//     public static void main (String args[]) {
//         Integer arr[] = {5, 4, 1, 3, 2};

//         // Arrays.sort(arr);
//         // Arrays.sort(arr, 0, 3 );
//         // Arrays.sort(arr, Collections.reverseOrder());
//         Arrays.sort(arr, 0, 3, Collections.reverseOrder());


//         for(int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
// }


// =======================================================================================================
// =======================================================================================================
// // Counting Sort :-

// import java.util.*;
// public class Sorting {
//     public static void countingSort(int arr[]) {
//         int largest = Integer.MIN_VALUE;    
//         for(int i = 0; i < arr.length; i++) {
//             largest = Math.max(largest, arr[i]);
//         }

//         int count[] = new int[largest+1];
//         for(int i=0; i<arr.length; i++) {
//             count[arr[i]]++;
//         }

//         // sorting 
//         int j = 0;
//         for(int i=0; i<count.length; i++) {
//             while(count[i] > 0) {
//                 arr[j] = i;
//                 j++;
//                 count[i]--;
//             }
//         }
//     }
//     public static void main (String args[]) {
//         int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};
//         countingSort(arr);

//         for(int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

// =======================================================================================================
// =======================================================================================================

// // I have to Write all Sorting useing this example :-

// You can use this array as an example :[3,6,2,1,8,7,4,5,3,1]

// // Here is the implementation of all sorting algorithms using this example array.
// import java.util.*;
// public class Sorting {
//     public static int bubbleSort(int arr[]) {
//         int n = arr.length;

//         for(int i=0; i<n; i++) {
            
//         }
//     }
//     public static void main(String args[]) {
//         int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
//         Bubble Sort(arr);
//         // Selection Sort(arr);
//         // Insertion Sort(arr);
//         // Counting Sort(arr);

//         for(int i=0; i<arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

// =======================================================================================================
// =======================================================================================================

// Live class :-
public class Sorting {
    public static void selectionSort(int arr[], int n) {
        
        for(int i=0; i<n-1; i++) {
            int maxIndex = i;

            for(int j=i+1; j<n; j++) {
                if(arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;

        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9};
        int n = arr.length;

        selectionSort(arr, n);

        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

























