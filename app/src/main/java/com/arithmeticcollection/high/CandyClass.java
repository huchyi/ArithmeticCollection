package com.arithmeticcollection.high;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 分糖果
 *
 * 有 N 个小孩站成一列。每个小孩有一个评级。
 *
 * 按照以下要求，给小孩分糖果：
 *
 * 每个小孩至少得到一颗糖果。
 *
 * 相邻两人里评级高的，可以多得一个糖果，
 *
 * 需最少准备多少糖果？
 *
 *
 * 样例
 * 给定评级 = [1, 2], 返回 3.
 *
 * 给定评级 = [1, 1, 1], 返回 3.
 *
 * 给定评级 = [1, 2, 2], 返回 4. ([1,2,1]).
 */

public class CandyClass {

  /**
   * @param ratings Children's ratings
   * @return the minimum candies you must give
   */
  public int candy(int[] ratings) {

    // Write your code here

    if (ratings.length <= 0) {
      return 0;
    }


    int[] num = new int[ratings.length];
    num[0] = 1;
    for (int i = 1; i < ratings.length; i++) {
      if(ratings[i] > ratings[i - 1]){
        num[i] = num[i - 1] + 1;
      }else if(ratings[i] < ratings[i - 1]){
        num[i] = 1;
        for (int j = i; j > 0; j--) {
          if(ratings[j] < ratings[j - 1]) {
            if(num[j - 1] <= num[j]){
              num[j - 1] = num[j] + 1;
            }
          }else if(ratings[j] > ratings[j - 1]){
            break;
          }
        }
      }else{
        num[i] = 1;
      }

    }

    int sum = 0;
    for (int i = 0; i < num.length; i++) {
      sum = sum + num[i];
    }
    return sum;




    //int point = -1;
    //int sum = ratings.length;
    //for (int i = 1; i < ratings.length; i++) {
    //
    //  if (ratings[i] > ratings[i - 1]) {
    //    sum = sum + 1;
    //    point = i;
    //  } else if (ratings[i] < ratings[i - 1]) {
    //    if (i - 1 > point) {
    //      sum = sum + 1;
    //      point = i - 1;
    //    }
    //  }
    //}
    //
    //return sum;

    //int min = ratings[0];
    //int max = ratings[0];
    //
    //HashMap<Integer,Integer> hashMap = new HashMap<>();
    //
    //for (int i = 0; i < ratings.length; i++) {
    //  int key = ratings[i];
    //  if (hashMap.containsKey(ratings[i])) {
    //    hashMap.put(key,hashMap.get(key) + 1);
    //  } else {
    //    hashMap.put(key,1);
    //  }
    //  if(key < min){
    //    min = key;
    //  }
    //
    //  if(key > max){
    //    max = key;
    //  }
    //}
    //if(min == max){
    //  return hashMap.get(max);
    //}
    //
    //int sum = 0;
    //
    //Iterator<Map.Entry<Integer, Integer>> iterator = hashMap.entrySet().iterator();
    //while (iterator.hasNext()) {
    //  Map.Entry<Integer, Integer> entry = iterator.next();
    //  int key = entry.getKey();
    //  int value = entry.getValue();
    //
    //  if(key - min > 0){
    //    sum  = sum + (key - min + 1) + (value - 1);
    //  }else{
    //    sum = sum + value;
    //  }
    //}
    //
    //return sum;
  }
}
