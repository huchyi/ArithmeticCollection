package com.arithmeticcollection;

/**
 * 排列序号
 *
 *给出一个不含重复数字的排列，求这些数字的所有排列按字典序排序后该排列的编号。其中，编号从1开始。
 *
 *样例
 例如，排列 [1,2,4] 是第 1 个排列。
 *
 *
 *
 *
 *
 *
 */

public class PermutationIndexClass {

  /**
   * @param A an integer array
   * @return a long integer
   */
  public long permutationIndex(int[] A) {
    // Write your code here
    long R=0;
    int low[] = new int[A.length];
    long weight[] = new long[A.length];
    for(int i=A.length-1;i>=0;--i){
      for(int j=i+1;j<A.length;++j)
        if(A[j]<A[i])
          ++low[i];
      weight[i] = (i>=A.length-2)?(A.length-1-i):weight[i+1]*(A.length-i-1);

      R += weight[i]*low[i];
    }
    return R+1;
  }

}
