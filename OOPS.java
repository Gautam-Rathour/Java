
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

// Enheritance (Multi Level): - 

public class OOPS {
    public static void main (String args[]) {
        Mammals human = new Mammals();
        human.eat();
        human.walk();
        Fish fish = new Fish();
        fish.eat();
        fish.swim();
        Bird bird = new Bird();
        bird.eat();
        bird.fly();

    }
}

// Base class 
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }
    void breathe() {
        System.out.println("breathes");
    }
}

class Mammals extends Animal {
    void walk() {
        System.out.println("Walks");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("Swime");
    }
}

class Bird extends Animal {
    void fly () {
        System.out.println("Fly");
    }
}




































