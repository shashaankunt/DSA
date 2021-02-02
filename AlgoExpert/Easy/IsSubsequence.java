Given two strings s and t, check if s is a subsequence of t.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) 
of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if(s==null && t==null) return true;
        
        if(s.length()<1) return true;
        
        if(s.length()>t.length()) return false;
        
        int s_pointer=0;
        int t_pointer=0;
        
        
        while(s_pointer<s.length() && t_pointer<t.length())
        {
            
            if(s.charAt(s_pointer)==t.charAt(t_pointer))
            {
                s_pointer++;
                t_pointer++;
            }
            else
            {
                t_pointer++;
            }
        }
      //  System.out.println(s_pointer);
        
        if(s_pointer==s.length()) return true;
        else return false;
        
        
        
        
    }
}
