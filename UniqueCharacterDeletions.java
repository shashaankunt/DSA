// Leetcode 1647. Minimum Deletions to Make Character Frequencies Unique

class Solution {
    public int minDeletions(String s) {
        
        if(s==null||s.length()<=1) return 0;
        
        
        int[] num=new int[26];
        HashSet<Integer> set=new HashSet<Integer>();
        
        for(char c: s.toCharArray())
        {
            num[c-'a']++;
        }
        
        int res=0;
        for(int i=0;i<26;i++)
        {
            int val=num[i];
            while(val>0)
            {
                if(!set.contains(val))
                {
                    set.add(val);
                    break;
                }
                else
                {
                     res++;
                    val--;
                }
                
            }
            
        }
        return res;
        
    }
}
