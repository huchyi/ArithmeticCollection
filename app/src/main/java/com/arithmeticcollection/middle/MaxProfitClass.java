package com.arithmeticcollection.middle;

/**
 * 买卖股票的最佳时机
 *
 *假设有一个数组，它的第i个元素是一支给定的股票在第i天的价格。如果你最多只允许完成一次交易(例如,一次买卖股票),设计一个算法来找出最大利润。
 *
 *
 *样例
 给出一个数组样例 [3,2,3,1,2], 返回 1
 *
 *
 *
 */

public class MaxProfitClass {
  /**
   * @param prices: Given an integer array
   * @return: Maximum profit
   */
  public static int maxProfit(int[] prices) {
    // write your code here

    int pointStart = -1;
    int max = 0;

    for (int i = 0; i < prices.length - 1; i++) {
      for (int j = i + 1; j < prices.length; j++) {
        if(pointStart == -1){
          pointStart = prices[i];
        }else if(j == i + 1){
          if(prices[i] > pointStart){
            break;
          }
          pointStart = prices[i];
        }

        //if(i == 0){
        //  max = prices[j] - prices[i];
        //}else
          if(prices[j] - prices[i] > max){
          max = prices[j] - prices[i];
        }

      }

    }

    //System.out.print(max);

    return max;
  }
}
