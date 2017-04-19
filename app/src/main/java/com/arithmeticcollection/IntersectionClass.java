package com.arithmeticcollection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 返回两个数组的交
 *
 * 注意事项
 *
 * Each element in the result must be unique.
 * The result can be in any order.
 *
 *
 *
 * 样例
 * nums1 = [1, 2, 2, 1], nums2 = [2, 2], 返回 [2].
 */

public class IntersectionClass {

  /**
   * @param nums1 an integer array
   * @param nums2 an integer array
   * @return an integer array
   */
  public int[] intersection(int[] nums1, int[] nums2) {
    // Write your code here

    HashSet<Integer> set =new HashSet<>();
    for (int i : nums2) {
      set.add(i);
    }
    HashSet<Integer> re = new HashSet<>();
    for (int i : nums1) {
      if(set.contains(i))
      {
        re.add(i);
      }
    }
    Iterator<Integer> iterator=re.iterator();
    int[] reInt = new int[re.size()];
    int i =0;
    while(iterator.hasNext()){
      reInt[i++] = iterator.next();
    }
    return reInt;

    //ArrayList<Integer> list = new ArrayList<>();
    //
    //for (int i = 0; i < nums1.length; i++) {
    //  if (!list.contains(nums1[i])) {
    //    for (int j = 0; j < nums2.length; j++) {
    //      if (nums1[i] == nums2[j]) {
    //        if (!list.contains(nums2[j])) {
    //          list.add(nums2[j]);
    //          break;
    //        }
    //      }
    //    }
    //  }
    //}
    //if (list.size() <= 0) {
    //  return new int[] {};
    //}
    //int[] ii = new int[list.size()];
    //for (int i = 0; i < list.size(); i++) {
    //  ii[i] = list.get(i);
    //}
    //return ii;

    //ArrayList<Integer> list1 = new ArrayList<>();
    //for (int i = 0; i < nums1.length; i++) {
    //  list1.add(nums1[i]);
    //}
    //
    //ArrayList<Integer> list2 = new ArrayList<>();
    //for (int i = 0; i < nums2.length; i++) {
    //  list2.add(nums2[i]);
    //}
    //
    //ArrayList<Integer> list = new ArrayList<>();
    //
    //for (int i = 0; i < list1.size(); i++) {
    //  boolean in = true;
    //  int tt = list1.get(i);
    //  for (int aa : list) {
    //    if(aa == tt){
    //      in = false;
    //      break;
    //    }
    //  }
    //
    //  if(in){
    //    for (int j = 0; j < list2.size(); j++) {
    //
    //      if (list1.get(i) == (list2.get(j))) {
    //        list.add(list1.get(i));
    //        list2.remove(j);
    //        break;
    //      }
    //    }
    //  }
    //
    //}
    //
    //if (list.size() <= 0) {
    //  return new int[] {};
    //}
    //int[] ii = new int[list.size()];
    //for (int i = 0; i < list.size(); i++) {
    //  ii[i] = list.get(i);
    //}
    //return ii;
  }
}
