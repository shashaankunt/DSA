class Solution {
    public int trap(int[] height) {
        
        if(height==null || height.length<1) return 0;
        
        int[] maxl=new int[height.length];
        int[] maxr=new int[height.length];
        
        maxl[0]=height[0];
        for(int i=1;i<height.length;i++)
        {
            maxl[i]=Math.max(height[i],maxl[i-1]);
            
        }
        
        maxr[height.length-1]=height[height.length-1];
        
        for(int i=height.length-2;i>=0;i--)
        {
            maxr[i]=Math.max(height[i],maxr[i+1]);
        }
        
        int[] water=new int[height.length];
        for(int i=0;i<height.length;i++)
        {
          int temp= Math.min(maxl[i],maxr[i]);
            water[i]=temp-height[i];
            
        }
        
        int ans=0;
        for(int ele:water)
        {
            ans+=ele;
        }
        
        return ans;
        
        
    }
}
