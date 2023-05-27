package dsAlgo;

import java.util.ArrayList;

public class StockBuyAndSell {
  public static void main (String[] args)
  {
    int[] arr = {4,3,2,1};
    System.out.println(stockBuySell(arr, arr.length));
  }

  static ArrayList<ArrayList<Integer>> stockBuySell(int arr[], int n) {
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    int buy = 0, sell =0;
    for(int i=1;i<n;i++){
      if(arr[i] > arr[i-1]){
        sell = i;
      }else {
        if(arr[buy] < arr[sell]) {
          ArrayList<Integer> temp = new ArrayList<>();
          temp.add(buy);
          temp.add(sell);
          ans.add(temp);
        }
        buy = sell = i;
      }
    }
    if(arr[buy] < arr[sell]) {
      ArrayList<Integer> temp = new ArrayList<>();
      temp.add(buy);
      temp.add(sell);
      ans.add(temp);
    }
    return ans;
  }
}
