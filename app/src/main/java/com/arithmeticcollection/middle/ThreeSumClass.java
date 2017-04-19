package com.arithmeticcollection.middle;

import java.util.ArrayList;

/**
 * 三数之和
 *
 * 给出一个有n个整数的数组S，在S中找到三个整数a, b, c，找到所有使得a + b + c = 0的三元组。
 *
 * 注意事项
 *
 * 在三元组(a, b, c)，要求a <= b <= c。
 *
 * 结果不能包含重复的三元组。
 *
 *
 *
 *
 * 样例
 * 如S = {-1 0 1 2 -1 -4}, 你需要返回的三元组集合的是：
 *
 * (-1, 0, 1)
 *
 * (-1, -1, 2)
 */

public class ThreeSumClass {

  /**
   * @param numbers : Give an array numbers of n integer
   * @return : Find all unique triplets in the array which gives the sum of zero.
   */
  public ArrayList<ArrayList<Integer>> threeSum(int[] numbers) {
    // write your code here

    ArrayList<ArrayList<Integer>> listAll = new ArrayList<>();

    ArrayList<Integer> listLow = new ArrayList<>();
    ArrayList<Integer> listZero = new ArrayList<>();
    ArrayList<Integer> listHight = new ArrayList<>();

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == 0) {
        listZero.add(numbers[i]);
      } else if (numbers[i] < 0) {
        listLow.add(numbers[i]);
      } else if (numbers[i] > 0) {
        listHight.add(numbers[i]);
      }
    }

    if (listZero.size() > 0) {
      if (listZero.size() >= 3) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(0);
        list.add(0);
        listAll.add(list);
      }

      if (listLow.size() > 0 && listHight.size() > 0) {
        for (int i = 0; i < listLow.size(); i++) {
          for (int j = 0; j < listHight.size(); j++) {
            if (listLow.get(i) + listHight.get(j) == 0) {
              ArrayList<Integer> list = new ArrayList<>();
              list.add(listLow.get(i));
              list.add(0);
              list.add(listHight.get(j));
              if (!listAll.contains(list)) {
                listAll.add(list);
              }
            }
          }
        }
      }
    }

    if (listLow.size() > 0 && listHight.size() > 0) {


      for (int i = 0; i < listLow.size() - 1; i++) {
        for (int j = i + 1; j < listLow.size(); j++) {

          for (int k = 0; k < listHight.size(); k++) {

            if(listLow.get(i) + listLow.get(j) + listHight.get(k) == 0){

              ArrayList<Integer> list = new ArrayList<>();
              if(listLow.get(i) > listLow.get(j)){
                list.add(listLow.get(j));
                list.add(listLow.get(i));
              }else{
                list.add(listLow.get(i));
                list.add(listLow.get(j));
              }

              list.add(listHight.get(k));
              if (!listAll.contains(list)) {
                listAll.add(list);
              }

            }

          }
        }
      }

      for (int i = 0; i < listHight.size() - 1; i++) {
        for (int j = i + 1; j < listHight.size(); j++) {

          for (int k = 0; k < listLow.size(); k++) {

            if(listHight.get(i) + listHight.get(j) + listLow.get(k) == 0){

              ArrayList<Integer> list = new ArrayList<>();
              list.add(listLow.get(k));
              if(listHight.get(i) > listHight.get(j)){
                list.add(listHight.get(j));
                list.add(listHight.get(i));
              }else{
                list.add(listHight.get(i));
                list.add(listHight.get(j));
              }

              if (!listAll.contains(list)) {
                listAll.add(list);
              }

            }

          }
        }
      }


    }

    //System.out.println("准备输出:");
    //for (int i = 0; i < listAll.size(); i++) {
    //  ArrayList<Integer> list = listAll.get(i);
    //  for (int j = 0; j < list.size(); j++) {
    //    System.out.print(list.get(j) + ",");
    //  }
    //  System.out.println();
    //}

    return listAll;
  }


}
