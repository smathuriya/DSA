package dsAlgo;

public class KadaneAlgorithm {
  public static void main(String args[]){
    int[] arr =  {-2,1,-3,4,-1,2,1,-5,4};
    System.out.println(maxSubarraySum(arr, arr.length));
  }

  static long maxSubarraySum(int arr[], int n){

    int sum = 0;
    int maxSum = 0;
    for(int i=0;i<n;i++){
      sum += arr[i];
      maxSum = maxSum < sum ? sum : maxSum;
      if(sum < 0)
        sum = 0;
    }
    /*if(maxSum == 0l){
      maxSum = Integer.MIN_VALUE;
      for(int i=0;i<n;i++){
        maxSum = maxSum < arr[i] ? arr[i] : maxSum;
      }
    }*/
    return maxSum;
  }
}
