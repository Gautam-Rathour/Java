
// ===========================================================================================================
// ===========================================================================================================


// public class OOPS {
//     public static void main (String args[]) {
//         Pen p1 = new Pen(); // created a pen object called p1 
//         p1.setColor("Blue");
//         p1.setTip(5);

//         System.out.println(p1.color);
//         System.out.println(p1.tip);

//         BankAccount myAcc = new BankAccount();
//         myAcc.username = "Saurabh Kumar";
//         myAcc.setPassword("abcdefghi");
//     }
// }

// class BankAccount {
//     public String username;
//     private String password;
//     public void setPassword(String pwd) {
//         password = pwd;
//     }

// }
// class Pen {
//     String color;
//     int tip;


//     void setColor(String newColor) {
//         color = newColor;
//     }

//     void setTip (int newTip) {
//         tip = newTip;
//     }
// }


// class Student {
//     String name;
//     int age;
//     float percentage; // CGPA

//     void calcPercentage (int phy, int chem, int math) {
//         int percentage = (phy + chem + math) / 3;
//     }
// }

// ===========================================================================================================
// ===========================================================================================================

// public class OOPS {
//     public static void main (String args[]) {
//         Pen p1 = new Pen(); // created a pen object called p1 
//         p1.setColor("Blue");
//         p1.setTip(5);

//         System.out.println(p1.getColor());
//         System.out.println(p1.getTip());
//         p1.setColor("yellow");
//         System.out.prinln(p1.getColor());

//         BankAccount myAcc = new BankAccount();
//         myAcc.username = "Saurabh Kumar";
//         myAcc.setPassword("abcdefghi");
//     }
// }


// class Pen {
//     private String color;
//     private int tip;

//     String getColor() {
//         return this.color;
//     }
//       int getTip () {
//         return this.tip;
//     }


//     void setColor(String newColor) {
//         color = newColor;
//     }
//     void setTip (int newTip) {
//         tip = newTip;
//     }
// }

// ===========================================================================================================
// ===========================================================================================================

// // OOPS concept :-

// public class OOPS {
//     public static void main(String args[]) {
//         Student s1 = new Student();
//         s1.name = "shahu";
//         s1.roll = 123;
//         s1.password = "abcd";
//         s1.marks[0] = 100;
//         s1.marks[1] = 90;
//         s1.marks[2] = 80;
        
//        Student s2 = new Student(s1);  // Copy
//         s2.password = "xyz";
//         s1.marks[2] = 100;

//         for(int i=0; i<3; i++) {
//             System.out.println(s2.marks[i]);
//         }
      
//     }
// }

// class Student {
//     String name;
//     int roll;
//     String password;
//     int marks[];

//     // //copy constructor
//     // Student (Student s1) {
//     //     marks = new int[3];
//     //     this.name = s1.name;
//     //     this.roll = s1.roll;
//     //     this.marks = s1.marks;
//     // }


//     // deep copy constructor 
//     Student(Student s1) {
//         marks = new int[3];
//         this.name = s1.name;
//         this.roll = s1.roll;

//         for(int i=0; i<marks.length(); i++) {
//             this.marks[i] = marks[i];
//         }
//     }

  
//     Student(String name) {
//         marks = new int[3];
//         return this.name;
//     }
//     Student(int roll) {
//         marks = new int[3];
//         return this.roll;
//     }
// }

// // ===========================================================================================================
// // ===========================================================================================================

// // Enheritance ( Simple Enheriitance ): - 

// public class OOPS {
//     public static void main (String args[]) {
//         Fish sark = new Fish();
//         sark.eat();

//     }
// }

// // Base class 
// class Animal {
//     String color;

//     void eat() {
//         System.out.println("eats");
//     }
//     void breathe() {
//         System.out.println("breathes");
//     }
// }

// // Derived Class         // subclass
// class Fish extends Animal {
//     int fins;
    
//     void swim() {
//         System.out.println("swims in water");
//     }
// }


// // ===========================================================================================================
// // ===========================================================================================================

// // Enheritance (Multi Level): - 

// public class OOPS {
//     public static void main (String args[]) {
//         Dog zDog = new Dog();
//         zDog.eat();
//         zDog.legs = 4;

//         System.out.println(zDog.legs);
//         // Mammals human = new Mammals();
//         // human.eat();

//     }
// }

// // Base class 
// class Animal {
//     String color;

//     void eat() {
//         System.out.println("eats");
//     }
//     void breathe() {
//         System.out.println("breathes");
//     }
// }

// class Mammals extends Animal {
//     int legs;
// }

// class Dog extends Mammals {
//     int teeth;
//     int eye;
// }


// ===========================================================================================================
// ===========================================================================================================

// // Enheritance (Multi Level): - 

// public class OOPS {
//     public static void main (String args[]) {
//         Mammals human = new Mammals();
//         human.eat();
//         human.walk();
//         Fish fish = new Fish();
//         fish.eat();
//         fish.swim();
//         Bird bird = new Bird();
//         bird.eat();
//         bird.fly();

//     }
// }

// // Base class 
// class Animal {
//     String color;

//     void eat() {
//         System.out.println("eats");
//     }
//     void breathe() {
//         System.out.println("breathes");
//     }
// }

// class Mammals extends Animal {
//     void walk() {
//         System.out.println("Walks");
//     }
// }

// class Fish extends Animal {
//     void swim() {
//         System.out.println("Swime");
//     }
// }

// class Bird extends Animal {
//     void fly () {
//         System.out.println("Fly");
//     }
// }

// ===========================================================================================================
// ===========================================================================================================

// // Hybrid Inheritance :-

// public class OOPS {
//     public static void main(String args[]) {


//     }
// }
// // parent class --------------
// class Animal {
//     void eat() {
//         System.out.println("Eats");
//     }
//     void breathe() {
//         System.out.println("Breathes");
//     }
// }


// //===============
// class Fish extends Animal {
//     void swim () {
//         System.out.println("Swims");
//     }
// }
// class Tuna extands Fish {
//     void jump() {
//         System.out.println("Jump");
//     }
// }
// class Shark extends Fish {
//     void shark () {
//         System.out.println("Shark");
//     }
// }


// //===============
// class Bird extends Animal {
//     void fly () {
//         System.out.println("Fly");
//     }
// }
// class peacock extends Animal {
//     void dance() {
//         System.out.println("Dance");
//     }
// }


// //===============
// class Mammal extends Animal {
//     void walk () {
//         System.out.println("Walks");
//     }
// }
// class Dog extends Mammal {
//     void bark () {
//         System.out.println("Barks");
//     }
// }
// class Cat extends Mammal {
//     void meow () {
//         System.out.println("Meows");
//     }
// }
// class Human extends Mammal {
//     void speak () {
//         System.out.println("Speaks");
//     }
// }

// // ===========================================================================================================
// // ===========================================================================================================


// // Method Overloading :-

// public class OOPS {
//     public static void main (String args[]) {
//         Calculator calc = new Calculator();
//         System.out.println(calc.sum(3, 1));
//         System.out.println(calc.sum((float)3.7 , (float)5.7));
//         System.out.println(calc.sum(3, 1, 2));


//     }
// }

// class Calculator {
//     int sum(int a , int b) {
//         return a + b;
//     }
//     float sum(float a, float b) {
//         return a + b;
//     }
//     int sum(int a, int b, int c) {
//         return a + b + c;
//     }
// }

// // ===========================================================================================================
// // ===========================================================================================================


// // Method Overriding :-

// public class OOPS {
//     public static void main (String args[]) {
//         Deer d = new Deer();
//         d.eat();


//     }
// }

// class Animal {
//     void eat() {
//         System.out.println("Eat anything......");
//     }
// }

// class Deer extends Animal {
//     void eat() {
//         System.out.println("Eat grasss");
//     }
// }


// class Calculator {
//     int sum(int a , int b) {
//         return a + b;
//     }
//     float sum(float a, float b) {
//         return a + b;
//     }
//     int sum(int a, int b, int c) {
//         return a + b + c;
//     }
// }


// ===========================================================================================================
// ===========================================================================================================

// // Abstraction :-

// public class OOPS {
//     public static void main (String args[]) {
//         // Horse h = new Horse();
//         // h.eat();
//         // h.walk();
//         // System.out.println(h.color);

//         Mustange myHorse = new Mustange();
//         // Animal -> Horse -> Mustange   

//     }
// }
// // main class   ------
// abstract class Animal {
//     String color;

//     Animal() {
//         System.out.println("Animal constructor called ");
//     }
//     void eat() {
//         System.out.println("animal eats");
//     }
//     abstract void walk();
// }

// // ---------------------
// class Horse extends Animal {
//     Horse() {
//         System.out.println("Horse constructor called ");
//     }
//     void changeColor() {
//         color = "dark brown";
//     }
//     void walk() {
//         System.out.println("walks on 4 legs");
//     }
// }
// class Mustange extends Horse {
//     Mustange() {
//         System.out.println("Mustange constructor called ");
//     }
// }

// // --------------------
// class Chicken extends Animal {
//     void changeColor() {
//         color = "yellow";
//     }
//     void walk () {
//         System.out.println("walks on 2 legs");
//     }
// }

// ===========================================================================================================
// ===========================================================================================================

// // makeing a Chess-Game Interface :---

// public class OOPS {
//     public static void main (String args[]) {
//         Queen q = new Queen();
//         q.moves();
        
//     }
// }

// interface ChessPlayer {
//     void moves();
// }

// class Queen implements ChessPlayer {
//     public void moves() {
//         System.out.println("up, down, left, right, diagonal (in all 4 directions)");
//     }
// }

// class Rook implements ChessPlayer {
//     public void moves() {
//         System.out.println("up, down, left, right");
//     }
// }

// class King implements ChessPlayer {
//     public void moves() {
//         System.out.println(" up, down, left, right, diagonal - ( by 1 step ) ");
//     }
// }

// ===========================================================================================================
// ===========================================================================================================


// public class OOPS {
//     public static void main (String args[]) {
        
//     }
// }

// interface Harbivore {
//     void eat();
// }

// interface Carnivore {
//     void eat();
//     void breathe();
// }

// class Bear implements Harbivore, Carnivore {
//     void eat() {
//         System.out.println
//     }
// }

// ===========================================================================================================
// ===========================================================================================================

// // Use of Static :-

// public class OOPS {
//     public static void main (String args[]) {
//         Student s1 = new Student();
//         s1.schoolName = "SSM";

//         Student s2 = new Student();
//         System.out.println("\nSecond student school name is : " + s2.schoolName);
            
        
//     }
// }

// class Student {
//     // if we use static ( Static ) keyword so , we do not have to use same code in multipal class :--
//     static int returnPercentage(int math, int phy, int chem) {
//         return (math + phy + chem) / 3;
//     }
//     String name ;
//     int roll ;
//     static String schoolName;

//     void setName(String name) {
//         this.name = name;
//     }
//     String getName() {
//         return this.name;
//     }
// }

// ===========================================================================================================
// ===========================================================================================================

// // Use of Super keyword :-

// public class OOPS { 
//     public static void main(String args[]) {
//         Horse h = new Horse();
//         System.out.println(h.color);
//     }
// }


// class Animal {
//     String color;
//     Animal() {
//         System.out.println("Animal constructor is called");
//     }
// }

// class Horse extends Animal {
//     Horse() {
//         super.color = "brown";
//         System.out.println("Horse constructor is called");
//     }
// }

// ===========================================================================================================
// ===========================================================================================================

// // Practice Question :--

// public class OOPS {
//     public static void main (String args[]) {
//         int a[] = {11, 12, 13, 14};
//         Student s1 = new Student( a );
        
//         Student s2 = new Student(s1);
//         // System.out.println(s2.name);
//         // System.out.println(s2.rollNo);
//         // System.out.println("");
//         s1.display();
//         s2.display();

//         a[0] = 10;
//         a[1] = 20;
//         a[2] = 30;
//         a[3] = 40;

//         s1.display();
//         s2.display();
//     }
// }

// class Student {
//     int arr[];
//     String name;
//     int rollNo;

//     Student(int arr[]) {
//         this.arr = new int[arr.length];

//         for(int i=0; i<arr.length; i++) {
//             this.arr[i] = arr[i];
//         }
//     }
    
//     // Basic copy constroctor 
//     Student(Student s1) {
//         this.arr = new int[s1.arr.length];

//         for(int i=0; i<s1.arr.length; i++) {
//             this.arr[i] = s1.arr[i];
//         }
//     }

//     void display() {
//         for(int i=0; i<arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
// }

// ===========================================================================================================
// ===========================================================================================================

// Question ( this question not related to this chepter ) :-

public class OOPS {
    public static void main (String args[]) {
        int a[] = {2, 3, -1, -5, 10, 12};
        int ans = 0;
        int sum = 0;

        for(int i = 0; i < a.length; i++ ) {
            sum += a[i];

            if(sum > ans) {
                ans = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        System.out.println(ans);
    }
}


// ===========================================================================================================
// ===========================================================================================================

















