package com.arithmeticcollection;

import android.util.Log;

/**
 * 报数
 *
 * 报数指的是，按照其中的整数的顺序进行报数，然后得到下一个数。如下所示：
 *
 * 1, 11, 21, 1211, 111221, 312211,13112221...
 *
 * 1 读作 "one 1" -> 11.
 *
 * 11 读作 "two 1s" -> 21.
 *
 * 21 读作 "one 2, then one 1" -> 1211.
 *
 * 给定一个整数 n, 返回 第 n 个顺序。
 *
 * 注意事项
 *
 * 整数的顺序将表示为一个字符串。
 *
 *
 *
 *
 * 样例
 * 给定 n = 5, 返回 "111221".
 *
 *
 *
 *
 * 思路：
 * 把每次的string转为char数组。记录第一个char数组，如果后面的和前一个一样则加1，否者（计数）+（字符）加入string中
 * 然后替换记录的char，让计数重新置1；循环。。。。
 *
 */

public class CountAndSayClass {

  /**
   * @param n the nth
   * @return the nth sequence
   */
  public String countAndSay(int n) {
    // Write your code here

    if (n == 0) {
      return "";
    }else if(n ==1){
      return "1";
    }

    String resultStr = "1";
    for (int i = 1; i < n; i++) {
      StringBuilder stringBuilder = new StringBuilder();
      char[] cc = resultStr.toCharArray();

      char ss = 0;
      int count = 0;
      for (int j = 0; j < cc.length; j++) {
        if(j == 0){
          ss = cc[j];
        }
        if(ss == cc[j]){
          count += 1;
        }else{
          stringBuilder.append(String.valueOf(count)).append(String.valueOf(ss));
          ss = cc[j];
          count = 1;
        }
      }

      if(count > 0){
        stringBuilder.append(String.valueOf(count)).append(String.valueOf(ss));
      }

      resultStr = stringBuilder.toString();
    }

    return resultStr;

  }
}
