// TWO POINTERS SOLUTION -- 

class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        
        if(nums==null||nums.length<1) return 0;
        
        int start=0;
        int end=start+1;
        int sum=0;
        int res=Integer.MAX_VALUE;
        
        
       for(int i=0;i<nums.length;i++)
       {
           sum+=nums[i];
           
           while(sum>=s)
           {
               res=Math.min(res,i+1-start);
               sum-=nums[start++];
           }
           
           
       }
        
         return res==Integer.MAX_VALUE?0:res;
        
    }
}
