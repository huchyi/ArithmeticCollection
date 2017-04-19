package com.arithmeticcollection.middle;

import java.util.ArrayList;

/**
 * 装最多水的容器
 *
 * 给定 n 个非负整数 a1, a2, ..., an, 每个数代表了坐标中的一个点 (i, ai)。画 n 条垂直线，使得 i 垂直线的两个
 * 端点分别为(i, ai)和(i, 0)。找到两条线，使得其与 x 轴共同构成一个容器，以容纳最多水。
 *
 * 注意事项
 *
 * 容器不可倾斜。
 *
 *
 *
 * 样例
 * 给出[1,3,2], 最大的储水面积是2.
 */

public class MaxAreaClass {

  /**
   * @param heights: an array of integers
   * @return: an integer
   */
  public int maxArea(int[] heights) {
    // write your code here

    int max = 0;

    for (int i = 0; i < heights.length - 1; i++) {
      for (int j = 1; j < heights.length; j++) {
        int ii = heights[i];
        int jj = heights[j];
        int hh = ii > jj ? jj : ii;
        int rr = hh * (j - i);
        if(max < rr){
          max = rr;
        }
      }
    }

    return max;
  }
}
