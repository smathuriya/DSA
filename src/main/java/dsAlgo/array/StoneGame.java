package dsAlgo.array;

public class StoneGame {
  public static void main(String args[]){
    int[] arr = {3,7,2,3};
    System.out.println(stoneGame(arr));
  }

  private static boolean stoneGame(int[] arr) {
    return stoneGamefun(arr, 0, arr.length-1, 0, 0);
  }


  public static boolean stoneGamefun(int[] piles, int l, int r, int a, int b) {
    if(l+1==r) {
      if (a > b)
        return true;
      else
        return false;
    }
    return stoneGamefun(piles, l+1, r-1, a+piles[l], b+piles[r]) ||
        stoneGamefun(piles, l+1,r-1, a+piles[r], b+piles[l]) ||
        stoneGamefun(piles,l+2, r, a+piles[l], b+piles[l+1]) ||
        stoneGamefun(piles,l,r-2,a+piles[r], b+piles[r-1]);
  }
}
