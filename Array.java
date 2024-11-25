

// // =======================================================================================================
// // =======================================================================================================

// // Array :-

// import java.util.*;
// public class Array {
//     public static void main (String args[]) {
//         int marks[] = new int[50];

//         int numbers[] = {1,2,3};
//         int moreNumber[] = {4,5,6};
//         String fruits[] = {"apple", "mango", "orange"};

//         System.out.println(fruits);
//     }
// }

// // =======================================================================================================
// // =======================================================================================================

// import java.util.*;
// public class Array{
//     public static void main (String args[]) {
//         Scanner scanner = new Scanner(System.in);
//         int marks[] = new int[10];

//         // marks[0] = scanner.nextInt();
//         // marks[1] = scanner.nextInt();
//         // marks[2] = scanner.nextInt();

//         // System.out.println("physics : " + marks[0]);
//         // System.out.println("chemistery : " +marks[1]);
//         // System.out.println("math : " + marks[2]);

        
//         // int percentage = (marks[0]+ marks[1]+ marks[2]) / 3;
//         // System.out.println("percentage : " + percentage + "%");

//         System.out.println("Lenght of Array : " + marks.length);
//     }
// } 

// // =======================================================================================================
// // =======================================================================================================

// import java.util.*;
// public class Array{
//     public static void update(int marks[]) {
//         for(int i=0; i<marks.length; i++) {
//             marks[i] += 1;
//         }
//     }
//     public static void main (String args[]) {
//         int marks[] = {97, 98, 99};
//         update(marks);

//         //print our marks :-
//         for(int i=0; i<marks.length; i++) {
//             System.out.print("marks : " + marks[i] + " ");
//         }
//         System.out.println();
//     }
// } 

// // =======================================================================================================
// // =======================================================================================================

// Linear Search :-

// import java.util.*;
// public class Array {
//     public static int linearSearch(int number[], int key) {
//           for(int i=0; i<number.length; i++) {
//             if(number[i] == key) {
//                 return i;
//                 // System.out.println("Key found at index :" + i);
//             }
//         }
//         return -1;
//     }
//     public static void main (String args[]) {
//         int number[] = {2, 4, 6, 8, 10, 12, 14, 16};
//         int key = 10;

//         int index = linearSearch(number, key);

//         if(index == -1) {
//             System.out.println("Not found");
//         } else {
//             System.out.println("Key found at index : " + index);
//         }
//     }
// }


// // =======================================================================================================
// // =======================================================================================================

// Linear Search :-

// import java.util.*;
// public class Array {
//     public static int linearSearch(String menu[], String key) {
//           for(int i=0; i<menu.length; i++) {
//             if(menu[i] == key) {
//                 return i;
//                 // System.out.println("Key found at index :" + i);
//             }
//         }
//         return -1;
//     }
//     public static void main (String args[]) {
//         String menu[] = {"dosa", "chole bhature", "samosa" };
//         String key = "samosa";

//         int index = linearSearch(menu, key);

//         if(index == -1) {
//             System.out.println("Not found");
//         } else {
//             System.out.println("Key found at index : " + index);
//         }
//     }
// }

// =======================================================================================================
// =======================================================================================================

// Find Smallest and Largest Number in the array :-

// import java.util.*;
// public class Array {
//     public static int getLargest(int num[]){
//         int largest = Integer.MIN_VALUE;
//         int smallest = Integer.MAX_VALUE;

//         for(int i=0; i<num.length; i++) {
//             if(largest < num[i]) {
//                 largest = num[i];
//             }

//             if(smallest > num[i]) {
//                 smallest = num[i];
//             }
//         }
//         System.out.println("This is the smallest num in this array : " + smallest);
//         return largest;
//     }
//     public static void main (String args[]) {
//         int num[] = {2, 4, 6, 8, 10, 5, 7, 12, 11};
       
//         System.out.println("This this the largest num in this array : " + getLargest(num));

//     }
// }

// // =======================================================================================================
// // =======================================================================================================

// // Binary Search :-

// import java.util.*;
// public class Array {
//     public static int binarySearch (int num[], int key) {
//         int start = 0;
//         int end = num.length-1;

//         while(start <= end) {
//             int mid = (start + end) / 2;

//             //comparisons
//             if(num[mid] == key) {
//                 return mid;
//             }

//             if(num[mid] < key) { // right
//                 start = mid + 1;
//             } else { // left
//                 end = mid - 1;
//             }
//         }
//         return -1;
//     }
//     public static void main (String args[]) {
//         int num[] = {2, 4, 6, 8, 10, 12, 14};
//         int key = 6;

//         int index = binarySearch(num, key);
//         System.out.println("The index of key : " + index);
//     }
// }

// // =======================================================================================================
// // =======================================================================================================

// // Binary Search :-

// import java.util.*;
// public class Array {
//     public static int binarySearch(int arr[], int key) {
//         int n = arr.length;
//         int start = 0;
//         int end = n-1;

//         while(start <= end) {
//             int mid = (start + end) / 2;

//             if(arr[mid] == key) {
//                 return mid;
//             }

//             if(arr[mid] < key) {
//                 start = mid + 1;
//             } else {
//                 end = mid -1;
//             }
//         }
//         return -1;
//     }
//     public static void main (String args[]) {
//         int arr[] = {10, 20, 30, 40, 50, 60};
//         int key = 60;


//         int index = binarySearch(arr, key);
//         System.out.println("The key is fond on index : " + index);
//     }
// }
        
// // =======================================================================================================
// // =======================================================================================================

// // Reverse an Array :-

// import java.util.*;
// public class Array {
//     public static void reverseArray(int num[]) {
//         int start = 0;
//         int end = num.length-1;

//         while(start < end) {
//             // Swap
//             int temp = num[start];
//             num[start] = num[end];
//             num[end] = temp;

//             start++;
//             end--;
//         }
//     }
//     public static void main(String args[]){
//         int num[] = {2, 4, 6, 8, 10};
        
//         reverseArray(num);
//         for(int i=0; i<num.length; i++) {
//             System.out.print(num[i] + " ");
//         }
//         System.out.println();
//     }
// }

// // =======================================================================================================
// // =======================================================================================================

// // // Reverse an Array :-

// import java.util.*;
// public class Array {
//     public static void reverseArray(int num[]) {

//         int rev[] = new int[n];
        
//         for(int i=0; i<n; i++) {
//             rev[n-1-i] = num[i];
//         }

//         for(int i=0; i<n; i++) {
//             System.out.println(num[i] + " ");
//         }

//     }
//     public static void main(String args[]) {
//         int num[] = {2, 4, 6, 8, 10};
//         int n = num.length;


//         reverseArray(num);
//     }
// }

// // =======================================================================================================
// // =======================================================================================================

// import java.util.*;
// public class Array {
//     public static void findPair(int num[]) {
//         for(int i=0; i<num.length; i++) {
//             int curr = num[i];
            
//             for(int j=i+1; j<num.length; j++) {
//                 System.out.print("(" + curr + "," + j + ")");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]) {
//         int num[] = {2, 4, 7, 9, 10};

//         findPair(num);
//     }
// }

// // =======================================================================================================
// // =======================================================================================================

// // Find the sub-array of a Array :-

// import java.util.*;
// public class Array {
//     public static void printSubarrays(int num[]) {
//         int ts = 0;

//         for(int i=0; i<num.length; i++) {
//             int start = i;
//             for(int j=i; j<num.length; j++) {
//                 int end = j;
//                 for(int k=start; k<=end; k++) {
//                     System.out.print(num[k] + " ");
//                 }
//                 ts++;
//                 System.out.println();
//             }
//             System.out.println();
//         }
//         System.out.println("Total numbers of sub array : " + ts);
//     }
//     public static void main(String args[]) {
//         int num[] = {2, 4, 7, 9, 10};

//         printSubarrays(num);
//     }
// }

// // =======================================================================================================
// // =======================================================================================================

// // // Find the Sub-Array :-
// import java.util.*;
// public class Array {
//     public static void main (String args[]) {
//         int arr[] = {10, 20, 30, 40, 50};
//         int n = arr.length;

//         for(int i=0; i<n; i++) {
//             for(int j=i; j<n; j++) {
//                 for(int k=i; k<=j; k++) {
//                     System.out.print(arr[k] + " ");
//                 }
//                 System.out.println();
//             }
//             System.out.println();
//         }
//     }
// }


// =======================================================================================================
// =======================================================================================================

// // Find the sum of sub-array of a Array :-

// import java.util.*;
// public class Array {
//     public static void printSubarrays(int num[]) {
//         int ts = 0;
//         int largest = Integer.MIN_VALUE;
//         int smallest = Integer.MAX_VALUE;

//         for(int i=0; i<num.length; i++) {
//             int start = i;
//             for(int j=i; j<num.length; j++) {
//                 int end = j;

//                 int sum = 0;
//                 for(int k=start; k<=end; k++) {
//                     System.out.print(num[k] + " ");
//                     sum +=  num[k];
//                 }

//                 if(largest < sum) {
//                     largest = sum;
//                 }
//                 if(smallest > sum) {
//                     smallest = sum;
//                 }

//                 System.out.println("Sum of sub-array : " + sum);
//                 ts++;
//                 System.out.println();
//             }
//             System.out.println();
//         }
//         System.out.println("Total numbers of sub array : " + ts);
//         System.out.println("Largest sum of sub array : " + largest);
//         System.out.println("Smallest sum of sub array : " + smallest);

//     }
//     public static void main(String args[]) {
//         int num[] = {2, 4, 7, 9, 10};

//         printSubarrays(num);
//     }
// }



// // =======================================================================================================
// // =======================================================================================================

// public class Array {
//     public static void main (String args[]) {
//         int n = 5;
        

//         for(int i=0; i<n; i++) {
//             for(int j=0; j<n-i-1; j++) {
//                 System.out.print(" ");
//             }
            
//             char ch = 'A';
//             for(int j=0; j<(2*i+1); j++) {
//                 System.out.print(ch);
                
//                 if(j < i) {
//                     ch++;
//                 } else {
//                     ch--;
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


// =======================================================================================================
// =======================================================================================================

// Max Subarray Sum (prefix Sum) :-

// import java.util.*;
// public class Array {
//     public static void main(String args[]) {
//         int arr[] = {1, -2, 6, -1, 3};
//         int n = arr.length;
//         int currSum = 0;
//         int add = 0;
//         int maxSum = Integer.MIN_VALUE;
//         int prefix[] = new int[arr.length];

//         prefix[0] = arr[0];
//         //calculate prefix array :-
//         for(int i=1; i<prefix.length; i++) {
//             prefix[i] = prefix[i-1] + arr[i];
//         }

//         for(int i=0; i<n; i++) {
//             int start = i;
//             for(int j=i; j<n; j++) {
//                 int end = j;

//                 currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                
//                 if(currSum > maxSum) {
//                     maxSum = currSum;
//                 }
//             }
//         }
//         System.out.println("Maximum Sum : " + maxSum);
//     }
// }

// =======================================================================================================
// =======================================================================================================

// // Prefix and sufficx - array :- 
// public calss Array {
//     public static void main (Stirng args[]) {
//         int nums[] = {21, 56, 54, 23,78, 24};
        

//             int n = nums.length;
//             int prefix[] = new int [n];
//             int suffix [] = new int [n];

//             prefix[0] = nums[0];
//             for(int i = 0; i < n; i++) {
//                 prefix[i] = prefix[i - 1] * nums[i];
//             }

//             suffix[n - 1] = nums[n = 1];
//             for(int i = n - 2; i >= 0; i--) {
//                 suffic[i] = suffic[i + 1] * nums[i];
//             }

//             int[] res = new int[n];
//             for(int i= 1; i < n - 1; i++) {
//                 res[i] = prefix[i - 1] * suffix[i + 1];
//             }

//             res[0] = suffix[1];
//             res[n - 1] = prefix[n - 2];
//             return res;
//     }
// }

// // =======================================================================================================
// // =======================================================================================================

// // Max Subarray Sum ( Kadan's Aligrothem ) :-

// import java.util.*;
// public class Array {
//     public static void kadanes(int arr[]) {
//         int ms = Integer.MIN_VALUE;
//         int cs = 0;

//         for(int i=0; i<arr.length; i++) {
//             cs = cs + arr[i];
//             if(cs < 0) {
//                 cs = 0;
//             }
//             ms = Math.max(cs, ms);
//         }
//         System.out.println("our max subarray sum is : " + ms);
//     }

//     public static void main(String args[]) {

//         int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
//         kadanes(arr);

        

//         int n = arr.length;
//         int currSum = 0;
//         int add = 0;
//         int maxSum = Integer.MIN_VALUE;
//         int prefix[] = new int[arr.length];

//         prefix[0] = arr[0];
//         //calculate prefix array :-
//         for(int i=1; i<prefix.length; i++) {
//             prefix[i] = prefix[i-1] + arr[i];
//         }

//         for(int i=0; i<n; i++) {
//             int start = i;
//             for(int j=i; j<n; j++) {
//                 int end = j;

//                 currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
//                 if(currSum > maxSum) {
//                     maxSum = currSum;
//                 }
//             }
//         }

//         System.out.println("Maximum Sum : " + maxSum);
//     }
// }

// // =======================================================================================================
// // =======================================================================================================

// // Trapping Rainwater :-
// import java.util.*;
// //    { 4, 2, 0, 6, 3, 2, 5}
// public class Array {
//     public static int trappedRainwater(int height[] ) {
//         int n = height.length;
//         //calculate left max boundary - array
//         int leftMax[] = new int[n];
//         leftMax[0] = height[0];
//         for(int i=1; i<n; i++) {
//             leftMax[i] = Math.max(height[i], leftMax[i-1]);
//         }

//         //calculate right max boundary - array
//         int rightMax[] = new int[n];
//         rightMax[n-1] = height[n-1];
//         for(int i=n-2; i>=0; i--) {
//             rightMax[i] = Math.max(height[i], rightMax[i+1]);
//         }

//         int trappedWater = 0;
//         //loop
//         for(int i=0; i<n; i++) {
//             //waterLevel = min(leftmax bound, rightmax bound)
//             int waterLevel = Math.min(leftMax[i], rightMax[i]);

//             //trapped water = waterLevel - height[i]
//             trappedWater += waterLevel - height[i];
//         }

//         return trappedWater;
//     }

//     public static void main(String args[]) {
//         int height[] = {4, 2, 0, 6, 3, 2, 5};

//         int result = trappedRainwater(height);
//         System.out.println("Trapped Water : " + result);

//     }
// }

// =======================================================================================================
// =======================================================================================================

// import java.util.*;
// public class Array {
//     public static int buyAndSellStocks(int prices[]) {
//         int buyPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;

//         for(int i=0; i<prices.length; i++) {
//             if(buyPrice < prices[i]) {// profit
//                 int profit = prices[i] - buyPrice; // today's profit
//                 maxProfit = Math.max(maxProfit, profit);
//             } else {
//                 buyPrice = prices[i];
//             }
//         }
//         return maxProfit;
//     }

//     public static void main(String args[]) {
//         int prices[] = {7, 1, 5, 3, 6, 4};

//         int result = buyAndSellStocks(prices);
//         System.out.println("Max Profit : " + result);
//     }
// }

// =======================================================================================================
// =======================================================================================================

// Leed-code question :- (number => 33.) -------------

public class Array {
    public static int search(int arr[], int target) {
        int n = arr.length;

        int left = 0;
        int right = n-1;
        while(left <= right) {
            int mid = (left + right) / 2;

            if(arr[mid] > arr[right]){
                left = mid + 1;
            } else {
                right = mid;
            }
        } // left == right 

        int shift = left;

        left = 0;
        right = n-1;

        while(left <= right) {
            int mid = (left + right) / 2;

            int realMid = (mid + shift) % n;

            if(arr[realMid] == target) {
                return realMid;
            } else if (arr[realMid] < target) {
                left = mid + 1;
            } else { 
                right = mid - 1;
            }

        }
        return -1;
    }
    public static void main(String args[]) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
    }
}

// =======================================================================================================
// =======================================================================================================









