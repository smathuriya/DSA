package dsAlgo.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
  List<List<Integer>> ans = new ArrayList<>();
  public static void main(String args[]){
    Permutations t = new Permutations();
    int[] nums = {1,2,3};
    System.out.println(t.permute(nums));
  }
  public List<List<Integer>> permute(int[] nums) {
    fun(nums, new ArrayList<>());
    return ans;
  }
  public void fun(int[] nums, ArrayList<Integer> list) {
    if(nums.length==list.size()){
      List<Integer> temp = new ArrayList<>();
      for (Integer r : list){
        temp.add(r);
      }
      ans.add(temp);
      return;
    }
    for (int i=0;i<nums.length;i++){
      if(list.contains(nums[i]))
        continue;
      list.add(nums[i]);
      fun(nums, list);
      list.remove(list.indexOf(nums[i]));
    }
  }
}
