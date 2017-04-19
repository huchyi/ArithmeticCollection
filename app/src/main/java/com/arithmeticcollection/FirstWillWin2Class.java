package com.arithmeticcollection;

import android.util.Log;
import java.util.ArrayList;

/**
 * 硬币排成线 II
 *
 * 有 n 个不同价值的硬币排成一条线。两个参赛者轮流从左边依次拿走 1 或 2 个硬币，直到没有硬币为止。计算两个人分别拿到的硬币总价值，价值高的人获胜。
 *
 * 请判定 第一个玩家 是输还是赢？
 *
 * 样例
 * 给定数组 A = [1,2,2], 返回 true.
 *
 * 给定数组 A = [1,2,4], 返回 false.
 */

public class FirstWillWin2Class {

  /**
   * @param values: an array of integers
   * @return: a boolean which equals to true if the first player will win
   */
  public boolean firstWillWin(int[] values) {
    // write your code here

    if (values.length < 3) {
      return true;
    } else if (values.length == 3) {
      return values[0] + values[1] > values[2];
    }

    int sum1 = 0;
    int sum2 = 0;

    int size = values.length;

    boolean isOne = true;

    for (int i = 0; i < size; ) {
      int yu = size - i;
      if(isOne){
        if(yu == 1){
          sum1 += values[i];
          break;
        }else if(yu == 2){
          sum1 += values[i];
          sum1 += values[i + 1];
          break;
        }else if(yu == 3){
          sum1 += values[i];
          sum1 += values[i + 1];
          sum2 += values[i + 2];
          break;
        }else{
          if (values[i] + values[i + 3] > values[i + 1] + values[i + 2]) {
            sum1 += values[i];
            i++;
          } else {
            sum1 += values[i] + values[i + 1];
            i = i + 2;
          }
        }

      }else{

        if(yu == 1){
          sum2 += values[i];
          break;
        }else if(yu == 2){
          sum2 += values[i];
          sum2 += values[i + 1];
          break;
        }else if(yu == 3){
          sum2 += values[i];
          sum2 += values[i + 1];
          sum1 += values[i + 2];
          break;
        }else{
          if (values[i] + values[i + 3] > values[i + 1] + values[i + 2]) {
            sum2 += values[i];
            i++;
          } else {
            sum2 += values[i] + values[i + 1];
            i = i + 2;
          }
        }

      }

      isOne = !isOne;
    }

    return sum1 > sum2;
  }
}
