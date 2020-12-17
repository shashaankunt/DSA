// 66. Plus One
// Kevin Naughton -- make sure we handle edge cases. 
// 129 The way it works for this input, handling 9
//--> 0.. 30...130

class Solution {
    public int[] plusOne(int[] digits) {
        
        
        for(int i=digits.length-1;i>=0 ; i--)
        {
            
            if(digits[i]!=9)
            {
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        
        
        int[] number=new int[digits.length+1];
        number[0]=1;
        return number;
        
        
        
    }
}
