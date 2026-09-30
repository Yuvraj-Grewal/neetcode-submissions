class Solution {
    public int maxProfit(int[] prices) {
        int profit =0 ;
        int buyp=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]>buyp) profit=Math.max(profit,prices[i]-buyp);
            else buyp=prices[i];
        }
        return profit;
    }
}
