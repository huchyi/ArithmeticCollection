package com.arithmeticcollection;

import android.text.TextUtils;

/**
 * 有效回文串
 *
 *
 * 给定一个字符串，判断其是否为一个回文串。只包含字母和数字，忽略大小写。
 *
 * 注意事项
 *
 * 你是否考虑过，字符串有可能是空字符串？这是面试过程中，面试官常常会问的问题。
 *
 * 在这个题目中，我们将空字符串判定为有效回文。
 *
 * 样例
 * "A man, a plan, a canal: Panama" 是一个回文。
 *
 * "race a car" 不是一个回文。
 *
 * 挑战
 * O(n) 时间复杂度，且不占用额外空间。
 */

public class IsPalindromeClass {

  /**
   * @param s A string
   * @return Whether the string is a valid palindrome
   */
  public boolean isPalindrome(String s) {
    // Write your code here
    if (s == null || s.length() <= 0) {
      return true;
    }
    int size = s.length();
    int end = size - 1;
    int begin = 0;

    while (begin < end) {
      while (end >= 0 && !check(s.charAt(end))) {
        --end;
      }
      while (begin < size && !check(s.charAt(begin))) {
        ++begin;
      }

      if (begin < size && end >= 0 && Character.toLowerCase(s.charAt(end)) != Character.toLowerCase(s.charAt(begin))) {
        return false;
      } else {
        --end;
        ++begin;
      }
    }
    return true;
  }

  private boolean check(char ch) {
    return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9');
  }
}
