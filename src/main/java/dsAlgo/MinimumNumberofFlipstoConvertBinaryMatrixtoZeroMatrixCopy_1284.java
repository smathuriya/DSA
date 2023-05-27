package dsAlgo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class MinimumNumberofFlipstoConvertBinaryMatrixtoZeroMatrixCopy_1284 {
  static class StateWrapper{
    int[][] matrix;
    int step;

    public StateWrapper(int[][] m, int f){
      this.matrix = m;
      this.step = f;
    }

    @Override
    public String toString() {
      return "StateWrapper{" + "matrix=" + Arrays.toString(matrix) + ", step=" + step + '}';
    }
    /*@Override
    public boolean equals(Object o){
      if(this == o){
        return true;
      }
      if(o==null || getClass() != o.getClass()){
        return false;
      }
      StateWrapper data = (StateWrapper) o;
      return Arrays.deepEquals(matrix, data.matrix);
    }
    @Override
    public int hashCode(){
      return Arrays.deepHashCode(matrix);
    }*/
  }

  static boolean cellInsideMatrix(int row, int col, int[][] mat){
    return row>=0 && row <mat.length && col>=0 && col<mat[0].length;
  }

  public static void main(String args[])
  {
    int[][] mat = {{0,0},{0,1}};
    /*int[][] mat1 = {{1,1,1},{1,1,1}};
    int[][] mat2 = {{2,1,1},{1,1,1}};
    StateWrapper sw = new StateWrapper(mat,1);
    StateWrapper sw1 = new StateWrapper(mat1,1);
    StateWrapper sw2 = new StateWrapper(mat2,1);
    Set<StateWrapper> visited = new HashSet<StateWrapper>();
    //System.out.println(mat.hashCode());
    int[][] copy = Arrays.stream(mat).map(int[]::clone).toArray(int[][]::new);
    StateWrapper sw3 = new StateWrapper(copy,1);
    System.out.println(visited.add(sw));
    System.out.println(visited.add(sw1));
    System.out.println(visited.add(sw2));
    System.out.println(visited.add(sw3));
    System.out.println(visited.add(sw3));*/
    //System.out.println(Arrays.deepEquals(mat1,mat));

    //System.out.println(copy.hashCode());
    System.out.println(minFlips(mat));
  }
  static public int minFlips(int[][] mat) {
    Queue<StateWrapper> queue = new LinkedList<>();
    queue.add(new StateWrapper(mat, 0));
    int[][] dest = new int[mat.length][mat[0].length];
    for (int[] row : dest){
      Arrays.fill(row, 0);
    }
    Set<StateWrapper> visited = new HashSet<StateWrapper>();
    while (!queue.isEmpty()){
      StateWrapper current = queue.poll();
      if(Arrays.deepEquals(current.matrix, dest))
        return current.step;
      if(visited.contains(current)){
        System.out.println(current);
      }
      if(!visited.contains(current)){
        visited.add(current);
        int[][] directions = new int[][] {{0,1},{0,-1},{1,0},{-1,0}};
        int[][] copy = Arrays.stream(current.matrix).map(int[]::clone).toArray(int[][]::new);
        /*int[][] copy = new int[current.matrix.length][current.matrix[0].length];
        for (int i=0;i<current.matrix.length;i++) {
          for (int j = 0; j < current.matrix[0].length; j++) {
            copy[i][j] = current.matrix[i][j];
          }
        }*/
        System.out.println(Arrays.deepEquals(copy, current.matrix));
        for (int i=0;i<current.matrix.length;i++){
          for (int j=0;j<current.matrix[0].length;j++){
            for (int[] direction : directions){
              int next_row = i + direction[0];
              int next_col = j + direction[1];
              if(cellInsideMatrix(next_row, next_col, mat)){
                copy[next_row][next_col] = 1 - copy[next_row][next_col];
              }
            }
            copy[i][j] = 1-copy[i][j];
            queue.add(new StateWrapper(copy, current.step+1));
            copy = Arrays.stream(current.matrix).map(int[]::clone).toArray(int[][]::new);
            /*//int[][] copy = new int[current.matrix.length][current.matrix[0].length];
            for (int a=0;a<current.matrix.length;a++) {
              for (int b = 0; b < current.matrix[0].length; b++) {
                copy[a][b] = current.matrix[a][b];
              }
            }*/
          }
        }
      }
    }
    return -1;
  }
}

