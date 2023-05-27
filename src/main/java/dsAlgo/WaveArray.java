package dsAlgo;

import java.util.Arrays;

public class WaveArray {
  public static void main(String args[]){
    int[] arr = {4, -16, 43, 4, 7, -36};
    Arrays.sort(arr);
    System.out.println(arr);
    convertToWave(arr.length, arr);
    System.out.println(arr);
    
  }

  private static void convertToWave(int n, int[] a) {
    for (int i=0;i<n-1;){
      int x = a[i];
      a[i] = a[i+1];
      a[i+1] = x;
      i += 2;
    }
  }
}
