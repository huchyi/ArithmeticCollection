package com.arithmeticcollection;

import java.util.ArrayList;

/**
 * 有效的括号序列
 *
 * 给定一个字符串所表示的括号序列，包含以下字符： '(', ')', '{', '}', '[' and ']'， 判定是否是有效的括号序列。
 *
 *
 *
 *样例
 括号必须依照 "()" 顺序表示， "()[]{}" 是有效的括号，但 "([)]"则是无效的括号。
 *
 *
 *
 *
 */

public class IsValidParenthesesClass {

  /**
   * @param s A string
   * @return whether the string is a valid parentheses
   */
  public boolean isValidParentheses(String s) {
    // Write your code here
    //System.out.println("s:" + s);
    char[] schar = s.toCharArray();
    if(schar.length % 2 != 0){
      return false;
    }

    char char11 = "(".charAt(0);
    char char12 = ")".charAt(0);

    char char21 = "[".charAt(0);
    char char22 = "]".charAt(0);

    char char31 = "{".charAt(0);
    char char32 = "}".charAt(0);

    ArrayList<Character> list = new ArrayList<>();
    for (int i = 0; i < schar.length; i++) {
      list.add(schar[i]);
    }

    int i = 0;
    int end = list.size();
    while (i < end - 1){

      if(list.get(i) == char11 && list.get(i + 1) == char12){
        list.remove(i + 1);
        list.remove(i);
        i = 0;
        end = list.size();

      }else  if(list.get(i) == char21 && list.get(i + 1) == char22){
        list.remove(i + 1);
        list.remove(i);
        i = 0;
        end = list.size();
      }else  if(list.get(i) == char31 && list.get(i + 1) == char32){
        list.remove(i + 1);
        list.remove(i);
        i = 0;
        end = list.size();
      }else{
        i++;
      }
    }
    //System.out.println(list.size() + ",list.size():" + !(list.size() > 0));
    return !(list.size() > 0);


    //int pointStart = -1;
    //int pointStartChar = -1;
    //
    //boolean isValid = true;
    //
    //for (int i = 0; i < schar.length; i++) {
    //  if(schar[i] == char11){
    //    if(pointStart == -1){
    //      pointStart = i;
    //      pointStartChar = schar[i];
    //    }
    //  }else if(schar[i] == char12){
    //    if(pointStart == -1){
    //      isValid = false;
    //      break;
    //    }else{
    //      if(pointStartChar == char11){
    //        if(i - pointStart != 1){
    //          if(!isValidParentheses(s.substring(pointStart + 1,i))){
    //            isValid = false;
    //            break;
    //          }
    //        }
    //        pointStart = -1;
    //      }
    //    }
    //
    //
    //  }else if(schar[i] == char21){
    //    if(pointStart == -1){
    //      pointStart = i;
    //      pointStartChar = schar[i];
    //    }
    //
    //  }else if(schar[i] == char22){
    //
    //    if(pointStart == -1){
    //      isValid = false;
    //      break;
    //    }else{
    //      if(pointStartChar == char21){
    //        if(i - pointStart != 1){
    //          if(!isValidParentheses(s.substring(pointStart + 1,i))){
    //            isValid = false;
    //            break;
    //          }
    //        }
    //        pointStart = -1;
    //      }
    //    }
    //
    //  }else if(schar[i] == char31){
    //    if(pointStart == -1){
    //      pointStart = i;
    //      pointStartChar = schar[i];
    //    }
    //
    //  }else if(schar[i] == char32){
    //
    //
    //    if(pointStart == -1){
    //      isValid = false;
    //      break;
    //    }else{
    //      if(pointStartChar == char31){
    //        if(i - pointStart != 1){
    //          if(!isValidParentheses(s.substring(pointStart + 1,i))){
    //            isValid = false;
    //            break;
    //          }
    //        }
    //        pointStart = -1;
    //      }
    //    }
    //
    //  }
    //}
    //
    //
    //System.out.println("isValid:" + isValid);
    //System.out.println("pointStart:" + pointStart);
    //
    //return isValid && pointStart == -1;
  }


}
