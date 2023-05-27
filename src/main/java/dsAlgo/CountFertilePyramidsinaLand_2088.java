package dsAlgo;

public class CountFertilePyramidsinaLand_2088 {
  public static void main(String args[]){
    int[][] arr = {{1,1,1,1,0},{1,1,1,1,1},{1,1,1,1,1},{0,1,0,0,1}};
    System.out.println(countPyramids(arr));
  }

  public static int countPyramids(int[][] grid) {
    int row = grid.length;
    int col = grid[0].length;
    int[][] tempGrid = grid;
    for (int i=row-2;i>=0;i--){
      for (int j=1;j<col-1;j++){
        if(tempGrid[i][j]==1 && tempGrid[i+1][j] >=1 && tempGrid[i+1][j-1] >= 1 && tempGrid[i+1][j+1] >= 1){
          tempGrid[i][j] = Math.min(Math.min(tempGrid[i+1][j], tempGrid[i+1][j-1]), tempGrid[i+1][j+1])+1;
        }
      }
    }
    int ans = 0;
    for(int i=0;i<row;i++){
      for (int j=0;j<col;j++){
        if(tempGrid[i][j]>1)
          ans += tempGrid[i][j]-1;
      }
    }
    for(int i=0;i<row;i++){
      for (int j=0;j<col;j++){
        if(tempGrid[i][j]>1)
          tempGrid[i][j] =1;
      }
    }
    for (int i=1;i<row;i++){
      for (int j=1;j<col-1;j++){
        if(tempGrid[i][j]==1 && tempGrid[i-1][j]>=1 && tempGrid[i-1][j-1]>=1 && tempGrid[i-1][j+1]>=1){
          tempGrid[i][j] = Math.min(Math.min(tempGrid[i-1][j],tempGrid[i-1][j-1]),tempGrid[i-1][j+1])+1;
        }
      }
    }
    for(int i=0;i<row;i++){
      for (int j=0;j<col;j++){
        if(tempGrid[i][j]>1)
          ans += tempGrid[i][j]-1;
      }
    }

    return ans;
  }
}
