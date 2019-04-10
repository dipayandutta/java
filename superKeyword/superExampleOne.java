import java.io.*;

// The Base class
class Animal {
  String color = "white";
}

class Dog extends Animal {
  String color = "Black";
  void printColor(){
    System.out.println(color);
    //calling the super
    System.out.println(super.color);
  }
}

// The main class

class superExampleOne {
  
    public static void main(String args[]){
      
       Dog jackey = new Dog();
       jackey.printColor();
     }
}
