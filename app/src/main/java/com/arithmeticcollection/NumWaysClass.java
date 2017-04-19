package com.arithmeticcollection;

/**
 * 栅栏染色
 *
 * 我们有一个栅栏，它有n个柱子，现在要给柱子染色，有k种颜色可以染。
 * 必须保证任意两个相邻的柱子颜色不同，求有多少种染色方案。
 *
 * 注意事项
 *
 * n和k都是非负整数
 *
 *
 *
 * 样例
 * n = 3, k = 2, return 6
 *
 * post 1,   post 2, post 3
 * way1    0         0       1
 * way2    0         1       0
 * way3    0         1       1
 * way4    1         0       0
 * way5    1         0       1
 * way6    1         1       0
 */

public class NumWaysClass {

  /**
   * @param n non-negative integer, n posts
   * @param k non-negative integer, k colors
   * @return an integer, the total number of ways
   */
  public int numWays(int n, int k) {
    // Write your code here

    return (int) (k * Math.pow(k - 1, n - 1));
  }
}
