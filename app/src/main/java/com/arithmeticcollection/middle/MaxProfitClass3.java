package com.arithmeticcollection.middle;

/**
 * 买卖股票的最佳时机 III
 *
 * 假设你有一个数组，它的第i个元素是一支给定的股票在第i天的价格。设计一个算法来找到最大的利润。你最多可以完成两笔交易。
 *
 * 注意事项
 *
 * 你不可以同时参与多笔交易(你必须在再次购买前出售掉之前的股票)
 *
 * 样例
 * 给出一个样例数组 [4,4,6,1,1,4,2,5], 返回 6
 */

public class MaxProfitClass3 {

  /**
   * @param prices: Given an integer array
   * @return: Maximum profit
   */
  public static int maxProfit(int[] prices) {
    // write your code here

    int maxSum = 0;
    int max1 = 0;
    int pointmax1 = -1;
    int max2 = 0;
    int pointk = -1;
    int pointmax2Value = -1;

    //[2,1,4,5,2,9,7] 11
    for (int i = 0; i < prices.length - 1; i++) {
      if (pointmax1 == -1) {
        pointmax1 = prices[i];
      } else {
        if (prices[i] > pointmax1) {
          continue;
        }
      }

      max1 = 0;
      max2 = 0;
      for (int j = i + 1; j < prices.length; j++) {

        if (prices[j] - prices[i] < 0) {
          continue;
        }

        if (prices[j] - prices[i] > max1) {
          max1 = prices[j] - prices[i];
          if (maxSum < max1) {
            maxSum = max1;
          }

          if (pointk >= j + 1) {
            max2 = pointmax2Value;
            if (max1 + max2 > maxSum) {
              maxSum = max1 + max2;
            }
            continue;
          }

          for (int k = j + 1; k < prices.length - 1; k++) {
            for (int l = k + 1; l < prices.length; l++) {
              if (prices[l] - prices[k] < 0) {
                continue;
              }
              if (prices[l] - prices[k] >= max2) {
                max2 = prices[l] - prices[k];

                pointk = k;
                pointmax2Value = max2;

                if (max1 + max2 > maxSum) {
                  maxSum = max1 + max2;
                }
              }
            }
          }
        }
      }
    }

    System.out.println("结果" + maxSum);

    return maxSum;
  }
}
