package com.arithmeticcollection.middle;

import java.util.ArrayList;

/**
 * 四数之和
 *
 * 给一个包含n个数的整数数组S，在S中找到所有使得和为给定整数target的四元组(a, b, c, d)。
 *
 * 注意事项
 *
 * 四元组(a, b, c, d)中，需要满足a <= b <= c <= d
 *
 * 答案中不可以包含重复的四元组。
 *
 *
 *
 *
 *
 * 样例
 * 例如，对于给定的整数数组S=[1, 0, -1, 0, -2, 2] 和 target=0. 满足要求的四元组集合为：
 *
 * (-1, 0, 0, 1)
 *
 * (-2, -1, 1, 2)
 *
 * (-2, 0, 0, 2)
 */

public class FourSumClass {

  /**
   * @param numbers : Give an array numbersbers of n integer
   * @param target : you need to find four elements that's sum of target
   * @return : Find all unique quadruplets in the array which gives the sum of
   * zero.
   */
  public ArrayList<ArrayList<Integer>> fourSum(int[] numbers, int target) {
        /* your code */

    ArrayList<Integer> resetData = new ArrayList<>();
    for (int i = 0; i < numbers.length; i++) {

      if (resetData.size() == 0) {
        resetData.add(numbers[i]);
        continue;
      }

      if (numbers[i] < resetData.get(0)) {
        resetData.add(0, numbers[i]);
        continue;
      } else if (numbers[i] >= resetData.get(resetData.size() - 1)) {
        resetData.add(numbers[i]);
        continue;
      }

      for (int j = 0; j < resetData.size() - 1; j++) {
        if (resetData.get(j) == numbers[i]) {
          resetData.add(j, numbers[i]);
          break;
        }
        if (resetData.get(j) < numbers[i] && numbers[i] < resetData.get(j + 1)) {
          resetData.add(j + 1, numbers[i]);
          break;
        }
      }
    }

    numbers = new int[resetData.size()];
    for (int i = 0; i < resetData.size(); i++) {
      numbers[i] = resetData.get(i);
    }

    System.out.println("排序后:");
    for (int j = 0; j < resetData.size(); j++) {
      System.out.print(resetData.get(j) + ",");
    }
    System.out.println();

    ArrayList<ArrayList<Integer>> listAll = new ArrayList<>();

    int pointi = 0;
    int pointj = 0;
    int pointk = 0;
    int pointl = 0;

    for (int i = 0; i < numbers.length - 3; i++) {
      if (i != 0 && pointi == numbers[i]) {
        continue;
      } else {
        pointi = numbers[i];
      }

      for (int j = i + 1; j < numbers.length - 2; j++) {

        if (j != i + 1 && pointj == numbers[j]) {
          continue;
        } else {
          pointj = numbers[j];
        }

        for (int k = j + 1; k < numbers.length - 1; k++) {

          if (k != j + 1 && pointk == numbers[k]) {
            continue;
          } else {
            pointk = numbers[k];
          }

          for (int l = k + 1; l < numbers.length; l++) {

            if (l != k + 1 && pointl == numbers[l]) {
              continue;
            } else {
              pointl = numbers[l];
            }

            if (numbers[i] + numbers[j] + numbers[k] + numbers[l] == target) {
              ArrayList<Integer> list = new ArrayList<>();
              list.add(numbers[i]);
              list.add(numbers[j]);
              list.add(numbers[k]);
              list.add(numbers[l]);
              if (!listAll.contains(list)) {
                listAll.add(list);
              }
            }
          }
        }
      }
    }

    System.out.println("准备输出:");
    for (int i = 0; i < listAll.size(); i++) {
      ArrayList<Integer> list = listAll.get(i);
      for (int j = 0; j < list.size(); j++) {
        System.out.print(list.get(j) + ",");
      }
      System.out.println();
    }

    return listAll;
  }
}
