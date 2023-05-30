package dsAlgo.searching;

public class DetonatetheMaximumBombs {
  public static void main(String args[]){
    DetonatetheMaximumBombs t = new DetonatetheMaximumBombs();
    int[][] bombs = {{1,1,5},{10,10,5}};
    System.out.println(t.maximumDetonation(bombs));
  }
  public int maximumDetonation(int[][] bombs) {
    int ans = 0;
    for (int i=0;i< bombs.length;) {
      int temp = binarySearch(bombs, i, bombs.length - 1, bombs[i][0] + bombs[i][2], bombs[i][1] + bombs[i][2]);
      ans = ans < temp-i+1 ? temp-i+1 : ans;
      i = temp;
    }
    return ans;
  }

  private int binarySearch(int[][] bombs, int start, int end, int x, int y) {
    int l=start, r=end;
    while (l<=r){
      int mid = (l+r)/2;
      if(bombs[l][0] <= x && bombs[l][1] <= y){
        l = mid+1;
      }else {
        r = mid -1;
      }
    }
    return l;
  }
}
