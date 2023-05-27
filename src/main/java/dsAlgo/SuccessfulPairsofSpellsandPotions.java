package dsAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SuccessfulPairsofSpellsandPotions {
  public static void main(String args[]){
    int[] spells = {1,5,3};
    int[] potions = {1,2,3,4,5};
    long success = 7;
    int[] pair = successfulPairs(spells,potions,success);
    for (int i=0;i<pair.length;i++){
      System.out.println(pair[i]);
    }
  }
  public static int[] successfulPairs(int[] spells, int[] potions, long success) {
    //Arrays.sort(spells);
    Arrays.sort(potions);
    int[] pairs = new int[spells.length];
    for (int i=0;i<spells.length;i++){
      int l=0,r= potions.length-1;
      while (l<=r){
        int mid = (l+r)/2;

        long prod = (long) spells[i]*potions[mid];
        if(prod<success){
          l=mid+1;
        }
        if(prod>=success){
          r=mid-1;
        }
      }
      pairs[i]= potions.length-l;
    }
    return pairs;
  }
}
