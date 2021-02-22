//An array is monotonic if it is either monotone increasing or monotone decreasing.

An array A is monotone increasing if for all i <= j, A[i] <= A[j].  An array A is monotone decreasing if for all i <= j, A[i] >= A[j].

Return true if and only if the given array A is monotonic.

 

Example 1:

Input: [1,2,2,3]
Output: true


class Solution {
    public boolean isMonotonic(int[] A) {
        
        
        boolean flag_inc=true;
        boolean flag_dec=true;
        
        for(int i=1;i<A.length;i++)
        {
            if(A[i]<A[i-1])
            {
                flag_inc=false;
            }
            else if(A[i]>A[i-1])
            {
                flag_dec=false;
            }
            
        }
        return flag_dec || flag_inc;
        
        
        
    }
}
