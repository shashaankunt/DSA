class Solution {
    public void gameOfLife(int[][] board) {
        
        int[] neigh={0,1,-1};
        
        
        int[][] copy=new int[board.length][board[0].length];
        
        
        
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                int total=0;
                for(int r1=0;r1<neigh.length;r1++)
                {
                    for(int c1=0;c1<neigh.length;c1++)
                    {
                        if(r1==0 && c1==0) continue;
                        
                        int row=i+neigh[r1];
                        int col=j+neigh[c1];
                        
                        
                        if(row<0 || row>=board.length || col<0 || col>=board[0].length) continue;
                        
                        if(board[row][col]==1) total++;
                        
                    }
                    
                }
                
                
                if( (total<2 || total>3 ) && board[i][j]==1) copy[i][j]=0;
                
                if((total>1 && total<4) && board[i][j]==1) copy[i][j]=1 ;
                
                    if(board[i][j]==0 && total==3) copy[i][j]=1;
                
                
            }
            
            
            
        }
        
        
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                board[i][j]=copy[i][j];
            }
        }
        
        
        
    }
}
