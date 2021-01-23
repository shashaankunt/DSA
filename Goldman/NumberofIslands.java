class Solution {
    public int numIslands(char[][] grid) {
        
        if(grid==null || grid.length==0)
        {
            return 0;
        }
        
        int rows=grid.length;
        int cols=grid[0].length;
        int max=0;
        
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(grid[i][j]=='1')
                {
                    max+=dfs(grid,i,j);
                }
                
            }
            
        }
        
        return max;
        
        
    }
    
    public int dfs(char[][]  grid, int i, int j)
    {
        if(i<0 || i>= grid.length  || j <0 || j >=grid[0].length || grid[i][j]=='0')
        {
            return 0;
}
        grid[i][j]='0';
        
        dfs(grid, i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
        return 1;
    }
    
}
