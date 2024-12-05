

// =======================================================================================================
// =======================================================================================================

// Recursion :--

// public class Recursion {
//     // public static void printDic(int n) {
//     //     if(n <= 0){
//     //         // System.out.println(n+1);
//     //         return;
//     //     }

//     //     System.out.print(n + " ");
//     //     printDic(n-1);
        
//     // }

//     public static void printInc(int n) {
//         if(n == 1) {
//             System.out.print(n + " ");
//             return;
//         }
//         printInc(n-1);
//         System.out.print(n + " ");
//     }

//     public static void main(String args[]) {
//         int n = 10;

//         // printDic(n);
//         printInc(n);
//         System.out.println();
//     }
// }

// =======================================================================================================
// =======================================================================================================

// Find Factorial of given number :-

// public class Recursion {
//     public static int printFactorial(int n) {
//         if(n == 0) {
//             return 1;
//         }
        
//         // int result = printFactorial(n-1);
//         // int ans = n * result;
//         // return ans;

//         return n * printFactorial(n - 1);
//     }
//     public static void main(String args[]) {
//         int n = 5;

//         System.out.println(printFactorial(n));
//     }
// }

// // =======================================================================================================
// // =======================================================================================================

// // Find sum whit the help of Recursion :- 

// public class Recursion {
//     public static int printSum(int n) {
//         if(n == 1) {
//             return 1;
//         }
//         int sum = n + printSum(n - 1);
//         return sum;
        
//     }
//     public static void main(String args[]) {
//         int n = 5;

//         System.out.println(printSum(n));
//     }
// }

// =======================================================================================================
// =======================================================================================================

// // Find fibonacci by  Recursion :- 

// public class Recursion {
//     public static int printFib(int n) {
        // if(n == 0 || n == 1) {
        //     return n;
        // }
        
//         int fib1 = printFib(n - 1);
//         int fib2 = printFib(n - 2);

//         int fib3 = fib1 + fib2;
//         return fib3;
        
//     }
//     public static void main(String args[]) {
//         int n = 26;

//         System.out.println(printFib(23));
//         System.out.println(printFib(24));
//         System.out.println(printFib(25));
//         System.out.println(printFib(26));
//         System.out.println(printFib(27));
//         System.out.println(printFib(28));
//     }
// }

// =======================================================================================================
// =======================================================================================================

// // Find fibonacci by  Recursion :- 

// public class Recursion {
//     public static boolean isSorted(int arr[], int i) {
//         if(i == arr.length-1) {
//             return true;
//         }
//         if(arr[i] > arr[i + 1]) {
//             return false;
//         }

//         return isSorted(arr, i+1);
//     }
//     public static void main(String args[]) {
//         int arr[] = {1, 2, 3, 5, 4};

//         System.out.println(isSorted(arr, 0));
        
//     }
// }

// =======================================================================================================
// =======================================================================================================
















































































































