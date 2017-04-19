package com.arithmeticcollection;

import java.util.ArrayList;

/**
 * 岛屿的个数
 *
 * 给一个01矩阵，求不同的岛屿的个数。
 *
 * 0代表海，1代表岛，如果两个1相邻，那么这两个1属于同一个岛。我们只考虑上下左右为相邻。
 *
 *
 * 样例
 * 在矩阵：
 *
 * [
 * [1, 1, 0, 0, 0],
 * [0, 1, 0, 0, 1],
 * [0, 0, 0, 1, 1],
 * [0, 0, 0, 0, 0],
 * [0, 0, 0, 0, 1]
 * ]
 * 中有 3 个岛.
 *
 *
 * 双层for循环，找到true的加一，其他标记为false。
 *
 *
 */

public class NumIslandsClass {

  /**
   * @param grid a boolean 2D matrix
   * @return an integer
   */
  public int numIslands(boolean[][] grid) {
    // Write your code here

    int num = 0;
    if (grid == null)
      return 0;
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        if (grid[i][j]) {
          num++;
          grid = change(grid, i, j);
        }
      }
    }

    return num;
  }

  private boolean[][] change(boolean[][] grid, int i, int j) {
    // 修改为false
    grid[i][j] = false;

    if (i > 0 && grid[i - 1][j]) {
      // 修改左边的
      grid = change(grid, i - 1, j);
    }
    if (j < grid[i].length - 1 && grid[i][j + 1]) {
      // 修改右边的
      grid = change(grid, i, j + 1);
    }
    if (j > 0 && grid[i][j - 1]) {
      // 修改上边的
      grid = change(grid, i, j - 1);
    }
    if (i < grid.length - 1 && grid[i + 1][j]) {
      // 修改下边的
      grid = change(grid, i + 1, j);
    }

    return grid;
  }

}
