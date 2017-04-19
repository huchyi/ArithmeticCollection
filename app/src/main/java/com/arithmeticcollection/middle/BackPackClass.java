package com.arithmeticcollection.middle;

/**
 * 背包问题
 *
 *
 *在n个物品中挑选若干物品装入背包，最多能装多满？假设背包的大小为m，每个物品的大小为A[i]

 注意事项

 你不可以将物品进行切割。
 *
 *
 *
 *样例
 如果有4个物品[2, 3, 5, 7]

 如果背包的大小为11，可以选择[2, 3, 5]装入背包，最多可以装满10的空间。

 如果背包的大小为12，可以选择[2, 3, 7]装入背包，最多可以装满12的空间。

 函数需要返回最多能装满的空间大小。

 挑战
 O(n x m) time and O(m) memory.

 O(n x m) memory is also acceptable if you do not know how to optimize memory.


 *
 *
 *
 *
 *
 */

public class BackPackClass {

  /**
   * @param m: An integer m denotes the size of a backpack
   * @param A: Given n items with size A[i]
   * @return: The maximum size
   */
  public int backPack(int m, int[] A) {
    // write your code here

    if (A == null || 0 == A.length || m == 0)
      return 0;
    int len = A.length;
    //初始化了一个数组，
    int[][]  sum = new int[len][m+1];
    for(int i=0;i<len;i++){
      sum[i][0] = 0;
    }
    for(int j=0;j<m+1;j++){
      if(j>=A[0]){
        sum[0][j] = A[0];
      }
    }
    for(int i=1;i<len;i++){
      for(int j=1;j<m+1;j++){
        if(j>=A[i]){
          sum[i][j] = Math.max(sum[i-1][j], sum[i-1][j-A[i]]+A[i]);
        }else{
          sum[i][j] = sum[i-1][j];
        }
      }
    }
    return sum[len-1][m];


  }
}
