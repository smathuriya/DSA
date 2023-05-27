package dsAlgo;

// A Dynamic Programming based Java program to find minimum
// number operations to convert str1 to str2
class EDIST {
	public static void main(String args[])
	{
		String str1 = "sunday";
		String str2 = "saturday";
		//System.out.println(str1.charAt(0));
		System.out.println(editDistDP(str1, str2, str1.length(), str2.length()));
	}
	static int editDistDP(String str1, String str2, int r, int c)
	{
		int[][] dp = new int[r+1][c+1];
		for (int i=0;i<=r;i++){
			for(int j=0;j<=c;j++){
				if(i==0){
					dp[i][j] = j;
					continue;
				}
				if(j==0){
					dp[i][j] = i;
					continue;
				}
				if(str1.charAt(i-1) == str2.charAt(j-1)){
					dp[i][j] = Math.min(Math.min(dp[i-1][j], dp[i][j-1])+1, dp[i-1][j-1]);
				}else {
					dp[i][j] = Math.min(Math.min(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1])+1;
				}
			}
		}
		return dp[r][c];
	}
}
