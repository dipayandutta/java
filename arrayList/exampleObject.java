import java.io.*;
import java.util.*;

//Defineing a class 
class Student{
  int rollNo;
  String name;
  int age;
//Constructor of the class
  Student(int rollNo,int age,String name){
    this.rollNo = rollNo;
    this.age    = age;
    this.name   = name;
  }
}

// The main class
class exampleObject{

// The main method
  public static void main(String args[]){
    Student james = new Student(10,20,"James"); // Creating the Studnet class Object
    Student issac = new Student(1,20,"Issac");

//Creating the arrayList 
    ArrayList<Student> std = new ArrayList<Student>();
    std.add(james);
    std.add(issac);

    for(int i=0;i<std.size();i++){
      System.out.println(std.get(i));
    }

//Traversing elements in the arrayList
    Iterator itr = std.iterator();
    while(itr.hasNext()){
      Student student = (Student)itr.next();
      System.out.println(student.rollNo+" "+student.age+" "+student.name);
    }
  }

}
