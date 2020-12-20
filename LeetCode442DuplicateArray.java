// Leetcode 442: Duplicate in an array
// O(N) time o(1) space
// Imp Trick Question
// Use the index and make the number negative...if you see a negative number that means you have already encuntered the index.
// Nick White YTube

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> result=new ArrayList<Integer>();
        
        
        for(int i=0;i<nums.length;i++)
        {
            int index=Math.abs(nums[i])-1;
            
            if(nums[index]<0)
            {
                result.add(Math.abs(nums[i]));
            }
            else
            {
               nums[index] = - nums[index];
                
            }
            
            
        }
        
        return result;
        
        
        
    }
}
