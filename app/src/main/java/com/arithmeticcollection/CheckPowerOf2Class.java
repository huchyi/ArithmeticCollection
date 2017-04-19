package com.arithmeticcollection;

import android.util.Log;

/**
 * O(1)时间检测2的幂次
 *
 * 用 O(1) 时间检测整数 n 是否是 2 的幂次。
 *
 * 样例
 * n=4，返回 true;
 *
 * n=5，返回 false.
 *
 *
 * 思路，2的幂二进制中只有一个数字为1。
 *
 *
 */

public class CheckPowerOf2Class {

  /*
    * @param n: An integer
    * @return: True or false
    */
  public boolean checkPowerOf2(int n) {
    // write your code here
    if (n <= 0) {
      return false;
    }
    String tt = Integer.toBinaryString(n);
    char[] chars = tt.toCharArray();
    char[] ch = "1".toCharArray();
    int num = 0;
    for (char a : chars) {
      if(a == ch[0]){
        num++;
        if(num > 1){
          break;
        }
      }
    }
    return num == 1;
  }
}
