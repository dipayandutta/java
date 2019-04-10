import java.io.*;

class Animal {
  //Creating the constructor 
  Animal(){
    System.out.println("Animal is created");
  }
}

class Dog extends Animal{
  Dog(){ // Cosntructor of this class
    super(); // Calling the constructor of the immediate base class
    System.out.println("Dog is created");
   }
}

// Creating the main class
class parentClassConstructor {
  public static void main(String args[]){
    Dog jackey = new Dog();
   
   }
} 

