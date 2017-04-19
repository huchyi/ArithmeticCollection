package com.arithmeticcollection;

/**
 * 二分查找
 *
 * 给定一个排序的整数数组（升序）和一个要查找的整数target，用O(logn)的时间查找到target第一次出现的下标（从0开始）
 * ，如果target不存在于数组中，返回-1。
 *
 *
 * 样例
 * 在数组 [1, 2, 3, 3, 4, 5, 10] 中二分查找3，返回2。
 *
 *
 *
 * 思路：
 * 二分查找法的原理是，在特定数组中从中间向两边查找
 */

public class BinarySearchClass {

  /**
   * @param nums: The integer array.
   * @param target: Target to find.
   * @return: The first position of target. Position starts from 0.
   */
  public int binarySearch(int[] nums, int target) {
    //write your code here

    int flag = -1;
    //第一个位置.
    int low = 0;
    //最高位置.数组长度-1,因为下标是从0开始的.
    int high = nums.length - 1;
    //当low"指针"和high不重复的时候.
    while (low <= high) {
      //中间位置计算,low+ 最高位置减去最低位置,右移一位,相当于除2.也可以用(high+low)/2
      int middle = low + ((high - low) >> 1);
      //与最中间的数字进行判断,是否相等,相等的话就返回对应的数组下标.
      if (target == nums[middle]) {
        flag = middle;
        high = middle - 1;
        break;
        //如果小于的话则移动最高层的"指针"
      } else if (target < nums[middle]) {
        high = middle - 1;
        //移动最低的"指针"
      } else {
        low = middle + 1;
      }
    }
    for (int i = high; i >= low; i--) {
      if(target > nums[i]){
        break;
      }else{
        flag = i;
      }
    }
    return flag;
  }
}
