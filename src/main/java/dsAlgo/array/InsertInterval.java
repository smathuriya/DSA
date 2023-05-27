package dsAlgo.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class InsertInterval {
  class Interval{
    int s;
    int e;
    Interval(int s, int e){
      this.s = s;
      this.e = e;
    }
  }
  public static void main(String args[]){
    InsertInterval t = new InsertInterval();
    int[][] intervals = {{1,3},{6,9}};
    int[] newInterval = {2,5};
    t.insert(intervals, newInterval);
    System.out.println();
  }
  public int[][] insert(int[][] a, int[] b) {
      if(a.length==0){
        int[][] tap = new int[1][2];
        tap[0][0] = b[0];
        tap[0][1] = b[1];
        return tap;
      }
      boolean flag = false;
      List<Interval> list = new ArrayList<>();
      int s=Integer.MAX_VALUE, e=Integer.MIN_VALUE;
      for (int i=0;i<a.length;i++){
        if(a[i][1] < b[0] || a[i][0]>b[1]){
          if(a[i][0]>b[1]){
            list.add(new Interval(s,e));
            flag=true;
          }
          list.add(new Interval(a[i][0],a[i][1]));
        }else {
          s = Math.min(Math.min(a[i][0], b[0]), s);
          e = Math.max(Math.max(a[i][1], b[1]), e);
        }
      }
      if (!flag){
        int[][] tap = new int[1][2];
        tap[0][0] = s;
        tap[0][1] = e;
        return tap;
      }
      int[][] ans = new int[list.size()][2];
      int count = 0;
      for (Interval intrvl : list){
        ans[count][0] = intrvl.s;
        ans[count][1] = intrvl.e;
        count++;
      }
      return ans;
  }
}
