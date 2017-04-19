package com.arithmeticcollection;

/**
 * 数字三角形
 *
 *
 *给定一个数字三角形，找到从顶部到底部的最小路径和。每一步可以移动到下面一行的相邻数字上。

 注意事项

 如果你只用额外空间复杂度O(n)的条件下完成可以获得加分，其中n是数字三角形的总行数。
 *
 *
 *样例
 比如，给出下列数字三角形：

 [
 [2],
 [3,4],
 [6,5,7],
 [4,1,8,3]
 ]
 从顶到底部的最小路径和为11 ( 2 + 3 + 5 + 1 = 11)。
 *
 *
 *
 *
 *
 *
 *
 *
 */
public class MinimumTotalClass {


  /**
   * @param triangle: a list of lists of integers.
   * @return: An integer, minimum path sum.
   */
  public int minimumTotal(int[][] triangle) {
    // write your code here
    if(triangle.length <= 0){
      return 0;
    }else if(triangle.length == 1){
      int min = 0;
      for (int i = 0; i < triangle[0].length; i++) {
        if(triangle[0][i] < min){
          min = triangle[0][i];
        }
      }
      return min;
    }

    int n = triangle.length;
    int m = triangle[n-1].length;

    int[] result = new int[m];
    result[0] = triangle[0][0];
    int min = 0;
    for (int i = 1; i < n; i++) {
      int[] newT = triangle[i];
      for (int j = newT.length - 1; j >= 0; j--) {
        if(j == newT.length - 1){
          result[j] = result[j - 1] + newT[j];
        }else if(j == 0){
          result[j] = result[j] + newT[j];
        }else{
          int jj = result[j];
          int jjj = result[j - 1];
          if(jj < jjj){
            result[j] = result[j] + newT[j];
          }else{
            result[j] = result[j - 1] + newT[j];
          }
        }

        if(i == n - 1){
          if(j == newT.length - 1){
            min = result[j];
          }else if(result[j] < min){
            min = result[j];
          }
        }

      }

    }

    return min;
  }



}
