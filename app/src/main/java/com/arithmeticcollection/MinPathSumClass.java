package com.arithmeticcollection;

import android.util.Log;
import java.util.ArrayList;

/**
 * 最小路径和
 *
 *
 * 给定一个只含非负整数的m*n网格，找到一条从左上角到右下角的可以使数字和最小的路径。
 *
 *
 *
 * 注意事项
 *
 * 你在同一时间只能向下或者向右移动一步
 *
 *
 *
 *
 * //[1,2,3,4,5,6,7,8,9]
 * //[1,2,3,4,5,6,7,8,9]
 * //[1,2,3,4,5,6,7,8,9]
 * //[1,2,3,4,5,6,7,8,9]
 * //[1,2,3,4,5,6,7,8,9]
 * //[1,2,3,4,5,6,7,8,9]
 * //[1,2,3,4,5,6,7,8,9]
 */

public class MinPathSumClass {

  /**
   * @param grid: a list of lists of integers.
   * @return: An integer, minimizes the sum of all numbers along its path
   *
   *
   *
   * 思路：
   * 把其分解为基础单位为正方形的4个元素  1，3 。先赋值给上边和左边，在比较对角线，小的加上右下赋值给右下。循环。
   *                                 2，1
   *
   */
  public int minPathSum(int[][] grid) {
    // write your code here
    int m = grid.length;
    int n = grid[0].length;
    int[][] dp = new int[m][n];
    dp[0][0] = grid[0][0];
    for(int i=1;i<m;i++)
      dp[i][0] = dp[i-1][0] + grid[i][0];
    for(int j=1;j<n;j++)
      dp[0][j] = dp[0][j-1] + grid[0][j];

    for(int i=1;i<m;i++)
      for(int j=1;j<n;j++)
        dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j];
    return dp[m-1][n-1];
  }

  ///**
  // * @param grid: a list of lists of integers.
  // * @return: An integer, minimizes the sum of all numbers along its path
  // */
  //public int minPathSum(int[][] grid) {
  //  // write your code here
  //  int y = grid[0].length - 1;
  //  if(y < 0){
  //    return 0;
  //  }
  //  int x = grid.length - 1;
  //  if(x < 0){
  //    return 0;
  //  }
  //
  //  int sum = grid[0][0];
  //  ArrayList<Integer> allList = new ArrayList<>();
  //  allList(allList,sum,grid,0,0,x,y);
  //  sum = allList.get(0);
  //  for (int tt : allList) {
  //    if(tt < sum){
  //      sum = tt;
  //    }
  //  }
  //
  //  return sum;
  //}
  //
  //private void allList(ArrayList<Integer> allList , int sum,int[][] grid,int xc,int yc,int x,int y){
  //
  //  if(xc == x && yc == y){
  //    allList.add(sum);
  //    return;
  //  }
  //  boolean isAdd = false;
  //  if(xc < x){
  //    xc++;
  //    sum = sum + grid[xc][yc];
  //    allList(allList,sum,grid,xc,yc,x,y);
  //    isAdd = true;
  //  }
  //
  //  if(yc < y){
  //    if(isAdd){
  //      sum = sum - grid[xc][yc];
  //      xc--;
  //      yc++;
  //      sum = sum + grid[xc][yc];
  //    }else{
  //      yc++;
  //      sum = sum + grid[xc][yc];
  //    }
  //    allList(allList,sum,grid,xc,yc,x,y);
  //  }
  //}
}
