//LeetCode Two Sum using List
// Can be done using map by storing the index as value.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        
        ArrayList<Integer> list=new ArrayList();
        
        for(int num=0;num<nums.length;num++)
        {
            
            if(list.contains(target-nums[num]))
            {
                res[0]=num;
                res[1]=list.indexOf(target-nums[num]);
                return res;
            }
            else
            {
                list.add(nums[num]);
            }
            
        }
        
        return res;
    }
}
