package dsAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BestTimetoBuyandSellStock {
  public static void main(String args[]){
    int[] prices = {1,2,4,2,5,7,2,4,9,0};
    System.out.println(maxProfit(prices));
  }
  public static int maxProfit(int[] prices) {
    List<Integer> list = new ArrayList<>();
    int minValue = prices[0];
    for (int i=1;i<prices.length;i++){
      if(prices[i]>=prices[i-1]){
        continue;
      }
      list.add(prices[i-1]-minValue);
      minValue=prices[i];
    }
    list.add(prices[prices.length-1]-minValue);
    Integer[] arr = list.toArray(new Integer[list.size()]);
    Arrays.sort(arr);
    if(arr.length>=2)
      return arr[arr.length-1]+arr[arr.length-2];
    if(arr.length==1)
      return arr[0];
    else
      return 0;







    /*int maxProfit=0,minValue=prices[0];
    for (int i=1;i<prices.length;i++){
      if(prices[i]-minValue>0)
        maxProfit = maxProfit<prices[i]-minValue? prices[i]-minValue : maxProfit;
      if(prices[i] < minValue)
        minValue = prices[i];
    }
    return maxProfit;*/
  }
}
