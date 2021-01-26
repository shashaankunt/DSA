class Solution {
    public int findDuplicate(int[] nums) {
        
        int first=nums[0];
        int sec=nums[nums[0]];
        
        while(first!=sec)
        {
            first=nums[first];
            sec=nums[nums[sec]];
        }
        
         first=0;
        
        while(first!=sec)
        {
            first=nums[first];
            sec=nums[sec];
        }
         return sec;
    }
}

// Two pointers -- First and second
