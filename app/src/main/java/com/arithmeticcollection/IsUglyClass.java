package com.arithmeticcollection;

/**
 * 丑数
 *
 * 写一个程序来检测一个整数是不是丑数。
 *
 * 丑数的定义是，只包含质因子 2, 3, 5 的正整数。比如 6, 8 就是丑数，但是 14 不是丑数以为他包含了质因子 7。
 *
 * 注意事项
 *
 * 可以认为 1 是一个特殊的丑数。
 *
 *
 * 样例
 * 给出 num = 8，返回 true。
 * 给出 num = 14，返回 false。
 */

public class IsUglyClass {

  /**
   * @param num an integer
   * @return true if num is an ugly number or false
   */
  public boolean isUgly(int num) {
    // Write your code here

    if(num == 0){
      return false;
    }

    while (true) {

      if (num % 2 == 0) {
        num = num / 2;
      } else if (num % 3 == 0) {
        num = num / 3;
      } else if (num % 5 == 0) {
        num = num / 5;
      } else {
        break;
      }
    }

    return num == 1 || num == 2 || num == 3 || num == 5;
  }
}
