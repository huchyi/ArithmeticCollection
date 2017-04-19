package com.arithmeticcollection;

import android.util.Log;

/**
 * 将整数A转换为B
 *
 *
 * 如果要将整数A转换为B，需要改变多少个bit位？
 *
 * 注意事项
 *
 * Both n and m are 32-bit integers.
 *
 * 样例
 * 如把31转换为14，需要改变2个bit位。
 *
 * (31)10=(11111)2
 *
 * (14)10=(01110)2
 *
 *
 *
 * 思路：
 * 先都转化为二进制数，如果不相等，在位数少的前面补0，直到长度一样。在判断，如果不一样计数，返回计数的结果。
 *
 *
 */

public class BitSwapRequiredClass {

  /**
   * @param a, b: Two integer
   * return: An integer
   */
  public static int bitSwapRequired(int a, int b) {
    // write your code here

    StringBuilder ss1 = new StringBuilder(Integer.toBinaryString(a));
    StringBuilder ss2 = new StringBuilder(Integer.toBinaryString(b));

    int s = Math.abs(ss1.length() - ss2.length());
    if (s > 0) {
      if (ss1.length() > ss2.length()) {
        StringBuilder child = new StringBuilder();
        for (int i = 0; i < s; i++) {
          child.append("0");
        }
        child.append(ss2);
        ss2 = child;
      } else {
        StringBuilder child = new StringBuilder();
        for (int i = 0; i < s; i++) {
          child.append("0");
        }
        child.append(ss1);
        ss1 = child;
      }
    }

    char[] aa = ss1.toString().toCharArray();
    char[] bb = ss2.toString().toCharArray();

    int ai = aa.length;

    int count = 0;
    for (int i = 0; i < ai; i++) {
      if (aa[i] != bb[i]) {
        count += 1;
      }
    }

    return count;
  }
}
