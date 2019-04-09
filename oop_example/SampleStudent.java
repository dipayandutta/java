import java.io.*;

class classroom{
  int roll;
  String name;

  void insertRecord(int r, String n){
    this.roll = r;
    this.name = n;
  }

  void displayInformation(){
    System.out.println("Student Name :"+this.name);
    System.out.println("Student Roll :"+this.roll);
  }
}

class SampleStudent{

  public static void main(String args[]){
  
    classroom newton     = new classroom();
    classroom rutherford = new classroom();

    newton.roll = 10;
    newton.name ="Issac";

    rutherford.roll = 1;
    rutherford.name = "Rutherford";

    newton.insertRecord(newton.roll,newton.name);
    newton.displayInformation();

    rutherford.insertRecord(rutherford.roll,rutherford.name);
    rutherford.displayInformation();
  }
}
