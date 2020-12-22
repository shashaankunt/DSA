//Maximum array
//Kadane's algorithm

class Solution {
    public int maxSubArray(int[] nums) {
        
        
        int currMax=nums[0];
        int totalMax=nums[0];
        
        for(int i=1;i<nums.length;i++)
        {

            currMax=Math.max(nums[i],currMax+nums[i]);
            totalMax=Math.max(totalMax,currMax);
                        
        }
        
        return totalMax;
        
    }
}
