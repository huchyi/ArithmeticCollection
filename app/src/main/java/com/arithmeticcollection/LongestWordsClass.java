package com.arithmeticcollection;

import java.util.ArrayList;

/**
 * 最长单词
 *
 *给一个词典，找出其中所有最长的单词。
 *
 *样例
 在词典

 {
 "dog",
 "google",
 "facebook",
 "internationalization",
 "blabla"
 }
 中, 最长的单词集合为 ["internationalization"]

 在词典

 {
 "like",
 "love",
 "hate",
 "yes"
 }
 中，最长的单词集合为 ["like", "love", "hate"]

 挑战
 遍历两次的办法很容易想到，如果只遍历一次你有没有什么好办法？
 *
 *
 *
 *
 * 思路：
 * 记录最大长度，如果比最大长度还长，清空list，add新数据。如果和最大长度相等，则add数据。如果小于则忽略。
 *
 */

public class LongestWordsClass {

  /**
   * @param dictionary: an array of strings
   * @return: an arraylist of strings
   */
  ArrayList<String> longestWords(String[] dictionary) {
    // write your code here

    ArrayList<String> lists = new ArrayList<>();

    if(dictionary == null){
      return lists;
    }

    int maxLength = 0;
    for (int i = 0; i < dictionary.length; i++) {

      if(maxLength < dictionary[i].length()){
        maxLength = dictionary[i].length();
        lists.clear();
        lists.add(dictionary[i]);
      }else if(maxLength == dictionary[i].length()){
        lists.add(dictionary[i]);
      }
    }

    return lists;
  }
}
