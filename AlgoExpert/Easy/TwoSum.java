//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

//You may assume that each input would have exactly one solution, and you may not use the same element twice.

class Solution {
    public int[] twoSum(int[] nums, int target) {

        if(nums==null||nums.length<2) return new int[]{-1,-1};
        
        HashMap<Integer,Integer> set=new HashMap();
        
        
        for(int i=0; i<nums.length;i++)
        {
            if(set.containsKey(target-nums[i]))
            {
                return new int[]{set.get(target-nums[i]),i};
            }
            else
            {
                set.put(nums[i],i);
            }
            
            
        }
        return new int[]{-1,-1};
        
        
        
        
        
        
        
}
}
