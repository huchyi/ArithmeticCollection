package com.arithmeticcollection;

/**
 * 中位数
 *
 *
 * 给定一个未排序的整数数组，找到其中位数。

 中位数是排序后数组的中间值，如果数组的个数是偶数个，则返回排序后数组的第N/2个数。


 样例
 给出数组[4, 5, 1, 2, 3]， 返回 3

 给出数组[7, 9, 4, 5]，返回 5
 *
 *
 *
 *
 * 挑战
 时间复杂度为O(n)
 *
 *
 */

public class MedianClass {


  /**
   * @param nums: A list of integers.
   * @return: An integer denotes the middle number of the array.
   */
  public int median(int[] nums) {
    // write your code here
    return sub(nums, 0, nums.length - 1, (nums.length + 1)/2);
  }
  private int sub(int[] nums, int start, int end, int size) {
    int mid = (start + end) / 2;
    int pivot = nums[mid];
    int i = start - 1, j = end + 1;
    for (int k = start; k < j; k++) {
      if (nums[k] < pivot) {
        i++;
        int tmp = nums[i];
        nums[i] = nums[k];
        nums[k] = tmp;
      } else if (nums[k] > pivot) {
        j--;
        int tmp = nums[j];
        nums[j] = nums[k];
        nums[k] = tmp;
        k--;
      }
    }
    if (i - start + 1 >= size) {
      return sub(nums, start, i, size);
    } else if (j - start >= size) {
      return nums[j-1];
    } else {
      return sub(nums, j, end, size - (j - start));
    }
  }
}
