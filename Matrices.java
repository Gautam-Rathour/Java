
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





































