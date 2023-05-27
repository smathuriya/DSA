package dsAlgo.BSTorBT;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MinimumHeightTrees {
  public static void main(String args[]){
    MinimumHeightTrees t = new MinimumHeightTrees();
    int[][] edges = {{3,0},{3,1},{3,2},{3,4},{5,4}};
    System.out.println(t.findMinHeightTrees(6,edges));
  }
  public List<Integer> findMinHeightTrees(int n, int[][] edges) {
    if(edges.length==0) {
      List<Integer> l = new ArrayList<>();
      l.add(0);
      return l;
    }
    List<Set<Integer>> elist = new ArrayList<>();
    for (int i=0;i<n;i++){
      elist.add(new HashSet<>());
    }
    for (int[] ele : edges){
      elist.get(ele[0]).add(ele[1]);
      elist.get(ele[1]).add(ele[0]);
    }
    List<Integer> leavesList = new ArrayList<>();
    for (int i=0;i<elist.size();i++){
      if(elist.get(i).size()==1)
        leavesList.add(i);
    }
    while (n>2){
      n -= leavesList.size();
      List<Integer> newLeavesList = new ArrayList<>();
      for (Integer ele : leavesList){
        elist.get(elist.get(ele).iterator().next()).remove(ele);
        if(elist.get(elist.get(ele).iterator().next()).size()==1)
          newLeavesList.add(elist.get(ele).iterator().next());
      }
      leavesList = newLeavesList;
    }
    return leavesList;
  }
}
