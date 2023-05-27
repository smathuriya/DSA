package dsAlgo;

import java.util.HashMap;
import java.util.Map;

public class KeyPair {
  public static void main(String args[]){
    int[] arr =  {1, 2, 5, 6, 7};
    System.out.println(hasArrayTwoCandidates(arr, arr.length, 4));
  }
  static boolean hasArrayTwoCandidates(int arr[], int n, int x) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i=0;i<n;i++){
      if(map.containsKey(arr[i])){
        map.put(arr[i], map.get(arr[i])+1);
      }else {
        map.put(arr[i],1);
      }
    }
    for (int i=0;i<n;i++){
      int remain = x-arr[i];
      if(remain == arr[i]){
        if(map.get(arr[i])>1)
          return true;
      }else {
        if (map.containsKey(remain))
          return true;
      }
    }
    return false;
  }
}
