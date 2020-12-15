// 33. Search in Rotated Sorted Array
// Modify the binary search to find the pivot element and then search based off the target value
// Nick white - YTube

class Solution {
    public int search(int[] nums, int target) {
       
        if(nums==null || nums.length<1) return -1;
        
        int start=0;
        int end=nums.length-1;
        
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[end])
            {
                start=mid+1;
            }
            else
            {
                end=mid;
            }
            
        }
        
        
        if(target>=nums[start] && target<=nums[nums.length-1])
        {
            end=nums.length-1;
        }
        else
        {
        
            end=start-1;
            start=0;    
        }
        
        return binarySearch(nums,start,end, target);
        
    }
    
    public int binarySearch(int[] nums, int start, int end, int target)
    {
        int index=-1;
        
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            
             if(nums[mid]==target)   
                return mid;
             else if(nums[mid]>target)
             {
                 end=mid-1;
             }
            else
            {
                start=mid+1;
            }
                
            
            
        }
        
        return index;
        
        
        
    }
    
    
}
