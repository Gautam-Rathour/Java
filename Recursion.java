

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

// // Find the first Occurence :--

// public class Recursion {
//     public static int firstOccurence (int arr[], int key, int i) {
//         if(i == arr.length) {
//             return -1;
//         }
//         if(arr[i] == key) {
//             return i;
//         }

//         return firstOccurence(arr, key, i+1);
//     }
//     public static void main(String args[]) {
//         int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
//         int key = 5;
//         System.out.println(firstOccurence(arr, key, 0));
//     }
// }

// // =======================================================================================================
// // =======================================================================================================

// // Find the last Occurence :--

// public class Recursion {
//     public static int lastOccurence (int arr[], int key, int i) {
//         if(i == arr.length) {
//                 return -1;
//             }

//        int isFound = lastOccurence(arr, key, i+1);
       
//        if(isFound == -1 && arr[i] == key) {
//         return i;
//        }

//        return isFound;
//     }
//     public static void main(String args[]) {
//         int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
//         int key = 5;
//         System.out.println(lastOccurence(arr, key, 0));
//     }
// }

// =======================================================================================================
// =======================================================================================================

// Find the last Occurence :--

// public class Recursion {
//     public static int power(int x, int n) {
//         if(n == 0) {
//             return 1;
//         }
//         return x * power(x, n-1);
//     }
//     public static void main(String args[]) {
//         int x = 2;
//         int y = 10;
//         System.out.println(power(x, y));
        
//     }
// }

// =======================================================================================================
// =======================================================================================================

// public class Recursion {
//     public static int optimizedPower(int a, int n) {
//         if(n == 0) {
//             return 1;
//         }
//     //    int halPowerSq = optimizedPowr(a, n/2) * optimizePower(a, n/2);
//         int halfPower = optimizedPower(a, n/2);
//         int halfPowerSq = halfPower * halfPower;

//        //n is odd 
//        if (n % 2 != 0) {
//         halfPowerSq = a * halfPowerSq;
//        }

//        return halfPowerSq;
//     }
//     public static void main(String args[]) {
//         int a = 2;
//         int n = 10;
//         System.out.println(optimizedPower(a, n));
        
//     }
// }

// =======================================================================================================
// =======================================================================================================

// // Revision :- 

// public class Recursion {
//     public static int firstOccurence(int arr[], int key, int i) {
//         if(i == arr.length) {
//             return -1;
//         }
//         if(arr[i] == key) {
//             return i;
//         }

//         return firstOccurence(arr, key, i+1);
//     }
//     public static void main (String args[]) {
//         int arr [] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
//         int key = 4;

//         System.out.println(firstOccurence(arr, key, 0));
//     }
// }

// =======================================================================================================
// =======================================================================================================

// // Revision :- 

// public class Recursion {
//     public static int lastOccurence(int arr[], int key, int i) {
//         if(i == arr.length) {
//             return -1;
//         }
//         int isFound = lastOccurence(arr, key, i+1);
//         if(isFound == -1  && arr[i] == key) {
//             return i;
//         }

//         return isFound;
//     }
   
//     public static void main (String args[]) {
//         int arr [] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
//         int key = 5;

//         System.out.println(lastOccurence(arr, key, 0));
//     }
// }

// // =======================================================================================================
// // =======================================================================================================

// // Revision :- (Power - x ^ n)

// public class Recursion {
//     public static int power(int x, int n ) {
//         if(n == 0) {
//             return 1;
//         }
//         return x * power(x , n-1);
//     }
   
   
//     public static void main (String args[]) {
//         int x = 2;
//         int n = 10;


//         System.out.println(power(x, n));
//     }
// }

// =======================================================================================================
// =======================================================================================================

// Revision :- (Power - x ^ n)

public class Recursion {
    public static int optimizedPower(int a, int n) {
        if(n == 0) {
            return 1;
        }

        int halfPowerSq = optimizedPower(a, n/2) * optimizedPower(a, n/2);

        // n is odd 
        if(n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;
    }
   
    public static void main (String args[]) {
        int a = 2;
        int n = 10;


        System.out.println(optimizedPower(a, n));
    }
}

// =======================================================================================================
// =======================================================================================================



































































































