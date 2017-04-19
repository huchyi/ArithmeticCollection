package com.arithmeticcollection.middle;

import java.util.ArrayList;

/**
 * 单词的添加与查找
 *
 *
 * 设计一个包含下面两个操作的数据结构：addWord(word), search(word)
 *
 * addWord(word)会在数据结构中添加一个单词。而search(word)则支持普通的单词查询或是只包含.和a-z的简易正则表达式的查询。
 *
 * 一个 . 可以代表一个任何的字母。
 *
 * 注意事项
 *
 * 你可以假设所有的单词都只包含小写字母 a-z。
 *
 *
 *
 *
 * 样例
 * addWord("bad")
 * addWord("dad")
 * addWord("mad")
 * search("pad")  // return false
 * search("bad")  // return true
 * search(".ad")  // return true
 * search("b..")  // return true
 */

public class WordDictionary {

  private ArrayList<String> wordList = new ArrayList<>();

  // Adds a word into the data structure.
  public void addWord(String word) {
    // Write your code here
    wordList.add(word);
  }

  // Returns if the word is in the data structure. A word could
  // contain the dot character '.' to represent any one letter.
  public boolean search(String word) {
    // Write your code here
    if (wordList.size() <= 0) {
      return false;
    }
    ArrayList<String> list = new ArrayList<>();
    for (int i = 0; i < wordList.size(); i++) {
      if (wordList.get(i).length() == word.length()) {
        list.add(wordList.get(i));
      }
    }

    if (list.size() <= 0) {
      return false;
    }

    System.out.println("准备循环");
    for (int i = 0; i < list.size(); i++) {

      for (int j = 0; j < word.length(); j++) {

        if (j == word.length() - 1) {
          if (list.get(i).substring(j, j + 1).equals(word.substring(j, j + 1)) || ".".equals(
              word.substring(j, j + 1))) {
            return true;
          }
        } else {
          if (list.get(i).substring(j, j + 1).equals(word.substring(j, j + 1))) {
          } else if (".".equals(word.substring(j, j + 1))) {
          } else {
            break;
          }
        }
      }
    }

    System.out.println("no");
    return false;
  }
}

// Your WordDictionary object will be instantiated and called as such:
// WordDictionary wordDictionary = new WordDictionary();
// wordDictionary.addWord("word");
// wordDictionary.search("pattern");
