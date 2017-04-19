package com.arithmeticcollection;

/**
 * 删除排序数组中的重复数字 II
 *
 *
 *跟进“删除重复数字”：

 如果可以允许出现两次重复将如何处理？


 *
 */

public class RemoveDuplicatesClass2 {

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
    int counts = 1;
    for (int i = 1; i < nums.length; i++) {
      if(start != nums[i]){
        start = nums[i];
        counts = 1;
        count++;
      }else{
        if(counts <= 2){
          count++;
          counts++;
        }else{
          counts++;
        }
      }
    }
    return count;
  }
}
