package dsAlgo.array;

import java.util.Arrays;

public class PrintArray {

  public static void print2DIntArray(int[][] arr){
    for (int i=0;i<arr.length;i++){
      for (int j=0;j<arr[0].length;j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
  }

}
