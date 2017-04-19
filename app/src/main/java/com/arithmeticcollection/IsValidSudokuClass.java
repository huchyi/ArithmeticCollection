package com.arithmeticcollection;

/**
 * 判断数独是否合法
 *
 *
 * 请判定一个数独是否有效。
 *
 * 该数独可能只填充了部分数字，其中缺少的数字用 . 表示。
 *
 * 注意事项
 *
 * 一个合法的数独（仅部分填充）并不一定是可解的。我们仅需使填充的空格有效即可。
 */

public class IsValidSudokuClass {

  /**
   * @param board: the board
   * @return: wether the Sudoku is valid
   */
  public boolean isValidSudoku(char[][] board) {
    int r[][] = new int[9][9];
    int l[][] = new int[9][9];
    int a[][][] = new int[3][3][9];

    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        r[i][j] = 0;
        l[i][j] = 0;
        if (i < 3 && j < 3) {
          for (int k = 0; k < 9; k++)
            a[i][j][k] = 0;
        }
      }
    }

    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        if (board[i][j] == '.') continue;
        int n = board[i][j] - '0';
        if (n < 0 || n > 9) return false;
        if (++r[i][n - 1] > 1) return false;
        if (++l[j][n - 1] > 1) return false;
        int x = i / 3;
        int y = j / 3;
        if (++a[x][y][n - 1] > 1) return false;
      }
    }

    return true;
  }
}

