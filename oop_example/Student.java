
import java.io.*;

class classroom{
  int id;
  String name;
}

class Student{
  public static void main(String args[]){
    classroom newton = new classroom();
    newton.id = 1;
    newton.name = "Isac";

    System.out.println("student ID :"+newton.id);
    System.out.println("Student Name :"+newton.name);
  }
}
