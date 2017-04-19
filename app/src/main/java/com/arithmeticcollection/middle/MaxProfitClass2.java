package com.arithmeticcollection.middle;

/**
 * 买卖股票的最佳时机 II
 *
 *假设有一个数组，它的第i个元素是一个给定的股票在第i天的价格。设计一个算法来找到最大的利润。你可以完成尽可能多的
 * 交易(多次买卖股票)。然而,你不能同时参与多个交易(你必须在再次购买前出售股票)。
 *
 *
 *样例
 给出一个数组样例[2,1,2,0,1], 返回 2
 *
 *
 *
 *
 *
 *
 *
 *
 */

public class MaxProfitClass2 {

  /**
   * @param prices: Given an integer array
   * @return: Maximum profit
   */
  public static int maxProfit(int[] prices) {
    // write your code here

    int sum = 0;

    for (int i = 0; i < prices.length - 1;i++) {
      int tt = prices[i + 1] - prices[i];
      if(tt > 0){
        sum = sum + tt;
      }

    }

    System.out.print(sum);

    return sum;
  }


}
