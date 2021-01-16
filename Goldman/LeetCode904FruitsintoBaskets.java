// Fruit in the baskets
// Tricky question

class Solution {
    public int totalFruit(int[] tree) {
        
        int first_element= -1;
         int sec_element= -1;
            int res= 0;
            int sec_element_count= 0;
            int curr_count=0;
            
        
        for(int ele: tree)
        {
            if(ele ==first_element || ele == sec_element)
            {
                curr_count++;
                
            }
            else
            {
                curr_count= sec_element_count+1;
            }
            
            
            if(ele==sec_element)
            {
                sec_element_count++;
            }
            else
            {
                sec_element_count=1;
            }
          
            if(ele!=sec_element)
            {
                first_element= sec_element;
                sec_element= ele;
            }
            
            res=Math.max(curr_count,res);
            
        }
            
        
        return res;
        
        
        
    }
}
