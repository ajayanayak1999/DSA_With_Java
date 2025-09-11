 package com.dsa;

public class BestTimeToBuyAndSellTheStock {
	
	public static int calcProfit(int[] prices) {
		int buyPrice=prices[0];
		int maxProfit=0;
		for(int i=1;i<prices.length;i++) {
			int sellPrice=prices[i];
			if(buyPrice<sellPrice ) {
				int profit=sellPrice-buyPrice;
				maxProfit=Math.max(maxProfit, profit);
			}else {
				buyPrice=sellPrice;
			}
		}
		return maxProfit;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices= {7,1,5,3,6,4};
		System.out.println("Max profit "+calcProfit(prices));
	}

}
