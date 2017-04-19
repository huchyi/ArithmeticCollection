package com.arithmeticcollection;

import java.util.ArrayList;

/**
 * 恢复旋转排序数组
 *
 *
 * 给定一个旋转排序数组，在原地恢复其排序。
 *
 *
 * 说明
 * 什么是旋转数组？
 *
 * 比如，原始数组为[1,2,3,4], 则其旋转数组可以是[1,2,3,4], [2,3,4,1], [3,4,1,2], [4,1,2,3]
 * 样例
 * [4, 5, 1, 2, 3] -> [1, 2, 3, 4, 5]
 *
 * 使用O(1)的额外空间和O(n)时间复杂度
 */

public class RecoverRotatedSortedArrayClass {

  /**
   * @param nums: The rotated sorted array
   * @return: void
   */
  public void recoverRotatedSortedArray(ArrayList<Integer> nums) {
    // write your code

    ArrayList<Integer> listLow = new ArrayList<>();
    ArrayList<Integer> listH = new ArrayList<>();

    boolean isTrue = nums.get(0) > nums.get(nums.size() - 1);
    if(isTrue){
      boolean isBreak = false;
      listLow.add(nums.get(0));
      for (int i = 1; i < nums.size(); i++) {
        if(isBreak){
          listH.add(nums.get(i));
        }else if (nums.get(i) < nums.get(i - 1)) {
          isBreak = true;
          listH.add(nums.get(i));
        }else {
          listLow.add(nums.get(i));
        }
      }

    }else{
      boolean isBreak = false;
      listH.add(nums.get(0));
      for (int i = 1; i < nums.size(); i++) {
        if(isBreak){
          listLow.add(nums.get(i));
        }else if (nums.get(i) > nums.get(i - 1)) {
          listLow.add(nums.get(i));
          isBreak = true;
        }else {
          listH.add(nums.get(i));
        }
      }
    }

    nums.clear();

    if(isTrue){
      nums.addAll(listH);
      nums.addAll(listLow);
    }else{
      nums.addAll(listH);
      nums.addAll(listLow);
    }
  }
}
