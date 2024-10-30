// // Find the Interest of 10 Years :-
// // 1st Year Interest = (Principal * Rate * Time) / 100


// public class Revise {
//     public static void main(String args []) {
//         int Amount = 10000;
//         // Rate of Interest = 10% ;
//         int Interest = Amount / 10;
//         int year = 5;
        
//         // System.out.println("Interest for 10 years is " + interest*year);
//         int Total_Interest = 0;
        
//         for(int i=1; i<=year; i++) {
//             Total_Interest += Interest;            
//         }

//         System.out.println("\n\nTotal Amount Taken By client = " + Amount);
//         System.out.println("Rate of Interest by Bank = " + Interest);
//         System.out.println("Interest of " + year + " years is = " + Total_Interest);

//         int Total_amount = Total_Interest + Amount;
//         System.out.println("Total Amount after " + year + " years is = " + Total_amount);
//     }
// }

// ======================================================================================================
// ======================================================================================================

// // Find max of 3 number :-

// import java.util.Scanner;
// public class Revise {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();


//         if(a>=b && a>=c) {
//             System.out.println(" A is greater");
//         } else if(b>=c) {
//             System.out.println("B is greater");
//         } else {
//             System.out.println("C is greater");
//         }
//     }
// }

// ======================================================================================================
// ======================================================================================================

// // Find if number is Prime :-

// import java.util.Scanner;

// public class Revise {
//     public static void main (String args []) {
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();

//         boolean isPrime = true;

//         if(n <= 1) {
//             System.out.println(n + " Is not a prime number");
//             isPrime = false;

//         } else {
            
//             for(int i = 2; i <= n / 2; i++) {

//                 if(n % i == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }
//         }
       
//         if(isPrime) {
//             System.out.println(n + " Is a prime number");
//         } else {
//             System.out.println(n + " Is not a prime number");
//         }
//     }
// }

// ======================================================================================================
// ======================================================================================================

// // Find the area of circle :-

// import java.util.Scanner;

// public class Revise {
//     public static void main (String args []) {
//         Scanner sc = new Scanner (System.in);
//         int r = sc.nextInt();

//         double area_of_circle = 3.14 * r * r;
        
//         System.out.print(area_of_circle);
//     }
// }

// ======================================================================================================
// ======================================================================================================

// // Find the Even number bitween 9 to 100 :-

// public class Revise { 
// public static void main (String args[]) {
//         for(int i = 9; i <= 100; i++) {
//             if(i % 2 == 0) {

//                 System.out.println(i + " This is a Even Number ");
//              }
//             else {
//                 System.out.println(i + "This is not a Even Number ");
//             }
//         }
//     }
// }

// ======================================================================================================
// ======================================================================================================

// Calculating the Average from 5 exams scores.

// import java.util.Scanner;
// public class Revise { 
// public static void main (String args[]) {
//     Scanner sc = new Scanner (System.in);
//             int n = sc.nextInt();

//             int sum = 0;
//             System.out.println("Enter all score : ");
//             for(int i = 1; i <= n; i++) {
//                 int score = sc.nextInt();
//                 sum += score;
//             }

//             int Avarage = sum / n;

//             System.out.println("Avarage of " + n + " Number = " + Avarage);
//     }
// }

// ======================================================================================================
// ======================================================================================================

// How to find prime number :-

import java.util.Scanner;
public  class Revise { 
public static void main (String args[]) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    boolean isPrime = true;
    if(n <= 1) {
        System.out.println(n + " Is not a prime Number");
        isPrime = false;
    } else {
        for(int i=2; i<= n/2 ; i++) {
            if(n % i == 0) {
                //System.out.println(n + " Is not a prime Number");
                isPrime = false;
                break;
                }
            }
        }

        if(isPrime) {
            System.out.println(n + " Is a prime Number");
        } else {
            System.out.println(n + " Is not a prime Number");
        }
    }
}

// ======================================================================================================
// ======================================================================================================

























