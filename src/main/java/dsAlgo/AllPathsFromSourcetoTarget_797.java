package dsAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllPathsFromSourcetoTarget_797 {
  public static void main(String args[]){
    int [][] mat = {{1,2},{3},{3},{}};
    System.out.println(allPathsSourceTarget(mat));
  }

  static public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> l = new ArrayList<>();
    dfs(graph,list,l,0);

    return list;
  }

  private static void dfs(int[][] graph, List<List<Integer>> list, List<Integer> l,int val) {
    if(val== graph.length-1) {
      l.add(val);
      list.add(new ArrayList<>(l));
      l.remove(l.size()-1);
      return;
    }
    for (int ele : graph[val]){
      l.add(val);
      dfs(graph,list, l,ele);
      l.remove(l.size()-1);
    }
  }
}
