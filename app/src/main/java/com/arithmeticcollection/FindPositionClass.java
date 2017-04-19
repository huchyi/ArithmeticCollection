package com.arithmeticcollection;

/**
 * 题目：经典二分查找
 *
 * 在一个排序数组中找一个数，返回该数出现的任意位置，如果不存在，返回-1
 *
 * 给出数组 [1, 2, 2, 4, 5, 5].
 *
 * 对于 target = 2, 返回 1 或者 2.
 * 对于 target = 5, 返回 4 或者 5.
 * 对于 target = 6, 返回 -1.
 */

public class FindPositionClass {

  /**
   * @param nums: An integer array sorted in ascending order
   * @param target: An integer
   * @return an integer
   */
  public int findPosition(int[] nums, int target) {
    // Write your code here

    int low = 0, high = nums.length - 1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (nums[mid] == target) {
        return mid;
      } else if (target < nums[mid]) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return -1;
  }
}
