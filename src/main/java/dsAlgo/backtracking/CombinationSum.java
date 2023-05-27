package dsAlgo.backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
  List<List<Integer>> ans = new ArrayList<>();
  public static void main(String args[]){
    CombinationSum t = new CombinationSum();
    int [] candidates = {1,2,3};
    int target = 7;
    System.out.println(t.combinationSum(candidates, target));
  }

  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<Integer> list = new ArrayList<>();
    fun(candidates, target, 0, list, 0);
    return ans;
  }

  public void fun(int[] candidates, int target, int currentSum, List<Integer> list, int index){
    if(currentSum == target){
      List<Integer> temp = new ArrayList<>();
      for (Integer r : list){
        temp.add(r);
      }
      ans.add(temp);
      return;
    }
    if(currentSum > target) {
      return;
    }
    for (int i=index;i<candidates.length;i++){
      list.add(candidates[i]);
      currentSum += candidates[i];
      fun(candidates, target, currentSum, list, i);
      int item = list.get(list.size()-1);
      list.remove(list.size()-1);
      currentSum -= item;
    }
  }
}
