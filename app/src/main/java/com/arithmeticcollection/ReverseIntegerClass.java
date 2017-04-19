package com.arithmeticcollection;

import android.util.Log;

/**
 * 反转整数
 *
 * 将一个整数中的数字进行颠倒，当颠倒后的整数溢出时，返回 0 (标记为 32 位整数)。
 *
 *
 * 样例
 * 给定 x = 123，返回 321
 *
 * 给定 x = -123，返回 -321
 */

public class ReverseIntegerClass {

  /**
   * @param n the integer to be reversed
   * @return the reversed integer
   */
  public int reverseInteger(int n) {
    // Write your code here
    if (n == 0) {
      return 0;
    }
    int max = Integer.MAX_VALUE;
    int min = Integer.MIN_VALUE;
    if (n > 0) {
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(n));
      stringBuilder.reverse();
      String nStr = stringBuilder.toString();
      String maxStr = String.valueOf(max);
      if (nStr.length() > maxStr.length() ||(nStr.length() == maxStr.length() && nStr.compareTo(maxStr) > 0)) {
        return 0;
      } else {
        return Integer.valueOf(nStr);
      }
    } else {
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(n));
      stringBuilder.deleteCharAt(0);
      stringBuilder.reverse();
      stringBuilder.insert(0, "-");
      String nStr = stringBuilder.toString();
      String minStr = String.valueOf(min);
      if (nStr.length() > minStr.length() ||(nStr.length() == minStr.length() && nStr.compareTo(minStr) > 0)) {
        return 0;
      } else {
        return Integer.valueOf(nStr);
      }
    }
  }
}
