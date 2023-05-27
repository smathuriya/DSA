package dsAlgo;

public class UniquePathsIII {
  static int ans = 0,gl, gh, empty=0;
  public static void main(String args[]){
    int[][] grid = {{1,0,0,0},{0,0,0,0},{0,0,2,-1}};
    gh = grid.length;
    gl = grid[0].length;
    uniquePathsIII(grid);
    System.out.println(uniquePathsIII(grid));
  }

  static public int uniquePathsIII(int[][] grid) {
    int startingX=0,startingY=0;
    for (int i=0;i<grid.length;i++){
      for( int j=0;j<grid[0].length;j++){
        if(grid[i][j]==1){
          startingX = i;
          startingY = j;
        }
        if(grid[i][j]==0)
          empty++;
      }
    }
    bfs(grid, startingX, startingY);
    return ans;
  }

  private static void bfs(int[][] grid, int i, int j) {
    if(i<0 || i>=gh || j<0 || j>=gl || grid[i][j] < 0)
      return;
    if(grid[i][j] == 2) {
      if(empty ==-1)
        ans++;
      return;
    }
    grid[i][j] = -2;
    empty--;
    bfs(grid,i+1,j);
    bfs(grid,i-1,j);
    bfs(grid,i,j+1);
    bfs(grid,i,j-1);
    grid[i][j]=0;
    empty++;
  }
}
