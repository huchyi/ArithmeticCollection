package com.arithmeticcollection;

/**
 * 给出两个整数a和b, 求他们的和, 但不能使用 + 等数学运算符。
 *
 * a和b都是 32位 整数么？
 * 是的
 *
 * 我可以使用位运算符么？
 * 当然可以
 *
 * 样例
 * 如果 a=1 并且 b=2，返回3
 *
 *
 * ~的优先级最高，其次是<<、>>和>>>，再次是＆，然后是^，优先级最低的是|。
 * 0^0=0,0^1=1 0异或任何数＝任何数
 *
 * 1^0=1,1^1=0 1异或任何数－任何数取反
 *
 *
 *
 * 思路：
 * 1.首先转化为二进制。
 * 2.位或规律 0 + 0 = 0
 *         0 + 1 = 1
 *         1 + 0 = 1
 *         1 + 1 = 1
 *
 * 位与规律 0 + 0 = 0
 *         0 + 1 = 0       因为只有  1+1=1  ，然后<<1,即左移1位进位，此时右边补0为10；  循环多次，直到没有进位了，退出循环。
 *         1 + 0 = 0
 *         1 + 1 = 1
 *
 * 位异或规律0 + 0 = 0
 *         0 + 1 = 1       异或完后位不变，只要与后有不为0有进位数据，继续异或。直到没有进位数据，退出循环。
 *         1 + 0 = 1
 *         1 + 1 = 0
 *
 *
 *
 *
 */

public class AplusbClass {

  /*
    * param a: The first integer
    * param b: The second integer
    * return: The sum of a and b
    */
  public int aplusb(int a, int b) {
    // write your code here, try to do it without arithmetic operators.
    //if (b == 0) return a;
    //int ans = 0;
    //while (b != 0) {
    //  ans = a ^ b;
    //  b = (a & b) << 1;
    //  a = ans;
    //}
    //return ans;

    int jw = a & b;
    int jg = a ^ b;
    while(jw != 0) {
      int t_a = jg;
      int t_b = jw << 1;
      jw = t_a & t_b;
      jg = t_a ^ t_b;
    }

    return jg;

  }

}
