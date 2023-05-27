package dsAlgo.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TwoSum {
  public static void main(String args[]){
    TwoSum t = new TwoSum();
    int[] nums = {3,2,4};
    int[] arr = t.twoSum(nums, 6);
    System.out.println(arr[0]+" "+arr[1]);
  }
  public int[] twoSum(int[] nums, int target) {
    Map<Integer,Integer> map = new HashMap<>();
    int[] ans = new int[2];
    for (int i=0;i<nums.length;i++){
      int ele = nums[i];
      if(map.containsKey(target-ele)){
        ans[0] = i;
        ans[1] = map.get(target-ele);
        return ans;
      }else {
        map.put(ele,i);
      }
    }
    return ans;
  }
}