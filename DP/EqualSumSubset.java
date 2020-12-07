//LeetCode: Equal Sumsubset partition -- YT Bha Ver
//416. Partition Equal Subset Sum


class Solution {
    public boolean canPartition(int[] nums) {
        
        if(nums==null) return false;
        
        if(nums.length<2) return false;
        
        int totalsum=0;
        for(int num: nums)
        {
            totalsum+=num;
            
        }
        
        if(totalsum%2!=0) return false;
        
        
        int subSum=totalsum/2;
        int len=nums.length;
    
            
        boolean[][] dp=new boolean[len+1][subSum+1];
        
        
        for(int i=0;i<dp[0].length;i++)
        {
            dp[0][i]=false;
        }
        
        for(int j=0;j<dp.length;j++)
        {
            dp[j][0]=true;
        }
        
        
        for(int i=1;i<len+1;i++)
        {
            for(int j=1;j<subSum+1;j++)
            {
                if(nums[i-1]<=j)
                {
                  
                    dp[i][j]=dp[i-1][j]||dp[i-1][j-nums[i-1]];
                    
                }
                
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
                
                
            }
                       
        }
        
        return dp[len][subSum];
        
    }
}
