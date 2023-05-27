package dsAlgo.array;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
  public static void main(String args[]){
    RottingOranges t = new RottingOranges();
    int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
    System.out.println(t.orangesRotting(grid));
  }
  public int orangesRotting(int[][] grid) {
    int i,j;
    for (i=0;i<grid.length;i++){
      for (j=0;j<grid[0].length;j++){
        if(grid[i][j]==2)
          return fun(grid, i,j);
      }
    }
    return 0;
  }

  private int fun(int[][] grid, int i, int j) {
    Queue<int[]> q = new LinkedList<>();
    int[] arr = new int[2];
    arr[0] = i;
    arr[1] = j;
    q.add(arr);
    int count = 0;
    return  0;
  }
}
