package com.arithmeticcollection;

import android.util.Log;

/**
 * 两个字符串是变位词
 *
 *
 * 写出一个函数 anagram(s, t) 判断两个字符串是否可以通过改变字母的顺序变成一样的字符串。
 *
 *
 * 说明
 * What is Anagram?
 * - Two strings are anagram if they can be the same after change the order of characters.
 *
 * 样例
 * 给出 s = "abcd"，t="dcab"，返回 true.
 * 给出 s = "ab", t = "ab", 返回 true.
 * 给出 s = "ab", t = "ac", 返回 false.
 *
 * 挑战
 * O(n) time, O(1) extra space
 */
public class AnagramClass {

  /**
   * @param s: The first string
   * @param t: The second string
   * @return true or false
   */
  public boolean anagram(String s, String t) {
    // write your code here

    if(s.length() != t.length())
      return false;

    int[] count = new int[256];

    for (int i = 0; i < s.length(); i++) {
      count[(int) s.charAt(i)]++;
    }

    for (int i = 0; i < t.length(); i++) {
      count[(int) t.charAt(i)]--;
      if(count[(int) t.charAt(i)] < 0)
        return false;
    }

    return true;
  }
}
