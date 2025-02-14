// =======================================================================================================
// =======================================================================================================


// // Coin Change  :  --------

// import java.util.*;
// public class DP3 {
//     public static int coinChange(int coins[], int sum) {
//         int n = coins.length;
//         int dp[][] = new int[n+1][sum+1];

//         //initialize - sum is 0
//         //i -> soins; j -> sum/change
//         for(int i=0; i<n+1; i++) {
//             dp[i][0] = 1;
//         }
//         for(int j=1; j<sum+1; j++) {
//             dp[0][j] = 0;
//         }

//         for(int i=1; i<n+1; i++) {
//             for(int j=1; j<sum+1; j++) {
//                 if(coins[i-1] <= j) { // Valid
//                     dp[i][j] = dp[i][j-coins[i-1]] + dp[i-1][j];
//                 } else {    // inValid
//                     dp[i][j] = dp[i-1][j];
//                 }
//             }
//         }
//         return dp[n][sum];
//     }
//     public static void main(String args[]) {
//         int coins[] = {2, 5, 3, 6};
//         int sum = 10;  //ans = 4
        
//         System.out.println(coinChange(coins, sum));
//     }
// }

// =======================================================================================================
// =======================================================================================================

// Rod Cutting : ----

public class DP3 {
    // weight => length; val => price; W => totRed
    public static int rodCutting(int length[], int price[], int totRod) {
        int n = price.length;
        int dp[][] = new int[n+1][totRod+1];

        for(int i=0; i<n+1; i++) {
            for(int j=0; j<totRod+1; j++) {
                if(i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }

        for(int i=1; i<n+1; i++) {
            for(int j=1; j<totRod+1; j++) {
                //Valid
                if(length[i-1] <= j) {
                    //dp[i][j] = Math.max(val[i-1] + dp[i][j-wt[i-1]], dp[i-1][j]);
                    dp[i][j] = Math.max(price[i-1] + dp[i][j-length[i-1]], dp[i-1][j]);
                }
                //inValid
                else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][totRod];
    }
    public static void main(String args[]) {
        int length[] = {1, 2, 3, 4, 5, 6, 7, 8}; // pieces length
        int price[] = {1, 5, 8, 9, 10, 17, 17, 20};
        int totRod = 8;

        System.out.println(rodCutting(length, price, totRod));
    }
}