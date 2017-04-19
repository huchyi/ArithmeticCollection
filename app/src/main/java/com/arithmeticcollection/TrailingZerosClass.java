package com.arithmeticcollection;

import android.util.Log;

/**
 * 尾部的零
 *
 * 设计一个算法，计算出n阶乘中尾部零的个数
 *
 *样例
 11! = 39916800，因此应该返回 2

 挑战
 O(logN)的时间复杂度
 *
 *
 *
 *
 *
 *
 *
 *
 * 公式：Z = [N/5] +[N/52] +[N/53] + …（不用担心这会是一个无穷的运算，因为总存在一个K，使得5K > N，[N/5K]=0。）
 *
 */

public class TrailingZerosClass {

  /*
     * param n: As desciption
     * return: An integer, denote the number of trailing zeros in n!
     */
  public long trailingZeros(long n) {
    // write your code here

    int num = 0, i;
    for(i=5; i<=n; i*=5)
    {
      num += n/i;
    }
    return num;
  }
}
