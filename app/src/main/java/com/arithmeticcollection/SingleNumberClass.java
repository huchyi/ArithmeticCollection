package com.arithmeticcollection;

import java.util.ArrayList;

/**
 * 落单的数
 *
 *
 *给出2*n + 1 个的数字，除其中一个数字之外其他每个数字均出现两次，找到这个数字。
 *
 *样例
 给出 [1,2,2,1,3,4,3]，返回 4

 挑战
 一次遍历，常数级的额外空间复杂度
 *
 *
 *
 *
 */

public class SingleNumberClass {


  /**
   *@param A : an integer array
   *return : a integer
   */
  public int singleNumber(int[] A) {
    // Write your code here
    ArrayList<Object> list = new ArrayList<>();
    for (int i = 0; i < A.length; i++) {
      Object o = A[i];
      if(list.contains(o)){
        list.remove(o);
      }else{
        list.add(o);
      }
    }
    if(list.size() <= 0){
      return 0;
    }
    return (int) list.get(0);
  }
}
