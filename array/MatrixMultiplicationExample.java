import java.io.*;

public class MatrixMultiplicationExample{
  public static void main(String args[]){
    //Creating Matrix 
    int a[][] = {{1,1,1},{2,2,2},{3,3,3}};
    int b[][] = {{1,1,1},{2,2,2},{3,3,3}};

    //Creating another matrix store the multiplication result
    int c[][] = new int[3][3]; //3 rows and 3 columns

    //Multiplying and printing multiplication of 2 matrices
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        c[i][j] = 0;
        for (int k=0;k<3;k++){
          c[i][j] +=a[i][k]*b[k][j];
        } //end of k loop
        System.out.println(c[i][j]+" ");
      } // end of j loop
      System.out.println();
    } // end of i loop
  } // end of main loop
}// end of class
