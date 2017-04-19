package com.arithmeticcollection;

import android.util.Log;
import java.util.ArrayList;

/**
 * 最小子数组
 *
 *给定一个整数数组，找到一个具有最小和的子数组。返回其最小和。

 注意事项

 子数组最少包含一个数字
 *
 *
 *
 *样例
 给出数组[1, -1, -2, 1]，返回 -3
 *
 *
 *
 *
 *
 */

public class MinSubArrayClass {

  /**
   * @param nums: a list of integers
   * @return: A integer indicate the sum of minimum subarray
   */
  public int minSubArray(ArrayList<Integer> nums) {
    // write your code
    int min_ending_here = nums.get(0);
    int min_so_far = nums.get(0);
    for( int i =1 ;i<nums.size(); i++) {
      min_ending_here = Math.min( nums.get(i) , nums.get(i) + min_ending_here );
      min_so_far = Math.min( min_so_far, min_ending_here);
    }
    return min_so_far;
  }
}
