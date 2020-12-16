//153. Find Minimum in Rotated Sorted Array
// Modify the binary search
// Check if middle element is greater than last element...if that is the case something is off
// Update start and end accordingly. Get the pivot element


class Solution {
    public int findMin(int[] nums) {
     
        if(nums==null || nums.length<1) return -1;
        
       int start=0;
        int end=nums.length-1;
        int mid=-1;
        
        while(start<end)
        {
            mid=start+(end-start)/2;
            
            if(nums[mid]>nums[end])
            {
                start=mid+1;
            }
            else
            {
                end=mid;
            }  
        }
            
           return nums[start]; 
    }
}
