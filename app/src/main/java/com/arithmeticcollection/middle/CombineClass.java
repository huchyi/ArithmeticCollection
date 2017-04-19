package com.arithmeticcollection.middle;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合
 *
 * 组给出两个整数n和k，返回从1......n中选出的k个数的组合。
 *
 * 样例
 * 例如 n = 4 且 k = 2
 *
 * 返回的解为：
 *
 * [[2,4],[3,4],[2,3],[1,2],[1,3],[1,4]]
 */
public class CombineClass {

  /**
   * @param n: Given the range of numbers
   * @param k: Given the numbers of combinations
   * @return: All the combinations of k numbers out of 1..n
   */
  public List<List<Integer>> combine(int n, int k) {
    // write your code here

    List<List<Integer>> result = new ArrayList<>();
    if (n < 0 || k < 0) return result;
    int start = 1;
    ArrayList<Integer> list = new ArrayList<>();
    DFS(n, k, start, result, list);
    return result;
  }

  public void DFS(int n, int k, int start, List<List<Integer>> result, ArrayList<Integer> list) {
    if (list.size() == k) {
      ArrayList<Integer> tmp = new ArrayList<>(list);
      if (!result.contains(tmp)) { // 可不要
        result.add(tmp);
      }
      return;
    }
    for (int i = start; i <= n; i++) {
      list.add(i);
      DFS(n, k, i + 1, result, list);
      list.remove(list.size() - 1);
    }
  }
}
