//Intersection of two arrays--basically finding the common elements

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        if(nums1==null||nums2==null||nums1.length<1|| nums2.length<1) return new int[]{};
        
        
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        List<Integer> resList=new ArrayList<Integer>();
        for(int i=0;i<nums1.length;i++)
        {
            hm.put(nums1[i],hm.getOrDefault(nums1[i],0)+1);
        }
        
        for(int i=0;i<nums2.length;i++)
        {
            if((hm.get(nums2[i])!=null) && (hm.get(nums2[i])>0))
            {
              resList.add(nums2[i]);
                hm.put(nums2[i],hm.get(nums2[i])-1);
            }
        }
        int[] res=new int[resList.size()];
        for(int i=0;i<resList.size();i++)
        {
            res[i]=resList.get(i);
        }
        
        
        return res;
        
        
        
    }
}
