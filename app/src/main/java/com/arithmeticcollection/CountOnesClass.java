package com.arithmeticcollection;

/**
 * 二进制中有多少个1
 *
 * 计算在一个 32 位的整数的二进制表式中有多少个 1.
 *
 * 给定 32 (100000)，返回 1

 给定 5 (101)，返回 2

 给定 1023 (111111111)，返回 9


 思路：
 把int转化为二进制，然后把1的char和当前转化为二进制数组比较，为1则计数加1；

 */

public class CountOnesClass {

  /**
   * @param num: an integer
   * @return: an integer, the number of ones in num
   */
  public int countOnes(int num) {
    // write your code here

    String ss = Integer.toBinaryString(num);

    char[] t = "1".toCharArray();
    char[] s = ss.toCharArray();

    int count =0;
    for (char a:s) {
      if(a == t[0]){
        count += 1;
      }
    }
    return count;
  }
}
