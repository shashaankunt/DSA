// Best time to buy and sell stocks

class Solution {
    public int maxProfit(int[] prices) {
        
        
        if(prices==null || prices.length<=1) return 0;
        
        int profit=0;
        int min=Integer.MAX_VALUE;
        
        for(int i=0;i<prices.length;i++)
        {
            int curr=prices[i];
            
            if(curr<min)
            {
                min=curr;
            }
            else
            {
                profit=Math.max(curr-min,profit);
            }
            
        }
        return profit;
}
}
