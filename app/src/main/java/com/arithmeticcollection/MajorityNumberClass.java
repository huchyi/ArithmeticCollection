package com.arithmeticcollection;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by huangchuanyi on 3/20/17.
 *
 * 给定一个整型数组，找出主元素，它在数组中的出现次数严格大于数组元素个数的二分之一。



 注意事项

 You may assume that the array is non-empty and the majority number always exist in the array.

 样例
 给出数组[1,1,1,1,2,2,2]，返回 1
 *
 *
 *
 * 思路：
 * 用hashmap，key为元素，value为袁术出现的次数，如果出现过加1；如果没出现过，添加。每次加完1判断是否大于元素一半，大则取出，否则继续。
 *
 *
 */

public class MajorityNumberClass {

  /**
   * @param nums: a list of integers
   * @return: find a  majority number
   */
  public int majorityNumber(ArrayList<Integer> nums) {
    // write your code
    HashMap<Integer,Integer> map = new HashMap<>();
    int length = nums.size();

    if(length == 1){
      return nums.get(0);
    }

    for (int num : nums) {
      if (map.containsKey(num)) {
        int aa = map.get(num) + 1;
        if(aa > length/2){
          length = num;
          break;
        }
        map.put(num,aa);
      }else{
        map.put(num,1);
      }
    }
    return length;

  }
}
