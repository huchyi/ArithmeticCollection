package com.arithmeticcollection;

/**
 * 判断字符串是否没有重复字符
 *
 *实现一个算法确定字符串中的字符是否均唯一出现
 *
 *
 *
 *样例
 给出"abc"，返回 true

 给出"aab"，返回 false

 挑战
 如果不使用额外的存储空间，你的算法该如何改变？
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

public class IsUniqueClass {


  /**
   * @param str: a string
   * @return: a boolean
   */
  public boolean isUnique(String str) {
    // write your code here
    if(str.length() <= 0){
      return true;
    }

    for (int i = 0; i < str.length(); i++) {
      for (int j = i + 1; j < str.length(); j++) {
        if(str.charAt(i) - str.charAt(j) == 0){
          return false;
        }
      }
    }

    return true;
  }


}
