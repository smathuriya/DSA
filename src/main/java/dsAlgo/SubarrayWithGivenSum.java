package dsAlgo;

import java.util.ArrayList;
import java.util.List;

public class SubarrayWithGivenSum {
  public static void main(String args[]){
    int[] arr =  {1,2,3};
    System.out.println(subarraySum(arr, arr.length, 0));
  }

  static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
  {
    ArrayList<Integer> list = new ArrayList<Integer>();
    int l=0,r=0;
    int sum = 0;
    for(int i=0;i<n;i++){
      sum += arr[i];
      r=i;
      if(sum > s){
        while (sum > s){
          sum -= arr[l++];
        }
      }
      if(sum == s){
        list.add(l+1);
        list.add(r+1);
        break;
      }
    }

    if(list.isEmpty() || list.get(0) > list.get(1)) {
      list.clear();
      list.add(-1);
    }
    return list;
  }
}
