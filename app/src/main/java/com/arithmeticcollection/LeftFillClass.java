package com.arithmeticcollection;

import android.text.TextUtils;

/**
 * 左填充
 *
 * 实现一个leftpad库，如果不知道什么是leftpad可以看样例
 *
 * 样例
 leftpad("foo", 5)
 >> "  foo"

 leftpad("foobar", 6)
 >> "foobar"

 leftpad("1", 2, "0")
 >> "01"
 */

public class LeftFillClass {

  /**
   * @param originalStr the string we want to append to with spaces
   * @param size the target length of the string
   * @return a string
   */
  static public String leftPad(String originalStr, int size) {
    // Write your code here

    if(originalStr == null){
      return "";
    }

    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < size - originalStr.length(); i++) {
      stringBuilder.append(" ");
    }
    stringBuilder.append(originalStr);
    return stringBuilder.toString();
  }

  /**
   * @param originalStr the string we want to append to
   * @param size the target length of the string
   * @param padChar the character to pad to the left side of the string
   * @return a string
   */
  static public String leftPad(String originalStr, int size, char padChar) {
    // Write your code here

    if(originalStr == null){
      return "";
    }

    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < size - originalStr.length(); i++) {
      stringBuilder.append(Character.toString(padChar));
    }
    stringBuilder.append(originalStr);
    return stringBuilder.toString();
  }

}
