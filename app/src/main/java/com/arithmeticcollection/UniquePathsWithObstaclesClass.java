package com.arithmeticcollection;

/**
 * 不同的路径 II
 *
 * "不同的路径" 的跟进问题：

 现在考虑网格中有障碍物，那样将会有多少条不同的路径？

 网格中的障碍和空位置分别用 1 和 0 来表示。

 注意事项

 m 和 n 均不超过100
 *
 *
 *
 * 样例
 如下所示在3x3的网格中有一个障碍物：

 [
 [0,0,0],
 [0,1,0],
 [0,0,0]
 ]
 一共有2条不同的路径从左上角到右下角。
 *
 *
 *
 *
 *
 */

public class UniquePathsWithObstaclesClass {



  /**
   * @param obstacleGrid: A list of lists of integers
   * @return: An integer
   */
  public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    // write your code here


    int m = obstacleGrid.length;
    int n = obstacleGrid[0].length;

    if(n == 1 || m == 1){
      return 1;
    }

    int[][] tt = new int[m][n];
    boolean isSetZero = false;
    for (int i = 0; i < m; i++) {
      if(isSetZero){
        tt[i][0] = 0;
      }else{
        tt[i][0] = 1;
        if(obstacleGrid[i][0] == 1){
          isSetZero = true;
          tt[i][0] = 0;
        }
      }
    }

    isSetZero = false;
    for (int i = 0; i < n; i++) {
      if(isSetZero){
        tt[0][i] = 0;
      }else{
        tt[0][i] = 1;
        if(obstacleGrid[i][0] == 1){
          isSetZero = true;
          tt[0][i] = 0;
        }
      }
    }

    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        if(obstacleGrid[i][j] == 1){
          tt[i][j] = 0;
        }else{
          tt[i][j] = tt[i][j - 1] + tt[i - 1][j];
        }
      }
    }

    System.out.print("tt:" + tt[m-1][n-1]);
    return tt[m-1][n-1];


  }


}
