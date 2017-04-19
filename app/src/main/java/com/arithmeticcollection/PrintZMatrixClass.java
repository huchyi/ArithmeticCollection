package com.arithmeticcollection;

import android.util.Log;

/**
 * 矩阵的之字型遍历
 *
 * 给你一个包含 m x n 个元素的矩阵 (m 行, n 列), 求该矩阵的之字型遍历。
 *
 * 样例
 * 对于如下矩阵：
 *
 * [
 * [1, 2,  3,  4],
 * [5, 6,  7,  8],
 * [9,10, 11, 12]
 * ]
 * 返回 [1, 2, 5, 9, 6, 3, 4, 7, 10, 11, 8, 12]
 *
 *
 *
 * 思路：
 * 外部循环的次数为矩阵周长的1/2，每次循环取斜线一条的数据。
 *
 *
 */

public class PrintZMatrixClass {

  /**
   * @param matrix: a matrix of integers
   * @return: an array of integers
   */
  public int[] printZMatrix(int[][] matrix) {
    // write your code here
    if (matrix.length < 1) {
      return new int[] {};
    }

    int h = 0;
    int v = 0;

    int maxh = matrix[0].length;
    int maxv = matrix.length;

    int[] nums = new int[maxh * maxv];

    boolean isH = true;
    int tt = 0;
    nums[tt] = matrix[h][v];
    for (int i = 0; i < maxh + maxv - 2; i++) {
      h++;
      v++;
      if (isH) {
        int hh = h;
        if (h > maxh - 1) {
          hh = maxh - 1;
        }
        int vv = 0;
        if (v > maxv - 1) {
          vv = v - (maxv - 1);
        }
        //[1, 2,  3,  4],
        //[5, 6,  7,  8],
        //[9,10, 11, 12]

        for (int j = hh; j >= vv; j--) {
          tt++;
          nums[tt] = matrix[v - j][j];
        }
      } else {
        int vv = v;
        if (v > maxv - 1) {
          vv = maxv - 1;
        }
        int hh = 0;
        if (h > maxh - 1) {
          hh = h - (maxh - 1);
        }
        for (int j = vv; j >= hh; j--) {
          tt++;
          nums[tt] = matrix[j][h - j];
        }
      }
      isH = !isH;
    }

    for (int t : nums) {
      Log.i("hcy", "t:" + t);
    }

    return nums;
  }
}
