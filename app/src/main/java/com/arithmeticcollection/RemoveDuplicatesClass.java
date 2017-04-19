package com.arithmeticcollection;

/**
 * 删除排序数组中的重复数字'
 *
 *
 * 给定一个排序数组，在原数组中删除重复出现的数字，使得每个元素只出现一次，并且返回新的数组的长度。
 不要使用额外的数组空间，必须在原地没有额外空间的条件下完成。
 *
 *样例
 给出数组A =[1,1,2]，你的函数应该返回长度2，此时A=[1,2]。
 *
 *
 *
 *
 *
 *
 *
 */

public class RemoveDuplicatesClass {

  /**
   * @param nums: a array of integers
   * @return : return an integer
   */
  public int removeDuplicates(int[] nums) {
    // write your code here

    if(nums.length <= 2){
      return nums.length;
    }
    int count = 1;
    int start = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if(start != nums[i]){
        start = nums[i];
        count++;
      }
    }
    return count;
  }

}
