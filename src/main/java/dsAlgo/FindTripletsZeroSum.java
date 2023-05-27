package dsAlgo;

import java.util.Arrays;

public class FindTripletsZeroSum {
  public static void main(String args[]){
    int[] arr = {4, -16, 43, 4, 7, -36, 18};
    System.out.println(findTriplets(arr, arr.length));
  }

  public static boolean findTriplets(int arr[] , int n)
  {
    Arrays.sort(arr);
    for(int i=0;i< arr.length-1;i++){
      if(findNum(arr, i, 0-arr[i]))
        return true;
    }
    return false;
  }

  private static boolean findNum(int[] arr, int i, int sum) {
    int l=0,r=arr.length-1;
    while (l<r){
      if(l==i) {
        l++;
        continue;
      }
      if(r==i) {
        r--;
        continue;
      }
      if(arr[l]+arr[r]==sum)
        return true;
      if((arr[l]+arr[r]) < sum ) {
        l++;
      }
      if((arr[l]+arr[r]) > sum ) {
        r--;
      }
    }
    return false;
  }
}
