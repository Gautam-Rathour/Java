
// Bit Menipulation  :-   ---


// public class BitMenipulation {
//     public static void main(String args[]) {
//         // System.out.println(5 & 6);
//         // System.out.println(5 | 6);
//         // System.out.println(5 ^ 6);
//         // System.out.println(~5);
//         // System.out.println(5 << 2);
//         // System.out.println(6 >> 1);


//         int n = 56;

//         if((n & 1) == 0) {
//             System.out.println("This num is Even");
//         } else {
//             System.out.println("This num is Odd");
//         }

//     }
// }

// ===========================================================================================================
// ===========================================================================================================
// get Ith Bit :-

// public class BitMenipulation {
//     public static int getIthBit(int n, int i) {
//         int bitMask = 1<<i;
        
//         if((n & bitMask) == 0) {
//             return 0;
//         } else {
//             return 1;
//         }
//     }

//     public static void main(String args[]) {
//         System.out.println(getIthBit(10, 2));
//     }
// }

// // ===========================================================================================================
// // ===========================================================================================================
// set Ith Bit :-

// public class BitMenipulation {
//     public static int setIthBit(int n, int i) {
//         int bitMask = 1<<i;
        
//         return n | bitMask;
//     }

//     public static void main(String args[]) {
//         System.out.println(setIthBit(10, 2));

        
//     }
// }

// ===========================================================================================================
// ===========================================================================================================
// // clear Ith Bit :-

// public class BitMenipulation {
//     public static int clearIthBit(int n, int i) {
//         int bitMask = 1<<i;
//         int tildbitMask = ~(bitMask);
        
//         return n & tildbitMask;
      
//     }

//     public static void main(String args[]) {
//         System.out.println(clearIthBit(10, 1));
        
        
//     }
// }


// // ===========================================================================================================
// // ===========================================================================================================

// public class BitMenipulation{
//         // set Ith Bit 
//         public static int setIthBit(int n, int i) {
//         int bitMask = 1<<i;
        
//         return n | bitMask;
//     }

//         // clear Ith Bit
//         public static int clearIthBit(int n, int i) {
//         int bitMask = 1<<i;
//         int tildbitMask = ~(bitMask);
        
//         return n & tildbitMask;
      
//     }

//     public static int updateIthBit(int n, int i, int newBit) {
//         // if(newBit == 0) {
//         //     return clearIthBit(n, i);
//         // } else {
//         //     return setIthBit(n, i);
//         // }

//         n = clearIthBit(n, i);
//         int BitMask = newBit<<i;
//         return n| BitMask;
//     }

//     public static int clearIBits(int n, int i) {

//         int bitMask = (~0) << i;
//         return n & bitMask;
//     }

// public static int clearIBits(int n, int i, int j) {
//     int a = ((~0)<<(j+1));
//     int b = (1<<i)-1;
//     int bitMask = a | b;
//     return n & bitMask;
// }


//     public static void main(String args[]) {

//         // System.out.println(updateIthBit(10, 2, 1));
//         // System.out.println(clearIthBit(10, 2));

//         // System.out.println(clearIBits(15, 2));
//         System.out.println(clearIBits(10, 2, 4));
//     }
// }

// // ===========================================================================================================
// // ===========================================================================================================

// Live : - 

// public class BitMenipulation {
//     public static void main(String[] args) { 
//         // int x = 11;

//         // x = x | (1 << 5);

//         // System.out.println(x);

//         int x = 9;
//         x = x & (~(1<<3));
//         System.out.println(x);
//     }
// }

// ===========================================================================================================
// ===========================================================================================================

// Swap the value - Without temp variable :-

// public class BitMenipulation {
//     public static void main(String[] args) { 
        
//         int a = 12;
//         int b = 53;

//         a = a ^ b;
//         b = a ^ b;
//         a = a ^ b;

//         System.out.println(" A = " + a);
//         System.out.println(" B = " + b);
//     }
// }

// // ===========================================================================================================
// // ===========================================================================================================

// Check the number is power of 2 or not :- 

// public class BitMenipulation {
//     public static boolean isPowerOfTwo(int n) {
//         return (n & (n-1)) == 0;

//     }
//     public static void main(String[] args) { 

//         boolean result = isPowerOfTwo(32);
//         System.out.println(result);

//     }
// }

// // ===========================================================================================================
// // ===========================================================================================================

// // Count Set Bits in a Number :- 

// public class BitMenipulation {
//     public static int countSetBits(int n) {
//         int count = 0;
//         while(n > 0) {
//             if((n & 1) != 0) {
//                 count++;
//             }
//             n = n >> 1;
//         }
//         return count;
//     }
//     public static void main(String[] args) { 

//         System.out.println(countSetBits(16));

//     }
// }

// ===========================================================================================================
// ===========================================================================================================

// Fast Exponentiation :-

public class BitMenipulation {
    public static int fastExpo(int a, int n) {
        int ans = 1;

        while(n > 0) {
            if((n & 1) != 0) { // check LSB
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }
    
    public static void main(String[] args) { 

        System.out.println(fastExpo(5, 3));

    }
}















