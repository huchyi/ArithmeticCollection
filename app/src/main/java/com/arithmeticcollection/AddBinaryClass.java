package com.arithmeticcollection;

import android.util.Log;
import java.util.ArrayList;

/**
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 *
 * 样例
 * a = 11
 *
 * b = 1
 *
 * 返回 100
 */

public class AddBinaryClass {

  /**
   * @param a a number
   * @param b a number
   * @return the result
   */
  public String addBinary(String a, String b) {
    // Write your code here

    char[] aa = a.toCharArray();
    char[] bb = b.toCharArray();

    int i = 0;
    int ai = aa.length;
    int bi = bb.length;
    ArrayList<String> alist = new ArrayList<>();
    for (int j = ai - 1; j >= 0; j--) {
      alist.add(String.valueOf(aa[j]));
    }

    ArrayList<String> blist = new ArrayList<>();
    for (int j = bi - 1; j >= 0; j--) {
      blist.add(String.valueOf(bb[j]));
    }

    ArrayList<String> clist = new ArrayList<>();
    ArrayList<String> dlist = new ArrayList<>();

    char[] cc = new char[] {};
    char[] dd = new char[] {};

    int tt = aa.length > bb.length ? aa.length : bb.length;

    for (int j = 0; j < tt + 2; j++) {
      clist.add("-1");
    }

    Log.i("hcy", "tt:" + tt);
    while (i < tt + 2) {
      int aaa = 0;
      int bbb = 0;
      if (i < ai) {
        if (alist.get(i) != null && alist.get(i).equals("1")) {
          aaa = 1;
        }
      }

      if (i < bi) {
        if (blist.get(i) != null && blist.get(i).equals("1")) {
          bbb = 1;
        }
      }
      if (aaa == 0 && bbb == 0 && clist.get(i).equals("-1")) {
        dlist.add("0");
      } else if (aaa == 0 && bbb == 0 && clist.get(i).equals("1")) {
        dlist.add("1");
      } else if (aaa == 1 && bbb == 0 && clist.get(i).equals("-1")) {
        dlist.add("1");
      } else if (aaa == 0 && bbb == 1 && clist.get(i).equals("-1")) {
        dlist.add("1");
      } else if (aaa == 1 && bbb == 0 && clist.get(i).equals("1")) {
        dlist.add("0");
        clist.set(i + 1, "1");
      } else if (aaa == 0 && bbb == 1 && clist.get(i).equals("1")) {
        dlist.add("0");
        clist.set(i + 1, "1");
      } else if (aaa == 1 && bbb == 1 && clist.get(i).equals("-1")) {
        dlist.add("0");
        clist.set(i + 1, "1");
      } else if (aaa == 1 && bbb == 1 && clist.get(i).equals("1")) {
        dlist.add("1");
        clist.set(i + 1, "1");
      }

      i++;
    }

    Log.i("hcy", "dlist:" + dlist.size());
    StringBuilder stringBuilder = new StringBuilder();
    for (int j = dlist.size() - 1; j >= 0; j--) {
      stringBuilder.append(dlist.get(j));
    }

    String str = stringBuilder.toString();
    if(str.startsWith("00")){
      str = str.substring(2);
    }else if(str.startsWith("0")){
      str = str.substring(1);
    }

    return str;
  }
}
