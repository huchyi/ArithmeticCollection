package com.arithmeticcollection;

import java.util.ArrayList;

/**
 * 比较字符串
 *
 *
 * 比较两个字符串A和B，确定A中是否包含B中所有的字符。字符串A和B中的字符都是 大写字母
 *
 * 注意事项
 *
 * 在 A 中出现的 B 字符串里的字符不需要连续或者有序。
 *
 * 样例
 * 给出 A = "ABCD" B = "ACD"，返回 true
 *
 * 给出 A = "ABCD" B = "AABC"， 返回 false
 *
 *
 *
 *
 * 思路：
 * 把a和B种的数据转为char数组，然后把B中的数据单个拿出来逐个和a进行比较，如果找到一样的记录下位置，B中的下一个数据就从这个位置开始比较。
 * 完了之后再反转一遍，因为是无序的。最后记录下位置的总数和b的长度一样则返回true。
 *
 *
 */

public class CompareStringsClass {

  /**
   * @param A : A string includes Upper Case letters
   * @param B : A string includes Upper Case letter
   * @return :  if string A contains all of the characters in B return true else return false
   */
  public boolean compareStrings(String A, String B) {
    // write your code here

    char[] aa = A.toCharArray();
    char[] bb = B.toCharArray();

    int count = 0;
    int t = 0;
    for (int i = 0; i < bb.length; i++) {

      for (int j = t; j < aa.length; j++) {
        if (bb[i] == aa[j]) {
          t = j + 1;
          count += 1;
          break;
        }
      }
    }

    StringBuilder ss = new StringBuilder(B);
    char[] bb2 = ss.reverse().toString().toCharArray();
    int count2 = 0;
    int t2 = 0;
    for (int i = 0; i < bb2.length; i++) {

      for (int j = t2; j < aa.length; j++) {
        if (bb2[i] == aa[j]) {
          t2 = j + 1;
          count2 += 1;
          break;
        }
      }
    }

    return count == bb.length || count2 == bb2.length;
  }
}
