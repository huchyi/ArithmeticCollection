package com.arithmeticcollection;

import java.util.HashMap;

/**
 * 两数之和
 *
 *给一个整数数组，找到两个数使得他们的和等于一个给定的数 target。

 你需要实现的函数twoSum需要返回这两个数的下标, 并且第一个下标小于第二个下标。注意这里下标的范围是 1 到 n，不是以 0 开头。

 注意事项

 你可以假设只有一组答案。
 *
 *
 *
 *样例
 给出 numbers = [2, 7, 11, 15], target = 9, 返回 [1, 2].

 挑战
 Either of the following solutions are acceptable:

 O(n) Space, O(nlogn) Time
 O(n) Space, O(n) Time
 *
 *
 *
 *
 *
 */

public class TwoSumClass {

  /*
     * @param numbers : An array of Integer
     * @param target : target = numbers[index1] + numbers[index2]
     * @return : [index1 + 1, index2 + 1] (index1 < index2)
     */
  public int[] twoSum(int[] numbers, int target) {
    // write your code here

    if (numbers != null) {
      // 因为Hashmap仅提供通过key获得value,故
      // HashMap value放置与numers[index]匹配的数值,key放置index；，故
      // 在下面循环时每一次查询map中的value是否有相等的值，有即相互匹配
      // 其思想在于用index的value表示数组中的该数据，map中的key与之匹配，并在数组中寻找匹配值
      HashMap<Integer, Integer> num_map = new HashMap<>();
      for (int i = 0; i < numbers.length; i++) {
        if (num_map.containsKey(numbers[i])) {
          int index = num_map.get(numbers[i]);
          return new int[]{++index, ++i};
        } else {
          num_map.put(target - numbers[i], i);
        }
      }
    }
    return null;
  }
}
