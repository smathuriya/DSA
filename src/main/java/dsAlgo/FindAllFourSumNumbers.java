package dsAlgo;

import java.util.ArrayList;
import java.util.Arrays;

public class FindAllFourSumNumbers {
  public static void main(String args[]){
    int[] a = {0,0,2,1,1};
    System.out.println(fourSum(a, 3));
  }

  static public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
    Arrays.sort(arr);
    ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
    int n = arr.length;
    for(int i=0;i<n;i++){
      for (int j=i+1;j<n;j++){
        int remain = k - arr[i] - arr[j];
        int l = 0, r = n-1;
        while (l<r){
          if(l == i)
            l++;
          if(l == j)
            l++;
          if(r == i)
            r--;
          if(r == j)
            r--;
          if(l<=n && r >= 0 && remain == arr[l]+arr[r]){
            ArrayList<Integer> list = new ArrayList<Integer>();
            int[] temparr = new int[4];
            temparr[0] = arr[i];
            temparr[1] = arr[j];
            temparr[2] = arr[l];
            temparr[3] = arr[r];
            Arrays.sort(temparr);
            for (int z=0;z<4;z++)
              list.add(temparr[z]);
            ans.add(list);
            break;
          }
          if(l<=n && r >= 0 && remain > arr[l]+arr[r]){
            l++;
          }
          if(l<=n && r >= 0 && remain < arr[l]+arr[r]){
            r--;
          }
        }
      }
    }
    return ans;
  }
}
