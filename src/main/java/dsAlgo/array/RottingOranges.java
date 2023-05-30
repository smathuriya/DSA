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
    int time=0,totalFresh=0,totalConverted=0;
    Queue<int[]> q = new LinkedList<>();
    for (int i=0;i<grid.length;i++){
      for (int j=0;j<grid[0].length;j++){
        if(grid[i][j]==2){
          q.add(new int[]{i,j});
        }
        if(grid[i][j]==1)
          totalFresh++;
      }
    }
    if(totalFresh==0)
      return 0;
    while (!q.isEmpty()){
      time++;
      int qSize = q.size();
      for (int i=0;i<qSize;i++){
        int[] arr = q.poll();
        int a = arr[0];
        int b = arr[1];
        if(a+1>=0 && a+1<grid.length && grid[a+1][b]==1) {
          totalConverted++;
          grid[a+1][b] = 2;
          q.add(new int[] {a + 1, b});
        }
        if(a-1>=0 && a-1<grid.length && grid[a-1][b]==1) {
          totalConverted++;
          grid[a-1][b] = 2;
          q.add(new int[] {a - 1, b});
        }
        if(b+1>=0 && b+1<grid[0].length && grid[a][b+1]==1) {
          totalConverted++;
          grid[a][b+1] = 2;
          q.add(new int[] {a, b + 1});
        }
        if(b-1>=0 && b-1<grid[0].length && grid[a][b-1]==1) {
          totalConverted++;
          grid[a][b-1] = 2;
          q.add(new int[] {a, b - 1});
        }
      }
    }
    if(totalFresh == totalConverted)
      return time-1;
    else
      return -1;
  }
}
