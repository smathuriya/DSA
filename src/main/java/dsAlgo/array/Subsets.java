package dsAlgo.array;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
  public static void main(String args[]){
    Subsets t = new Subsets();
    int[] nums = {1,2,3};
    System.out.println(t.subsets(nums));
  }
  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    fun(list, nums, 0);
    return list;
  }

  private void fun(List<List<Integer>> list, int[] nums, int i) {

  }
}
