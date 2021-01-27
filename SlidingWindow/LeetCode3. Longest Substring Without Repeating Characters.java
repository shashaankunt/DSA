 Longest Substring Without Repeating Characters
//https://leetcode.com/problems/minimum-window-substring/discuss/26808/Here-is-a-10-line-template-that-can-solve-most-'substring'-problems


class Solution {
    public int lengthOfLongestSubstring(String s) {
     
        
        
        int begin=0;
        int end=0;
        int length=Integer.MIN_VALUE;
        HashMap<Character, Integer> hm=new HashMap();
        int counter=0;
        
        
        while(end<s.length())
        {
            char c=s.charAt(end);
            
            hm.put(c,hm.getOrDefault(c,0)+1);
            
            if(hm.get(c)>1) counter++;
            
            end++;
            
            while(counter>0)
            {
                char temp=s.charAt(begin);
                
                if(hm.get(temp)>1)
                {
                    counter--;
                   
                }
                hm.put(temp,hm.get(temp)-1);
                begin++;
            }
             if(end-begin>length)
                    {
                        length=end-begin;
                    }
        
        }
        
        if(length==Integer.MIN_VALUE) return 0;
        
        return length;
        
        
        
        
        
        
    }     
        
        
    }
