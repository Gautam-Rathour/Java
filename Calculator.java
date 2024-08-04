import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Division");
        System.out.println("4. Multiplaction");
        System.out.println("5. Exit");

        System.out.println("Chose Your Option");
        int choice = sc.nextInt();

        switch(choice){
            case 1 :  System.out.println("Add");
            Scanner sc1 = new Scanner(System.in);
        
                        int a = sc1.nextInt();
                        int b = sc1.nextInt();
                
                        int Add = a + b;
                        System.out.println("Result =" + Add);
            break;
            case 2 :  System.out.println("sub");
            Scanner sc2 = new Scanner(System.in);
        
                        int c = sc2.nextInt();
                        int d = sc2.nextInt();
                
                        int sub = c - d;
                        System.out.println("Result =" + sub);
            break;
            case 3 :  System.out.println("div");
            Scanner sc3 = new Scanner(System.in);
        
                        int e = sc3.nextInt();
                        int f = sc3.nextInt();
                
                        int div = e / f;
                        System.out.println("Result =" + div);
            break;
            case 4 :  System.out.println("mul");
            Scanner sc4 = new Scanner(System.in);
        
                        int g = sc4.nextInt();
                        int h = sc4.nextInt();
                
                        int mul = g * h;
                        System.out.println("Result =" +mul);
            break;
            case 5 : System.out.println("Result =" + "You Chose The Wrong Option");
            break;


         }
    }
}
