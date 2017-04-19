package com.arithmeticcollection;

import android.util.Log;

/**
 * 加一
 *
 *
 * 给定一个非负数，表示一个数字数组，在该数的基础上+1，返回一个新的数组。
 *
 * 该数字按照大小进行排列，最大的数在列表的最前面。
 *
 *
 * 样例
 * 给定 [1,2,3] 表示 123, 返回 [1,2,4].
 *
 * 给定 [9,9,9] 表示 999, 返回 [1,0,0,0].
 */

public class PlusOneClass {

  /**
   * @param digits a number represented as an array of digits
   * @return the result
   */
  public int[] plusOne(int[] digits) {
    // Write your code here
    if (digits.length == 0) {
      return new int[] { 1 };
    }

    StringBuilder stringBuilder = new StringBuilder();
    int a = 0;
    for (int i = digits.length - 1; i >= 0; i--) {
      int t = 0;
      if (i == digits.length - 1) {
        t = digits[i] + 1 + a;
      } else {
        t = digits[i] + a;
      }
      if (i > 0) {
        if (t > 9) {
          a = 1;
          t = 0;
        } else {
          a = 0;
        }
        stringBuilder.append(t);
      }else{
        if(t > 9){
          stringBuilder.append("01");
        }else{
          stringBuilder.append(t);
        }

      }
    }

    int[] aa = new int[stringBuilder.length()];
    char[] chars = stringBuilder.reverse().toString().toCharArray();
    for (int i = 0; i < chars.length; i++) {
      aa[i] = Character.getNumericValue(chars[i]);
    }
    return aa;
  }
}
