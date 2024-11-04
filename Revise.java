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

// // How to find prime number :-

// import java.util.Scanner;
// public  class Revise { 
// public static void main (String args[]) {

//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();

//     boolean isPrime = true;
//     if(n <= 1) {
//         System.out.println(n + " Is not a prime Number");
//         isPrime = false;
//     } else {
//         for(int i=2; i<= n/2 ; i++) {
//             if(n % i == 0) {
//                 //System.out.println(n + " Is not a prime Number");
//                 isPrime = false;
//                 break;
//                 }
//             }
//         }

//         if(isPrime) {
//             System.out.println(n + " Is a prime Number");
//         } else {
//             System.out.println(n + " Is not a prime Number");
//         }
//     }
// }

// ======================================================================================================
// ======================================================================================================

// public class Revise {
//     public static void main (String args []) {
//         // System.out.println("* * * *");
//         // System.out.println("* * * ");
//         // System.out.println("* * ");
//         // System.out.println("* ");


//        for(int i=0; i<4; i++) {
//         for(int j=1; j<=4-i; j++) {
//             System.out.print("*");
//         }
//         System.out.println();
//        }

//     }
// }

// ======================================================================================================
// ======================================================================================================

// public class Revise {
//     public static void main (String args []) {
//       int a = 3;
//       int b = 34;
//       System.out.println(a);

//       String name = "Tony Stark";
//       System.out.println(name);

//       a = b;
//       System.out.println(a);

//     }
// }

// ======================================================================================================
// ======================================================================================================


// public class Revise {
//     public static void main (String args []) {
//     byte b = 8;
//     System.out.println(b);
//     char ch = 'a';
//     System.out.println(ch);
//     boolean var = false;
//     float price = 10.5;
//     int number = 25;
//     //long
//     //double
//     short n = 324;

//     }
// }


// ======================================================================================================
// ======================================================================================================

/* 

// Code for add two number :- 
public class Revise {
    public static void main (String args []) {
        int a = 10;
        int b = 5;

        int sum = a + b;
        System.out.println(sum);

    }
}
    */

// ======================================================================================================
// ======================================================================================================

// import java.util.*;
// public class Revise {
//     public static void main (String args []) {
//         Scanner sc = new Scanner (System.in);

//         // String input = sc.nextLine();
//         // System.out.println(input);

//         // float price = sc.nextFloat();
//         // System.out.println(price);


//         // int a = sc.nextInt();
//         // int b = sc.nextInt();

//         // int sum = a + b;
//         // int multiply = a * b;
//         // System.out.println("Add of two number " + sum);
//         // System.out.println("multiply of two number " + multiply);


//         // float radius = sc.nextInt();
//         // float area = 3.14f * radius * radius;
//         // System.out.println(area);

//     }
// }

// ======================================================================================================
// ======================================================================================================

// import java.util.*;
// public class Revise {
//     public static void main (String args []) {
//         Scanner sc = new Scanner (System.in);
//         // int a = 10;
//         // long b = a;

//         // long a = 10;
//         // int b = a;
//         // System.err.println(b);

//         float number = sc.nextInt();
//         System.out.println(number);

//     }
// }

// // ======================================================================================================
// // ======================================================================================================

// import java.util.*;
// public class Revise {
//     public static void main (String args []) {
//         Scanner sc = new Scanner (System.in);
//        float a = 99.999f;
//        int b = (int)a;

//        System.out.println(b);

//     }
// }

// ======================================================================================================
// ======================================================================================================

// public class Revise {
//     public static void main (String args []) {
//        char ch = 'a';
//        char ch2 = 'b';
//         char ch3 = 'd';

//        int number = ch;
//        int number2 = ch2;
//        int number3 = ch3;
//        System.out.println(number);
//        System.out.println(number2);
//        System.out.println(number3);

//     }
// }

// ======================================================================================================
// ======================================================================================================

// public class Revise {
//     public static void main (String args []) {
//        char a = 'a';
//        char b = 'b';
//       char c = a - b;
//     //    System.out.println((int)(b));
//     //    System.out.println((int)(a));
//     System.out.println(a);
//        System.out.println(b-a);

//     }
// }


// // ======================================================================================================
// // ======================================================================================================

// public class Revise {
//     public static void main (String args []) {
//      short a = 5;
//      byte b = 25;
//      char c = 'c';
//      byte bt = (byte)(a + b + c);
//         System.out.println(bt);
//     }
// }


// ======================================================================================================
// ======================================================================================================

// public class Revise {
//     public static void main (String args []) {
//     int a = 10;
//     float b = 20.25f;
//     long c = 25;
//     double d = 30;
//     double ans = a + b + c + d;
//     System.out.println(ans);

//     }
// }


// ======================================================================================================
// ======================================================================================================

// public class Revise {
//     public static void main (String args []) {
//    byte b = 5 ;
//    byte a = (byte) (b * 2);
//    System.out.println(a);

//     }
// }

// ======================================================================================================
// ======================================================================================================
// ======================================================================================================
// ======================================================================================================

// import java.util.*;

// public class Revise {
//     public static void main (String args []) {
//     Scanner sc = new Scanner (System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     int c = sc.nextInt();

//     int sum = a + b + c;
//     int avg = sum / 3 ;
//     System.out.println(avg);
        
//     }
// }

// // ======================================================================================================
// // ======================================================================================================
// // :Inaprogram,input3numbers:A,BandC.Youhavetooutputtheaverageofthese 3 numbers
// import java.util.*;

// public class Revise {
//     public static void main (String args []) {
//     Scanner sc = new Scanner (System.in);
//     int n = sc.nextInt();
   
//         int sum = 0;
//         for(int i=1; i<=n; i++) {
//             int num = sc.nextInt();
//             sum = sum + num;
//         }
//          int avg = sum / n;       
        
//          System.out.println(avg);
//     }
// }

// // ======================================================================================================
// // ======================================================================================================
// // 2:In a program,input the side of asquare. You have to out put the area of the square
// import java.util.*;
// public class Revise {
//     public static void main (String args []) {
//    Scanner sc = new Scanner (System.in);
//         int side = sc.nextInt();
//         int area = side * side;

//         System.out.println(area);

//     }
// }

// // ======================================================================================================
// // ======================================================================================================
// // Importent Question :-

// // 2: In a program,input the side of asquare. You have to out put the area of the square
// import java.util.*;
// public class Revise {
//     public static void main (String args []) {
//    Scanner sc = new Scanner (System.in);
//       float pencil = sc.nextFloat();
//       float pen = sc.nextFloat();
//       float eraser = sc.nextFloat();

//       double total_bill = pencil + pen + eraser;
//       System.out.println(" Total = " + total_bill);

//       double avg = total_bill / 3;
//       System.out.println("Avg = " + avg);

//       //  Adding 18% gst tax to the items in the bill
//         double GST = total_bill * 18 / 100;
//         System.out.println("Total GST = " + GST);

//         double Final_amount = total_bill + GST;
//         System.out.println("Total Amount + GST = " + Final_amount);
//     }
// }

// // ======================================================================================================
// // ======================================================================================================
// What will be the type of result in thefollowing Java code?

// public class Revise {
//     public static void main (String args[]) {
//         byte b = 4;
//         char c = 'a';
//         short s = 512;
//         int i = 1000;
//         float f = 3.14f;
//         double d = 99.9954;

//         double result = (f * b) + (i % c) - (d * s);
//         System.out.println(result);
//     }
// }

// // ======================================================================================================
// // ======================================================================================================

// public class Revise {
//     public static void main (String args[]) {
//         int int$ 24;
//         System.out.println($);
//     }
// }

// // ======================================================================================================
// // ======================================================================================================
// // ======================================================================================================
// // ======================================================================================================

// public class Revise {
//     public static void main(String[] args) {
//         int x = 200, y = 50, z = 100;
//         if(x > y && y > z){System.out.println("Hello");
//     }
//     if(z > y && z < x){System.out.println("Java")
//     ;
// }if((y+200) < x && (y+150) < z){
//     System.out.println("Hello Java");
// }
// }
// }

// // ======================================================================================================
// // ======================================================================================================

// public class Revise {
//     public static void main(String[] args){
//         float x, y, z;
//         x = y = z = 2;
//         x += y;y -= z;
//         z /= (x + y);
//         System.out.println(x + " " + y + " " + z);
//     }
// }

// // ======================================================================================================
// // ======================================================================================================


// public class Revise {
//     public static void main(String[] args){
//         int x = 10, y = 5;
//         int exp1 = (y * (x / y + x / y));
//         int exp2 = (y * x / y + y * x / y);
//         System.out.println(exp1);
//         System.out.println(exp2);
//     }
// }

// ======================================================================================================
// ======================================================================================================

// public class Revise {
//     public static void main(String[] args){
//         int x = 9, y = 12;int a = 2, b = 4, c = 6;
//         int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
//         System.out.println(exp);
//     }
// }

// ======================================================================================================
// ======================================================================================================

// Find all Indvisual number :-

// public class Revise { 
//     public static void printDigit (int n) {
//        int sum = 0;
//         while(n != 0) {
//             int digit = n % 10;
//             System.out.println(digit + " ");
//            sum += digit;
//             n = n / 10;
//         }
//        System.out.println(sum);
//     }
// public static void main (String args[]) {
//     int n = 876;

//     printDigit(n);
//     }
// }

// ======================================================================================================
// ======================================================================================================

// // Find Armstrong num :-
// public class Revise {
//     public static boolean isArmstrong(int n) {
//         int copyN = n;
//         int sumofCube = 0;
        
//         while(n != 0) {
//             int digit = n % 10;
//             System.out.println(digit);
//             sumofCube += digit * digit * digit;

//             n = n / 10;
//         }
//        return sumofCube == copyN;
//     }
//     public static void main (String args[]) {
//         int n = 111;

//         if(isArmstrong(n)) {
//             System.out.println("Yes it is Armstrong num");
//         } else {
//             System.out.println("No it is not Armstrong num");
//         }
//     }
// }

// ======================================================================================================
// ======================================================================================================

// // Find the GCD :-
// public class Revise {

//     // public static int GCD (int a, int b) {
//     //     while(a > 0 && b > 0) {
//     //         if(a > b) {
//     //             a = a % b;
//     //         } else {
//     //             b = b % a;
//     //         }
//     //     }
//     //     return(a == 0) ? b : a;
//     // }

//     // Find GCD by Recursion :-
//     public static int gcdrecursion (int a , int b) {
//         if(b == 0) return a;

//         return gcdrecursion (b , a % b);
//     }
//     public static void main (String args []) {
//         // System.out.println(GCD(60,10));
//         System.out.println(gcdrecursion(60,200));
//     }
// }
// ======================================================================================================
// Find the CD :- 











// ======================================================================================================
// ======================================================================================================

// Find the LCM :- 

// public class Revise {

//     // Find GCD by Recursion :-
//     public static int gcdrecursion (int a , int b) {
//         if(b == 0) return a;

//         return gcdrecursion (b , a % b);
//     }
//     // Find LCM :- 
//     public static int LCM (int a , int b) {
//         int gcd = gcdrecursion(a , b);
//         return (a * b) / gcd;
//     }
//     public static void main (String args []) {
//         // System.out.println(GCD(60,10));
//         System.out.println(LCM(60,200));
//     }
// }

// ======================================================================================================
// ======================================================================================================

// Reverse a number :-
// public class Revise {
//     public static void main (String args []) {
//         int reverse(int n) {
//             int revNum = 0;

//             while(n != 0) {
//                 int dig = n % 10;

//                 if(revNum > INT_MAX || revNum > INT_MIN) {
//                     return 0;
//                 }
                
//                 revNum = revNum * 10 + dig;
//                 n = n / 10; 
//             }

//             System.out.println(revNum);
//         }
//     }
// }  

// ======================================================================================================
// ======================================================================================================

// public class Revise {
//     public static void main (String args[]) {
//         int age = 15;
//         if(age > 18) {
//             System.out.println("He/She is adult : drive , vote");
//         } 
//         if( age > 13 && age < 18) {
//             System.out.println("He/She is teenager : study");
//         }
//         else {
//             System.out.println("He/She is not adult : not drive , not vote");
//         }
//     }
// }

// ======================================================================================================
// ======================================================================================================

// public class Revise {
//     public static void main (String args[]) {

//         int a = 23;
//         int b = 53;
//         if(a >= b) {
//             System.out.println("A is gratter");
//         } 
//         else {
//             System.out.println("B is gratter");
//         }
//     }
// }

// ======================================================================================================
// ======================================================================================================
// import java.util.*;
// public class Revise {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();

//         if(n % 2 == 0) {
//             System.out.println("Even Number");
//         } 
//         else {
//             System.out.println("Odd Number");
//         }
//     }
// }

// ======================================================================================================
// ======================================================================================================

import java.util.*;
public class Revise {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        int age = sc.nextInt();
        
        if(age >= 18) {
            System.out.println("Adult");
        } else if (age >= 13) {
            System.out.println("Teenager");
        } else {
            System.out.println("Child");
        }
    }
}











































































































