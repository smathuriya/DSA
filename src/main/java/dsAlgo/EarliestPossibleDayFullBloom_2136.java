package dsAlgo;

import java.util.Arrays;

public class EarliestPossibleDayFullBloom_2136 {
  public static void main(String args[])
  {
    int[] plantTime ={1,2,3,2};
    int[] growTime = {2,1,2,1};
    EarliestPossibleDayFullBloom_2136 nk = new EarliestPossibleDayFullBloom_2136();
    System.out.println(nk.earliestFullBloom(plantTime, growTime));
  }

  public int earliestFullBloom(int[] plantTime, int[] growTime) {
    int ans;
    Pair[] pair = new Pair[plantTime.length];
    for (int i=0;i< plantTime.length;i++){
      pair[i] = new Pair(plantTime[i], growTime[i]);
    }
    Arrays.sort(pair, (a,b) -> b.g - a.g);
    ans = pair[0].p+pair[0].g;
    int temp = pair[0].p;
    for (int i=1;i<pair.length;i++){
      ans = Math.max(ans, temp+pair[i].p+pair[i].g);
      temp += pair[i].p;
    }
    return ans;
  }
  class Pair{
    int p;
    int g;
    public Pair(int p, int g){
      this.p = p;
      this.g = g;
    }
  }
}
