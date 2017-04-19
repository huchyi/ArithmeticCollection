package com.arithmeticcollection;

/**
 * 最长回文子串
 *
 *
 *给出一个字符串（假设长度最长为1000），求出它的最长回文子串，你可以假定只有一个满足条件的最长回文串。
 *
 *
 *
 *样例
 给出字符串 "abcdzdcab"，它的最长回文子串为 "cdzdc"。

 挑战
 O(n2) 时间复杂度的算法是可以接受的，如果你能用 O(n) 的算法那自然更好。
 *
 *
 *
 *
 *
 *
 *
 */

public class LongestPalindromeClass {




  /**
   * @param s input string
   * @return the longest palindromic substring
   */
  public String longestPalindrome(String s) {
    // Write your code here

    if(s.length() <= 1){
      return s;
    }

    String maxStr = "";
    int size = s.length();

    int t = 0;
    while (t < size){
      if (maxStr.length() >= size - t){
        break;
      }

      for (int i = size; i > t ; i--) {

        if (maxStr.length() >= i){
          break;
        }

        int end = i - 1;
        int start = t;

        while (start < end){
          if(s.charAt(start) != s.charAt(end)){
            break;
          }
          if(end - start <= 2){
            String max = s.substring(t,i);
            if(maxStr.length() < max.length()){
              maxStr = max;
            }
          }

          start++;
          end--;
        }
      }

      t++;

    }



    return maxStr;
  }

}
