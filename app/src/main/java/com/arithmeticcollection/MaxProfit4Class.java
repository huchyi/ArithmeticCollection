package com.arithmeticcollection;

import java.util.ArrayList;

/**
 * 买卖股票的最佳时机 IV
 *
 *
 * 假设你有一个数组，它的第i个元素是一支给定的股票在第i天的价格。
 *
 * 设计一个算法来找到最大的利润。你最多可以完成 k 笔交易。
 *
 * 注意事项
 *
 * 你不可以同时参与多笔交易(你必须在再次购买前出售掉之前的股票)
 *
 *
 *
 *
 *
 *
 *
 * 样例
 * 给定价格 = [4,4,6,1,1,4,2,5], 且 k = 2, 返回 6.
 *
 * 挑战
 * O(nk) 时间序列。
 *
 *
 *
 *
 *
 * 思路
 我们维护两种量，一个是当前到达第i天可以最多进行j次交易，最好的利润是多少（global[i][j]），另一个是当前到达第i天，
 最多可进行j次交易，并且最后一次交易在当天卖出的最好的利润是多少（local[i][j]）

 同时注意当K很大时的情况,变为买卖股票的最佳时机ii。
 *
 *
 *
 *
 *
 */

public class MaxProfit4Class {

  /**
   * @param k: An integer
   * @param prices: Given an integer array
   * @return: Maximum profit
   */
  public int maxProfit(int k, int[] prices) {
    // write your code here

    if (k == 0) {
      return 0;
    }
    if(prices==null || prices.length==0)
      return 0;

    if (k >= prices.length / 2) {
      int profit = 0;
      for (int i = 1; i < prices.length; i++) {
        if (prices[i] > prices[i - 1]) {
          profit += prices[i] - prices[i - 1];
        }
      }
      return profit;
    }
    int len = prices.length;
    int[][] local = new int[len][k+1];
    int[][] global = new int[len][k+1];
    for(int i=1; i<len; i++) {
      int diff = prices[i] - prices[i-1];
      for(int j=1; j<=k; j++) {
        local[i][j] = Math.max(global[i-1][j-1]+Math.max(diff,0), local[i-1][j]+diff);
        global[i][j] = Math.max(global[i-1][j], local[i][j]);
      }
    }
    return global[len-1][k];
  }
}
