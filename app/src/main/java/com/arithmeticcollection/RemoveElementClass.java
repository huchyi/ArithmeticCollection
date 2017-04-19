package com.arithmeticcollection;

import android.util.Log;
import java.util.ArrayList;

/**
 * 删除元素
 *
 *给定一个数组和一个值，在原地删除与值相同的数字，返回新数组的长度。

 元素的顺序可以改变，并且对新的数组不会有影响。
 *
 *
 *样例
 给出一个数组 [0,4,4,0,0,2,4,4]，和值 4
 返回 4 并且4个元素的新数组为[0,0,0,2]
 *
 *
 *
 *
 *
 *
 */

public class RemoveElementClass {

  /**
   *@param A: A list of integers
   *@param elem: An integer
   *@return: The new length after remove
   */
  public int removeElement(int[] A, int elem) {
    // write your code here
    if(A.length <= 0 ){
      return 0;
    }
    ArrayList<Integer> list = new ArrayList<>();

    for (int i = 0; i < A.length; i++) {
      if(elem != A[i]){
        list.add(A[i]);
      }
    }


    for (int i = 0; i < list.size(); i++) {
      A[i] = list.get(i);
      //Log.i("hcy","B[i]:" + A[i]);
    }

    A = new int[list.size()];

    return A.length;
  }
}
