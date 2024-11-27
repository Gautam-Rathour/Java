// =======================================================================================================
// =======================================================================================================

// import java.util.*;
// public class Strings {
//     public static void printLetter(String str) {
//         for(int i=0; i<str.length(); i++) {
//             System.out.print(str.charAt(i) + " ");
//         }
//         System.out.println();
//     }
//     public static void main(String args[]) {
//         // char arr[] = {'a', 'b', 'c', 'd'};
//         // String str1 = "abcd";
//         // String str2 = new String("xyz");

//         // // Strings are INMUTABLE

//         // System.out.print("Enter you good name : ");
//         // Scanner scanner = new Scanner(System.in);
//         // String name;
//         // name = scanner.nextLine();
//         // System.out.println("Your name is : " + name);

//         // Strings : --

//         // String fullName = "Avinash kumar";
//         // System.out.println(fullName.length());

//         String firstName = "Avinash";
//         String lastName = "kumar";
//         String fullName = firstName + " " +  lastName;
//         // System.out.println(fullName.charAt(0,firstname));

//         printLetter(firstName);
//     }
// }

// =======================================================================================================
// =======================================================================================================

// import java.util.*;
// public class Strings {
//     public static boolean isPalindrome(String str) {
//         int n = str.length();

//         for(int i=0; i<n/2; i++) {
//             if(str.charAt(i) != str.charAt(n-i-1)) {
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String args[]) {
//         String str = "saurabh";
        
//         // System.out.println(isPalindrome(str));
//         isPalindrome(str);

//         if(isPalindrome(str)) {
//             System.out.println("String is Palindrome");
//         } else {
//             System.out.println("String is not Palindrome");
//         }
//     }
// }

// =======================================================================================================
// =======================================================================================================
//  

// import java.util.*;
// public class Strings {
//     public static float getShortestPath(String path) {
//         int x = 0;
//         int y = 0;

//         for(int i=0; i<path.length(); i++) {
//             char dir = path.charAt(i);
//             // South
//             if(dir ==  'S') {
//                 y--;
//             }
//             // North
//              else if (dir == 'N') {
//                 y++;
//             } 
//             // West
//             else if (dir == 'W') {
//                 x--;
//             } 
//             // East
//             else {
//                 x++;
//             }
//         }
//         int X2 = x*x;
//         int Y2 = y*y;
//         return (float)Math.sqrt(X2 + Y2);
//     }

//     public static void main(String args[]) {
//         String path = "WNEENESENNN";

//         float result = getShortestPath(path);

//         System.out.println(result);
//     }
// }

// =======================================================================================================
// =======================================================================================================
 
// public class Strings {
//     public static void main(String args[]) {
//         String s1 = "Avinash";
//         String s2 = "Avinash";
//         String s3 = new String("Avinash");

//         // if(s1 == s2) {
//         //     System.out.println("String are equal");
//         // } else {
//         //     System.out.println("String are not equal");
//         // }


//         // if(s1 == s3) {
//         //     System.out.println("String are equal");
//         // } else {
//         //     System.out.println("String are not equal");
//         // }

// // =======================================================================================================

//         // if(s1.equals(s3)) {
//         //     System.out.println("String are equal");
//         // } else {
//         //     System.out.println("String are not equal");
//         // }
//     }
// }

// // =======================================================================================================
// // =======================================================================================================
 
// public class Strings {
//     public static String subString(String s1, int start, int end) {
//         String subStr = "";

//         for(int i=start; i<end; i++) {
//             subStr += s1.charAt(i);
//         }
//         return subStr;
//     }
//     public static void main(String args[]) {
//         String s1 = "HelloWorld";

//         System.out.println(s1.substring(s1, 0, 10));
//         System.out.println(subString(s1, 5, 10));
//     }
// }

// =======================================================================================================
// =======================================================================================================
 
// public class Strings {
//     public static void main(String args[]) {
//         String fruits[] = {"apple", "mange", "banana"};

//         String largest = fruits[0];
//         for(int i=1; i<fruits.length; i++) {
//             if(largest.compareTo(fruits[i]) < 0) {
//                 largest = fruits[i];           
//             }
//         } 
//         System.out.println(largest);
//     }
// }

// =======================================================================================================
// =======================================================================================================
 
// //String Builder : - 
// import java.util.*;
// public class Strings {
//     public static void main(String args[]) {
//         StringBuilder sb = new StringBuilder("");

//         for(char ch='a'; ch<='z'; ch++) {
//             sb.append(ch);
//         }

//         System.out.println(sb);
//     }
// }

// =======================================================================================================
// =======================================================================================================
 
// // Uppercase ;-
// public class Strings {
//     public static String toUpperCase(String s1) {
//         StringBuilder sb = new StringBuilder("");

//         char ch = Character.toUpperCase(s1.charAt(0));
//         sb.append(ch);

//         for(int i=1; i<s1.length(); i++) {
//             if(s1.charAt(i) == ' ' && i<s1.length()-1) {
//                 sb.append(s1.charAt(i));
//                 i++;
//                 sb.append(Character.toUpperCase(s1.charAt(i)));
//             } else { 
//                 sb.append(s1.charAt(i));
//             }
//         }

//         return sb.toString();
//     }
//     public static void main(String args[]) {
//         String s1 = "hi, i am shradha";

//         System.out.println(toUpperCase(s1));
//     }
// }










































































































