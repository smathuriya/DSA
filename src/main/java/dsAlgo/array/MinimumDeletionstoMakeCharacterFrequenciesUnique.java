package dsAlgo.array;

import java.util.Arrays;

public class MinimumDeletionstoMakeCharacterFrequenciesUnique {
  public static void main(String args[]){
    MinimumDeletionstoMakeCharacterFrequenciesUnique t = new MinimumDeletionstoMakeCharacterFrequenciesUnique();
    System.out.println(t.minDeletions("adec"));
  }
  public int minDeletions(String s) {
    int[] arr = new int[26];
    Arrays.fill(arr,0);
    char[] carr = s.toCharArray();
    for (char ele : carr){
      arr[ele-97] = arr[ele-97]+1;
    }
    Arrays.sort(arr);
    int count =0;
    for (int i=arr.length-2;i>=0&&arr[i]>0;i--){
      if(arr[i]>=arr[i+1]){
        count += arr[i]-arr[i+1]+1;
        if(arr[i+1]==0){
          count--;
          arr[i]=0;
        }else
          arr[i] = arr[i+1]-1;
      }
    }
    return count;
  }
}
