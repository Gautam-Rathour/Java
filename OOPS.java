/* 
import java.util.*;

public class second{
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println( sum);
    }
}*/
// //=========================================================

// import java.util.*;

// public class second{
//     public static void main (String[] args) {

//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         if (a == b) {
//             System.out.println("Equal");
//         } 
//         else if(a > b) {
//                 System.out.println("a is greater");
//         } 
//         else {
//             System.out.println("a is lesser");
//         }
//     }
// }

// //=========================================================

// import java.util.*;

// public class second{
//     public static void main (String[] args) {

//         Scanner sc = new Scanner(System.in);
//         int Button = sc.nextInt();
        

//         if (Button == 1) {
//             System.out.println("Hello");
//         } 
//         else if(Button == 2) {
//                 System.out.println("Namaste");
//         } 
//         else if(Button == 3){
//             System.out.println("Bonjour");
//         }
//         else{
//             System.out.println("You click a Wrong button");
//         }
//     }
// }
// //==================================================

// import java.util.*;

// public class second{
//     public static void main (String[] args) {

//         Scanner sc = new Scanner(System.in);
//         int Button = sc.nextInt();
        
//     switch(Button){
//     case 1 : System.out.println("Hello");
//     break;
//     case 2 : System.out.println("Namaste");
//     break;
//     case 3 : System.out.println("Bonjour");
//     break;
//     default : System.out.println("Invalid Button");
//         }
//     }
// }
//==================================================

// import java.util.*;

// public class second{
//     public static void main (String[] args) {

//     //  for (int i = 0 ; i <= 20; i++) {
//     //     System.out.println(i  + ".  Hello World");
//     //  }

// //==============================

//     // int i = 0;
//     // while(i < 10) {
//     //     System.out.println(i + ". Hyy Raju");
//     //     i++;
//     //     }

// //==============================

//         // int i = 0;
//         // do{
//         //     System.out.print(i + "Ram ji");
//         //     i++;
//         // }while(i < 10);
        
//     }
// }

// // //==================================================

// import java.util.*;
//  public class second{
//     public static void main (String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("\n\nEnter a Number = ");
//         int numb = sc.nextInt();

//         int sum = 0;
//         for(int i = 1; i <= numb; i++){
//             sum = sum + i; 

//         }
//         System.out.println("Addition Your all number " + 0 + " to " + numb + " Result =   " + sum + "\n\n");    
//     }
//  }

// ==================================================

// import java.util.*;
//  public class second{
//     public static void main (String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("\n\nEnter a Number = ");
//         int numb = sc.nextInt();
//         System.out.println("\n\nHear 👇 is Your Table");

        
//         for(int i = 1; i <= 10; i++){
//              System.out.println(numb +" * "+ i + " =   " + numb * i);

//         }
          
//     }
//  }

// // ==================================================

// public class second {
//     public static void main(String[] args) {

//         for (int i = 1; i <= 4; i++){
            
//             for (int j = 0; j < 5; j++) {
//                 System.out.print( "*");
//             }
//             System.out.println();
//         }
//     }
// }

// ==================================================

// import java.util.*;
// public class second {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
       
//         for (int i = 1; i <= n; i++){
            
//             System.out.println(i % 2 == 0 );    
                       
//         }
//     }
// }

// ==================================================

// public class second {
//     public static void main (String[] args) {
//         int n = 4;
//         int m = 5;

//         for(int i = 1; i <= n; i++) {
//             for(int j = 1; j <= m; j++){
//                 if(i == 1 || j == 1 || i == n || j == m) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }              
//             }
//             System.out.println( );
//         }
//     }
// }
// ==================================================

// public class second{
//     public static void main (String[] args) {
//         int n = 5;
//         for(int i=1; i<=n; i++) {
//             for(int j=1; j<= n-i; j++) {
//                 System.out.print(" ");
//             }
//             for (int k=1; k<= i; k++){
//                 System.out.print("*");
//             }  
//             System.out.println();     
//         }
//     }
// }
// // ==================================================

// public class second {
//     public static void main(String[] args) {
//         // int n = 1;

//         for (int i=5; i>=1; i--) {
//             for(int j=1; j<=i; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
        
//     }
// }
// // ==================================================

// public class second {
//     public static void main(String[] args) {
//         int n = 5;
//         int number = 1;

        
//         for (int i=1; i<=n; i++) {
//             for(int j=1; j<=i; j++) {
//                 System.out.print(number +" ");
//                 number++;
//             }
//             System.out.println();
//         }       
//     }
// }
// // ==================================================

// public class second {
//     public static void main (String[] args) {
//         int n = 5;

//         for (int i=1; i<=n; i++) {
//             for(int j=1; j<=i; j++) {
//                 int sum = i+j;
//                 if(sum % 2 == 0) {//Even
//                     System.out.print("1 ");
//                 } else {
//                     System.out.print("0 ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// // ==================================================

// public class second {
//     public static void main (String[] args) {
//         int n = 5;

//         for (int i=1; i<=n; i++) {
//             for (int j=1; j<=i; j++) {
//                 System.out.print("* ");
//             }
//             for(int j=1; j<=n-i; j++) {
//                 System.out.print("  ");
//             }
//         //=========================================       
//             for(int j=1; j<=n-i; j++) {
//                 System.out.print("  ");
//             }
//             for(int j=1; j<=i; j++) {
//                 System.out.print("* ");
//             }
//            System.out.println();          
//         }       
//             //=========================================
//            //=========================================
//            for(int i=1; i<=n; i++) {
//             for(int j=0; j<=n-i; j++) {
//                 System.out.print("* ");
//            }
//            for(int j=2; j<=i; j++) {
//             System.out.print("  ");
//            }
//            //=========================================
//            for(int j=2; j<=i; j++){
//             System.out.print("  ");
//            }
//            for(int j=0; j<=n-i; j++) {
//             System.out.print("* ");
//            }
//            System.out.println();
//         }
//     }
// }

// // ===========================================================================================================
// // ===========================================================================================================

// public class second {
//     public static void main (String[] args) {
//         int n = 5;

//         for (int i=0; i<n; i++) {
//             for (int j=1; j<=n-i; j++) {
//                 System.out.print("  ");
//             }
//             for(int j=0; j<n; j++) {
//                 if(i == 0 || i == n-1 || j == 0 || j == n-1 ) { 
//                 System.out.print("* ");
//                 } else {
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// // ===========================================================================================================
// // ===========================================================================================================
// public class second {
//     public static void main (String[] args) {
//         int n = 5;

//         for(int i = 1; i <= n; i++) {
//             for(int j=1; j<=n-i; j++) {
//                 System.out.print(" ");
//             }

//             for(int j = 1; j <= i; j++) {
//                 System.out.print(i + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// // ===========================================================================================================
// // ===========================================================================================================

// public class second {
//     public static void main (String[] args) {
//         int n = 5;

//         for(int i = 1; i <= n; i++) {
//             for(int j=1; j<=n-i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j=i; j>=1; j--) {
//                 System.out.print(j);
//             }
//             for (int j=2; j<=i; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// // ===========================================================================================================
// // ===========================================================================================================

// public class second {
//     public static void main (String[] args) {
//         int n = 4;

//         for(int i = 1; i <= n; i++) {
//             for(int j=1; j<=n-i; j++) {
//                 System.out.print("  ");
//             }
//             int sum = 2 * i-1;
//             for(int j=1; j<=sum; j++) {
//                 System.out.print("* ");
//             }       
//             System.out.println();
//         }
//         //=======================================
//         for(int i = n; i >= 1; i--) {
//             for(int j=1; j<=n-i; j++) {
//                 System.out.print("  ");
//             }
//             int sum = 2 * i-1;
//             for(int j=1; j<=sum; j++) {
//                 System.out.print("* ");
//             }        
//             System.out.println();
//         }
//     }
// }

// // ===========================================================================================================
// // ===========================================================================================================

// import java.util.*;

// public class second {
//     public static int calculatesum(int a,int b) {
//         int sum = a + b;
//         return sum;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner (System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int sum  = calculatesum(a , b);
//         System.out.println("Sum of both number = " + sum);

//     }   
// }
// // // ===========================================================================================================
// // // ===========================================================================================================

// import java.util.*;

// public class second {
//     public static int calculatemul(int a,int b) {
//         int mul = a / b;
//         return mul;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner (System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int mul  = calculatemul(a , b);
//         System.out.println("Multipal of both number = " + mul);

//     }   
// }

// // ===========================================================================================================
// // ===========================================================================================================


// // How can i Find Fectorial 
// import java.util.*;

// public class second {
//     public static void printFactorial(int n) {

//     int factorial = 1;
//     for (int i=n; i>=1; i--) {
//             factorial = factorial * i;
//         }
//         System.out.println(factorial);
//         return;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
        
//         printFactorial(n);        
//     }   
// }
//==================================

// import java.util.*;

// public class first{
//     public static void printFunction(int n) {

//         int function = 1;
//         for (int i=n; i>=1; i--) {
//             function = function * i;
//        }
//         System.out.println(function);
//         return;
//     }
//     public static void main (String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         printFunction(n);
//     }
// }

//=======================================
//Revision
// import java.util.*;
// public class second {

//     public static void addnum(int n) {
//         if (n < 0){
//             System.out.println("Please enter a positive number");
//             return;
//         }
//         int allsum = 1;
//         for(int i=n; i>=1; i--) {
//             allsum = allsum * i;
            
//         }
//         System.out.println(allsum);
//         return;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         addnum (n);
//     }
// }
// // ===========================================================================================================
// // ===========================================================================================================

//Enter 3 numbers from the user & make a function to print their average.

// import java.util.*;
// public class second {

//     public static void addnum(int a, int b, int c) {
//         int sum = a + b + c;
//         int result = sum / 3;
//        System.out.println("Average of all Number = " + result);
//        }    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
         
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
       
//         addnum (a,b,c);        
//     }
// }
//====================================================================================================
//====================================================================================================

//Write a function to print the sum of all odd numbers from 1 to n.

// import java.util.*;
// public class second {

//     public static void addnum(int n) {    
        
//         int sum = 0;
//         for(int i=1; i<=n; i++) {
//             if(i%2!=0) {
//                 sum = sum + i;               
//             }
//         }
//         System.out.println("Sum of all odd Number = " +sum);
//         return;     
//     }       
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);         
//         int n = sc.nextInt();
       
//         addnum (n);        
//     }
// }

//====================================================================================================
//====================================================================================================

// Write a function which takes in 2 numbers and returns the greater of those two.

// import java.util.*;
// public class second {

//     public static void addnum(int a, int b) { 
//         if (a > b) {
//             System.out.println(" A is a Greater Number");
//         } else {
//             System.out.println("B is a Greater Number");
//         }       
          
//     }       
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);         
//         int a = sc.nextInt();
//         int b = sc.nextInt();
       
//         addnum (a , b);        
//     }
// }

// //====================================================================================================
// //====================================================================================================

// // Write a function that takes in the radius as input and returns the circumference of a circle.

// // 2 * 3.14 * r ;

// import java.util.*;
// public class Ram {

    
//     public static void addnum(double r) {
//          double PI = 3.14159;
//         double result =  2 * PI * r; 
//         System.out.println("\n\nCircumference of Circle = " +result + "\n\n");
//         return;
//     }      
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in); 
//         System.out.print("Enter the radius of Circle = ");        
//         double r = sc.nextDouble();
        
       
//         addnum (r);        
//     }
// }


// //====================================================================================================
// //====================================================================================================

// // Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

// import java.util.*;
// public class Ram {
//     public static void eligible(int age) {
//         if (age >= 18) {
//             System.out.println("\n\nHe/She is eligible for vote\n\n");
//         } else {
//             System.out.println("\n\nHe/She is Not eligible for vote\n\n");
//         }
//     }
//     public static void main (String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("\n\nEnter Your vote = ");
//         int age = sc.nextInt();

//         eligible(age);
//     }
// }

// //====================================================================================================
// //====================================================================================================

// // Write an infinite loop using do while condition.

// public class Ram {
//     public static void main (String[] args) {
    
//         int i = 0;
//         do {
//             System.out.println("Hello World");
//         }while(true);
//     }
// }

// //====================================================================================================
// //====================================================================================================

// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative -
// and zeros entered.

// import java.util.Scanner;
// public class NumberCounter {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int positiveCount = 0, negativeCount = 0, zeroCount = 0;
//         char choice;

        // do {
        //     System.out.print("Enter a number: ");
        //     int number = scanner.nextInt();

        //     if (number > 0) {
        //         positiveCount++;
        //     } else if (number < 0) {
        //         negativeCount++;
        //     } else {
        //         zeroCount++;
        //     }
        //     System.out.print("Do you want to enter another number? (y/n): ");
        //     choice = scanner.next().charAt(0);

        // } while (choice == 'y' || choice == 'Y');

//         System.out.println("Count of positive numbers: " + positiveCount);
//         System.out.println("Count of negative numbers: " + negativeCount);
//         System.out.println("Count of zeros: " + zeroCount);
        
//     }
// }

// //====================================================================================================
// //====================================================================================================

//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the -
//power of another i.e. xn.

// import java.util.Scanner;

// public class PowerCalculation {
//     // Method to calculate x^n
//     public static int power(int x, int n) {
//         int result = 1;
//         for (int i = 0; i < n; i++) {
//             result *= x;
//         }
//         return result;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Getting input from the user
//         System.out.print("Enter the base number (x): ");
//         int x = scanner.nextInt();

//         System.out.print("Enter the exponent (n): ");
//         int n = scanner.nextInt();

//         // Calculating the power
//         int result = power(x, n);

//         // Displaying the result
//         System.out.println(x + " raised to the power of " + n + " is: " + result);
//     }
// }

// //====================================================================================================
// //====================================================================================================

// //Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the -
// //power of another i.e. xn.

// import java.util.Scanner;
// public class second{
//     public static int power(int x, int n) {
//         int result = 1;
//         for (int i=0; i<n; i++) {
//             result =result * x;
//         }
//         return result;
//     } 
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Your (x) = ");
//         int x = sc.nextInt();

//         System.out.print("Enter Your (n) = ");
//         int n = sc.nextInt();

//         int result = power(x, n);

//         System.out.print(x + "raised to the power of " + n + " is: " + result);
//     }
// }

// //====================================================================================================
// //====================================================================================================

//  Arrays

// import java.util.*;
// public class Arrays {
//     public static void main (String args []) {

//         // int [] marks = new int[3];
//         int marks [] = {97, 92, 94};

//         marks[0] = 97; //physics
//         marks[1] = 92; //chemistery
//         marks[2] = 94; //math

//         // System.out.println(marks[0]);
//         // System.out.println(marks[1]);
//         // System.out.println(marks[2]);

//         for (int i=0; i<3; i++) {
//             System.out.println(marks[i]);
//         }
//     }
// }

// // //====================================================================================================
// // //====================================================================================================

// import java.util.*;

// public class Arrays {
//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int number [] = new int[size];

//         //input
//         for(int i=0; i<size; i++) {
//             number[i] = sc.nextInt();
//         }

//         //output
//         for(int i=0; i<size; i++) {
//             System.out.println(number[i]);
//         }
//     }
// }

// //====================================================================================================
// //====================================================================================================

// // Taking an array as an input and printing its index numbeer.

// // Liniyr Search

// import java.util.*;

// public class Arrays {
//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int number [] = new int[size];

//          //input
//         for(int i=0; i<size; i++) {
//             number[i] = sc.nextInt();
//         }

//         int x = sc.nextInt();

//         for(int i=0; i<number.length; i++) {
//             if(number[i] == x) { 
//             System.out.println("X Found at Index = " + i);
//             }
//         }
//     }
// }

// //====================================================================================================
// //====================================================================================================

// import java.util.*;

// public class Arrays{
//     public static void main(String args []) {
//         Scanner sc = new Scanner (System.in);
//         int size = sc.nextInt();
//         int array1[] = new int [size];

//         //input
//         for(int i=0; i<size; i++) {
//             array1[i] = sc.nextInt();
//         }

//         //output
//         for(int i=0; i<size; i++) {
//             System.out.println("Name " + (i+1) + " is = " + array1[i]);
//         }
//     }
// }

// //====================================================================================================
// //====================================================================================================

// import java.util.*;
// public class second {
//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int number[] = new int [size];

//         for(int i=0; i<size; i++) {
//             number[i] = sc.nextInt();
//         }

//         for(int i=0; i<number.length; i++) {
//             System.out.println("your " + (i+1) + " arrays = " + number[i]);
//         }
//     }
// }

// //====================================================================================================
// //====================================================================================================

// //Two numbers are entered by the user, x and n. Write a function to find the value of 
// //one number raised to the power of another i.e. xn.

// import java.util.Scanner;
// public class second{
//     public static int power(int x,int n) {
//         int result = 1;
//         for(int i=0; i<n; i++) {
//             result = result * x;            
//         }  
//         return result;   
//     }

//     public static void main (String args []) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         int n = sc.nextInt();

//         int result = power(x,n);

//      System.out.println(result);     
//     }
// }

// //====================================================================================================
// //====================================================================================================

//  Write a program to enter the numbers till the user wants and at the end it should display the count of 
// positive, negative and zeros entered. 

// import java.util.*;
// public class second{
//     public static void main (String args []) {
//         Scanner sc = new Scanner(System.in);
//         int positive = 0, negative = 0, zeros = 0;
    
//         char choice;

//     do{
//         int number = sc.nextInt();
//         if(number > 0) {
//             positive++;
//         } else if (number < 0) {
//             negative++;
//         } else { 
//             zeros++;
//             }
//             System.out.print("Do You want another number (y/n) = ");
//             choice = sc.next().charAt(0);

//         } while (choice == 'Y' || choice == 'y');

//         System.out.println("Yout have positive number = " + positive);
//         System.out.println("Yout have negative number = " +negative);
//         System.out.println("Yout have zero number = " +zeros);
//     }
// }

// //====================================================================================================
// //====================================================================================================

// // Find the maximum & minimum number in an array of integers. 

// import java.util.*;
// public class second {
//     public static void main (String args []) {
//         Scanner sc = new Scanner (System.in);
//         int size = sc.nextInt();
//         int arr [] = new int[size];
        
//         for (int i=0; i<size; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int max = arr[0];
//         int min = arr[0];

//         for(int i = 1; i<arr.length; i++) {

//             if(max < arr[i]){ 
//             max = arr[i];
//             }

//             if (min > arr[i]) {
//                 min = arr[i];
//             }            
//         }
//         System.out.println("\n\nThis is our max value = " + max);
//         System.out.println("\nThis is our min value = " + min + "\n\n" );

//     }
// }

// //====================================================================================================
// //==================================================================================================== 

// // Take an array of numbers as input and check if it is an array sorted in ascending order.

// // Eg : { 1, 2, 4, 7 } is sorted in ascending order.
// //        {3, 4, 6, 2} is not sorted in ascending order.

// import java.util.*;
// public class second {
//     public static void main (String args []) {
//         Scanner sc = new Scanner (System.in);
//         int size = sc.nextInt();
//         int arr [] = new int[size];
        
//         for (int i=0; i<size; i++) {
//             arr[i] = sc.nextInt();
//         }

//         boolean isAscending = true;
//        for (int i=1; i<arr.length; i++) {
//             if (arr[i-1] >= arr[i]) {
//                 isAscending = false;
//                 break;
//             }
//        }
//             if(isAscending) {     
//                 System.out.println(" This array is in ascending order");
//             } else {
//                 System.out.println(" This array is Not in ascending order");
//             }
//         }
//      }

// //====================================================================================================
// //==================================================================================================== 

// Find the maximum & minimum number in an array of integers.
// import java.util.*; 
// public class second {
//     public static void main (String args []) {
//         Scanner sc = new Scanner (System.in);
//         int size = sc.nextInt();
//         int array[] = new int [size];

//         for (int i=0; i<size; i++) {
//             array[i] = sc.nextInt();
//         }

//         int max = array[0];
//         int min = array[0];

//         for (int i=1; i<array.length; i++) {
//             if (max < array[i]) {
//                 max = array[i];
//             }
//             if (min > array[i]) {
//                 min = array[i];
//             }

//         } 
//         System.out.println(max);
//         System.out.println(min);
//     }
// }

// //====================================================================================================
// //==================================================================================================== 

//  Take an array of numbers as input and check if it is an array sorted in ascending order.
//  Eg : { 1, 2, 4, 7 } is sorted in ascending order.
//       {3, 4, 6, 2} is not sorted in ascending order.

// import java.util.*; 
// public class second {
//     public static void main (String args []) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int arr[] = new int[size];

//         for (int i=0; i<size; i++) {
//             arr[i] = sc.nextInt();
//         }

//         boolean isAscending = true;
//         for ( int i=1; i<arr.length; i++) {
//             if (arr[i-1] >= arr[i]) {
//                 isAscending = false;
//                 break;
//             } 
//         }
//         if(isAscending) {
//             System.out.println("It is in Ascending Order");
//         } else {
//             System.out.println("It is Not in Ascending Order");
//         }
//     }
// }


// //====================================================================================================
// //==================================================================================================== 
// // 2D Arrays

// import java.util.*;
// public class TwoDArray {
//     public static void main (String arg[]){
//         Scanner sc = new Scanner (System.in);
//         System.out.print("\n\nEnter rows number = ");
//         int rows = sc.nextInt();
//         System.out.print("\nEnter colums number = ");
//         int cols = sc.nextInt();

//         int array[][] = new int [rows][cols];

//         // Input
//         //rows
//         for(int i=0; i<rows; i++) {
//             //colums
//             for(int j=0; j<cols; j++) {
//                 array[i][j]  = sc.nextInt();
//             }
//         }

//           //To print transpose
//         for (int j=0; j<cols; j++) {
//             for (int i=0; i<rows; i++){ 
//             System.out.print(array[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// //====================================================================================================
// //==================================================================================================== 
// 2D Arrays

// import java.util.*;
// public class TwoDArray{
//     public static void main (String args []) {
//         Scanner sc = new Scanner (System.in);
//         int rows = sc.nextInt();
//         int cols = sc.nextInt();

//         int array[][] = new int [rows] [cols];

//         for(int i=0; i<rows; i++) {
//             for(int j=0; j<cols; j++) {
//                 array[i][j] = sc.nextInt();
//             }
//             System.out.println("Enter next row : ");
//         }


//         System.out.println("If you want find any mumber you can type hear : ");
//         int x = sc.nextInt();

//         for (int i=0; i<rows; i++) {
//             for (int j=0; j<cols; j++) {
//                 if (array[i][j] == x) {
//                     System.out.println("This is the index of x = " + i + "," + j);
//                 }
//             }
//         }
//     }
//}

// //====================================================================================================
// //==================================================================================================== 

// public class array  {
//     public static void main (String args []) {
//        int n = 15, firstNum = 0, secondNum = 1;
//        int nextNum;

//        for (int i=1; i<=n; i++) {
//         System.out.print(firstNum + ", ");
//         nextNum = firstNum + secondNum;
//         firstNum = secondNum;
//         secondNum = nextNum;
//        }
//     }
// }

// //====================================================================================================
// //==================================================================================================== 

// // =====  String  =====

// import java.util.*;
// public class Strings {
//     public static void main (String args []) {
//      Scanner sc = new Scanner (System.in);
//      String name = sc.nextLine();

//      System.out.println("\n Your name is = " + name + "\n\n");
//     }
// }
// //==================================================================================================== 

// import java.util.*;
// public class Strings {
//     public static void main (String args []) {
//      Scanner sc = new Scanner (System.in);

//      //Concatenation
//      String firstName = "Saurabh";
//      String lastName = "Kumar"; 
//      String FullName = firstName + " " + lastName ;

//      System.out.println(FullName.length());

//      //charAt
//      for ( int i=0; i<FullName.length(); i++) {
//         System.out.println(FullName.charAt(i));
//         }
//     }
// }

// //====================================================================================================
// //==================================================================================================== 

// public class Strings {
//     public static void main (String args []) {
//      Scanner sc = new Scanner (System.in);

//      //compareTo
//      String num1 = "Tony";
//      String num2 = "Tony";

//      //1 s1 > s2  : +ve value
//      //2 s1 == s2 : 0 value
//      //3 s1 < s2  : -ve value


//         // if (num1.compareTo(num2) == 0) {
//         //     System.out.println("String are equal");
//         // } else {
//         //     System.out.println("String are not  equal");

//         // }

//         // if (num1 == num2) {
//         //     System.out.println("String are equal");
//         // } else {
//         //     System.out.println("String are not  equal");

//         // }
    

//         if (new String("Tony") == new String("Tony")) {
//             System.out.println("String are equal");
//         } else {
//             System.out.println("String are not equal");
//         }
//     }
// }

// //====================================================================================================
// //==================================================================================================== 

// import java.util.*;
// public class Strings {
//     public static void main (String args []) {
//      Scanner sc = new Scanner (System.in);

//      // Parsing
//      String sentence = "Saurabhkumar\n\n";
//      String name = sentence.substring(7,sentence.length());
//      System.out.println(name);

//      // String are Inmutable

//     }
// }
// //====================================================================================================
// //==================================================================================================== 

// // =====  String-Builder  =====

// public class Strings {
//     public static void main (String args []) {
//         StringBuilder sb = new StringBuilder("Tony");

//         System.out.println(sb);

//         // char at index 0
//         System.out.println(sb.charAt(0));

//         // set char at index 0
//         sb.setCharAt(0,'P');
//         System.out.println(sb);

//         sb.insert(3,"n");
//         System.out.println(sb);

//         //Delete the extra n
//         sb.delete(2,4);
//         System.out.println(sb);
//     }
// }

// //==================================================================================================== 

// // =====  String-Builder  =====

// public class Strings {
//     public static void main (String args []) {
//         //Appends the characters 'o', 'n', and 'y' to the StringBuilder object.
//         StringBuilder sb = new StringBuilder("T");
//         sb.append("o");
//         sb.append("n");
//         sb.append("y");
        

//         System.out.println(sb);

//         System.out.println(sb.length());

//     }
// }

// //====================================================================================================
// //==================================================================================================== 

// // Question ---

// public class Strings {
//     public static void main (String args []) {

//         // Takes a string as input, reverses it, and prints the reversed string.
//         StringBuilder sb = new StringBuilder("\n Hello Saurabh \n");

//         for (int i=0; i<sb.length()/2; i++) {
//             int front = i;
//             int back = sb.length() - 1 - i; //5 - 1 - i

//             char frontChar = sb.charAt(front);
//             char backChar = sb.charAt(back);

//             sb.setCharAt(front, backChar);
//             sb.setCharAt(back, frontChar);
//         }

//         System.out.println(sb);
//     }
// }

// //====================================================================================================
// //==================================================================================================== 

// Homework Problems
// Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

// import java.util.*;
// public class Strings {
//     public static void main(String args []) {
//         Scanner sc = new Scanner (System.in);
//         int size = sc.nextInt();
//         String array[] = new String [size];
//         int totlength = 0;
        
//         for(int i=0; i<size; i++) {
//             array[i] = sc.next();
//             totlength += array[i].length();

//         }
//         System.out.println("Total length of all strings : " + totlength);

    //===================================

//         for(int i = 0; i < size; i++) {
//             System.out.println("Length of string : " + array[i] + ": "+ (i+1) + ": "+ array[i].length());
//         }
//     }
// }

// //====================================================================================================
// //==================================================================================================== 

// import java.util.*;

// public class Strings {
//    public static void main(String args[]) {
//      Scanner sc = new Scanner (System.in);
//      String str = sc.next();
//      String result = "";


//      for(int i=0; i<str.length(); i++) {
//        if(str.charAt(i) == 'e') {
//          result += 'i';
//        } else {
//          result += str.charAt(i);
//        }
//      }

//      System.out.println(result);
//    }
// }
// //==========================
// //==========================

// Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’.

// Example : 
// original = “eabcdef’ ; result = “iabcdif”
// Original = “xyz” ; result = “xyz”

// import java.util.*;
// public class Strings {
//     public static void main(String args []) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.next();
//         String result = "";

//         for(int i=0; i<str.length(); i++) {
//             if (str.charAt(i) == 'e') {
//                 result += 'i';
//             } else {
//                 result += str.charAt(i);
//             }            
//         }
//         System.out.println(result);
//     }
// }

// //====================================================================================================
// //==================================================================================================== 

// Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
// Example : 
// email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
// email = “helloWorld123@gmail.com”; username = “helloWorld123”

// import java.util.*;
// public class Strings {
//     public static void main(String args []) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("\n\nEnter your email ID = ");
//         String email = sc.next();

//         String id = "";

//         for (int i=0; i<email.length(); i++) {
//             if (email.charAt(i) == '@') {
//                 break;
//             } else {
//                 id = id + email.charAt(i);
//             }
//         }
//         System.out.println("\n\nYour user ID is for this account = " + id);
//     }
// }

// practic again ===================

// import java.util.*;
// public class Strings {
//     public static void main (String args []) {
//         Scanner sc = new Scanner(System.in);
//         String email = sc.nextLine();

//         String ID = "";

//         for (int i=0; i<email.length(); i++) {
//             if (email.charAt(i) == '@') {
//                 break;
//             } else {
//                 ID += email.charAt(i);
//             }
//         }
//         System.out.println(ID);
//     }
// }

// //====================================================================================================
// //==================================================================================================== 
// // Revision

// public class Strings {
//     public static void main(String args []) {
//         // Scanner sc = new Scanner (System.in);
//         StringBuilder name = new StringBuilder("saurabh");

//         //For adding new string in same String
//         name.append(" kumar");

//         //For count length
//         System.out.println(name.length());

//         //For call half length of String
//         System.out.print(name.substring(7,13));

//         //for call by charAt with tha help of index
//         for (int i=0; i<name.length(); i++){        
//         System.out.println (name.charAt(i));
//         }
        
//         //For set any new string by setCharAt medted
//         name.setCharAt(8, 'p');
//         System.out.println(name);

//         //For insert any new string
//         name.insert(13," singh g");
//         System.out.println(name);
//         System.out.println(name.length());

//         //For Delete any string
//         name.delete(14,name.length());
//         System.out.println(name);
//     }
// }

// //====================================================================================================
// //==================================================================================================== 

// public class Bit {
//     public static void main (String args []) {
//         int n = 5;
//         int pos = 3;
//         int bitMask = 1<<pos;

//         if ((bitMask & n) == 0) {
//             System.out.println("Bit was zero");
//         } else {
//             System.out.println("Bit was one");
//         }
//     }
// }

// //====================================================================================================
// //==================================================================================================== 

// public class Bit {
//     public static void main (String args []) {
//         int n = 5;
//         int pos = 2;
//         int bitMask = 1<<pos;
//         int notbitMask = ~(bitMask);

//         int newNumber = notbitMask & n;
//             System.out.println("\n" + newNumber + "\n");
       
//     }
// }

// //====================================================================================================
// //==================================================================================================== 

// import java.util.*;
// public class Bit {
//     public static void main (String args []) {
//         Scanner sc = new Scanner (System.in);
//         int oper = sc.nextInt();
//         // oper=1 -> set; oper=0 -> clear

//         int n = 5;
//         int pos = 1;

//         int bitMask = 1<<pos;

//         if(oper == 1) {
//             int newNumber = bitMask | n;
//             System.out.println(newNumber);

//         } else {
//             int newbitNumber = ~(bitMask);
//             int newNumber = newbitNumber & n;
//             System.out.println(newNumber);

//         }

//     }
// }

// //====================================================================================================
// //==================================================================================================== 

// import java.util.*;
// public class Bit {
//     public static void main (String args []) {
//         Scanner sc = new Scanner (System.in);
//         int oper = sc.nextInt();
//         int n = 5;
//         int pos = 1;
        
//         int bitMark = 1<<pos;
//         if(oper == 1) {
//             int newNumber = bitMark | n;
//             System.out.println(newNumber);
//         } else {
//             int newbitNumber = ~(bitMark);
//             int newNumber = newbitNumber & n;
//             System.out.println(newNumber);
//         }
//     }
// }

// //====================================================================================================
// //==================================================================================================== 

//Write a program to find if a number is a power of 2 or not.

// import java.util.*;
// public class Bit {
//     public static void main (String args []) {
//         Scanner sc = new Scanner (System.in);
//         System.out.print("\nEnter a number = ");
//         int num = sc.nextInt();

//         if (num % 2 == 0) {
//             System.out.println(num + ",  Yes, this number is power of two");
//         } else {
//             System.out.println(num + ",  No, It is not power of two");
//         }
//     }
// }

// //====================================================================================================
// //==================================================================================================== 

// // //Write a program to toggle a bit a position = “pos” in a number “n”.

// public class Bit  {
//     public static void main(String[] args) {
//         int n = 7; // number
//         int pos = 2; // position
//         int bitmask = 1<<pos;

//         int newNumber = bitmask ^ n;
//         System.out.println(newNumber);

//     }
// }

// //====================================================================================================
// //==================================================================================================== 

// Write a program to count the number of 1’s in a binary representation of the number.

// public class Bit  {
//     public static void main(String[] args) {
//         int n = 7; // number
//         String binaryNumber = Integer.toBinaryString(n);
//         int result = 0;
       
//         while(n > 0){
//             result = result + 1;

//         }

//         System.out.println(binaryNumber);
//     }
// }

// I am unable to solve this question  Sorry!.

// //====================================================================================================
// //==================================================================================================== 

// Practic Question 
//Take an array as input from the user. Search for a given number x and print the index at which it occurs.

// import java.util.*;
// public class Arrays {
//     public static void main(String args []){ 
//         Scanner sc = new Scanner (System.in);
//         int size = sc.nextInt();
//         int arr [] = new int [size];

//         for(int i=0; i<size; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.print("Enter the number number how you want to search = ");
//         int x = sc.nextInt();
//         for(int i=0; i<size; i++) {
//             if(arr[i] == x) {
//                 System.out.println("\nThis is the index of x = " + i);
//             }
//         }
//     }
// }

// //====================================================================================================
// //==================================================================================================== 

// // Shorting 

// public class Shorting {
//     public static void printArrays(int arr[]) {
//         for (int i=0; i<arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
//     public static void main(String args []) {
//         int arr[] = {7,8,3,1,2};

//         // //Bubble sort
//         // for (int i=0; i<arr.length-1; i++) {
//         //     for (int j=0; j<arr.length-i-1; j++) {
//         //         if (arr[j] > arr[j+1]) {
//         //             //Swap
//         //             int temp = arr[j];
//         //             arr[j] = arr[j+1];
//         //             arr[j+1] = temp;
//         //         }
//         //     }
//         // }
//         // Selection sort :-


//         printArrays(arr);
//     }
// }


// //====================================================================================================
// //==================================================================================================== 

// // Shorting 
//Descending
// public class Sorting{
//     public static void printSorted( int arr[]) {
//         for(int i=0; i<arr.length; i++) {
//             System.out.print(arr[i]+ " ");
//         }
//         System.out.println();
//     }
//     public static void main (String args[]){
//         int arr[] = {7, 8, 3, 1, 2};

//         for ( int i=0; i<arr.length-1; i++) {
//             for( int j=0; j<arr.length-i-1; j++) {

//                 if (arr[j] < arr[j+1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//         printSorted( arr);
//     }
// }

// //====================================================================================================
// //==================================================================================================== 

// class Sorting {
//    public static void printArray(int arr[]) {
//        for(int i=0; i<arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//    public static void main(String args[]) {
//        int arr[] = {7, 8, 1, 3, 2};

//        //selection sort
//        for(int i=0; i<arr.length-1; i++) {
        
//            for(int j=0+i; j<arr.length-1; j++) {
//             if(arr[j] < arr[j+1]) {

//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//         printArray(arr);  
//     }
// }

// //====================================================================================================
// //==================================================================================================== 

// public class Insertion {
//     public static void printInsertion(int arr[]) {
//         for (int i=0; i<arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
//     public static void main (String args []) {
//         int arr[] = {7,8,3,1,2};

//         for(int i=1; i<arr.length; i++) {
//           int current = arr[i];
//           int j = i-1;
//           while(j >= 0 && current < arr[j]) {
//             arr[j+1] = arr[j];
//             j--;
//           }
//           //placement 
//           arr[j+1] = current;
//         }
//         printInsertion(arr);
//     }
// }

// //====================================================================================================
// //==================================================================================================== 

// import java.util.Scanner;
// public class Recursion {
//     public static void printNumber(int n) {
//         if(n == 0) {
//             return;
//         }    
//             System.out.print(n);
//             printNumber(n-1);
        
//     }
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();
//         printNumber(n);
//     }
// }

// //====================================================================================================
// //==================================================================================================== 

//Recursion

// import java.util.Scanner;
// public class Recursion {
//     public static void printNumber(int n) {
//         if(n == 6) {
//             return;
//         }   
         
//             System.out.println(n);
//             printNumber(n+1);
        
//     }
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();
//         printNumber(n);
//     }
// }

// //====================================================================================================
// //==================================================================================================== 

//Recursion
// Find sum of n naturial number;

// public class Recursion {
//     public static void printsum(int i, int n, int sum) {
        
//         if(i == n) {
//             sum += i;
//             System.out.println(sum);
//             return;
//         }           
//           sum += i;
//           printsum(i+1, n , sum);                 
//     }
//     public static void main (String args[]) {
        
//         printsum(1, 5, 0);
//     }
// }

// //====================================================================================================
// //==================================================================================================== 

//Recursion
// Find Factorial of n naturial number;

// public class Recursion {
//     public static void printFactorial(int n,int Fac) {
//         if(n == 1){
//             System.out.println(Fac);
//             return;
//         }
        
//         Fac *= n;
//         printFactorial(n-1, Fac);
//     }
//     public static void main (String args[]) {

//         printFactorial(5,1);
//     }
// }

//================

// public class Recursion1 {
//     public static int calcfactorial(int n) {
//         if(n == 1 || n == 0) {
//             return 1;
//         }

//         int fact_nm1 = calcfactorial(n-1);
//         int fact_n = n * fact_nm1;
//         return fact_n;
//     }

//     public static void main(String args[]) {
//         int n = 5;
//         int ans = calcfactorial(n);
//         System.out.println(ans);
//     }
// }


// //====================================================================================================
// //==================================================================================================== 

// import java.util.Scanner;
// public class FibonacciSeries {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the number of terms: ");
//         int n = scanner.nextInt();

//         int first = 0, second = 1, next;

//         for (int i = 1; i <= n; ++i) {
//             if (i == 1) {
//                 System.out.print(first + " ");
//                 continue;
//             }
//             if (i == 2) {
//                 System.out.print(second + " ");
//                 continue; 
//             }
//             // Calculate the next term in the series
//             next = first + second;
//             // Update the values of 'first' and 'second'
//             first = second;
//             second = next;
           
//             System.out.print(next + " ");
//         }
//     }
// }

// //====================================================================================================
// //==================================================================================================== 

// Print Normal Fibonacci-Series :-

// import java.util.Scanner;
// public class FibonacciSeries{
//     public static void main (String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("\nEnter the number of terms : ");
//         int n = sc.nextInt();

//         int First = 0;
//         int Second = 1;
//         int Next = 0;

//         for(int i=1; i<=n; i++) {

//             System.out.print(First + ", ");
//             Next = First + Second;
//             First = Second;
//             Second = Next;
           
//         }
//     }
// }

// //====================================================================================================
// //==================================================================================================== 

// Print Fibonacci-Series  in Recursion :- 

// public class Recursion {
//     public static void printFibonacciSeries(int a, int b, int n) {
//         if(n == 0) {
//             return;
//         }

//         int c = a + b; 
//         System.out.print(c + " ");
//         printFibonacciSeries(b, c, n-1);
//     }
//     public static void main (String args[]) {
//         int a = 0, b = 1;
//         System.out.print(a + " ");
//         System.out.print(b + " ");
//         int n = 10;

//         printFibonacciSeries(a, b, n-2);

//     }
// }

// //====================================================================================================
// //==================================================================================================== 

// // Print x^n (stack height = n)

// public class Recursion {
//     public static int printPower(int x, int n) {
//         if(n == 0) {           
//             return 1;
//         }
        
        
//         return x * printPower(x, n-1);
//     }

//     public static void main(String args[]) {
//         int x = 5;
//         int n = 3;

//         int result = printPower(x, n); 
//         System.out.println(result);    
//     }
// }

// //====================================================================================================
// //==================================================================================================== 

// // Print x^n (stack height = n)

// public class Recursion {
//     public static int printPower(int x, int n) {
//         if(n == 0) {           
//             return 1;
//         }
        
//         if(n % 2 == 0) { // if n is Even
//         return printPower(x, n/2) * printPower(x, n/2);
//         } else { // if n is Odd
//             return printPower(x, n/2) * printPower(x, n/2) * x;
//         }
//     }

//     public static void main(String args[]) {
//         int x = 5;
//         int n = 3;

//         int result = printPower(x, n); 
//         System.out.println(result);    
//     }
// }

// //====================================================================================================
// //==================================================================================================== 

// This is little complex :-   ( Please read carfully )

// public class Recursion {
//     public static void towerOfHanoi(int n, String src, String helper, String dest) {
//         if (n == 1) {
//             System.out.println("transfer disk " + n + " from " + src + " to " + dest);
//             return;
//         }
//         towerOfHanoi(n-1, src, dest, helper);
//         System.out.println("transfer disk " + n + " from " + src + " to " + dest);
//         towerOfHanoi(n-1, helper, src, dest);
//     }
//     public static void main (String args[]) {
//         int n = 3;

//         towerOfHanoi(n, "S", "H", "D");
//     }
// }

// //====================================================================================================
// //==================================================================================================== 

// public class First {
//     public static void main (String args[]) {
//         String src = "abcd";

//         for(int i=src.length()-1; i>=0; i--) {
//             System.out.print(src.charAt(i));
//         }
//     }
// }

// //==================================================================================================== 

// public class Recursion {
//      // Recursive method to print the string in reverse order.
//    public static void printrev(String src, int idx) {
//     if(idx == 0) {
//         System.out.print(src.charAt(idx));
//         return;
//     }
//     System.out.print(src.charAt(idx));
//     printrev(src, idx-1);
//     }
//     public static void main (String args[]) {
//         String src = "abcd";
//         printrev(src, src.length()-1);
//     }
// }

// //====================================================================================================
// //==================================================================================================== 


// public class Recursion {
//     public static int first = -1;
//     public static int last = -1;

//    public static void findOccuration (String str, int idx, char element) {
//     if (idx == str.length()) {
//         System.out.println(first);
//         System.out.println(last);
//         return;
//     }
//         char currChar = str.charAt(idx);
//         if(currChar == element) {
//             if(first == -1) {
//                 first = idx;
//             } else {
//                 last = idx;
//             }
//         }

//         findOccuration(str, idx+1, element);
//    }
//    public static void main (String args[]) {
//        String src = "abaacdaefaah";
//        findOccuration(src, 0, 'a');
//    }
// }



// //====================================================================================================
// //==================================================================================================== 
// //====================================================================================================
// //==================================================================================================== 
// //====================================================================================================
// //==================================================================================================== 

// OOPS : - 

class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Write Sonthing");
    }
    public void printColor() {
        System.out.println(this.color);
        System.out.println(type);
    }
}

public class OOPS {
    public static void main (String args []) {
        Pen mypen = new Pen();
        mypen.color = "yellow";
        mypen.type = "Ballpoint";        

        mypen.printColor();
    }
}

// //==================================================================================================== 


// class Student {
//     String name;
//     int age;

//     public void printInfo() {
//         System.out.println(this.name);
//         System.out.println(this.age);

//     }
//     Student(String name, int age) {
//         this.name = name;
//         this.age = age;

        
//     }
// }
// public class OOPS {
//     public static void main (String args []) {

//         Student s1 = new Student("raju" , 34);
//         // s1.name = "Ramu";
//         // s1.age = 28;

//         s1.printInfo();
//     }
// }




















