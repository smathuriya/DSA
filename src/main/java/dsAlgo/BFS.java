package dsAlgo;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
  public static void main(String args[]){
    int[][] arr = {{0,1,1,0,0},{1,0,0,0,1},{1,0,0,1,0},{0,0,1,0,0},{0,1,1,0,0}};
    printBfs(arr);
  }

  private static void printBfs(int[][] arr) {
    Queue<Integer> q = new LinkedList<>();
    q.add(0);
    boolean[] visit = new boolean[arr.length];
    Arrays.fill(visit,false);
    while (!q.isEmpty()){
      int ele = q.poll();
      visit[ele] = true;
      System.out.print(ele);
      for (int i=0;i<arr.length;i++){
        if(arr[ele][i]==1 && !visit[i])
          q.add(i);
      }
    }
  }
}
