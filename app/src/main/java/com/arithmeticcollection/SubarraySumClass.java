package com.arithmeticcollection;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 子数组之和
 *
 * 给定一个整数数组，找到和为零的子数组。你的代码应该返回满足要求的子数组的起始位置和结束位置
 *
 * 注意事项
 *
 * There is at least one subarray that it's sum equals to zero.
 *
 *
 * 样例
 * 给出 [-3, 1, 2, -3, 4]，返回[0, 2] 或者 [1, 3].
 *
 *
 *
 *
 * wo cao ,碉堡了。去除前项相加为0跳出，第i项为0跳出外，剩下的就是如果索引n相加的舒等于索引m相加的数（n>M），那么m+1到n绝逼为0。一个值加减后再次回到这个值，绝逼中间项加起来为0.
 */

public class SubarraySumClass {

  /**
   * @param nums: A list of integers
   * @return: A list of integers includes the index of the first number
   * and the index of the last number
   */
  public ArrayList<Integer> subarraySum(int[] nums) {

    int sum = 0;
    // 给hash表增加一个前置位：键 —— 0；值 —— -1
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    ArrayList<Integer> list = new ArrayList<>();
    int n = nums.length;
    for (int i = 0; i < n; i++) {
      sum += nums[i];

      if (nums[i] == 0) {
        list.add(i);
        list.add(i);
        break;
      }

      if (sum == 0) {
        list.add(0);
        list.add(i);
        break;
      }
      if (hashMap.containsKey(sum)) {
        list.add(hashMap.get(sum) + 1);
        list.add(i);
        break;
      }
      hashMap.put(sum, i);
    }
    return list;

    // write your code here

    //int pointStart = 0;
    //int pointEnd = 1;
    //int beforeNum = 0;
    //
    //ArrayList<Integer> list = new ArrayList<>();
    //if (nums.length <= 1) {
    //  list.add(0);
    //  list.add(0);
    //}else if(nums[0] == 0){
    //  list.add(0);
    //  list.add(0);
    //  pointEnd = nums.length;
    //}
    //
    //while (pointEnd < nums.length) {
    //
    //  int tt = 0;
    //  boolean isBreak = false;
    //
    //  if (nums[pointEnd] == 0) {
    //    list.add(pointEnd);
    //    list.add(pointEnd);
    //    break;
    //  }
    //
    //  if(beforeNum < nums[pointEnd]){
    //
    //  }
    //
    //  //[-3,1,2,-3,4]
    //  for (int i = pointEnd - 1; i >= pointStart; i--) {
    //    for (int j = i; j <= pointEnd; j++) {
    //      tt = tt + nums[j];
    //    }
    //
    //    if (beforeNum == 0) {
    //      beforeNum = tt;
    //    } else if (Math.abs(tt) < beforeNum) {
    //      pointStart = i;
    //      beforeNum = tt;
    //    }
    //
    //    if (tt == 0) {
    //      list.add(i);
    //      list.add(pointEnd);
    //      isBreak = true;
    //    }
    //
    //    if (isBreak) {
    //      break;
    //    }
    //
    //    tt = 0;
    //  }
    //  pointEnd++;
    //
    //  if (isBreak) {
    //    break;
    //  }
    //}
    //return list;
  }
}
