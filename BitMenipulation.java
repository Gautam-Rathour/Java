
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

public class BitMenipulation{
        // set Ith Bit 
        public static int setIthBit(int n, int i) {
        int bitMask = 1<<i;
        
        return n | bitMask;
    }

        // clear Ith Bit
        public static int clearIthBit(int n, int i) {
        int bitMask = 1<<i;
        int tildbitMask = ~(bitMask);
        
        return n & tildbitMask;
      
    }

    public static int updateIthBit(int n, int i, int newBit) {
        // if(newBit == 0) {
        //     return clearIthBit(n, i);
        // } else {
        //     return setIthBit(n, i);
        // }

        n = clearIthBit(n, i);
        int BitMask = newBit<<i;
        return n| BitMask;
    }

    public static int clearIBits(int n, int i) {

        int bitMask = (~0) << i;
        return n & bitMask;
    }

public static int clearIBits(int n, int i, int j) {
    int a = ((~0)<<(j+1));
    int b = (1<<i)-1;
    int bitMask = a | b;
    return n & bitMask;
}


    public static void main(String args[]) {

        // System.out.println(updateIthBit(10, 2, 1));
        // System.out.println(clearIthBit(10, 2));

        // System.out.println(clearIBits(15, 2));
        System.out.println(clearIBits(10, 2, 4));
    }
}

// // ===========================================================================================================
// // ===========================================================================================================























