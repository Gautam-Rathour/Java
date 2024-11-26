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

// =======================================================================================================
// =======================================================================================================
 
public class Strings {
    public static void printSubString(String s1, int start, int end) {
        String subStr = 0;
        for(int i=start; i<end; i++) {
            subStr += s1.charAt(i);
        }
    }

    public static void main(String args[]) {
        String s1 = "Avinashkumar";

        // System.out.println(s1.substring(0,7));
        System.out.println(printSubString(s1, 0, 7));
    }
}















































































































