
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

//Diagonal Sum :-
//Given a square matrix, find the sum of the main diagonal (from top-left to bottom-right and top-right to bottom-left;

import java.util.*;
public class Matrices {
    public static int diagonalSum(int matrix[][]) {
        int sum = 0;

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(i == j) {
                    sum += matrix[i][j];
                }

                if(i+j == matrix.length-1) {
                    sum += matrix[i][j];
                }
            }
        }

        // for(int i=0; i<matrix.length; i++) {
        //     //pd
        //     sum += matrix[i][i];
        //     //sd
        //     if(i != matrix.length-i-1)
        //     sum += matrix[i][matrix.length-i-1];
        // }
        return sum;
    }
    public static void main (String args[]) {
        int matrix[][] = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};

                          System.out.println(diagonalSum(matrix));
    }
}


// =======================================================================================================
// =======================================================================================================
































