package dsAlgo;

public class MaximumIndex {
  public static void main(String args[]){
    int[] a = {34, 8, 10, 3, 2, 80, 30, 33, 1};
    System.out.println(maxIndexDiff(a, a.length));
  }
  static int maxIndexDiff(int arr[], int n) {
    int[] dec = new int[n];
    int[] asc = new int[n];
    dec[n-1] = arr[n-1];
    for (int i=n-1-1;i>=0;i--){
      dec[i] = arr[i] < dec[i+1] ? dec[i+1] : arr[i];
    }
    asc[0] = arr[0];
    for(int i=1;i<n;i++){
      asc[i] = arr[i] < asc[i-1] ? arr[i] : asc[i-1];
    }
    /*for (int i=0;i<n;i++){
      System.out.print(dec[i]+" ");
    }
    System.out.println();
    for (int i=0;i<n;i++){
      System.out.print(asc[i]+" ");
    }*/

    int u = 0, l = 0, ans = 0;
    while (u<=n-1){
      while (u<=n-1 && dec[u] >= asc[l]){
        u++;
      }
      ans = ans < (u-1)-l ? (u-1)-l : ans;
      l++;
    }
    return ans;
  }
}
