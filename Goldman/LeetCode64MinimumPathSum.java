class Solution {
    public int minPathSum(int[][] grid) {
        
        
        int rows=grid.length;
        int cols=grid[0].length;
        
        int[][] dp=new int[rows][cols];
        
        for(int i=0; i< rows; i++)
        {
            for(int j=0;j<cols;j++)
            {
                
             if(i==0 && j==0)
             {
                 dp[0][0]=grid[0][0];
             }
              else if(i==0 && j!=0)
              {
                  dp[i][j]=grid[i][j]+dp[i][j-1];
              }
              else if(j==0 && i!=0)
              {
                  dp[i][j]=grid[i][j] + dp[i-1][j];
              }
              else
              {
                  dp[i][j]=grid[i][j]+ Math.min(dp[i-1][j],dp[i][j-1]);
              }
                
                
                
                
            }
            
        }
        
        return dp[rows-1][cols-1];
    }
}
