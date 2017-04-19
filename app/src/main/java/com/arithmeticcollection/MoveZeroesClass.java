package com.arithmeticcollection;

/**
 * 移动零
 *
 * 给一个数组 nums 写一个函数将 0 移动到数组的最后面，非零元素保持原数组的顺序
 *
 * 注意事项
 *
 * 1.必须在原数组上操作
 * 2.最小化操作数
 *
 * 样例
 * 给出 nums = [0, 1, 0, 3, 12], 调用函数之后, nums = [1, 3, 12, 0, 0].
 */

public class MoveZeroesClass {

  /**
   * @param nums an integer array
   * @return nothing, do this in-place
   */
  public void moveZeroes(int[] nums) {
    // Write your code here

    if (nums.length <= 1) {
      return;
    }
    int start0 = -1;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        if(start0 == -1){
          start0 = i;
        }
      } else if (start0 != -1) {
        nums[start0] = nums[i];
        nums[i] = 0;
        if(start0 + 1 < nums.length && nums[start0 + 1] == 0){
          start0 = start0 + 1;
        }else{
          start0 = i;
        }
      }
    }
  }
}
