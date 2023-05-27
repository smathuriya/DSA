package dsAlgo;

import java.util.Arrays;

public class CountSortedVowelStrings_1641 {
  public static void main(String args[]){
    System.out.println(countVowelStrings(33));
  }

  static public int countVowelStrings(int n) {
    int[] arr = new int[5];
    Arrays.fill(arr,1);
    for (int i=2;i<=n;i++){
      for (int j=3;j>=0;j--){
        arr[j] += arr[j+1];
      }
    }
    int ans = 0;
    for (int i=0;i<5;i++){
      ans += arr[i];
    }
    return ans;
  }
}
