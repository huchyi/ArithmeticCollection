package com.arithmeticcollection;

import android.text.TextUtils;

/**
 * 字符串查找
 *
 * 对于一个给定的 source 字符串和一个 target 字符串，你应该在 source 字符串中找出 target 字符串出现的第一个位置
 * (从0开始)。如果不存在，则返回 -1。
 *
 *
 * 说明
 * KMP算法？
 *
 * 样例
 * 如果 source = "source" 和 target = "target"，返回 -1。
 *
 * 如果 source = "abcdabcdefg" 和 target = "bcd"，返回 1。
 *
 * 挑战
 * O(n2)的算法是可以接受的。如果你能用O(n)的算法做出来那更加好。（提示：KMP）
 */

public class FindStrClass {

  /**
   * Returns a index to the first occurrence of target in source,
   * or -1  if target is not part of source.
   *
   * @param source string to be scanned.
   * @param target string containing the sequence of characters to match.
   */
  public int strStr(String source, String target) {
    // write your code here
    if (source == null) {
      return -1;
    } else if (target == null) {
      return -1;
    } else if ("".equals(target)) {
      return 0;
    }
    //["tartarget", "target"]

    char[] sourceChar = source.toCharArray();
    char[] targetChar = target.toCharArray();

    if (targetChar.length > sourceChar.length) {
      return -1;
    }

    int point = -1;

    int pointt = 0;
    for (int i = 0; i < sourceChar.length; i++) {
      if (sourceChar[i] == targetChar[pointt]) {
        if (pointt == 0) {
          point = i;
        }
        if (pointt == targetChar.length - 1) {
          return point;
        }
        pointt++;
      } else if (sourceChar[i] == targetChar[0]) {
        point = i;
        pointt = 1;
      } else {

        if (i > sourceChar.length - targetChar.length) {
          break;
        }
        point = -1;
        pointt = 0;
      }
    }

    return -1;
  }
}
