package dsAlgo;

public class CountSquareSubmatriceswithAllOnes_1277 {
  public static void main(String args[]){
    int[][] mat = {{0,0,0},
                   {0,1,0},
                   {0,1,0},
                   {1,1,1},
                   {1,1,0}};
    System.out.println(countSquares(mat));
  }

  static public int countSquares(int[][] mat) {
    int ans = 0;
    int row = mat.length;
    int col = mat[0].length;

    for (int i=0;i<row;i++){
      for (int j=0;j<col;j++){
        boolean flag = true;
        int x1 = i, x2 = i, x3 = i, y1 = j, y2 = j, y3 = j;
        while (flag) {
          while (x1 <= x2 && y1 <= y2) {
            if(mat[x1][y1]==0){
              flag = false;
              break;
            }
            x1++;
          }
          if(!flag)
            break;
          while (x3 <= x2 && y3 <= y2) {
            if(mat[x3][y3]==0){
              flag = false;
              break;
            }
            y3++;
          }
          if(!flag)
            break;
          ans++;
          x2++;y2++;
          if(x2>=row || y2>=col)
            flag=false;
          x1=i;y1=y2;x3=x2;y3=j;
        }
      }
    }
    return ans;
  }
}
