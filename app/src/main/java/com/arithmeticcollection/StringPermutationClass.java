package com.arithmeticcollection;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 字符串置换
 *
 *
 *给定两个字符串，请设计一个方法来判定其中一个字符串是否为另一个字符串的置换。

 置换的意思是，通过改变顺序可以使得两个字符串相等。

 样例
 "abc" 为 "cba" 的置换。

 "aabc" 不是 "abcc" 的置换。
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

public class StringPermutationClass {


  /**
   * @param A a string
   * @param B a string
   * @return a boolean
   */
  public boolean stringPermutation(String A, String B) {
    // Write your code here

    HashMap<Character,Integer> hashMapA = new HashMap<>();
    HashMap<Character,Integer> hashMapB = new HashMap<>();

    char[] aa = A.toCharArray();
    for (int i = 0; i < aa.length; i++) {
      if(hashMapA.containsKey(aa[i])){
        hashMapA.put(aa[i],hashMapA.get(aa[i]) + 1);
      }else{
        hashMapA.put(aa[i],1);
      }
    }

    char[] bb = B.toCharArray();
    for (int i = 0; i < bb.length; i++) {
      if(hashMapB.containsKey(bb[i])){
        hashMapB.put(bb[i],hashMapB.get(bb[i]) + 1);
      }else{
        hashMapB.put(bb[i],1);
      }
    }
    if(hashMapA.size() != hashMapB.size()){
      Log.i("hcy","长度不相等");
      return false;
    }

    Iterator<Map.Entry<Character, Integer>> iterator = hashMapA.entrySet().iterator();
    while (iterator.hasNext()){
      Map.Entry entry = (Map.Entry) iterator.next();
      char key = (char) entry.getKey();
      int value = (int) entry.getValue();

      if(hashMapB.containsKey(key) && hashMapB.get(key) == value){
        hashMapB.remove(key);
      }
    }
    Log.i("hcy","长度：" + hashMapB.size());
    Iterator<Map.Entry<Character, Integer>> iterator2 = hashMapB.entrySet().iterator();
    while (iterator2.hasNext()){
      Map.Entry entry = (Map.Entry) iterator2.next();
      char key = (char) entry.getKey();
      int value = (int) entry.getValue();
      Log.i("hcy",key + ",value：" + value);
    }
    return hashMapB.size() <= 0;



  }

}
