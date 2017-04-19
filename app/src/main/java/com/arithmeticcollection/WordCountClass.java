package com.arithmeticcollection;

import com.arithmeticcollection.utils.OutputCollector;
import java.util.Iterator;

/**
 *
 * Definition of OutputCollector:
 * class OutputCollector<K, V> {
 *     public void collect(K key, V value);
 *         // Adds a key/value pair to the output buffer
 * }
 *
 *
 * 单词计数 (Map Reduce版本)
 *使用 map reduce 来计算单词频率
 https://hadoop.apache.org/docs/r1.2.1/mapred_tutorial.html#Example%3A+WordCount+v1.0
 *
 *
 * chunk1: "Google Bye GoodBye Hadoop code"
 chunk2: "lintcode code Bye"


 Get MapReduce result:
 Bye: 2
 GoodBye: 1
 Google: 1
 Hadoop: 1
 code: 2
 lintcode: 1
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
 *
 */

public class WordCountClass {

  public static class Map {
    public void map(String key, String value, OutputCollector<String, Integer> output) {
      // Write your code here
      // Output the results into output buffer.
      // Ps. output.collect(String key, int value);

      String[] result = value.split(" ");
      for(int i = 0;i<result.length;i++){
        output.collect(result[i] , 1);
      }
    }
  }

  public static class Reduce {
    public void reduce(String key, Iterator<Integer> values,
        OutputCollector<String, Integer> output) {
      // Write your code here
      // Output the results into output buffer.
      // Ps. output.collect(String key, int value);

      int count = 0;
      while(values.hasNext()){
        count += values.next();
      }
      output.collect(key , count);

    }
  }
}
