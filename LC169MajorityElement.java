// 169. Majority Element
// Each element votes for itself. The one that is left is the major element.
// Boyer-Moore Majority Vote Algorithm
// http://www.cs.utexas.edu/~moore/best-ideas/mjrty/

class Solution {
    public int majorityElement(int[] nums) {
        
        int count=1;
        int cand=nums[0];
        
        for(int i=1;i<nums.length;i++)
        {
            if(count==0)
                {
                    cand=nums[i];
                }
            
            if(cand==nums[i])
            {
                count++;
            }
            else
            {
                count--;   
            }            
        }

        return cand;
    }
}
