package dsAlgo;

import java.util.Arrays;

public class MinimumPlatforms {
  public static void main(String[] args){
    int[] arr = {900, 940, 950, 1100, 1500, 1800};
    int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
    //[900, 940, 950, 1100, 1500, 1800]
    //[910, 1120, 1130, 1200, 1900, 2000]
    System.out.println(findPlatform(arr, dep, arr.length));

  }
  static int findPlatform(int arr[], int dep[], int n)
  {
    Arrays.sort(arr);
    Arrays.sort(dep);
    int platform = 0, ans = Integer.MIN_VALUE;
    int i=0,j=0;
    boolean arrivalFlag = true;
    while (i<n && j<n){
      if(arr[i] <= dep[j]){
        platform++;
        i++;
      }else {
        platform--;
        j++;
      }
      ans = ans > platform ? ans : platform;
    }

    return ans;
  }
}
