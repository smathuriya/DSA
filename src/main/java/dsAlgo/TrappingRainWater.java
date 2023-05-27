package dsAlgo;

public class TrappingRainWater {
  public static void main(String args[]){

    int[] arr = {3,0,0,2,0,4};
    System.out.println(trappingWater(arr, arr.length));
  }

  static long trappingWater(int arr[], int n) {
    int[] tempArr = new int[arr.length-2];
    int max = arr[0];
    for(int i=1;i<n-1;i++){
      if(max > arr[i]){
        tempArr[i-1] = max - arr[i];
      }
      else {
        max = arr[i];
        tempArr[i-1] = 0;
      }
    }
    max = arr[n-1];
    for(int i=n-2;i>0;i--){
      if(max > arr[i]){
        tempArr[i-1] = Math.min(max - arr[i], tempArr[i-1]);
      }
      else {
        max = arr[i];
        tempArr[i-1] = 0;
      }
    }
    long sum =0;
    for(int i=0;i<arr.length-2;i++)
      sum += tempArr[i];
    return sum;
  }
}
