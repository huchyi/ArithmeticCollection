package com.arithmeticcollection;

/**
 * 旋转字符串
 *
 *给定一个字符串和一个偏移量，根据偏移量旋转字符串(从左向右旋转)
 *
 *
 *
 *
 *样例
 对于字符串 "abcdefg".

 offset=0 => "abcdefg"
 offset=1 => "gabcdef"
 offset=2 => "fgabcde"
 offset=3 => "efgabcd"
 挑战
 在数组上原地旋转，使用O(1)的额外空间
 *
 *
 *
 *
 *
 *
 */

public class RotateStringClass {




  /**
   * @param str: an array of char
   * @param offset: an integer
   * @return: nothing
   */
  public void rotateString(char[] str, int offset) {
    // write your code here

    if(str.length <= 0){
      return;
    }
    if(offset > str.length){
      offset = offset % str.length;
    }
    while (offset-- > 0){
      char pointStart = str[str.length - 1];
      for (int i = str.length - 1; i > 0; i--) {
        str[i] = str[i - 1];
      }
      str[0] = pointStart;
    }

  }
}
