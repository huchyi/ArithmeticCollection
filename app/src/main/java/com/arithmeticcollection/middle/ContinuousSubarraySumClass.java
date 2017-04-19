package com.arithmeticcollection.middle;

import java.util.ArrayList;

/**
 * 连续子数组求和
 *
 * 给定一个整数数组，请找出一个连续子数组，使得该子数组的和最大。输出答案时，请分别返回第一个数字和最后一个数字的
 * 下标。（如果两个相同的答案，请返回其中任意一个）
 *
 *
 *
 * 样例
 * 给定 [-3, 1, 3, -3, 4], 返回[1,4].
 */

public class ContinuousSubarraySumClass {

  /**
   * @param A an integer array
   * @return A list of integers includes the index of the first number and the index of the last
   * number
   */
  public static ArrayList<Integer> continuousSubarraySum(int[] A) {
    // Write your code here
    int len = A.length, curStart = 0, curSum = 0, maxSum = 0;

    ArrayList<Integer> list = new ArrayList<>();

    if (len == 0) return list;
    maxSum = A[0];

    list.add(0);
    list.add(0);

    for (int i = 0; i < len; i++) {

      if (curSum <= 0) {
        curStart = i;
        curSum = A[i];
      } else {
        curSum += A[i];
      }

      if (curSum > maxSum) {
        list.clear();
        list.add(curStart);
        list.add(i);
        maxSum = curSum;
      }
    }

    return list;
  }
}
