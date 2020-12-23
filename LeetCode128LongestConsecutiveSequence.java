// Leetcode hard problem
//The idea is simple...addd all the elements to a set. Try finding a lowest number in a sequence.



class Solution {
    public int longestConsecutive(int[] nums) {
        
        
        if(nums==null || nums.length<1) return 0;
                
        HashSet<Integer> set=new HashSet<Integer>();
        
        for(int num: nums)
        {
            set.add(num);
        }
        int res=0;
        for(int i=0;i<nums.length;i++)
        {
            if(!set.contains(nums[i]-1))
            {
                int numLen=1;
                
                while(set.contains(nums[i]+1))
                {
                    numLen++;
                    nums[i]=nums[i]+1;
                }
                res=Math.max(res,numLen);
                
            }
            
        }
        return res;
        
    }
}
