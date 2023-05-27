package dsAlgo;


import java.util.Arrays;

public class SticklerThief {
  public static void main(String args[]){
    int[] arr =  {10};

    System.out.println(FindMaxSum(arr, arr.length));
  }

  public static int FindMaxSum(int arr[], int n)
  {
    int[] dp = new int[n];
    Arrays.fill(dp, -1);
    return  fun(arr, 0, dp);

  }

  private static int fun(int[] arr, int index, int[] dp) {
    if(index >= arr.length )
      return 0;
    if(index == arr.length-1)
      return arr[index];
    if(dp[index] != -1)
      return dp[index];
    int pick = arr[index] + fun(arr, index+2, dp);
    int notPick = fun(arr, index+1, dp);
    return dp[index] = Math.max(pick, notPick);
  }
}
