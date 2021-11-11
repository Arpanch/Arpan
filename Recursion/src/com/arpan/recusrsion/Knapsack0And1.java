package com.arpan.recusrsion;

public class Knapsack0And1 {
	public static void main(String[] args) {
		int profit[] = new int[] {  20, 5, 10, 40, 15, 25 };
		int wt[] = new int[] {  1, 2, 3, 8, 7, 4 };
		int W = 10;
		System.out.println(knapSack(W, wt, profit,0,0,0));
	}

	private static int knapSack(int w, int[] wt, int[] profit, int n, int currentWeight, int currentProfit) {
		if (n > wt.length - 1) {
			return currentProfit;
		}

		int profitOfNotIncluding = knapSack(w, wt, profit, n + 1, currentWeight, currentProfit);

		int including = 0;
		if (currentWeight + wt[n] <= w) {
			including = knapSack(w, wt, profit, n + 1, currentWeight + wt[n], currentProfit + profit[n]);
		}

		return Math.max(profitOfNotIncluding, including);
	}
}
