package com.arithmeticcollection.middle;

import java.util.ArrayList;
import java.util.List;

/**
 * 乱序字符串
 *
 * 给出一个字符串数组S，找到其中所有的乱序字符串(Anagram)。如果一个字符串是乱序字符串，那么他存在一个字母集合相同
 * ，但顺序不同的字符串也在S中。
 *
 * 注意事项
 *
 * 所有的字符串都只包含小写字母
 *
 *
 *
 *
 *
 * 样例
 * 对于字符串数组 ["lint","intl","inlt","code"]
 *
 * 返回 ["lint","inlt","intl"]
 *
 * 挑战
 * What is Anagram?
 * - Two strings are anagram if they can be the same after change the order of characters.
 */

public class AnagramsClass {

  /**
   * @param strs: A list of strings
   * @return: A list of strings
   */
  public static List<String> anagrams(String[] strs) {
    // write your code here
    ArrayList<String> strList = new ArrayList<>();
    for (int i = 0; i < strs.length; i++) {
      strList.add(strs[i]);
    }

    ArrayList<String> list = new ArrayList<>();

    int i = 0;
    int end = strList.size();
    while (i < end) {
      String word = strList.get(0);
      char[] wordChars = word.toCharArray();
      ArrayList<Character> wordList = new ArrayList<>();
      for (int j = 0; j < wordChars.length; j++) {
        wordList.add(wordChars[j]);
      }


      for (int j = strList.size() - 1; j > 0; j--) {
        if (word.length() == strList.get(j).length()) {
          char[] nextChars = strList.get(j).toCharArray();

          StringBuilder newWord = new StringBuilder();
          ArrayList<Character> newWordList = new ArrayList<>();
          newWordList.addAll(wordList);

          boolean isBreak = false;

          for (int k = 0; k < nextChars.length; k++) {
            for (int l = 0; l < newWordList.size(); l++) {
              if (nextChars[k] == newWordList.get(l)) {
                newWord.append(newWordList.get(l));
                newWordList.remove(l);
                break;
              }else{
                if(l == newWordList.size() - 1){
                  isBreak = true;
                }
              }

            }

            if(isBreak){
              break;
            }
          }

          if(newWord.length() == word.length()){
            if (!list.contains(word)) {
              list.add(word);
            }
            list.add(strList.get(j));

            strList.remove(j);
          }

        }
      }

      strList.remove(word);
      end = strList.size();
      i = 0;
    }

    for (int j = 0; j < list.size(); j++) {
      System.out.println(list.get(j));
    }

    return list;
  }
}
