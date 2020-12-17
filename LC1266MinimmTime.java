//Leetcode 1266. Minimum Time Visiting All Points

class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        
        if(points==null|| points.length<1) return -1;
        
        int totalTime=0;
        
        
        for(int i=0;i<points.length-1;i++)
        {
            int[] curr=points[i];
            int[] nex=points[i+1];
            
            totalTime+=Math.max(Math.abs(curr[0]-nex[0]), Math.abs(curr[1]-nex[1]));
            
        }
       return totalTime;
        
    }
}
