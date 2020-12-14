//Leetcode 268: Missing Number

class Solution {
    public int missingNumber(int[] nums) {
        
        if(nums==null || nums.length<1) return -1;
        
        int size=nums.length;
        int sum= (size+1)*(size)/2;
        int arrSum=0;
        for(int a: nums)
        {
            arrSum+=a;
        }
        
        return sum-arrSum;
        
    }
}
