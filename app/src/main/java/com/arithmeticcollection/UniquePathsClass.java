package com.arithmeticcollection;

/**
 * 不同的路径
 *
 *有一个机器人的位于一个 m × n 个网格左上角。

 机器人每一时刻只能向下或者向右移动一步。机器人试图达到网格的右下角。

 问有多少条不同的路径？

 注意事项

 n和m均不超过100
 *
 *
 *样例
 给出 m = 3 和 n = 3, 返回 6.
 给出 m = 4 和 n = 5, 返回 35.
 *
 *
 *
 *
 *
 *
 */

public class UniquePathsClass {



  /**
   * @param n, m: positive integer (1 <= n ,m <= 100)
   * @return an integer
   */
  public int uniquePaths(int m, int n) {
    // write your code here
    if(n == 1 || m == 1){
      return 1;
    }

    int[][] tt = new int[m][n];
    for (int i = 0; i < m; i++) {
      tt[i][0] = 1;
    }

    for (int i = 0; i < n; i++) {
      tt[0][i] = 1;
    }

    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        tt[i][j] = tt[i][j - 1] + tt[i - 1][j];
      }
    }

    return tt[m-1][n-1];
  }

}
