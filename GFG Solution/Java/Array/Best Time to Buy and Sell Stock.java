//problem url: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class Solution {
    public int maxProfit(int[] prices) {
        int res=0,max=0;
        for (int i=1;i<prices.length;i++)
        {
            if(prices[i]<prices[res])
            {
                res=i;
            }
            else
            {
                max=(int)Math.max(prices[i]-prices[res],max);
            }
        }
        return max;
    }
}
