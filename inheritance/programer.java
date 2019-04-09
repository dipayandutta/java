import java.io.*;

class Employee{

  int salaryProgrammer = 1000;
  int salaryAccountent = 2000;

}

class programer extends Employee{
  
  int bonus = 2000;

  public static void main(String args[]){
      programer dipayan = new programer();
      System.out.println(dipayan.salaryProgrammer);
      System.out.println(dipayan.bonus);
  }
}

