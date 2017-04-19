package com.arithmeticcollection;

import android.util.Log;

/**
 * Created by huangchuanyi on 3/14/17.
 *
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 *
 * 样例
 Given num = 38.
 The process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return 2.
 */

public class AddDigitsClass {

  int tt = 1;

  /**
   * @param num a non-negative integer
   * @return one digit
   */
  public int addDigits(int num) {
    // Write your code here
    if(num < 10){
      return num;
    }

    String numStr = Integer.toString(num);
    char[] aa = numStr.toCharArray();
    int sum = 0;
    for (int i = 0; i < aa.length; i++) {
      sum = sum + Character.getNumericValue(aa[i]);
    }
    tt++;
    if(sum >= 10){
      sum = addDigits(sum);
    }
    return sum;
  }
}
