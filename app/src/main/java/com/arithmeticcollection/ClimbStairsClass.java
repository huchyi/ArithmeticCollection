package com.arithmeticcollection;

/**
 * 爬楼梯
 *
 * 假设你正在爬楼梯，需要n步你才能到达顶部。但每次你只能爬一步或者两步，你能有多少种不同的方法爬到楼顶部？
 *
 * 样例
 * 比如n=3，1+1+1=1+2=2+1=3，共有3中不同的方法
 *
 * 返回 3
 *
 *
 * 思路：
 * 正宗的斐波那契数列。递归的思想。
 *
 */

public class ClimbStairsClass {

  /**
   * @param stepsNum: An integer
   * @return: An integer
   */
  public int climbStairs(int stepsNum) {
    // write your code here

    if (stepsNum == 0) {
      return 0;
    }

    //int sum = 0;
    //if (stepsNum == 1) {
    //  return 1;
    //} else if (stepsNum == 2) {
    //  return 2;
    //} else if (stepsNum > 3) {
    //  return climbStairs(stepsNum - 2) + climbStairs(stepsNum - 1);
    //}
    //return stepsNum;


    int[] array = new int[stepsNum + 1];
    array[0] = 1;
    array[1] = 1;
    for (int i = 2; i <= stepsNum; i++) {
      array[i] = array[i - 1] + array[i - 2];
    }
    return array[stepsNum];

  }
}
