package com.arithmeticcollection;

import java.util.ArrayList;

/**
 * 合并排序数组
 *
 * 合并两个排序的整数数组A和B变成一个新的数组。
 *
 * 样例
 * 给出A=[1,2,3,4]，B=[2,4,5,6]，返回 [1,2,2,3,4,4,5,6]
 *
 *
 * 挑战
 * 你能否优化你的算法，如果其中一个数组很大而另一个数组很小？
 */

public class MergeSortedArrayClass2 {

  /**
   * @param A and B: sorted integer array A and B.
   * @return: A new sorted integer array
   */
  public int[] mergeSortedArray(int[] A, int[] B) {
    // Write your code here

    ArrayList<Integer> list = new ArrayList<>();
    int ai = A.length - 1;
    int bi = B.length - 1;
    while (ai >= 0 && bi >= 0) {
      if (A[ai] > B[bi]) {
        list.add(A[ai--]);
      }else{
        list.add(B[bi--]);
      }
    }
    while (ai >= 0){
      list.add(A[ai--]);
    }
    while (bi >= 0){
      list.add(B[bi--]);
    }
    int[] cc = new int[list.size()];
    int t = cc.length - 1;
    for (int i = 0; i < list.size(); i++,t--) {
      cc[t] = list.get(i);
    }
    return cc;
  }
}
