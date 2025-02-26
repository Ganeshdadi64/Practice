package org.example.StringsAndArrays.Arraays;

public class Problem4 {

    //Best time to sell a stock
//    Problem Statement:
//    Given an array prices[] where prices[i] is the price of a stock on the i-th day,
//    find the maximum profit that can be achieved by buying and selling once
//            (you cannot sell before buying).



    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) return 0; // Edge case

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // Update min price
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice); // Update max profit
            }
        }

        return maxProfit;
    }


}
