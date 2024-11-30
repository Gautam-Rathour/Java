
// // Matricees :- 

// import java.util.*;
// public class Matrices {
//     public static boolean search(int matrix[][], int key) {
//         for(int i=0; i<matrix.length; i++) { 
//             for(int j=0; j<matrix[0].length; j++) {
//                 if(matrix[i][j] == key) {
//                     System.out.println("found at cell (" + i + "," + j + ")");
//                     return true;
//                 }
//             }
//         }
//         System.out.println("The key is not Found!");
//         return false;
//     }
//     // Find largest :-
//     public static void searchMax(int matrix[][]) {
//         int largest = Integer.MIN_VALUE;
//         for(int i=0; i<matrix.length; i++) {
//             for(int j=0; j<matrix[0].length; j++) {
//                 if(matrix[i][j] > largest) {
//                     largest = matrix[i][j];
//                 }
//             }
//         }
//         System.out.println("The largest element is : " + largest);
//     }
//     // Find smallest :-
//     public static void searchMin(int matrix[][]) {
//         int smallest = Integer.MAX_VALUE;
//         for(int i=0; i<matrix.length; i++) {
//             for(int j=0; j<matrix[0].length; j++) {
//                 if(matrix[i][j] < smallest) {
//                     smallest = matrix[i][j];
//                 }
//             }
//         }
//         System.out.println("The smallest element is : " + smallest);
//     }

//     public static void main (String args[]) {
//         Scanner scanner = new Scanner(System.in);
//         int matrix[][] = new int[3][3];
//         int n = 3, m = 3;
//         int key = 7;

//         System.out.print("Enter the number : ");
//         for(int i=0; i<n; i++) {
//             for(int j=0; j<m; j++) {
//                 matrix[i][j] = scanner.nextInt();
//             }
//         }
//         //Output
//         for(int i=0; i<n; i++) { 
//             for(int j=0; j<m; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//         search(matrix, key);


//         searchMax(matrix);
//         searchMin(matrix);
//     }
// }


// =======================================================================================================
// =======================================================================================================

// // Sprial matrix Code :-

// import java.util.*;
// public class Matrices {
//     public static void printSpiral (int matrix[][]) {
//         int startRow = 0;
//         int startCol = 0;
//         int endRow = matrix.length - 1;
//         int endCol = matrix[0].length-1;

//         while(startRow <= endRow && startCol <= endCol) {
//             //top
//             for(int j=startCol; j<=endCol; j++) {
//                 System.out.print(matrix[startRow][j] + " ");
//             }

//             //right
//             for(int i=startRow+1; i<=endRow; i++) {
//                 System.out.print(matrix[i][endCol]+ " ");
//             }

//             //bottom
//             for(int j=endCol-1; j>=startCol; j--) {
//                 if(startRow == endRow) {
//                     break;
//                 }
//                 System.out.print(matrix[endRow][j] +" ");
//             }

//             //left
//             for(int i=endRow-1; i>=startRow+1; i--) {
//                 if(startCol == endCol) {
//                     break;
//                 }
//                 System.out.print(matrix[i][startCol] + " ");
//             }

//             startCol++;
//             startRow++;
//             endCol--;
//             endRow--;
//         }
//         System.out.println();
//     }
//     public static void main(String args[]) {
//         int matrix[][] = {{1, 2, 3, 4},
//                           {5, 6, 7, 8},
//                           {9, 10, 11, 12},
//                           {13, 14, 15, 16}};

//                           printSpiral(matrix);
//     }
// }

// =======================================================================================================
// =======================================================================================================

// //Diagonal Sum :-
// //Given a square matrix, find the sum of the main diagonal (from top-left to bottom-right and top-right to bottom-left;

// import java.util.*;
// public class Matrices {
//     public static int diagonalSum(int matrix[][]) {
//         int sum = 0;

//         for(int i=0; i<matrix.length; i++) {
//             for(int j=0; j<matrix[0].length; j++) {
//                 if(i == j) {
//                     sum += matrix[i][j];
//                 }

//                 if(i+j == matrix.length-1) {
//                     sum += matrix[i][j];
//                 }
//             }
//         }

//         // for(int i=0; i<matrix.length; i++) {
//         //     //pd
//         //     sum += matrix[i][i];
//         //     //sd
//         //     if(i != matrix.length-i-1)
//         //     sum += matrix[i][matrix.length-i-1];
//         // }
//         return sum;
//     }
//     public static void main (String args[]) {
//         int matrix[][] = {{1, 2, 3, 4},
//                           {5, 6, 7, 8},
//                           {9, 10, 11, 12},
//                           {13, 14, 15, 16}};

//                           System.out.println(diagonalSum(matrix));
//     }
// }

// =======================================================================================================
// =======================================================================================================

// // Search in sorted matrix :-

// import java.util.*;
// public class Matrices {
//     public static boolean staircaseSearch(int matrix[][], int key) {
//         int row = 0, col = matrix[0].length-1;

//         while(row < matrix.length && col >= 0) {
//             if(matrix[row][col] == key) {
//                 System.out.println("Found key at (" + row + "," + col + ")");
//                 return true;
//             }

//             else if(key < matrix[row][col]) {
//                 col--;
//             }
//             else {
//                 row++;
//             }
//         }
//         System.out.println("Key not found!");
//         return false;
//     }
//     public static void main(String args[]) {
//         int matrix[][] = {{10, 20, 30, 40},
//                           {15, 25, 35, 45},
//                           {27, 29, 37, 48},
//                           {32, 33, 39, 50}};



//         int key = 350;
//         staircaseSearch(matrix, key);

//     }
// }

// =======================================================================================================
// =======================================================================================================

// // Question 1 :Print the number of 7’s that are inthe 2d array.

// import java.util.*;
// public class Matrices {
//     public static void main (String args[]) {
//         int nums[][] = {{1, 4, 9},
//                         {11, 4, 3},
//                         {2, 2, 3}};

//         int key = 2;
//         int count = 0;


//         for(int i=0; i<nums.length; i++) {
//             for(int j=0; j<nums[0].length; j++) {
//                 if(nums[i][j] == key) {
//                     count++;
//                 }
//             }
//         }
//         if(count == 0) {
//             System.out.println("Key is not avlable in this 2D array .");

//         } else {
//             System.out.println("Number is avilable");
//         }
//     }
// }

// =======================================================================================================
// =======================================================================================================

// 
public class Matrices {
    public static void printSpiral(int mat[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = mat.length - 1;
        int endCol = mat[0].length - 1;

        while(startRow <= endRow && startCol <= endCol) { 
            // =========
            col = startCol;
            for(int row=0; row<=mat.length-1; row++) {
                System.out.print(mat[row][col] + " ");
            }
            startCol++;

            // print ending row from sc to es
            row = endRow;
            for(int col=startCol; col<mat[0].length; col++) {
                System.out.print(mat[row][col] + " ");
            }
            endRow--;

            // print ending col from endRow to Startrow
            col = endCol;
            for(int row=endRow; row>=0; row--) {
                System.out.print(mat[row][col] + " ");
            }
            endCol--;


            // =========
            row = startRow;
            for(int col=endCol; col>=0; col--) {
                System.out.print(mat[row][col] + " ");
            }
            startRow++;


        }
    }
    public static void main(String args[]) {
        int arr[][] = {{1, 6, 11, 14, 21},
                        {2, 7, 12, 15, 25},
                        {3, 8, 13, 16, 22},
                        {4, 9, 17, 19, 24},
                        {5, 10, 20, 18, 23}};

                        printSpiral(arr);
    }
}


// =======================================================================================================
// =======================================================================================================




























