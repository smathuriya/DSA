package dsAlgo;

public class OddEvenSum {
  public static void main (String[] args)
  {
    int arr[] = {1, 1, 1 };
    int n = arr.length;
    System.out.println(cntIndexesToMakeBalance(arr));
  }

  private static int cntIndexesToMakeBalance(int[] arr) {
    int es=0,os=0,ans=0;
    int[] arrTemp = new int[arr.length];
    for(int i=0;i<arr.length;i++){
      if(i%2==0)
        es += arr[i];
      else
        os += arr[i];
    }
    arrTemp[0] = arr[0];
    arrTemp[1] = arr[1];
    for(int i=2;i<arr.length;i++){
      arrTemp[i] = arrTemp[i-2]+arr[i];
    }
    for(int i=0;i<arr.length;i++){
      int sumOdd = 0;
      int sumEven = 0;
      if(i%2==0){
        if(i==0) {
          sumEven = os;
          sumOdd = es - arr[i];
        }
        else {
          sumEven = arrTemp[i-2]+os-arrTemp[i-1];
          sumOdd = arrTemp[i-1]+es-arrTemp[i];
        }
      }else {
        if(i==1){
          sumEven = arrTemp[i-1] + os - arrTemp[i];
          sumOdd = es-arrTemp[i-1];
        }else {
          sumEven = arrTemp[i-1]+os-arrTemp[i];
          sumOdd = arrTemp[i-2]+es-arrTemp[i-1];
        }
      }
      if(sumOdd==sumEven) {
        //System.out.println(i+" oddSum: "+ sumOdd +"evenSum: "+sumEven);
        ans++;
      }
    }
    return ans;
  }
}
