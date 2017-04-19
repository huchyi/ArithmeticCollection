package com.arithmeticcollection;

import java.util.ArrayList;

/**
 * 和大于S的最小子数组
 *
 * 给定一个由 n 个整数组成的数组和一个正整数 s ，请找出该数组中满足其和 ≥ s 的最小长度子数组。如果无解，则返回 -1。
 *
 *
 * 样例
 * 给定数组 [2,3,1,2,4,3] 和 s = 7, 子数组 [4,3] 是该条件下的最小长度子数组。
 *
 * 挑战
 * 如果你已经完成了O(n)时间复杂度的编程，请再试试 O(n log n)时间复杂度。
 */

public class MinimumSizeClass {

  /**
   * @param nums: an array of integers
   * @param s: an integer
   * @return: an integer representing the minimum size of subarray
   */
  public int minimumSize(int[] nums, int s) {
    // write your code here
    int[] newNums = new int[nums.length];

    int tt = -1;
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      sum = sum + nums[i];
      newNums[i] = sum;
      if (nums[i] >= s) {
        tt = 1;
        break;
      }
      if (sum >= s) {
        int ttt = i + 1;
        if (tt == -1) {
          tt = ttt;
        } else {
          if (ttt < tt) {
            tt = ttt;
          }
        }
      }

      for (int j = i - 1; j >= 0; j--) {
        if (newNums[i] - newNums[j] >= s) {
          int ttt = i - j;
          if (tt == -1) {
            tt = ttt;
          } else {
            if (ttt < tt) {
              tt = ttt;
            }else{
              break;
            }
          }
        }
      }
    }

    return tt;
  }
}
