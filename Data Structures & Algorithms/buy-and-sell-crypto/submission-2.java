class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int l = 0;
        for (int r = 1; r < prices.length; r++)
        {
            int currProfit = prices[r] - prices[l];
            if (currProfit > 0)
            {
                maxProfit = Math.max(maxProfit, currProfit);
            }
            else 
            {
                l = r;
            }
        }
        return maxProfit;
    }
}
