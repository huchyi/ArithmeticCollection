package com.arithmeticcollection;

import android.util.Log;

/**
 * 搜索二维矩阵
 *
 *
 * 写出一个高效的算法来搜索 m × n矩阵中的值。
 *
 * 这个矩阵具有以下特性：
 *
 * 每行中的整数从左到右是排序的。
 * 每行的第一个数大于上一行的最后一个整数。
 *
 *
 *
 * 样例
 * 考虑下列矩阵：
 *
 * [
 * [1, 3, 5, 7],
 * [10, 11, 16, 20],
 * [23, 30, 34, 50]
 * ]
 * 给出 target = 3，返回 true
 *
 * 挑战
 * O(log(n) + log(m)) 时间复杂度
 */

public class SearchMatrixClass {

  /**
   * @param matrix, a list of lists of integers
   * @param target, an integer
   * @return a boolean, indicate whether matrix contains target
   */
  public boolean searchMatrix(int[][] matrix, int target) {
    // write your code here

    if(matrix.length <= 0){
      return false;
    }

    int m = matrix.length;
    int n = matrix[0].length;

    boolean isTarget = false;

    for (int i = 0; i < m - 1; i++) {
      if (matrix[i][0] == target) {
        isTarget = true;
        break;
      } else if (matrix[i + 1][0] == target) {
        isTarget = true;
        break;
      } else if (matrix[i][0] < target && target < matrix[i + 1][0]) {
        for (int j = 0; j < n - 1; j++) {
          if(matrix[i][j] == target){
            isTarget = true;
            break;
          }else if(target == matrix[i][j + 1]){
            isTarget = true;
            break;
          }else if(matrix[i][j] < target && target < matrix[i][j + 1]){
            break;
          }
        }
        break;
      }else if(i + 1 == m - 1 && target > matrix[i + 1][0]){
        for (int j = 0; j < n - 1; j++) {
          if(matrix[i + 1][j] == target){
            isTarget = true;
            break;
          }else if(target == matrix[i + 1][j + 1]){
            isTarget = true;
            break;
          }else if(matrix[i + 1][j] < target && target < matrix[i + 1][j + 1]){
            break;
          }
        }
        break;
      }
    }
    return isTarget;
  }
}
