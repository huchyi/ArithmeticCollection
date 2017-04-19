package com.arithmeticcollection;

/**
 * x的平方根
 *
 * 实现 int sqrt(int x) 函数，计算并返回 x 的平方根。
 *
 *
 * 样例
 * sqrt(3) = 1
 *
 * sqrt(4) = 2
 *
 * sqrt(5) = 2
 *
 * sqrt(10) = 3
 *
 * 挑战
 * O(log(x))
 */

public class XsqrtClass {

  /**
   * @param x: An integer
   * @return: The sqrt of x
   */
  public int sqrt(int x) {
    // write your code here
    if (x <= 1) {
      return x;
    }

    int begin = 1;
    int end = x;
    int middle = 0;
    while (begin <= end) {
      middle = begin + (end - begin) / 2;
      //不要写成middle*middle==x，会溢出
      if (middle == x / middle) {
        return middle;
      } else {
        if (middle < x / middle) {
          begin = middle + 1;
        } else {
          end = middle - 1;
        }
      }
    }
    //结束条件end一定<begin，所以返回end
    return end;
  }
}
