package dsAlgo;

import java.util.Arrays;

public class JumpGame {
  public static void main(String args[]){
    int[] nums = {1,0,1,0};
    System.out.println(jump(nums));
  }

  public static boolean jump(int[] A) {
    int maxJump=0,cEnd=0,farthest=0;
    for (int i=0;i<A.length-1;i++){
      farthest = farthest<i+A[i]?i+A[i]:farthest;
      if(cEnd==i){
        if(A[i]==0&&farthest<=cEnd)
          return false;
        maxJump++;
        cEnd=farthest;
      }
    }
    return true;
  }
}
