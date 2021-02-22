//Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]

class Solution {
    public void moveZeroes(int[] nums) {
     
        if(nums==null || nums.length<=1) return ;
        
        int index=0;
        for(int num: nums)
        {
            if(num!=0)
            {
                nums[index++]=num;
            }
        }
        
        for(int i=index;i<nums.length;i++)
        {
            nums[index++]=0;
        }
        
       
        
        
        
        
    }
}
