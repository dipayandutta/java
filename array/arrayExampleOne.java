import java.io.*;

class arrayExampleOne{
  
  public static void main(String args[]){
    int a[] = new int[5];
    a[0] = 10;
    a[1] = -2;
    a[2] = 34;
    a[3] = 3;

    for(int i=0;i<a.length;i++){
      System.out.println(i);
    }
  }
}
