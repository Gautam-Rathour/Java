
// =======================================================================================================
// =======================================================================================================

// public class BackTracking {
//     public static void changeArr(int arr[], int i, int val) {
//         //base case
//         if( i == arr.length ) {
//             printArr(arr);
//             return;
//         }
//         //recursion
//         arr[i] = val;
//         changeArr(arr, i+1, val+1); //fnx call step

//         arr[i] = arr[i] - 2;    // backtracking step 
//     }
//     public static void printArr(int arr[]) {
//         for(int i=0; i<arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
//     public static void main(String args[]) {
//         int arr[] = new int [5];
//         changeArr(arr, 0, 1);
//         printArr(arr);
       
//     }
// }

// =======================================================================================================
// =======================================================================================================

// // Find Sub-sets :-

// public class BackTracking {
//     public static void findSubsets(String str, String ans, int i) {
//         // base case
//         if(i == str.length()) {
//             if(ans.length() == 0) {
//                 System.out.println("null");
//             } else { 
//                 System.out.println(ans);
//             }
//             return;
//         }

//         //recursion 
//         //Yes choice
//         findSubsets(str, ans+str.charAt(i), i+1);
//         //No choice
//         findSubsets(str, ans, i+1);

//     }
//     public static void main(String args[]) {
//         String str = "abc";
//         findSubsets(str, "", 0);
        
//     }
    
// }

// =======================================================================================================
// =======================================================================================================

// // Find permutation : --

// public class BackTracking {
//     public static void findPermutation(String str, String ans) {
//         // base case
//         if(str.length() == 0) {
//             System.out.println(ans);
//             return;
//         }
//         //recursion
//         for(int i=0; i<str.length(); i++) {
//             char curr = str.charAt(i);
//             //"abcde" => "ab" + "de" = "abde"
//             String NewStr = str.substring(0, i) + str.substring(i+1);
//             findPermutation(NewStr, ans + curr);
//         }
//     }
//     public static void main(String args[]) {
//         String str = "abc";
//         findPermutation("abc", "");
//     }
// }

// =======================================================================================================
// =======================================================================================================

// Find space for " Q "  : --

// public class BackTracking {
//     public static boolean isSafe(char board[][], int row, int col) {
//         // vertical up
//         for(int i=row-1; i>=0; i--) {
//             if(board[i][col] == 'Q') {
//                 return false;
//             }
//         }

//         // diag left up 
//         for(int i=row-1, j=col-1; i>=0 && j>=0; i-- , j--) {
//             if(board[i][j] == 'Q') {
//                 return false;
//             }
//         }

//         // diag right up
//         for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++) {
//             if(board[i][j] == 'Q') {
//                 return false;
//             }
//         }
//         return true;
//     }

//     static int count = 0;
//     public static void nQueens(char board[][], int row) {
//         //base
//         if(row == board.length) {
//             // printBoard(board);
//             count++;
//             return;
//         }
//         // column loop
//         for(int j=0; j<board.length; j++) {
//             if(isSafe(board, row, j)) {
//                 board[row][j] = 'Q';
//                 nQueens(board, row+1); // function call
//                 board[row][j] = 'x';   // backtracking step
//             }
//         }
//     }
//     public static void printBoard(char board[][]) {
//         System.out.println("------------ chess board ------------");
//         for(int i=0; i<board.length; i++) {
//             for(int j=0; j<board.length; j++) {
//                 System.out.print(board[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String args[]) {
//         int n = 5;
//         char board[][] = new char[n][n];
//         //initialize
//         for(int i=0; i<n; i++) {
//             for(int j=0; j<n; j++) {
//                 board[i][j] = 'x';
//             }
//         }

//         nQueens(board, 0);
//         System.out.println("Total ways to solve n queens = " + count);
//     }
// }

// =======================================================================================================
// =======================================================================================================

//
// Find how many way you can put count : -----

public class BackTracking {
    public static boolean isSafe(char board[][], int row, int col) {
        // vertical up
        for(int i=row-1; i>=0; i--) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }

        // diag left up 
        for(int i=row-1, j=col-1; i>=0 && j>=0; i-- , j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        // diag right up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }


    static int count = 0;
    public static boolean nQueens(char board[][], int row) {
        //base
        if(row == board.length) {
            count++;
            return true;
        }
        // column loop
        for(int j=0; j<board.length; j++) {
            if(isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if(nQueens(board, row+1)) { // function call
                    return true;
                } 
                board[row][j] = 'x'; // backtracking step
            }
        }
        return false;
    }
    public static void printBoard(char board[][]) {
        System.out.println("------------ chess board ------------");
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n = 4;
        char board[][] = new char[n][n];
        //initialize
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                board[i][j] = 'x';
            }
        }

        if(nQueens(board, 0)) {
            System.out.println("\nsolution is possible");
            printBoard(board);
        } else {
            System.out.println("solution is not possible");
        }
        System.out.println("Total ways to solve n queens = " + count);
    }
}

// =======================================================================================================
// =======================================================================================================

// // Find Frid Ways ( how many way we have for rich the n-1, m-1 ) : --

// public class BackTracking {
//     public static int gridWays(int i, int j, int n, int m) {  
//         // base case 
//         if(i == n-1 && j == m-1) {   // condn for last cell
//             return 1;
//         } else if(i == n || j == n) {   // boundary cross condn
//             return 0;
//         }

//         int w1 = gridWays(i+1, j, n, m);
//         int w2 = gridWays(i, j+1, n, m);
//         return w1 + w2;
//     }
//     public static void main(String args[]) {
//         int n = 3, m = 3;
//         System.out.println(gridWays(0, 0, n, m));
//     }
// }

// =======================================================================================================
// =======================================================================================================
// // Write a Function to complete a Sudoku.

// public class BackTracking {
//     public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
//         // Check column
//         for (int i = 0; i <= 8; i++) {
//             if (sudoku[i][col] == digit) {
//                 return false;
//             }
//         }

//         // Check row
//         for (int j = 0; j <= 8; j++) {
//             if (sudoku[row][j] == digit) {
//                 return false;
//             }
//         }

//         // Check 3x3 grid
//         int sr = (row / 3) * 3;
//         int sc = (col / 3) * 3;
//         for (int i = sr; i < sr + 3; i++) {
//             for (int j = sc; j < sc + 3; j++) {
//                 if (sudoku[i][j] == digit) {
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }

//     public static boolean sudokuSolver(int sudoku[][], int row, int col) {
//         // Base case:
//         if (row == 9) {
//             return true;
//         }

//         //recursion
//         int nextRow = row, nextCol = col + 1;
//         if (col == 8) { // If column is the last, move to the next row
//             nextRow = row + 1;
//             nextCol = 0;
//         }

//         // If the cell is already filled, skip it
//         if (sudoku[row][col] != 0) {
//             return sudokuSolver(sudoku, nextRow, nextCol);
//         }

//         // Try placing digits 1 to 9
//         for (int digit = 1; digit <= 9; digit++) {
//             if (isSafe(sudoku, row, col, digit)) {
//                 sudoku[row][col] = digit; // Place the digit
//                 if (sudokuSolver(sudoku, nextRow, nextCol)) { // Recursively solve
//                     return true;
//                 }
//                 sudoku[row][col] = 0; // Backtrack
//             }
//         }

//         return false; // If no digit can be placed, return false
//     }

//     public static void printSudoku(int sudoku[][]) {
//         for (int i = 0; i < 9; i++) {
//             for (int j = 0; j < 9; j++) {
//                 System.out.print(sudoku[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String args[]) {
//         int sudoku[][] = {
//             {0, 0, 8, 0, 0, 0, 0, 0, 0},
//             {4, 9, 0, 1, 5, 7, 0, 0, 2},
//             {0, 0, 3, 0, 0, 4, 1, 9, 0},
//             {1, 8, 5, 0, 6, 0, 0, 2, 0},
//             {0, 0, 0, 0, 2, 0, 0, 6, 0},
//             {9, 6, 0, 4, 0, 5, 3, 0, 0},
//             {0, 3, 0, 0, 7, 2, 0, 0, 4},
//             {0, 4, 9, 0, 3, 0, 0, 5, 7},
//             {8, 2, 7, 0, 0, 9, 0, 1, 3}
//         };

//         if (sudokuSolver(sudoku, 0, 0)) {
//             System.out.println("Solution exists:");
//             printSudoku(sudoku);
//         } else {
//             System.out.println("Solution does not exist");
//         }
//     }
// }

// =======================================================================================================
// =======================================================================================================



// =======================================================================================================
// =======================================================================================================








































































