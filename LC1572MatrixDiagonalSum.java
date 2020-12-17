//Calculating boh the diagonal's sum 
// Primary diagonal row= col (i=i)
//Secondary diagonal row+col=n [(len-1-i)(i)] 

class Solution {
    public int diagonalSum(int[][] mat) {
     
        if(mat==null || mat.length<1) return -1;
        
        int midSum=0;
        int ans=0;
        int len=mat.length;
        
        for(int i=0;i<mat.length;i++)
        {
            ans+=mat[i][i];
            ans+=mat[len-1-i][i];
        }
        
        //
        
        if(mat.length%2!=0) midSum=mat[(len/2)][(len/2)];
        
        return ans-midSum;
    }
    
    
    
    
}
