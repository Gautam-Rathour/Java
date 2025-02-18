// // =======================================================================================================
// // =======================================================================================================

// // Matrix Chain Multiplication ( Recursion ) :  -----

// import java.util.*;
// public class DP6 {
//     public static int mcm(int arr[], int i, int j) {
//         if(i == j) {
//             return 0;  // single matrix case
//         }

//         int ans = Integer.MAX_VALUE;
//         for(int k=i; k<=j-1; k++) {
//             int cost1 = mcm(arr, i, k);  //Ai...Ak => arr[i-1] *  arr[k]
//             int cost2 = mcm(arr, k+1, j); //Ai+1...Aj => arr[k] * arr[j]
//             int cost3 = arr[i-1] * arr[k] * arr[j];
//             int finalCost = cost1 + cost2 + cost3;
//             ans = Math.min(ans, finalCost);
//         }

//         return ans; //mincost
//     }
//     public static void main(String args[]) {
//         int arr[] = {1, 2, 3, 4, 3};  //n = 3
//         int n = arr.length;

//         System.out.println(mcm(arr, 1, n-1));
//     }
// }

// // =======================================================================================================
// // =======================================================================================================

// // Matrix Chain Multiplication ( Memoision ) :  -----

// import java.util.*;
// public class DP6 {
//     public static int mcm(int arr[], int i, int j, int dp[][]) {  // O(n^2)
//         if(i == j) {
//             return 0;  // single matrix case
//         }

//         int ans = Integer.MAX_VALUE;
//         for(int k=i; k<=j-1; k++) {
//             int cost1 = mcm(arr, i, k, dp);  //Ai...Ak => arr[i-1] *  arr[k]
//             int cost2 = mcm(arr, k+1, j, dp); //Ai+1...Aj => arr[k] * arr[j]
//             int cost3 = arr[i-1] * arr[k] * arr[j];
//             int finalCost = cost1 + cost2 + cost3;
//             ans = Math.min(ans, finalCost);
//         }

//         return dp[i][j] = ans; //mincost
//     }
//     public static void main(String args[]) {
//         int arr[] = {1, 2, 3, 4, 3};  //n = 3
//         int n = arr.length;

//         int dp[][] = new int [n][n];
//         for(int i=0; i<n; i++) {
//             Arrays.fill(dp[i], -1);
//         }
//         System.out.println(mcm(arr, 1, n-1, dp));
//     }
// }

// =======================================================================================================
// =======================================================================================================

// Matrix Chain Multiplication ( Tabulation ) :  -----

import java.util.*;
public class DP6 {
    public static int mcm(int arr[], int i, int j, int dp[][]) {  // O(n^2)
        if(i == j) {
            return 0;  // single matrix case
        }

        int ans = Integer.MAX_VALUE;
        for(int k=i; k<=j-1; k++) {
            int cost1 = mcm(arr, i, k, dp);  //Ai...Ak => arr[i-1] *  arr[k]
            int cost2 = mcm(arr, k+1, j, dp); //Ai+1...Aj => arr[k] * arr[j]
            int cost3 = arr[i-1] * arr[k] * arr[j];
            int finalCost = cost1 + cost2 + cost3;
            ans = Math.min(ans, finalCost);
        }

        return dp[i][j] = ans; //mincost
    }
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 3};  //n = 3
        int n = arr.length;

        int dp[][] = new int [n][n];
        for(int i=0; i<n; i++) {
            Arrays.fill(dp[i], -1);
        }
        System.out.println(mcm(arr, 1, n-1, dp));
    }
}

// =======================================================================================================
// =======================================================================================================
