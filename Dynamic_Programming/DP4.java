// =======================================================================================================
// =======================================================================================================

// // Longest Common Substring  :  -------

// public class DP4 {
//     public static int longestCommonSubstring(String str1, String str2) { // O(n * m)
//         int n = str1.length();
//         int m = str2.length();
//         int dp[][] = new int[n+1][m+1];
//         int ans = 0;

//         // initialize
//         for(int i=0; i<n+1; i++) {
//             dp[i][0] = 0;
//         }
//         for(int j=0; j<m+1; j++) {
//             dp[0][j] = 0;
//         }

//         //bottom up
//         for(int i=1; i<n+1; i++) {
//             for(int j=1; j<m+1; j++) {
//                 if(str1.charAt(i-1) == str2.charAt(j-1)) {
//                     dp[i][j] = dp[i-1][j-1] + 1;
//                     ans = Math.max(ans, dp[i][j]);
//                 } else {
//                     dp[i][j] = 0;
//                 }
//             }
//         }
//         return ans;
//     }
//     public static void main(String args[]) {
//         String str1 = "ABCDE";
//         String str2 = "ABGCE";

//         System.out.println(longestCommonSubstring(str1, str2));
//     }
// }

// =======================================================================================================
// =======================================================================================================

// // Longest Increasing Subsequence  :   ---------

// import java.util.*;
// public class DP4 {
//     public static int lcs(int arr1[], int arr2[]) {
//         int n = arr1.length;
//         int m = arr2.length;
//         int dp[][] = new int[n+1][m+1];

//         //initialize
//         for(int i=0; i<n+1; i++) {
//             dp[i][0] = 0;
//         }
//         for(int j=0; j<m+1; j++) {
//             dp[0][j] = 0;
//         }

//         // bottom up 
//         for(int i=1; i<n+1; i++) {
//             for(int j=1; j<m+1; j++) {
//                 if(arr1[i-1] == arr2[j-1]) {
//                     dp[i][j] = dp[i-1][j-1] + 1;
//                 } else {
//                     int ans1 = dp[i-1][j];
//                     int ans2 = dp[i][j-1];
//                     dp[i][j] = Math.max(ans1, ans2);
//                 }
//             }
//         }
//         return dp[n][m];
//     }
//     public static int lis(int arr1[]) {
//         HashSet<Integer> set = new HashSet<>();
//         for(int i=0; i<arr1.length; i++) {
//             set.add(arr1[i]);
//         }

//         int arr2[] = new int[set.size()];  //sorted unique els
//         int i = 0; 
//         for(int num : set) {
//             arr2[i] = num;
//             i++;
//         }

//         Arrays.sort(arr2); // ascending
//         return lcs(arr1, arr2);
//     }
//     public static void main(String args[]) {
//         int arr[] = {50, 3, 10, 7, 40, 80};

//         System.out.println(lis(arr));
//     }
// }

// =======================================================================================================
// =======================================================================================================

// // Edit Distance  :  ----

// public class DP4 {
//     public static int editDistance(String str1, String str2) { // O(n * m)
//         int n = str1.length();
//         int m = str2.length();
//         int dp[][] = new int[n+1][m+1];

//         //initialize
//         for(int i=0; i<n+1; i++) {
//             for(int j=0; j<m+1; j++) {
//                 if(i == 0) {
//                     dp[i][j] = j;
//                     } 
//                 if(j == 0) {
//                     dp[i][j] = i;
//                 }
//             }
//         }

//         //bottom up 
//         for(int i=1; i<n+1; i++) {
//             for(int j=1; j<m+1; j++) {
//                 if(str1.charAt(i-1) == str2.charAt(j-1)) { // same
//                     dp[i][j] = dp[i-1][j-1];
//                 } else { // diff
//                     int add = dp[i][j-1] + 1;
//                     int del = dp[i-1][j] + 1;
//                     int rep = dp[i-1][j-1] + 1;
//                     dp[i][j] = Math.min(add, Math.min(del, rep));
//                 }
//             }
//         }

//         return dp[n][m];
//     }
//     public static void main(String args[]) {
//         String word1 = "abc";
//         String word2 = "sbd"; //2

//         System.out.println(editDistance(word1, word2));

//     }
// }

// =======================================================================================================
// =======================================================================================================

// //  String Conversion  :  -------

// public class DP4 {
//     // Function to find the length of Longest Common Subsequence (LCS)
//     private static int findLCS(String A, String B) {
//         int m = A.length(), n = B.length();
//         int[][] dp = new int[m + 1][n + 1];

//         // Fill the DP table
//         for (int i = 1; i <= m; i++) {
//             for (int j = 1; j <= n; j++) {
//                 if (A.charAt(i - 1) == B.charAt(j - 1)) {
//                     dp[i][j] = 1 + dp[i - 1][j - 1];
//                 } else {
//                     dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
//                 }
//             }
//         }
//         return dp[m][n];
//     }

//     // Function to find minimum insertions and deletions
//     public static void minInsertDelete(String A, String B) {
//         int lcsLength = findLCS(A, B);

//         int deletions = A.length() - lcsLength;
//         int insertions = B.length() - lcsLength;

//         System.out.println("Minimum Deletions: " + deletions);
//         System.out.println("Minimum Insertions: " + insertions);

//         System.out.println("Total Action = " + (deletions + insertions));
//     }

//     public static void main(String[] args) {
//         String A = "heap";
//         String B = "pea";

//         minInsertDelete(A, B);
//     }
// }

// =======================================================================================================
// =======================================================================================================

// // Live Lecture  :  ------

// public class DP4 {
//     public static void findFeb(int n) {
//         int dp[] = new int[n];
//         dp[0] = 0;
//         dp[1] = 0;
//         dp[2] = 1;

//         for(int i=3; i<n; i++) {
//             dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
//         }

//         for(int i=0; i<n; i++) {
//             System.out.println(dp[i] + " ");
//         }
//     }
//     public static void main(String args[]) {
//         int n = 10;

//         findFeb(n);
//     }
// }

// =======================================================================================================
// =======================================================================================================

// Generate Parentheses  : ------- ( Live ) --

import java.util.*;
public class DP4 {
    public static void helper(int open, int close, String str, int n, List<String> ans) {
        if(open == n && close == n) {
            ans.add(str);
            return;
        }

        if(open < n) {
            helper(open + 1, close, str + "(", n, ans);
        }
        if(close < open) { 
            helper(open, close + 1, str + ")", n, ans);
        }
    }

    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(0, 0, "", n, ans);
        return ans;
    }

    public static void main(String args[]) {
        int n = 3;
        List<String> result = generateParenthesis(n);

        System.out.println(result);
    }
}

// =======================================================================================================
// =======================================================================================================

// Best Time to Buy and Sell Stocks - (II) 










// =======================================================================================================
// =======================================================================================================

// Longest commen Subsiquence  :  -----
https://google.com


