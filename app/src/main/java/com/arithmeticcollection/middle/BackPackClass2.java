package com.arithmeticcollection.middle;

import java.util.Arrays;

/**
 * 背包问题 II
 *
 *给出n个物品的体积A[i]和其价值V[i]，将他们装入一个大小为m的背包，最多能装入的总价值有多大？

 注意事项

 A[i], V[i], n, m均为整数。你不能将物品进行切分。你所挑选的物品总体积需要小于等于给定的m。
 *
 *
 *样例
 对于物品体积[2, 3, 5, 7]和对应的价值[1, 5, 2, 4], 假设背包大小为10的话，最大能够装入的价值为9。

 挑战
 O(n x m) memory is acceptable, can you do it in O(m) memory?
 *
 *
 *
 *
 */

public class BackPackClass2 {

  /**
   * @param m: An integer m denotes the size of a backpack
   * @param A & V: Given n items with size A[i] and value V[i]
   * @return: The maximum value
   */
  public int backPackII(int m, int[] A, int V[]) {
    // write your code here



    int len = A.length;
    int[] result=new int[m+1];
    for(int i = 0;i<len;i++){
      for(int j = m; j>=A[i];j--){
        int temp = result[j-A[i]]+V[i];
        result[j]=Math.max(result[j],temp );
      }
        System.out.println(Arrays.toString(result));
    }
    return result[m];

  }

}
