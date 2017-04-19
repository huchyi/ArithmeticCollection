package com.arithmeticcollection;

import java.util.ArrayList;

/**
 * 数组剔除元素后的乘积

 给定一个整数数组A。
 定义B[i] = A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]， 计算B的时候请不要使用除法。
 *
 *
 *
 * 样例
 给出A=[1, 2, 3]，返回 B为[6, 3, 2]
 *
 *
 */

public class ProductExcludeItselfClass {

  /**
   * @param A: Given an integers array A
   * @return: A Long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
   */
  public ArrayList<Long> productExcludeItself(ArrayList<Integer> A) {
    // write your code
    ArrayList<Long> result = new ArrayList<>();
    for(int i=0;i<A.size();i++){
      Long mul = 1L;
      for(int j=0;j<A.size();j++){
        if(j!=i){
          mul = mul*A.get(j);
        }
      }
      result.add(mul);
    }

    return result;
  }
}
