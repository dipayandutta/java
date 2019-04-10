import java.io.*;

class Person {
  int id;
  String name;
  // Constructor 
  Person(int id, String name){
    this.id = id;
    this.name = name;
  }
}

// The Derived class from the Person class
class Emp extends Person{
  float Salary;
  Emp(int id , String name , float Salary){
  //Reusing the parent Constructor
    super(id,name);
    this.Salary = Salary;
  }

  void displayInformation(){
    System.out.println(this.id+" "+this.name+" "+this.Salary);
  }
}

// The main class
class record {
  public static void main(String args[]){
    Emp newton = new Emp(1,"Issac",123);
    newton.displayInformation();
  }
}
