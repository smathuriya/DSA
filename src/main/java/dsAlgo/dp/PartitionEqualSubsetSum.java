package dsAlgo.dp;

import java.util.Arrays;

public class PartitionEqualSubsetSum {
  public static void main(String args[]){
    PartitionEqualSubsetSum t = new PartitionEqualSubsetSum();
    int[] nums = {1,2,5};
    System.out.println(t.canPartition(nums));
  }
  public boolean canPartition(int[] nums) {
    int sum = 0;
    for(int ele : nums){
      sum += ele;
    }
    if(sum%2==1)
      return false;
    sum = sum/2;
    boolean numCoin = coinChange(nums, sum);
    return numCoin;
  }


  public boolean coinChange(int[] nums, int sum) {
    boolean[] dp = new boolean[sum+1];
    Arrays.fill(dp, false);
    dp[0] = true;

    for (int num : nums) {
      for (int i = sum; i > 0; i--) {
        if (i >= num) {
          dp[i] = dp[i] || dp[i-num];
        }
      }
    }
    return dp[sum];
  }
}
