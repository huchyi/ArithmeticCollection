package com.arithmeticcollection.middle;

import java.util.ArrayList;
import java.util.List;

/**
 * 数字组合
 *
 * 给出一组候选数字(C)和目标数字(T),找到C中所有的组合，使找出的数字和为T。C中的数字可以无限制重复被选取。
 *
 * 例如,给出候选数组[2,3,6,7]和目标数字7，所求的解为：
 *
 * [7]，
 *
 * [2,2,3]
 *
 * 注意事项
 *
 * 所有的数字(包括目标数字)均为正整数。
 * 元素组合(a1, a2, … , ak)必须是非降序(ie, a1 ≤ a2 ≤ … ≤ ak)。
 * 解集不能包含重复的组合。
 *
 *
 *
 *
 * 样例
 * 给出候选数组[2,3,6,7]和目标数字7
 *
 * 返回 [[7],[2,2,3]]
 */

public class CombinationSumClass {

  /**
   * @param candidates: A list of integers
   * @param target:An integer
   * @return: A list of lists of integers
   */
  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    // write your code here

    //ArrayList<ArrayList<ArrayList<Integer>>> allAllList = new ArrayList<>();
    //ArrayList<ArrayList<Integer>> allList = new ArrayList<>();
    //ArrayList<Integer> listSum = new ArrayList<>();
    //
    //
    //  for (int i = 0; i < candidates.length; i++) {
    //
    //    if (candidates[i] > target / 2) {
    //      break;
    //    }
    //
    //    int num = target / candidates[i];
    //    while (num > 0) {
    //      int sum = 0;
    //      ArrayList<Integer> list = new ArrayList<>();
    //      for (int j = 0; j < num; j++) {
    //        sum = sum + candidates[i];
    //        list.add(candidates[i]);
    //      }
    //      listSum.add(sum);
    //      allList.add(list);
    //      for (int j = 0; j < num; j++) {
    //        allAllList.add(allList);
    //      }
    //      num--;
    //    }
    //  }
    //
    //for (int i = 0; i < allAllList.size(); i++) {
    //
    //  ArrayList<ArrayList<Integer>> lists1 = allAllList.get(i);
    //  for (int j = 0; j < lists1.size(); j++) {
    //
    //  }
    //
    //
    //}
    //
    //return allList.;
    ArrayList<ArrayList<ArrayList<Integer>>> allAllList = new ArrayList<>();
    ArrayList<ArrayList<Integer>> allList = new ArrayList<>();
    ArrayList<Integer> listSum = new ArrayList<>();

    for (int i = 0; i < candidates.length; i++) {

      int num = target / candidates[i];
      while (num > 0) {
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int j = 0; j < num; j++) {
          sum = sum + candidates[i];
          list.add(candidates[i]);
        }
        listSum.add(sum);
        allList.add(list);
        num--;
      }

      for (int j = 0; j < num; j++) {

      }
    }

    for (int i = 0; i < allList.size(); i++) {
      setData(allList,listSum);
    }

    return null;
  }


  private void setData(ArrayList<ArrayList<Integer>> allList,ArrayList<Integer> listSum){




  }

}
