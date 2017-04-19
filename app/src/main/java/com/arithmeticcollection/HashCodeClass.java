package com.arithmeticcollection;

import android.util.Log;

/**
 * 在数据结构中，哈希函数是用来将一个字符串（或任何其他类型）转化为小于哈希表大小且大于等于零的整数。一个好的哈希函数可以尽可能少地产生冲突。
 * 一种广泛使用的哈希函数算法是使用数值33，假设任何字符串都是基于33的一个大整数，比如：
 *
 * hashcode("abcd") = (ascii(a) * 33^3 + ascii(b) * 33^2 + ascii(c) *33^1 + ascii(d)) % HASH_SIZE
 *
 * = (97* 33^3 + 98 * 33^2 + 99 * 33^1 +100) % HASH_SIZE
 *
 * = 3595978 % HASH_SIZE
 *
 * 其中HASH_SIZE表示哈希表的大小(可以假设一个哈希表就是一个索引0 ~ HASH_SIZE-1的数组)。
 *
 * 给出一个字符串作为key和一个哈希表的大小，返回这个字符串的哈希值。
 *
 *
 * 说明
 * For this problem, you are not necessary to design your own hash algorithm or consider any
 * collision issue,
 * you just need to implement the algorithm as described.
 *
 * 样例
 * 对于key="abcd" 并且 size=100， 返回 78
 *
 *
 * 思路：
 * 主要在33^n上思考。
 *
 *
 */

public class HashCodeClass {

  /**
   * @param key: A String you should hash
   * @param HASH_SIZE: An integer
   * @return an integer
   */
  public int hashCode(char[] key, int HASH_SIZE) {
    // write your code here

    long sum = (int)key[0];//sum * 33可能会超出int范围
    for(int i = 1; i < key.length; i++) {
      sum = sum * 33 % HASH_SIZE + (int)key[i];//及时求余，否则超出long范围
    }
    return (int)(sum % HASH_SIZE);


    //会增加时间的复杂度
    //long sum = 0;
    //for (int i = 0; i < key.length; i++) {
    //  long tt = 1;
    //  for (int j = i + 1; j < key.length; j++) {
    //    tt = tt * 33;
    //    if(tt > HASH_SIZE){
    //      tt = tt % HASH_SIZE;
    //    }
    //  }
    //  //double aa = Math.pow(33,key.length - i) % HASH_SIZE;
    //  //sum = (sum + key[i] * (long)aa)% HASH_SIZE;
    //  sum = (sum + key[i] * tt)% HASH_SIZE;
    //}
    //return (int)sum;
  }
}
