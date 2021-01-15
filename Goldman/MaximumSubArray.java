class Solution {
    public int maxSubArray(int[] nums) {
        
        int max=Integer.MIN_VALUE;
        int currMax=0;
        
        
        for(int i=0;i<nums.length;i++)
        {
            currMax=Math.max(nums[i],nums[i]+currMax);
            max=Math.max(currMax, max);
            
        }
        return max;
}
}
