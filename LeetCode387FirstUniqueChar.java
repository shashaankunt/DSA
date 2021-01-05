//First non repeating character
class Solution {
    public int firstUniqChar(String s) {
        
        if(s==null||s.length()<1) return -1;
        
        int[] chars=new int[26];
        
        for(int i=0;i<s.length();i++)
        {
            chars[s.charAt(i)-'a']++;
        }
        
        for(int i=0;i<s.length();i++)
        {
            if(chars[s.charAt(i)-'a']==1)
            {
                return i;
            }
            
        }
    
           return -1;
            
        
        
    }
}
