class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int profit = 0;
        for(int price: prices){
            if(price < minPrice){
                minPrice = price;
            }
            else if(price - minPrice > profit){
                profit = price - minPrice;
            }
        }
        return profit;
    }
}