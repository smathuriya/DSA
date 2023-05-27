package dsAlgo.twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
  public static void main(String args[]){
    int[] nums = {-1,0,1,2,-1,-4};
    List<List<Integer>> list = threeSum(nums);
    System.out.println(list);
    //System.out.println("Reverse Words in a String".replaceAll("[ ]",""));
  }

  public static List<List<Integer>> threeSum(int[] nums) {
    if(nums.length==0)
      return new ArrayList<>();

    Set<List<Integer>> set = new HashSet<>();
    Arrays.sort(nums);
    for (int i=0;i<nums.length-2;i++){
      int l=i+1, r=nums.length-1;
      while (l<r){
        int sum = nums[i]+nums[l]+nums[r];
        if(sum==0)
          set.add(Arrays.asList(nums[i],nums[l++],nums[r--]));
        else if(sum<0)
          l++;
        else
          r--;
      }
    }
    return new ArrayList<>(set);
  }

}
