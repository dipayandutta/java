import java.io.*;

class Address {
  
  String address ;

  void customerAddres(String add){
    this.address = add;
  }
  void displayAddress(){
    System.out.println(this.address);
  }
}

class Salary extends Address{

  float Salary ;
  void customerSalary(float sal){
    this.Salary = sal;
  }
  void displaySalary(){
    System.out.println(this.Salary);
  }
}

class customerName extends Salary{
  
  String name;
  void cusName(String n){
    this.name = n;
  }

  void displayName(){
    System.out.println(this.name);
  }
}

class multilevel{
  public static void main(String args[]){
    
    customerName newton = new customerName();
    
    newton.customerAddres("England");
    newton.customerSalary(12345);
    newton.cusName("Sir Issac Newton");

    //Display all the Informations

    newton.displayName();
    newton.displayAddress();
    newton.displaySalary();
  }
}
