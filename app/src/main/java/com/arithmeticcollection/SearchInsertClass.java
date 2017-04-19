package com.arithmeticcollection;

import android.util.Log;

/**
 * 搜索插入位置
 *
 * 给定一个排序数组和一个目标值，如果在数组中找到目标值则返回索引。如果没有，返回到它将会被按顺序插入的位置。
 *
 * 你可以假设在数组中无重复元素。
 *
 * 样例
 * [1,3,5,6]，5 → 2
 *
 * [1,3,5,6]，2 → 1
 *
 * [1,3,5,6]， 7 → 4
 *
 * [1,3,5,6]，0 → 0
 *
 * 挑战
 * O(log(n)) time
 *
 * [1,3,5,6,8,9], 7
 */

public class SearchInsertClass {

  /**
   * param A : an integer sorted array
   * param target :  an integer to be inserted
   * return : an integer
   */
  public int searchInsert(int[] A, int target) {
    // write your code here

    int length = A.length;
    if (length <= 0) {
      return 0;
    }

    int higth = length - 1;
    int low = 0;
    int middle = length / 2;

    //[1,2,3,4,5,9], 0
    int middleNum = A[middle];
    while (true) {

      Log.i("hcy","low:" + low);
      Log.i("hcy","higth:" + higth);
      if(higth == low + 1){
        if(target <= A[low]){
          middle = low;
          break;
        }else if(target > A[higth]){
          middle = higth + 1;
          break;
        }else{
          middle = higth;
          break;
        }
      }

      if (middleNum > target) {

        higth = middle;
        middle = low + (higth - low)/2;
        middleNum = A[middle];

      } else if (middleNum < target) {

        low = middle;
        middle = low + (higth - low)/2;
        middleNum = A[middle];

      } else {

        break;
      }

    }

    return middle;
  }
}
