//Leetcode 1207
//        HashSet<Integer> set=new HashSet(occurences.values());

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        if(arr==null||arr.length<=1) return true;

        HashMap<Integer,Integer> occurences=new HashMap();
        for(int a: arr)
        occurences.put(a,occurences.getOrDefault(a,0)+1);
        
        HashSet<Integer> set=new HashSet(occurences.values());
        //set.add(a);
        
        return set.size()==occurences.size();
    }
}
