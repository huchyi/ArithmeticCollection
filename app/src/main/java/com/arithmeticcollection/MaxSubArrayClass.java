package com.arithmeticcollection;

import android.util.Log;

/**
 * 给定一个整数数组，找到一个具有最大和的子数组，返回其最大和。

 注意事项

 子数组最少包含一个数


 *
 * 样例
 给出数组[−2,2,−3,4,−1,2,1,−5,3]，符合要求的子数组为[4,−1,2,1]，其最大和为6
 *
 *
 *
 * */

public class MaxSubArrayClass {


  /**
   * @param nums: A list of integers
   * @return: A integer indicate the sum of max subarray
   */
  public int maxSubArray(int[] nums) {
    // write your code
    int max_ending_here = nums[0];
    int max_so_far = nums[0];
    for( int i =1 ;i<nums.length; i++) {
      max_ending_here = Math.max( nums[i] , nums[i] + max_ending_here );
      max_so_far = Math.max( max_so_far, max_ending_here);
    }
    return max_so_far;

  }

}
