package com.arithmeticcollection.middle;

import android.util.Log;

/**
 * 打劫房屋
 *
 *假设你是一个专业的窃贼，准备沿着一条街打劫房屋。每个房子都存放着特定金额的钱。你面临的唯一约束条件是：相邻的房子装
 * 着相互联系的防盗系统，且 当相邻的两个房子同一天被打劫时，该系统会自动报警。

 给定一个非负整数列表，表示每个房子中存放的钱， 算一算，如果今晚去打劫，你最多可以得到多少钱 在不触动报警装置的情况下。
 *
 *
 *
 *
 *给定 [3, 8, 4], 返回 8.

 挑战
 O(n) 时间复杂度 且 O(1) 存储。
 *
 *
 *
 *
 *
 */

public class HouseRobberClass {

  /**
   * @param houseMoneys: An array of non-negative integers.
   * return: The maximum amount of money you can rob tonight
   */
  public long houseRobber(int[] houseMoneys) {
    // write your code here

    if(null == houseMoneys || houseMoneys.length <= 0)
      return 0;
    if(houseMoneys.length == 1)
      return houseMoneys[0];
    if(houseMoneys.length == 2)
    {
      return Math.max(houseMoneys[0], houseMoneys[1]);
    }

    if(houseMoneys.length == 3)
    {
      return Math.max(houseMoneys[1], houseMoneys[0] + houseMoneys[2]);
    }

    long[] max = new long[4];
    max[0] = houseMoneys[0];
    max[1] = houseMoneys[1];
    max[2] = Math.max(houseMoneys[1], houseMoneys[0] + houseMoneys[2]);

    for(int i = 3;i < houseMoneys.length;i++)
    {
      max[3] = houseMoneys[i] + Math.max(max[0], max[1]);
      if(i == houseMoneys.length - 1)
        continue;
      max[0] = max[1];
      max[1] = max[2];
      max[2] = max[3];
    }

    Log.i("hcy","-->>>>:" + Math.max(max[3], max[2]));
    return Math.max(max[3], max[2]);
  }
}
