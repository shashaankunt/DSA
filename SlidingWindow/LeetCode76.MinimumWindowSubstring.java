//https://leetcode.com/problems/find-all-anagrams-in-a-string/discuss/92007/sliding-window-algorithm-template-to-solve-all-the-leetcode-substring-search-problem
// Pattern for sliding window problems


class Solution {
    public String minWindow(String s, String t) {
       
        
        if(t.length()> s.length()) return "";
        int begin=0;
        int end=0;
        
        HashMap<Character,Integer> hm=new HashMap();
        
        for(char c: t.toCharArray())
        {
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        
        
        
        int counter=hm.size();
        int head=Integer.MAX_VALUE;
        int len=Integer.MAX_VALUE;
        while(end<s.length())
        {
            char c= s.charAt(end);
            
            
            if(hm.containsKey(c))
            {
                
                hm.put(c,hm.get(c)-1);
                if(hm.get(c)==0) counter--;
            }
            end++;
            
            while(counter==0)
            {
                char temp=s.charAt(begin);
                 if(hm.containsKey(temp))
                 {
                     hm.put(temp,hm.get(temp)+1);
                     if(hm.get(temp)>0) counter++;
                 }
                
                if(end-begin<len)
            {
                len=end-begin;
                head=begin;
            }
            
                
                begin++;
                
            }
            
            
            
        }
        if(len == Integer.MAX_VALUE) return "";
        return s.substring(head,head+len);
        
        
        
        
        
    }
}
