

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

// // Revision :- (Power - x ^ n)

// public class Recursion {
//     public static int optimizedPower(int a, int n) {     // O(logn)
//         if(n == 0) {
//             return 1;
//         }

//         int halfPower = optimizedPower(a, n/2);
//         int halfPowerSq = halfPower * halfPower;

//         // n is odd 
//         if(n % 2 != 0) {
//             halfPowerSq = a * halfPowerSq;
//         }
//         return halfPowerSq;
//     }
//     public static void main (String args[]) {
//         int a = 2;
//         int n = 10;


//         System.out.println(optimizedPower(a, n));
//     }
// }

// =======================================================================================================
// =======================================================================================================
// =======================================================================================================
// =======================================================================================================
// =======================================================================================================
// =======================================================================================================
// =======================================================================================================
// =======================================================================================================

// // Second Lecture :-

// public class Recursion {
//     public static int tilingProblem(int n) {
//         // base case
//         if(n == 0 || n == 1) {
//             return 1;
//         }

//         // // kaam
//         // // vertical choice
//         // int fnm1 = tilingProblem(n - 1);

//         // // horizontal choice 
//         // int fnm2 = tilingProblem(n - 2);
//         // int totWays = fnm1 + fnm2;
//         // return totWays;

//         return tilingProblem(n-1) + tilingProblem(n-2);
//     }
//     public static void main(String args[]) {
//         System.out.println(tilingProblem(4));
//     }
// }

// // =======================================================================================================
// // =======================================================================================================

// // Remove Duplicates letter :-

// public class Recursion {
//     public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
//         if(idx == str.length()) {
//             System.out.print(newStr);
//             return;
//         }
//             //kaam
//             char currChar = str.charAt(idx);
//             if(map[currChar-'a'] == true) {
//                 //duplicate
//                 removeDuplicates(str, idx+1, newStr, map);
//             } else {
//                 map[currChar-'a'] = true;
//                 removeDuplicates(str, idx+1, newStr.append(currChar),map);
//             }
//         }
        
//     public static void main(String args[]) {
//         String str = "appnnacollege";

//         removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
//         System.out.println();
//     }
// }

// =======================================================================================================
// =======================================================================================================

// // Find Friends Pairing :- 

// public class Recursion {
//     public static int friendsPairing(int n) {
//         if(n == 1 || n == 2) {
//             return n;
//         }
        
//         // // choice
//         // //single
//         // int fnm1 = friendsPairing(n-1);

//         // //pair
//         // int fnm2 = friendsPairing(n-2);
//         // int pairWays = (n-1) * fnm2;

//         // // totWays
//         // int totWays = fnm1 + pairWays;
//         // return totWays;

//         return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
//     }
//     public static void main(String args[]) {
//         System.out.println(friendsPairing(3));

//     }
// }

// =======================================================================================================
// =======================================================================================================

// // Print all binary strings of size N withour consecutive ones : -

// public class Recursion {
//     public static void printBinStrings(int n, int lastPlace, String str) {
//         // base case
//         if(n == 0) {
//             System.out.println(str);
//             return;
//         }
//         // //kaam
//         // if(lastPlace == 0) {
//         //     //sit 0 on chair lastPlace
//         //     printBinStrings(n-1, 0, str+"0");
//         //     printBinStrings(n-1, 1, str+"1");
//         // } else {
//         //     //sit 1 on chair lastPlace
//         //     printBinStrings(n-1, 0, append("0"));
//         // }

//         printBinStrings(n-1, 0, str+"0");
//         if(lastPlace == 0) {
//             printBinStrings(n-1, 1, str+"1");
//         }
//     }
//     public static void main(String args[]) {
        
//         printBinStrings(5, 0, "");
//     }
// }

// =======================================================================================================
// =======================================================================================================

// //   Tower of hanoi :--

// public class Recursion {
//     public static void toh(int n, int A, int C, int B , int D) {
//         if(n == 0) {
//             return;
//         }
//         toh(n-1, A, B, C ,D);
//         System.out.println("Moving " + n + "th disk from " + A + " to " + C);
//         toh(n-1, B, C, A ,D);
//     }
//     public static void main(String args[]) {
//         toh(4, 10, 30, 20, 40);
//     }
// }

// =======================================================================================================
// =======================================================================================================

// // 

// public class Recursion {
//     public static int countSubs(String str, int si, int ei) {
//         if(si > ei) {
//             return 0;
//         }
//         int firstCharRemoved = countSubs(str, si+1, ei);
//         int lastCharRemoved = countSubs(str, si, ei-1);
//         int firstLastCharRemoved = countSubs(str, si+1, ei-1);  // common substrings after removing first and last char

//         int ans = firstCharRemoved + lastCharRemoved - firstLastCharRemoved ;

//         if(str.charAt(si) == str.charAt(ei)) {
//             ans++;
//         }

//         return ans;
//     }
//     public static void main(String args[]) {

//         String s = "aba";
//         int n = s.length();

//         int ans = countSubs(s, 0, n-1);  

//         System.out.println(ans);
//     }
// }


// =======================================================================================================
// =======================================================================================================

// // Tower of hinoi  :--

// public class Recursion {
    
//     public static void towerOfHanoi(int n, String src, String helper, String dest) {
//         if(n == 1) {
//             System.out.println("  Transfer disk " + n + " from " + src + " to " + dest);
//             return ;
//         }
//         towerOfHanoi(n-1, src, dest, helper);
//         System.out.println("  Transfer disk " + n + " from " + src + " to " + dest);
        
//         towerOfHanoi(n-1, helper, src, dest);
       
//     }
//     public static void main(String args[]) {
//         int n = 8;
//         towerOfHanoi(n, "S", "H", "D");
//     }
// }


// =======================================================================================================
// =======================================================================================================

// // Reverse string :----
// public class Recursion { 
// public static void printRev (String str, int idx) {
//     if(idx == 0) {
//         System.out.println(str.charAt(idx));
//         return;
//     }

//     System.out.print(str.charAt(idx));
//     printRev(str, idx-1);
// }
// public static void main(String args[]) {
//     String str = "abcd";

//     printRev(str, str.length()-1);
//     }
// }


// =======================================================================================================
// =======================================================================================================

// // Find Occurance : --

// public class Recursion { 
//     public static int first = -1;
//     public static int last = -1;

//     public static void findOccurance (String str, int idx, char element) {
//         if(idx == str.length()-1) {
//             System.out.println(first);
//             System.out.println(last);
//             return;
//         }
//         char currChar = str.charAt(idx);
//         if(currChar == element) {
//             if(first == -1) {
//                 first = idx;
//             } else {
//                 last = idx;
//             }
//         }

//         findOccurance(str, idx+1, element);
//     }
// public static void main(String args[]) {
//     String str = "abaacdaefaah";

//      findOccurance(str, 0, 'a');
//     }
// }

// // =======================================================================================================
// // =======================================================================================================

// // Check is Sorted or not : ---
// public class Recursion {
//     public static boolean isSorted(int arr[], int idx) {
//         if(idx == arr.length-1) {
//             return true;
//         }

//         if(arr[idx] < arr[idx+1]) {
//             // array is sorted
//             return isSorted (arr, idx+1);
//         } else {
//             return false;
//         }
//     }

//     public static void main(String args[]) {
//         int arr[] = {1, 2, 3, 4, 6, 5};

//         System.out.println(isSorted(arr, 0));
//     }
// }

// =======================================================================================================
// =======================================================================================================

// public class Recursion {
//     public static void moveAllX(String str, int idx, int count, String newString) {
//         if(idx == str.length()) {
//             System.out.print(newString);
//             for(int i=0; i<count; i++) {
//                 System.out.print("x");
//             }
//             return;
//         }
//         char currChar = str.charAt(idx);
//         if(currChar == 'x') {
//             count++;
//             moveAllX(str, idx+1, count, newString);
//         } else {
//             newString += currChar; // newString = newString + currChar;
//             moveAllX(str, idx+1, count, newString);
//         }
//     }
//     public static void main(String args[]) {
//         String str = "axbcxxd";
//         moveAllX(str, 0, 0, "");
//     }
// }

// =======================================================================================================
// =======================================================================================================

// public class Recursion {
//     public static boolean map [] = new boolean [26];
//     public static void removeDuplicates(String str, int idx, String newString) {
//         if(idx == str.length()) {
//             System.out.println(newString);
//             return;
//         }

//         char currChar = str.charAt(idx);
//         if(map[currChar - 'a'] == true) {
//             removeDuplicates(str, idx+1, newString);
//         } else {
//             newString += currChar;
//             map[currChar - 'a'] = true;
//             removeDuplicates(str, idx+1, newString);
//         }
//      }

//     public static void main(String args[]) {
//         String str = "abbccda";
//         removeDuplicates(str, 0, "");
//     }
// }

// =======================================================================================================
// =======================================================================================================


// public class Recursion {
//     public static void subsequences(String str, int idx, String newString) {
//         if(idx == str.length()) {
//             System.out.println(newString);
//             return;
//         }
        
//         char currChar = str.charAt(idx);

//         //to be
//         subsequences(str, idx+1, newString + currChar);
//         //or not to be 
//         subsequences(str, idx+1, newString);
//     }
//     public static void main(String[] args) {
//         String str = "abc";
//         subsequences(str, 0, "");
//     } 
// }

// =======================================================================================================
// =======================================================================================================

public class Recursion {
    public static String keypad [] = {".", "abc", "def", "ghi", "jkl", "mon"};
        public static void printComb(String str, int idx, String combination) {
            if(idx == str.length()) {
                System.out.println(combination);
                return;
            }
            char currChar = str.charAt(idx);
            String mapping = keypad[currChar - '0'];

            for(int i=0; i<mapping.length(); i++) {
                printComb(str, idx+1, combination+mapping.charAt(i));

            }
        }

    public static void main(String args[]) {
        String str = "4";
        printComb(str, 0, "");
    }
}


























































