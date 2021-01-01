//Finding the next greater element to the right by using stacks in 0(n) time

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        
        Stack<Integer> st=new Stack<Integer>();
        int len2=nums2.length-1;
        
        for(int i=len2;i>=0;i--)
        {
            int curr=nums2[i];
            if(st.isEmpty())
            {
                hm.put(curr,-1);
                st.push(curr);
            }
            else if(st.peek()>curr)
            {
                hm.put(curr,st.peek());
                st.push(curr);
            }
            else
            {
                while(!st.isEmpty())
                {
                    if(st.peek()>curr)
                    {
                        hm.put(curr,st.peek());
                        st.push(curr);
                        break;
                    }
                    st.pop();
                }
                if(st.isEmpty())
                {
                  hm.put(curr,-1);
                    st.push(curr);
                }
                
            }      
            
        }
       // System.out.println(hm);
        int[] res =new int[nums1.length];
        for(int i=0;i<=nums1.length-1;i++)
        {
            res[i]=hm.get(nums1[i]);
            
        }
        
        return res;
        
        
    }
}
