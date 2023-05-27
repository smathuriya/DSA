package dsAlgo.array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Matrix01 {
  class Point{
    int i;
    int j;
    Point(int i,int j){
      this.i=i;
      this.j=j;
    }
  }
  public static void main(String args[]) {
    Matrix01 t = new Matrix01();
    int[][] mat = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
    PrintArray.print2DIntArray(mat);
  }

  public int[][] updateMatrix(int[][] mat) {
    boolean[][] visit = new boolean[mat.length][mat[0].length];
    for (int i = 0; i < visit.length; i++) {
      Arrays.fill(visit[i], false);
    }

    int[][] temp = bfs(mat, visit, 0, 0);
    return mat;
  }

  private int[][] bfs(int[][] mat, boolean[][] visit, int pi, int pj) {

    Queue<Point> queue = new LinkedList<>();
    queue.add(new Point(pi, pj));
    while (!queue.isEmpty()){
      Point point = queue.poll();
      int i = point.i;
      int j = point.j;
      if(mat[i][j]==1 || visit[i][j] || i<0 || i>= mat.length || j<0 || j>=mat[0].length)
        continue;
      visit[point.i][point.j]=true;
      queue.add(new Point(i+1,j));
      queue.add(new Point(i-1,j));
      queue.add(new Point(i,j+1));
      queue.add(new Point(i,j-1));
    }
    return mat;
  }
}
