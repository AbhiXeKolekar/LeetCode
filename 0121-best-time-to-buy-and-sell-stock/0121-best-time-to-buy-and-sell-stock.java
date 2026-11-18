class Solution {
    public int maxProfit(int[] prices) {
        int k = 0;
        int maxProfit = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] < prices[k]) k = i;

            maxProfit = Math.max(maxProfit, prices[i] - prices[k]);
        }
        return maxProfit;
    }
}