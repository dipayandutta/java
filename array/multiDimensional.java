import java.io.*;

public class multiDimensional{
  public static void main(String args[]){
    //2D array 
    int array[][] = {{1,2,3},{4,5,6}};
    for (int i=0;i<2;i++){
      for(int j=0;j<3;j++){
        System.out.println(array[i][j]+" ");
      }
    }
    System.out.println();
  }
}
