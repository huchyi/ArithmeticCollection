package com.arithmeticcollection;

/**
 * 奇偶分割数组
 *
 *分割一个整数数组，使得奇数在前偶数在后。
 *
 *样例
 给定 [1, 2, 3, 4]，返回 [1, 3, 2, 4]。
 *
 *
 *
 */

public class PartitionArrayClass {

  /**
   * @param nums: an array of integers
   * @return: nothing
   */
  public void partitionArray(int[] nums) {
    // write your code here;

    int length = nums.length;
    int start = -1;

    for (int i = 0; i < length; i++) {
      if(nums[i] % 2 == 0){
        if(start == -1){
          start = i;
        }
      }else if(start != -1 && nums[i] % 2 == 1){
        int temp = nums[i];
        nums[i] = nums[start];
        nums[start] = temp;
        if(i < length - 1 && nums[start + 1] %2 == 0){
          start = start + 1;
        }
      }
    }

  }
}
