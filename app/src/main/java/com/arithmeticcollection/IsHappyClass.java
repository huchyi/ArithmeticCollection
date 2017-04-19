package com.arithmeticcollection;

import java.util.ArrayList;

/**
 * 写一个算法来判断一个数是不是"快乐数"。
 *
 * 一个数是不是快乐是这么定义的：对于一个正整数，每一次将该数替换为他每个位置上的数字的平方和，然后重复这个过程直
 * 到这个数变为1，或是无限循环但始终变不到1。如果可以变为1，那么这个数就是快乐数。
 *
 *
 *
 * 样例
 * 19 就是一个快乐数。
 *
 * 1^2 + 9^2 = 82
 * 8^2 + 2^2 = 68
 * 6^2 + 8^2 = 100
 * 1^2 + 0^2 + 0^2 = 1
 *
 *
 * 思路：
 * 把每个数转为string，在转为char[]，插接出来进行平方相加，相加的数为1 返回true。相加的数不为1，加入list，为不为1
 * 做对比，如果已经加入过一个相同的数字，则死循环了。返回false。
 *
 *
 */

public class IsHappyClass {

  /**
   * @param n an integer
   * @return true if this is a happy number or false
   */
  public boolean isHappy(int n) {
    // Write your code here

    if (n == 0) {
      return false;
    }

    ArrayList<Integer> list = new ArrayList<>();
    list.add(n);

    return sum(list, n);
  }

  public boolean sum(ArrayList<Integer> list, int n) {
    int sum = 0;
    char[] cc = Integer.toString(n).toCharArray();

    for (char t : cc) {
      int tt = Character.getNumericValue(t);
      sum = sum + tt * tt;
    }

    boolean isBreak = false;
    for (int tt : list) {
      if (tt == sum) {
        isBreak = true;
        break;
      }
    }
    list.add(sum);
    if (sum == 1) {
      return true;
    }
    if (isBreak) {
      return false;
    } else {
      return sum(list, sum);
    }
  }
}
