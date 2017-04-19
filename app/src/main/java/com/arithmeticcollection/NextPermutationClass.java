package com.arithmeticcollection;

/**
 * 下一个排列
 *
 *
 * 给定一个若干整数的排列，给出按正数大小进行字典序从小到大排序后的下一个排列。
 *
 * 如果没有下一个排列，则输出字典序最小的序列。
 *
 *
 * 样例
 * 左边是原始排列，右边是对应的下一个排列。
 *
 * 1,2,3 → 1,3,2
 *
 * 3,2,1 → 1,2,3
 *
 * 1,1,5 → 1,5,1
 *
 * 挑战
 * 不允许使用额外的空间。
 */

public class NextPermutationClass {

  /**
   * @param nums: an array of integers
   * @return: return nothing (void), do not return anything, modify nums in-place instead
   */
  public void nextPermutation(int[] nums) {
    // write your code here

    if (nums == null) {
      return;
    }
    int n = nums.length;
    int i = n - 1;
    while (i != 0 && nums[i] <= nums[i - 1]) {
      i--;
    }
    if (i == 0) {
      reverse(nums, 0, n - 1);
      return;
    }
    int j = n - 1;
    for (; j > i - 1; j--) {
      if (nums[j] > nums[i - 1]) {
        break;
      }
    }
    swap(nums, i - 1, j);
    reverse(nums, i, n - 1);
    return;
  }
  private void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
  private void reverse(int[] nums, int start, int end) {
    for(; start < end; start++, end--) {
      swap(nums, start, end);
    }
  }



}
