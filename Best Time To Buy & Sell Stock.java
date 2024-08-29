class Solution{
    public int maxProfit(int[]prices){
        int maxProfit=0;
        int minPrice=prices[0];
        for(int price:prices){
            maxProfit=Math.max(maxProfit,price-minPrice);
            minPrice=Math.min(minPrice,price);
        }
        return maxProfit;
    }
}
