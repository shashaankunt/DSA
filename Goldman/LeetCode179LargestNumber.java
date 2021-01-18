//179. Largest Number
// Given a list of non-negative integers nums, arrange them such that they form the largest number.
// Sorting uisng comparator

class Solution {
    public String largestNumber(int[] nums) {
        
        String[] str=new String[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            str[i]=String.valueOf(nums[i]);
        }
        
        
        
        Arrays.sort(str,new Comp());
        
        if(str[0].equals("0"))
        {
            return "0";
        }
        
        StringBuilder sb=new StringBuilder();
        for(String a: str)
        {
            sb.append(a);
        }
        
        return sb.toString();
        
    }
    private class Comp implements Comparator<String>
    {
        public int compare(String a,String b)
        {
            String ab=a+b;
            String ba=b+a;
            
            return ba.compareTo(ab);
        }
        
        
    }
    
    
}
