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

// import java.util.*;
// public class Revise {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//         int age = sc.nextInt();
        
//         if(age >= 18) {
//             System.out.println("Adult");
//         } else if (age >= 13) {
//             System.out.println("Teenager");
//         } else {
//             System.out.println("Child");
//         }
//     }
// }

// ======================================================================================================
// ======================================================================================================

// import java.util.*;
// public class Revise {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//         int inc = sc.nextInt();
//         int tex = 0;

//         if(inc < 500000) {
//             tex = 0;
//         } else if (inc >= 500000 && inc <= 1000000) {
//             tex = (int)(inc * (0.2));
//         } else {
//             tex = (int)(inc * 0.3);

//         }
//         System.out.println("Your tax is = " + tex);
        
//     }
// }

// ======================================================================================================
// ======================================================================================================

// import java.util.*;
// public class Revise {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//        int a = 11;
//        int b = 9;
//        int c = 6;

//        if (a >= b && a >= c) {
//         System.out.println("A is greater");
//        } else if (b >= c) {
//         System.out.println("B is greater");
//        } else {
//         System.out.println("C is greater");
//        }
//     }
// }


// ======================================================================================================
// ======================================================================================================

// import java.util.*;
// public class Revise {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//        int a = 11;
//        int b = 9;
//        int c = 6;

//        if (a >= b && a >= c) {
//         System.out.println("A is greater");
//        } else if (b >= c) {
//         System.out.println("B is greater");
//        } else {
//         System.out.println("C is greater");
//        }
//     }
// }

// ======================================================================================================
// ======================================================================================================

// import java.util.*;
// public class Revise {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//         int num = 57;

//         String type = (num % 2 == 0) ? "Even" : "Odd";
//         System.out.println(type);

       
//     }
// }

// ======================================================================================================
// ======================================================================================================

// import java.util.*;
// public class Revise {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//         int marks = 31;

//         String result = (marks >= 33) ? "PASS" : "FAIL";
//         System.out.println(result);
//     }
// }

// // ======================================================================================================
// // ======================================================================================================

// import java.util.*;
// public class Revise {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//         int button = sc.nextInt();

        
//         switch(button) {
//             case 1: System.out.println("Samosa");
//             break;
//             case 2: System.out.println("Burger");
//             break;
//             case 3: System.out.println("mango shake");
//             break;
//             case 4: System.out.println("We wake up");
//             break;
//             default : System.out.println("Nothing");
//         }
//     }
// }

// ======================================================================================================
// ======================================================================================================


// import java.util.*;
// public class Revise {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//         int button = sc.nextInt();

        
//         switch(button) {
//             case 1: System.out.println("Samosa");
//             break;
//             case 2: System.out.println("Burger");
//             break;
//             case 3: System.out.println("mango shake");
//             break;
//             case 4: System.out.println("We wake up");
//             break;
//             default : System.out.println("Nothing");
//         }
//     }
// }

// // ======================================================================================================
// // ======================================================================================================


// import java.util.*;
// public class Revise {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
 
//         System.out.print("Enter first number :- ");
//         int a = sc.nextInt();
//         System.out.print("Enter second number :- ");
//         int b = sc.nextInt();

//         System.out.println("Addtion : 1 ");
//         System.out.println("Subtract : 2 ");
//         System.out.println("Multiplaction : 3 ");
//         System.out.println("Devision : 4 ");

//         System.out.println(" ");
//             int button = sc.nextInt();

//         switch(button) {
//             case 1: System.out.println(a + b);
//             break;
//             case 2: System.out.println(a - b);
//             break;
//             case 3: System.out.println(a * b);
//             break;
//             case 4: System.out.println(a / b);
//             break;
//             default : System.out.println("Please chick right Button ");
//         }
//     }
// }

// ======================================================================================================
// ======================================================================================================

// import java.util.*;
// public class Revise {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//         int num = sc.nextInt();

//         if(num < 0) {
//             System.out.println("This number is negative");
//         } else {
//             System.out.println("This number is positive");
//         }
        
//     }
// }

// // ======================================================================================================
// // ======================================================================================================

// import java.util.*;
// public class Revise {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//         double temp = sc.nextInt();

//         if(temp >= 100) {
//             System.out.println("You have fever");
//         } else {
//             System.out.println("You don't have fever");
//         }
//     }
// }

// // ======================================================================================================
// // ======================================================================================================

// import java.util.*;
// public class Revise {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
 

//         System.out.println(" ");
//             int num = sc.nextInt();

//         switch(num) {
//             case 1: System.out.println("Sunday");
//             break;
//             case 2: System.out.println("Monday");
//             break;
//             case 3: System.out.println("Tuesday");
//             break;
//             case 4: System.out.println("wednesday");
//             break;
//             case 5: System.out.println("Thursday");
//             break;
//             case 6: System.out.println("Friday");
//             break;
//             case 7: System.out.println("Saturday");
//             break;
//             default : System.out.println("Please chick right Button ");
//         }
//     }
// }

// // ======================================================================================================
// // ======================================================================================================

// import java.util.*;
// public class Revise {
//     public static void main (String args[]) {
//        int a = 63, b = 36;
//        boolean x = (a < b) ? true : false;
//        int y = (a > b) ? a : b;   

//        System.out.println(x);
//        System.out.println(y);

//     }
// }

// // ======================================================================================================
// // ======================================================================================================

// import java.util.*;
// public class Revise {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//        int year = sc.nextInt();

//        if(year % 4 == 0) {
//         System.out.println("This year is a leap year");
//        } else {
//         System.out.println("This year is not a leap year");

//        }
//     }
// }

// // ======================================================================================================
// // ======================================================================================================

// // Loops :- 

// import java.util.*;
// public class Revise {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();
//         int sum = 0;
        
//         int n = 1;
//         while(n <= number) {
//             // System.out.println(n );
//             sum += n;
            
//             n++;
//         }
//         System.out.println(sum);
//     }
// }

// // ======================================================================================================
// // ======================================================================================================

// // Loops :- 

// import java.util.*;
// public class Revise {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
        
//         for(int i=1; i<=num; i++) {
//             for(int j=1; j<=num; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// // ======================================================================================================
// // ======================================================================================================

// // // Loops :- 

// import java.util.*;
// public class Revise {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = 10899;

//         while(num != 0) {
//             int remender = num % 10;
//             System.out.print(remender);
//             num = num / 10;

//         } 
//        System.out.println();   
//     }
// }

// // ======================================================================================================
// // ======================================================================================================

// // Loops :- 

// import java.util.*;
// public class Revise {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = 10899;

//         int rev = 0;
//         while(num != 0) {
//             int rem = num % 10;
//             System.out.print(rem + " ");

//             rev = rev * 10 + rem;

//             num = num / 10;

//         } 
//        System.out.println();   
//        System.out.println(rev);
//     }
// }

// // =======================================================================================================
// // =======================================================================================================


// // Loops :- 

// import java.util.*;
// public class Revise {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = 1;

//         do{
//             System.out.println(n + ". hello");
//             n++;
//         } while(n <= 10);
//         } 
   
//     }


// // =======================================================================================================
// // =======================================================================================================

// // Loops :- 

// import java.util.*;
// public class Revise {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = 1;

//         for(int i=1; i<=10; i++) {
//             if(i == 5) {
//                 break;
//             }
//             System.out.println(i + ". hello");
//         }
   
//     }
// }

// // // =======================================================================================================
// // // =======================================================================================================

// // Loops :- 

// import java.util.*;
// public class Revise {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner(System.in);
        

//         do{
//             System.out.print("Enter Your Number :  ");
//             int n = sc.nextInt();
//             if(n % 10 == 0) {
//                 break;
//             }
//             System.out.println("You enterd this number :- " + n);

//         } while(true);

//         System.out.println("You are out from this loop.");
        
   
//     }
// }

// // =======================================================================================================
// // =======================================================================================================

// Loops :- 

// import java.util.*;
// public class Revise {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner(System.in);
        

//         do{
//             System.out.print("Enter Your Number :  ");
//             int n = sc.nextInt();
//             if(n % 10 == 0) {
//                 continue;
//             }
//             System.out.println("You enterd this number :- " + n);

//         } while(true);
        
   
//     }
// }

// // =======================================================================================================
// // =======================================================================================================

// import java.util.*;
// public class Revise {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//         int num = sc.nextInt();

//         boolean isPrime = true;

//          if(num <= 1) {
//                 isPrime = false;
//             }

//         for(int i=2; i <= num/2; i++) {
           


//             if(num % i == 0) {
//                 isPrime = false;
//                 break;
//             }
//         }
        
//         if(isPrime) {
//             System.out.println("This number is prime ");
//         } else {
//             System.out.println("This number is not prime ");
//         }
//     }
// }


// // =======================================================================================================
// // =======================================================================================================

// public class Revise {
//     public static void main (String[]args){
//         for(int i=0; i<5; i++) {
//             System.out.println("Hello");
//             i+=2;
//         }
//     }
// }

// // =======================================================================================================
// // =======================================================================================================
// Write a program that reads a set of integers , and then prints the sum of the even and odd integers

// import java.util.*;
// public class Revise {
//     public static void main (String[]args){
//         Scanner sc = new Scanner (System.in);

//         int odd = 0;
//         int even = 0;

//         for(int i=1; i<=4; i++) {
//             int number = sc.nextInt();

//             if(number % 2 == 0) {
//                 even += number;
//             }
//             if(number % 2 == 1) {
//                 odd += number;
//             }   
//         }
//         System.out.println("Sum of even numbers is: " + even);
//         System.out.println("Sum of odd numbers is: " + odd);
//     }
// }

// // =======================================================================================================
// // =======================================================================================================

// //  Factorial

// import java.util.*;

// public class Revise {
//     public static void main (String[]args){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int factorial = 1;

//         for(int i=num; i>=1; i--) {
//             factorial *= i;  
//         }

//         System.out.println(factorial);
//     }
// }

// // =======================================================================================================
// // =======================================================================================================

// //  Table :-

// import java.util.*;

// public class Revise {
//     public static void main (String[]args){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int multiplaction = 0;
        

//         for(int i=1; i<=10; i++) {
//             multiplaction = num * i;
//             System.out.println("5 * " + i + " = "  + multiplaction);
//         }  
//     }
// }

// // =======================================================================================================
// // =======================================================================================================

// Question :- 

// public class Revise {
//     public static void main (String[]args){

//         for(int i=1; i<=5; i++) {
//             System.out.println("i = " + i);
//         }
//     }
// }

// // =======================================================================================================
// // =======================================================================================================

// public class Revise {
//     public static void main (String[]args){

//         for(int i=1; i<=4; i++) {
//             for(int j=1; j<=i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// // =======================================================================================================
// // =======================================================================================================

// public class Revise {
//     public static void main (String[]args){

//         for(int i=1; i<=4; i++) {
//             for(int j=1; j<=i; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }


// // =======================================================================================================
// // =======================================================================================================

// public class Revise {
//     public static void main (String[]args){
//         char ch = 'A';

//         for(int i=1; i<=10; i++) {
//             for(int j=1; j<=i; j++) {
//                 System.out.print(ch);
//                 ch++;
//             }
//             System.out.println();
//         }
//     }
// }

// // =======================================================================================================
// // =======================================================================================================

// public class Revise {
//     public static void main (String[]args){
        

//         for(int i=1; i<=4; i++) {
//             for(int j=1; j<=5; j++) {
//                 if(i == 1 || j == 1 || i == 4 || j == 5) {
//                     System.out.print(" *");
//                 } else {
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// // =======================================================================================================
// // =======================================================================================================

// public class Revise {
//     public static void main (String[]args){
        

//         for(int i=1; i<=4; i++) {
//             for(int j=1; j<=(4-i); j++) {
//                 System.out.print("  ");
                
//             }

//             for(int j=1; j<=i; j++) {
//                 System.out.print(" *");
                
//             }
//             System.out.println();
//         }
//     }
// }


// // =======================================================================================================
// // =======================================================================================================

// public class Revise {
//     public static void main (String[]args){
        

//         for(int i=1; i<=5; i++) {
//             for(int j=1; j<=(5-i+1); j++) {
//                 System.out.print(j);
                
//             }
//             System.out.println();
//         }
//     }
// }


// // =======================================================================================================
// // =======================================================================================================

// public class Revise {
//     public static void main (String[]args){
//         int num = 1;

//         for(int i=1; i<=5; i++) {
//             for(int j=1; j<=i; j++) {
//                 System.out.print(num + " ");
//                 num++;
                
//             }
//             System.out.println();
//         }
//     }
// }


// // =======================================================================================================
// // =======================================================================================================

// public class Revise {
//     public static void main (String[]args){
//         int num = 1;
//         int count = 0;

//                 for(int i=1; i<=5; i++) {
//                     for(int j=1; j<=i; j++) {
//                        int add = i + j;
//                        if(add % 2 == 0) {
//                         System.out.print("1 ");
//                        } else {
//                         System.out.print("0 ");
//                        }
                         
//                     }
//             System.out.println();
//         }
//     }
// }


// // =======================================================================================================
// // =======================================================================================================

// public class Revise {
//     public static void main (String[]args){

//         // First halfe :-
//         for(int i=1; i<=4; i++) {
//             for(int j=1; j<=i; j++) {
//                 System.out.print("* ");
//             }

//             for(int j=1; j<=2*(4-i); j++) {
//                 System.out.print("  ");
//             }

//             for(int j=1; j<=i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }    


//         // Second halfe :-
//         for(int i=4; i>=1; i--) {
//             for(int j=1; j<=i; j++) {
//                 System.out.print("* ");
//             }

//             for(int j=1; j<=2*(4-i); j++) {
//                 System.out.print("  ");
//             }

//             for(int j=1; j<=i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         } 
//     }
// }


// =======================================================================================================
// =======================================================================================================

// public class Revise {
//     public static void main (String args[]) {
//         for(int i=1; i<=5; i++) {
//             for(int j=1; j<=5-i+1; j++) {
//                 System.out.print("  ");
//             }
//             for(int j=1; j<=5; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// =======================================================================================================
// =======================================================================================================

// public class Revise {
//     public static void main (String args[]) {
//         for(int i=1; i<=5; i++) {
//             for(int j=1; j<=5-i+1; j++) {
//                 System.out.print("  ");
//             }
//             for(int j=1; j<=5; j++) {
//                 if(j==1 || j==5 || i==1 || i==5) {
//                     System.out.print("* ");
//                 } else {
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// =======================================================================================================
// =======================================================================================================

// public class Revise {
//     public static void main (String args[]) {
//         for(int i=1; i<=4; i++) {
//             for(int j=1; j<=4-i; j++) {
//             System.out.print("  ");
//             } 

//             for(int j=1; j<=i; j++) {
//                 System.out.print("* ");
//             }
//             for(int j=1; j<=i-1; j++) { 
//                 System.out.print("* ");
//             }
//             System.out.println(); 
//         }


//         for(int i=4; i>=1; i--) {
//             for(int j=1; j<=4-i; j++) {
//             System.out.print("  ");
//             } 

//             for(int j=1; j<=i; j++) {
//                 System.out.print("* ");
//             }
//             for(int j=1; j<=i-1; j++) { 
//                 System.out.print("* ");
//             }
//             System.out.println(); 
//         }
//     }
// }

// // =======================================================================================================
// // =======================================================================================================


// public class Revise {
//     public static void main (String args[]) {
//         for(int i=1; i<=5; i++) {
//             for(int j=1; j<=5-i+1; j++) {
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++) {
//                 System.out.print(i + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// =======================================================================================================
// =======================================================================================================


// public class Revise {
//     public static void main (String args[]) {
//         for(int i=1; i<=5; i++) {
//             for(int j=1; j<=5-i+1; j++) {
//                 System.out.print(" ");
//             }
//             for(int j=i; j>=1; j--) {
//                 System.out.print(j);
//             }

//             for(int j=2; j<=i; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// // =======================================================================================================
// // =======================================================================================================

// public class Revise {
//     public static void printHello() {

//         System.out.println("Hello");  
//         System.out.println("Hello"); 
//         System.out.println("Hello");  
//     }
//     public static void main (String args[]) {
//         printHello();

//     }  
// }

// // =======================================================================================================
// // =======================================================================================================

// import java.util.*;
// public class Revise {
//     public static int addTwoNum(int a , int b) {
//         int sum = a + b;
//         return sum;
//     }
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int sum = addTwoNum(a,b);
//         System.out.println("Sum of = " + sum);

//     }  
// }

// // =======================================================================================================
// // =======================================================================================================

// import java.util.*;
// public class Revise {
//     public static void swap(int a , int b) {
//         int temp = a; 
//             a = b;
//             b = temp;

//             System.out.println("This is the value of a = " + a);
//             System.out.println("This is the value of b = " + b);
//     }
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//         int a = 5;
//         int b = 7;

//         swap(a,b);
//     }  
// }

// // =======================================================================================================
// // =======================================================================================================

// import java.util.*;
// public class Revise {
//     public static int multipleTwoNum(int a , int b) {
//         int multipl = a * b;
//         System.out.println(multipl);
//         return multipl;
//     }
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//         int a = 7;
//         int b = 7;

//         multipleTwoNum(a,b);
//     }  
// }

// // =======================================================================================================
// // =======================================================================================================

// import java.util.*;
// public class Revise {
//     public static int factorial(int a) {
//         int factorial = 1;
//         for(int i=1; i<=a; i++) {
//         factorial *= i;
            
//         }
//         System.out.println(factorial);
//         return factorial;
//     }
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//         int a = 4;

//         factorial(a);
//     }  
// }

// // =======================================================================================================
// // =======================================================================================================

// import java.util.*;
// public class Revise {
//     public static int factorial(int n) {
//         int factorial = 1;
//         for(int i=1; i<=n; i++) {
//             factorial *= i;   
//         }
//        return factorial;
//     }

//     public static int Bfactorial(int n , int r) {
//         int fact_n = factorial(n);
//         int fact_r = factorial(r);
//         int fact_nmr = factorial(n-r);
//         int bc = fact_n / (fact_r * fact_nmr);
//         return bc;
//     }
//     public static void main (String args[]) {
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();
//         int r = sc.nextInt();
        
        

//         System.out.println(Bfactorial(n,r));
//     }  
// }

// // =======================================================================================================
// // =======================================================================================================

// import java.util.*;
// public class Revise {
//     // public static int sum(int a , int b) {
    //  return a+b;
    // }

    // public static int sum(int a, int b, int c) {
    //     return a+b+c;
    // }

    // public static int sum (int a , int b) {
    //     return a+b;
    // }

    // public static float sum (float a , float b ) {
    //     return a+b;
    // }

    // public static boolean isPrime(int n) {

    //     if(n <= 1) {
            
    //         return false;
    //     }
    //     for(int i=2; i<=Math.sqrt(n); i++) {
    //         if(n % i == 0) {
    //             return false;

    //         }
    //     }

    //   return true;
    // }

//     public static void primerange(int n) {
//         for(int i=2; i<=n; i++) { 
//             if(isPrime(i)){
//                 System.out.print(i + " ");
//             }
//         } 
//         System.out.println();
//     }
//     public static void main (String args[]) {

//         // System.out.println(sum(5,3));
//         // System.out.println(sum(5.5f,3.5f));  

//         primerange(200);
          
//     }
// }

// =======================================================================================================
// =======================================================================================================

// import java.util.*;
// public class Revise {
//     public static void binToDic(int binNum) {
//         int myNum = binNum;
//         int pow = 0;
//         int decNum = 0;

//         while(binNum > 0) {
//             int lastDigit = binNum % 10;
//             decNum = decNum + (lastDigit * (int)Math.pow(2 , pow));

//             pow++;
//             binNum = binNum / 10;

//         }
//         System.out.println("Decimal of " + myNum + " = " + decNum);
//     }
//     public static void main (String args[]) {
//         binToDic(111);

          
//     }
// }

// =======================================================================================================
// =======================================================================================================

// import java.util.*;
// public class Revise {  
// public static void decToBin(int n) {
//     int myNum = n;
//     int pow = 0;
//     int binNum = 0;

//     while(n > 0) {
//         int rem = n % 2;
//         binNum = binNum + (rem * (int)Math.pow(10, pow));
//         pow++;
//         n = n/2;
//     }

//     System.out.println("binary form of " + myNum + " = " + binNum);
// }

// public static void main (String args[]) {
//     Scanner scanner = new Scanner(System.in);
//     int n = scanner.nextInt();
//     decToBin(n);
// }
// }

// // =======================================================================================================
// // =======================================================================================================

// import java.util.*;
// public class Revise {
//     public static void main(String args[]) {
//       Scanner scanner = new Scanner (System.in);
//       int a = scanner.nextInt();
//       int b = scanner.nextInt();
//       int c = scanner.nextInt();

//       float sum = a + b + c;
//       float average = sum / 3;
//       System.out.println(average);

//     }
// }

// =======================================================================================================
// =======================================================================================================

// import java.util.*;
// public class Revise {
//     public static void main(String args[]) {
//       Scanner scanner = new Scanner (System.in);
     
      

//     }
// }









































































































