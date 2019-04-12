import java.io.*;

class arrayExampleTwo{
  
  static void min(int arr[]){
    int min = arr[0];
    for (int i=0;i<arr.length;i++){
      if (min > arr[i]){
        min = arr[i];
      }
    }
    System.out.println("Minimum is "+min);
  }

  public static void main(String args[]){
    int a[] = {10,20,3,44};
    min(a);
  }
}
