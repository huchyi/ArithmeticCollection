package com.arithmeticcollection;

import com.arithmeticcollection.utils.Interval;
import java.util.ArrayList;

/**
 * 插入区间
 *
 *
 * 给出一个无重叠的按照区间起始端点排序的区间列表。
 *
 * 在列表中插入一个新的区间，你要确保列表中的区间仍然有序且不重叠（如果有必要的话，可以合并区间）。
 *
 *
 *
 * 样例
 * 插入区间[2, 5] 到 [[1,2], [5,9]]，我们得到 [[1,9]]。
 *
 * 插入区间[3, 4] 到 [[1,2], [5,9]]，我们得到 [[1,2], [3,4], [5,9]]。
 */

public class InsertIntervalClass {

  /**
   * Insert newInterval into intervals.
   *
   * @param intervals: Sorted interval list.
   * @param newInterval: A new interval.
   * @return: A new sorted interval list.
   */
  public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
    ArrayList<Interval> list = new ArrayList<Interval>();
    // 边界情况
    if (intervals.size() == 0) {
      list.add(newInterval);
      return list;
    }
    // 循环判断
    for (int i = 0; i < intervals.size(); i++) {
      // 如果新的区间结束值小于开始值，则直接插入前面，后面依次插入即可
      if (newInterval.end < intervals.get(i).start) {
        list.add(newInterval);
        for (int j = i; j < intervals.size(); j++) {
          list.add(intervals.get(j));
        }
        break;
      } else if (newInterval.start > intervals.get(i).end) { // 新的区间开始点大于结束点，则当前点直接添加结果集
        list.add(intervals.get(i));
      } else { // 需要合并的情况
        // 合并区间
        newInterval.start = Math.min(newInterval.start, intervals.get(i).start);
        newInterval.end = Math.max(newInterval.end, intervals.get(i).end);
      }
      if (i == intervals.size() - 1) {// 如果是最后一个数据。也添加结果集中
        list.add(newInterval);
      }
    }
    return list;
  }
}
