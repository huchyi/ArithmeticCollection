package com.arithmeticcollection.middle;

import java.util.ArrayList;

/**
 * 最长无重复字符的子串
 *
 *给定一个字符串，请找出其中无重复字符的最长子字符串。
 *
 *
 *样例
 例如，在"abcabcbb"中，其无重复字符的最长子字符串是"abc"，其长度为 3。

 对于，"bbbbb"，其无重复字符的最长子字符串为"b"，长度为1。

 挑战
 O(n) 时间
 *
 *
 */

public class LengthOfLongestSubstringClass {


  /**
   * @param s: a string
   * @return: an integer
   */
  public int lengthOfLongestSubstring(String s) {
    // write your code here

    char[] chars = s.toCharArray();

    if (s.length() <= 1 ){
      return s.length();
    }

    ArrayList<Character> charList = new ArrayList<>();

    int max = 1;
    int point = 0;

    for (int i = 0; i < chars.length; i++) {
      if(charList.contains(chars[i])){

        if(charList.size() >= max){
          max = charList.size();
        }
        point++ ;
        i = point - 1;
        charList.clear();

      }else{

        charList.add(chars[i]);

      }

    }

    //System.out.println("charList.size():" + charList.size());
    if(charList.size() >= max){
      max = charList.size();
    }

    //System.out.println("max:" + max);

    return max;

  }
}
