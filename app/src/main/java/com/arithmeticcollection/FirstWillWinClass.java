package com.arithmeticcollection;

/**
 * 硬币排成线
 *
 *
 * 有 n 个硬币排成一条线。两个参赛者轮流从右边依次拿走 1 或 2 个硬币，直到没有硬币为止。拿到最后一枚硬币的人获胜。
 *
 * 请判定 第一个玩家 是输还是赢？
 *
 *
 * 样例
 * n = 1, 返回 true.
 *
 * n = 2, 返回 true.
 *
 * n = 3, 返回 false.
 *
 * n = 4, 返回 true.
 *
 * n = 5, 返回 true.
 *
 * 挑战
 * O(1) 时间复杂度且O(1) 存储。
 *
 *
 *
 *
 * 思路：为3的倍数，先拿的，每位3的倍数必输。
 *
 *
 */

public class FirstWillWinClass {

  /**
   * @param n: an integer
   * @return: a boolean which equals to true if the first player will win
   */
  public boolean firstWillWin(int n) {
    // write your code here

    return n % 3 != 0;
  }
}
