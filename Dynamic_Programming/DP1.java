// =======================================================================================================
// =======================================================================================================

// DP  :  ----

// import java.util.*;
// public class DP1 {
//     public static int fib(int n, int f[]) { // O(n)
//         if(n == 0 || n == 1) { // 0 1 2 3
//             return n;
//         }
//         if(f[n] != 0) {
//             return f[n];
//         }

//         f[n] =  fib(n-1, f) + fib(n-2, f);
//         return f[n];
//     }

//     // Tabulation  :  ------
//     public static int fibTablation(int n) {
//         int dp[] = new int[n+1];
//         dp[0] = 0;
//         dp[1] = 1;
//         for(int i=2; i<=n; i++) {
//             dp[i] = dp[i-1] + dp[i-2];
//         }
//         return dp[n]; //ans
//     }
//     public static void main(String args[]) {
//         int n = 7;
//         int f[] = new int[n+1]; //0, 0, 0, 0

//         // System.out.println(fib(n, f));
//         System.out.println(fibTablation(n));
//     }
// }

// =======================================================================================================
// =======================================================================================================

// // Climbing Stairs (DP -  Recursion )  :  -----

// import java.util.*;
// public class DP {
//     // memozation  - O(n) || recursion (2^n) -> n = 10^5
//     public static int countWays(int n, int ways[]) {
//         if(n == 0) {
//             return 1;
//         }
//         if(n < 0) {
//             return 0;
//         }
//         if(ways[n] != -1) { //already calculated
//             return ways[n];
//         }

//         ways[n] =  countWays(n - 1, ways) + countWays(n - 2, ways);  //  +  countWays(n - 3) +  countWays(n - 4);
//         return ways[n];
//     }
//     public static void main(String args[]) {
//         int n = 5;
//         int ways[] = new int[n+1];
//         Arrays.fill(ways, -1);

//         System.out.println(countWays(n, ways));
//     }
// }

// =======================================================================================================
// =======================================================================================================

// // Climbing Stairs (DP - Tabulation )  :  -----

// import java.util.*;
// public class DP1 {

//     // memozation  - O(n) || recursion (2^n) -> n = 10^5
//     public static int countWays(int n, int ways[]) { //O(n)
//         if(n == 0) {
//             return 1;
//         }
//         if(n < 0) {
//             return 0;
//         }
//         if(ways[n] != -1) { //already calculated
//             return ways[n];
//         }
//         ways[n] =  countWays(n - 1, ways) + countWays(n - 2, ways);  //  +  countWays(n - 3) +  countWays(n - 4);
//         return ways[n];
//     }


//     // Tabulation : -- 
//     public static int countWaysTab(int n) { //O(n)
//         int dp[] = new int[n+1];
//         dp[0] = 1;

//         //tabulation loop
//         for(int i=1; i<=n; i++) {
//             if(i == 1) {
//                 dp[i] = dp[i-1] + 0;
//             } else {
//                 dp[i] = dp[i-1] + dp[i-2];
//             }
//         }

//         return dp[n];
//     }
//     public static void main(String args[]) {
//         int n = 5;
//         int ways[] = new int[n+1];
//         Arrays.fill(ways, -1);

//         System.out.println(countWays(n, ways));
//         System.out.println(countWaysTab(n));
//     }
// }

// =======================================================================================================
// =======================================================================================================
