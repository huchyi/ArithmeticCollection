package com.arithmeticcollection.middle;

import java.util.ArrayList;

/**
 * 最接近的三数之和
 *
 *
 * 给一个包含 n 个整数的数组 S, 找到和与给定整数 target 最接近的三元组，返回这三个数的和。
 *
 * 注意事项
 *
 * 只需要返回三元组之和，无需返回三元组本身
 *
 * 样例
 * 例如 S = [-1, 2, 1, -4] and target = 1. 和最接近 1 的三元组是 -1 + 2 + 1 = 2.
 *
 * 挑战
 * O(n^2) 时间, O(1) 额外空间。
 */

public class ThreeSumClosestClass {

  /**
   * @param numbers: Give an array numbers of n integer
   * @param target : An integer
   * @return : return the sum of the three integers, the sum closest target.
   */
  public int threeSumClosest(int[] numbers, int target) {
    // write your code here
    if (numbers.length <= 3) {
      int sum = 0;
      for (int i = 0; i < numbers.length; i++) {
        sum = sum + numbers[i];
      }
      return sum;
    }

    int min = 0;
    int result = 0;
    for (int i = 0; i < numbers.length-2; i++) {

      for (int j = i+ 1; j < numbers.length - 1; j++) {

        for (int k = j + 1; k < numbers.length; k++) {
          if(i ==0 && j ==1 && k ==2){
            min = Math.abs(target - (numbers[i] + numbers[j] + numbers[k]));
            result = numbers[i] + numbers[j] + numbers[k];
          }else{
            if(Math.abs(target - (numbers[i] + numbers[j] + numbers[k])) < min){
              min = Math.abs(target - (numbers[i] + numbers[j] + numbers[k]));
              result = numbers[i] + numbers[j] + numbers[k];
            }
          }
        }

      }

    }

    System.out.print(result);
    return result;




  }





}
