package com.arithmeticcollection;

import android.util.Log;

/**
 * 给一组整数，按照升序排序，使用选择排序，冒泡排序，插入排序或者任何 O(n2) 的排序算法。
 *
 * 样例
 * 对于数组 [3, 2, 1, 4, 5], 排序后为：[1, 2, 3, 4, 5]。
 */

public class SortIntegersClass {

  /**
   * @param aa an integer array
   * @return void
   */
  public void sortIntegers(int[] aa) {
    // Write your code here

    int bb;
    for (int i = 0; i < aa.length - 1; i++) {
      for (int j = i + 1; j < aa.length; j++) {
        if (aa[i] > aa[j]) {
          bb = aa[i];
          aa[i] = aa[j];
          aa[j] = bb;
        }
      }
    }

    for (int i = 0; i < aa.length; i++) {
      Log.i("hcy", "sortIntegers: " + aa[i]);
    }

  }
}
