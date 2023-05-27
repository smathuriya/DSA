package dsAlgo.dp;

import java.util.Arrays;

public class CoinChange {
  public static void main(String args[]){
    CoinChange t = new CoinChange();
    int[] coins = {1,2,5};
    System.out.println(t.coinChange(coins, 11));
  }

  public int coinChange(int[] coins, int amount) {
    if(amount==0)
      return 0;
    int[] arr = new int[amount];
    for (int i=0;i<amount;i++){
      for (int j=0;j<coins.length;j++){
        if(i-(coins[j]-1)==0) {
          arr[i] = 1;
          continue;
        }
        if(i-coins[j] >=0 && arr[i-coins[j]]>0){
          if(arr[i]==0)
            arr[i] = arr[i-coins[j]] +1;
          else
            arr[i] = arr[i] < arr[i-coins[j]]+1 ? arr[i] : arr[i-coins[j]]+1;
        }
      }
    }
    if(arr[amount-1]==0)
      return -1;
    return arr[amount-1];
  }
}
