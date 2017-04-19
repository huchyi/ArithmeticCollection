package com.arithmeticcollection;

/**
 *
 * 合并排序数组 II
 *
 * 合并两个排序的整数数组A和B变成一个新的数组。

 注意事项

 你可以假设A具有足够的空间（A数组的大小大于或等于m+n）去添加B中的元素。
 *
 *
 *
 *样例
 给出 A = [1, 2, 3, empty, empty], B = [4, 5]

 合并之后 A 将变成 [1,2,3,4,5]
 *
 *
 *
 */

public class MergeSortedArrayClass {

  /**
   * @param A: sorted integer array A which has m elements,
   *           but size of A is m+n
   * @param B: sorted integer array B which has n elements
   * @return: void
   */
  public void mergeSortedArray(int[] A, int m, int[] B, int n) {
    // write your code here
    int k = m + n - 1; // Index of last location of array b
    int i = m - 1; // Index of last element in array b
    int j = n - 1; // Index of last element in array a
    // Start comparing from the last element and merge a and b
    while (i >= 0 && j >= 0) {
      if (A[i] > B[j]) {
        A[k--] = A[i--];
      } else {
        A[k--] = B[j--];
      }
    }
    while (j >= 0) {
      A[k--] = B[j--];
    }
  }
}
