class Solution {
    public int maxProfit(int[] prices) {
        int profit=0,maxProfit=0;
        int size=prices.length,max=prices[size-1];
        for(int i=size-2;i>=0;i--){
            if(prices[i]<=max){
                profit=max-prices[i];
                maxProfit=Math.max(maxProfit,profit);
            }
            max=Math.max(max,prices[i]);
        }
        return maxProfit;
    }
}