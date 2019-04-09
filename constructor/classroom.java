import java.io.*;

class classroom{
  
  int roll;
  String name;

  classroom(int r, String n){
    this.roll = r;
    this.name = n;
  }

  void displayInformation(){
    System.out.println("Name of the Student "+this.name);
    System.out.println("Id of the Student "+this.roll);
  }
}

class student{
  
  public static void main(String args[]){
    
    classroom newton = new classroom(1,"Issac");
    classroom rutherford = new classroom(2,"Rutherford");

    newton.displayInformation();
    rutherford.displayInformation();
  }
}
