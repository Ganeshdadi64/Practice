package org.example.DSA4Contest;

public class SellingStocks {
    public static void main(String[] args) {
        int[] prizes={7,3,1,4,8,2};
        int minPrize=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int prize:prizes){
            minPrize=Math.min(minPrize,prize);
            int profit=prize-minPrize;
            maxProfit=Math.max(profit,maxProfit);
        }
        System.out.println(maxProfit);
    }
}
