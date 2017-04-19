package com.arithmeticcollection;

import java.util.ArrayList;

/**
 * 翻转字符串
 *
 *给定一个字符串，逐个翻转字符串中的每个单词。
 *
 *
 *说明
 单词的构成：无空格字母构成一个单词
 输入字符串是否包括前导或者尾随空格？可以包括，但是反转后的字符不能包括
 如何处理两个单词间的多个空格？在反转字符串中间空格减少到只含一个

 *
 *
 *
 *
 *
 *
 *
 */

public class ReverseWordsClass {



  /**
   * @param s : A string
   * @return : A string
   */
  public String reverseWords(String s) {
    // write your code
    char[] chars = s.toCharArray();
    char space = " ".charAt(0);

    StringBuilder stringBuilder = new StringBuilder();
    int point = 0;
    for (int i = 0; i < chars.length; i++) {
      if(chars[i] != space){
        if(stringBuilder.length() > 0 && !stringBuilder.subSequence(0,1).toString().equals(" ")){
          stringBuilder.insert(++point,String.valueOf(chars[i]));
        }else{
          point = 0;
          stringBuilder.insert(0,String.valueOf(chars[i]));
        }
      }else{
        if(stringBuilder.length() > 0 && !stringBuilder.subSequence(0,1).toString().equals(" ")){
          stringBuilder.insert(0,String.valueOf(chars[i]));
        }
      }
    }
    if(stringBuilder.length() > 0 && stringBuilder.subSequence(0,1).toString().equals(" ")){
      stringBuilder.delete(0,1);
    }
    return stringBuilder.toString();

  }
}
