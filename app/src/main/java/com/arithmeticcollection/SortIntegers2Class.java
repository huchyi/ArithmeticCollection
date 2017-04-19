package com.arithmeticcollection;

/**
 * 整数排序 II
 *
 *给一组整数，按照升序排序。使用归并排序，快速排序，堆排序或者任何其他 O(n log n) 的排序算法。
 *
 *
 * 样例
 给出 [3, 2, 1, 4, 5], 排序后的结果为 [1, 2, 3, 4, 5]。
 *
 *
 *
 *
 */

public class SortIntegers2Class {

  /**
   * @param A an integer array
   * @return void
   */
  public void sortIntegers2(int[] A) {
    // Write your code here
    arr = A;
    quick_sort_recursive(0, arr.length - 1);
  }

  int[] arr;

  private void swap(int x, int y) {
    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
  }

  private void quick_sort_recursive(int start, int end) {
    if (start >= end)
      return;
    int mid = arr[end];
    int left = start, right = end - 1;
    while (left < right) {
      while (arr[left] <= mid && left < right)
        left++;
      while (arr[right] >= mid && left < right)
        right--;
      swap(left, right);
    }
    if (arr[left] >= arr[end])
      swap(left, end);
    else
      left++;
    quick_sort_recursive(start, left - 1);
    quick_sort_recursive(left + 1, end);
  }

  //public void sort(int[] arrin) {
  //  arr = arrin;
  //  quick_sort_recursive(0, arr.length - 1);
  //}

}
