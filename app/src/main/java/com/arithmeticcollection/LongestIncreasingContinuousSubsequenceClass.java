package com.arithmeticcollection;

import android.util.Log;
import java.util.ArrayList;

/**
 * 最长上升连续子序列
 *
 * 给定一个整数数组（下标从 0 到 n-1， n 表示整个数组的规模），请找出该数组中的最长上升连续子序列。
 * （最长上升连续子序列可以定义为从右到左或从左到右的序列。）
 *
 * 注意事项
 *
 * time
 *
 *
 * 样例
 * 给定 [5, 4, 2, 1, 3], 其最长上升连续子序列（LICS）为 [5, 4, 2, 1], 返回 4.
 *
 * 给定 [5, 1, 2, 3, 4], 其最长上升连续子序列（LICS）为 [1, 2, 3, 4], 返回 4.
 *
 *
 *
 * 思路：
 * 高位和低位都记录，每次比较，加1或者加入list。最后找到list中的最大数。
 *
 *
 */

public class LongestIncreasingContinuousSubsequenceClass {

  /**
   * @param A an array of Integer
   * @return an integer
   */
  public int longestIncreasingContinuousSubsequence(int[] A) {
    // Write your code here
    if (A.length <= 0) {
      return 0;
    }else if (A.length == 1) {
      return 1;
    }else if (A.length == 2) {
      return 2;
    }

    ArrayList<Integer> lowList = new ArrayList<>();
    ArrayList<Integer> hightList = new ArrayList<>();

    int low = 1;
    int hight = 1;

    int lowNum = A[0];
    int hightNum = A[0];
    for (int i = 0; i < A.length - 1; i++) {
      if (lowNum <= A[i + 1]) {
        low += 1;

        if(i == A.length - 2){
          int tt = low;
          lowList.add(tt);
        }
      } else {
        int tt = low;
        lowList.add(tt);
        low = 1;
      }
      lowNum = A[i + 1];

      if (hightNum >= A[i + 1]) {
        hight += 1;

        if(i == A.length - 2){
          int tt = hight;
          hightList.add(tt);
        }
      } else {
        int tt = hight;
        hightList.add(tt);
        hight = 1;
      }
      hightNum = A[i + 1];
    }

    int max = 1;
    for (int tt : lowList) {
      Log.i("hcy","lowList:" + tt);
      if (max < tt) {
        max = tt;
      }
    }

    for (int tt : hightList) {
      Log.i("hcy","hightList:" + tt);
      if (max < tt) {
        max = tt;
      }
    }
    return max;
  }
}












