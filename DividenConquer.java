// // =======================================================================================================
// // =======================================================================================================

// public class DividenConquer {
//     public static void printArr(int arr[]) {
//         for(int i=0; i<arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println(); 
//     }

//     public static void margeSort(int arr[], int si, int ei) {
//         if(si >= ei) {
//             return;
//         }
//         //kaam
//         int mid = si + (ei - si) / 2;  // (si + ei) / 2
//         margeSort(arr, si, mid);        // left part
//         margeSort(arr, mid+1, ei);      // right part
//         merge(arr, si, mid, ei);
//     }

//     public static void merge(int arr[], int si, int mid, int ei) {
//         // left(0,3)=4  right(4,6)=3  ->  6+0+1
//         int temp[] = new int[ei-si+1];
//         int i = si;     // iterator for left part
//         int j = mid+1; // iterator for right part
//         int k = 0;     //iterator for temp arr

//         while(i <= mid && j <= ei) {
//             if(arr[i] < arr[j]) {
//                 temp[k] = arr[i];
//                 i++; 
//             } else {
//                 temp[k] = arr[j];
//                 j++;
//             }
//             k++;
//         }

//         // left part
//         while(i <= mid) {
//             temp[k++] = arr[i++];
//         }

//         // right part
//         while(j <= ei) {
//             temp[k++] = arr[j++];
//         }

//         //copy temp to original arr
//         for(k=0, i=si; k<temp.length; k++, i++) {
//             arr[i] = temp[k];
//         }
//     }

//     public static void main(String args[]) {
//         int arr[] = {6, 3, 9, 5, 2, 8, -2};

//         margeSort(arr, 0, arr.length-1);
//         printArr(arr);

//     }
// }

// =======================================================================================================
// =======================================================================================================

// // Quick Sort :-

// public class DividenConquer {
//     public static void quickSort(int arr[], int si, int ei) {
//         if(si >= ei) {
//             return;
//         }
//         //last element
//         int pIdx = partition(arr, si, ei);
//         quickSort(arr, si, pIdx-1); // left
//         quickSort(arr, pIdx+1, ei); // right
//     }

//     public static int partition(int arr[], int si, int ei) {
//         int pivot = arr[ei];
//         int i = si-1; // to make place for els smaller then pivot

//         for(int j=si; j<ei; j++) {
//             if(arr[j] <= pivot) {
//                 i++;
//                 //swap
//                 int temp = arr[j];
//                 arr[j] = arr[i];
//                 arr[i] = temp;
//             }
//         }
//         i++;
//         int temp = pivot;
//         arr[ei] = arr[i]; // pivot = arr[i]
//         arr[i] = temp;
//         return i;
//     }
//     public static void main(String args[]) {
//         int arr[] = {6, 3, 9, 8, 2, 5, -5};
//         quickSort(arr, 0, arr.length-1);

//         for(int i=0; i<arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
// }

// =======================================================================================================
// =======================================================================================================

// // Search in Rotated Sorted Array :--

// public class DividenConquer {
//     public static void search(int arr[], int tar) {
//         int start = 0;
//         int end = arr.length - 1;
//         int n = arr.length;
//         while(start < end) {
//             int mid = start (end - start) / 2;

                // if(arr[mid] == tar) {
                //     System.out.println("Element is present at index " + mid);
                // }
             
//             if(arr[mid] > arr[end]) {
//                 start = mid + 1;
//             } else {
//                 end = mid;
//             }
//         }
//     }
//     public static void main(String args[]) {
//         int arr[] = {4, 5, 6, 7, 0, 1, 2}; 


//         System.out.println(search(arr, 3, 0, arr.length-1));
//     }
// }


// =======================================================================================================
// =======================================================================================================

public class DividenConquer {
    public static int search(int arr[], int tar, int si, int ei) {
        if(si > ei) {
            return -1;
        }

        //kaam
        int mid = si + (ei - si) / 2;

        // case FOUND
        if(arr[mid] == tar) {
            return mid;
        }

        //mid on L1
        if(arr[si] <= arr[mid]) {
            //case a : left
            if(arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid);
            } else {
                //case b : right
                return search(arr, tar, mid+1, ei);
            }
        }

        // mid on L2
        else {
            //case c : left
            if(arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid+1, ei);
            } else { 
            // case d : right
            return search(arr, tar, si, mid-1);
            }
        }
    }
    public static void main(String args[]) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0; // output -> 4
        int tarIdx = search(arr, target, 0, arr.length-1);
        System.out.println(tarIdx);
    }
}



// =======================================================================================================
// =======================================================================================================












































