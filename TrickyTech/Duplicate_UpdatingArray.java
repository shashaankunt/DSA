287. Find the Duplicate Number
Medium

Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

//There is only one repeated number in nums, return this repeated number.

 

Example 1:

Input: nums = [1,3,4,2,2]
Output: 2

class Solution {
    public int findDuplicate(int[] nums) {
       
        for(int i=0;i<nums.length;i++)
        {
            
            int val=Math.abs(nums[i]);
            
            if(nums[val]<0) return val;
            else nums[val]=-nums[val];
            
        }
        return -1;
        
        
        
    }
}
