package dsAlgo;

public class MaximumProductSubarray {
  public static void main(String args[]){
    int[] arr = {0,3, -5, -2, 8, -7, -6, -2, -3, -9};
    //int[] arr = {2,-2,-1,-3};
    System.out.println(maxProduct(arr, arr.length));
  }

  static long maxProduct(int[] arr, int n) {
    long max_ending_here = arr[0];

    // min negative product ending
    // at the current position
    long min_ending_here = arr[0];

    // Initialize overall max product
    long max_so_far = arr[0];

    // /* Traverse through the array.
    // the maximum product subarray ending at an index
    // will be the maximum of the element itself,
    // the product of element and max product ending previously
    // and the min product ending previously. */
    for(int i=1;i<n;i++){
      long temp = Math.max(Math.max(arr[i], arr[i] * max_ending_here), arr[i] * min_ending_here);
      min_ending_here = Math.min(Math.min(arr[i], arr[i] * max_ending_here), arr[i] * min_ending_here);
      max_ending_here = temp;
      max_so_far = Math.max(max_so_far, max_ending_here);
    }

    return max_so_far;
  }
}
