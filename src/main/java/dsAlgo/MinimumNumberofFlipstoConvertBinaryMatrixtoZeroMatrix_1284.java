package dsAlgo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class MinimumNumberofFlipstoConvertBinaryMatrixtoZeroMatrix_1284 {

  public static void main(String args[])
  {
    int[][] mat = {{0,0},{0,1}};
    System.out.println(minFlips(mat));
  }
  static public int minFlips(int[][] mat) {
    Map<String,Integer> map = new HashMap<>();
    int ans = func(mat, new HashSet<>(),  map);
    return ans == Integer.MAX_VALUE ? -1 : ans;
  }

  public static void flip(int[][] mat, int n, int m, int i, int j){
    mat[i][j] = mat[i][j] ^ 1;
    if(i - 1 >= 0) mat[i - 1][j] = mat[i - 1][j] ^ 1;
    if(j - 1 >= 0) mat[i][j - 1] = mat[i][j - 1] ^ 1;
    if(i + 1 < n) mat[i + 1][j] = mat[i + 1][j] ^ 1;
    if(j + 1 < m) mat[i][j + 1] = mat[i][j + 1] ^ 1;
  }
  private static int func(int[][] mat, Set<String> set, Map<String, Integer> map) {
    StringBuilder strB = new StringBuilder("");
    StringBuilder strZ = new StringBuilder("");
    for (int i=0;i<mat.length;i++){
      for (int j=0;j<mat[0].length;j++){
        strB.append(Integer.toString(mat[i][j]));
        strZ.append("0");
      }
    }

    String str = strB.toString();
    if(strZ.toString().equals(str)){
      return 0;
    }
    if(map.containsKey(str))
      return map.get(str);
    if(set.contains(str))
      return Integer.MAX_VALUE;
    set.add(str);
    for(int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[0].length; j++) {
        flip(mat,mat.length, mat[0].length,i,j);

      }
    }
    return 0;
  }
}