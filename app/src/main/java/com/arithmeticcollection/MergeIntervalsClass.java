package com.arithmeticcollection;

import android.util.Log;
import com.arithmeticcollection.utils.Interval;
import java.util.ArrayList;
import java.util.List;

/**
 * 给出若干闭合区间，合并所有重叠的部分。
 *
 *
 *
 *
 * 样例
 给出的区间列表 => 合并后的区间列表：

 [                     [
 [1, 3],               [1, 6],
 [2, 6],      =>       [8, 10],
 [8, 10],              [15, 18]
 [15, 18]            ]
 ]
 *
 *
 * [[2,3],[2,2],[3,3],[1,3],[5,7],[2,2],[4,6]]
 *
 * [[4,5],[2,4],[4,6],[3,4],[0,0],[1,1],[3,5],[2,2]]  -> [[2,6],[0,0],[1,1]]
 *
 *
 *
 */

public class MergeIntervalsClass {

  /**
   * @param intervals, a collection of intervals
   * @return: A new sorted interval list.
   */
  public List<Interval> merge(List<Interval> intervals) {
    // write your code here

    if(intervals.size() <= 1){
      return intervals;
    }

    ArrayList<Interval> newIntervals = new ArrayList<>();
    for (int i = 0; i < intervals.size(); i++) {
      Interval intervali =intervals.get(i);

      if(newIntervals.size() > 0 ){
        boolean isHave = false;
        ArrayList<Integer> flag = new ArrayList<>();
        for (int j = 0; j < newIntervals.size(); j++) {
          Interval intervalj =newIntervals.get(j);

          if((intervali.start >= intervalj.start && intervali.start <= intervalj.end)
              || (intervali.end >= intervalj.start && intervali.end <= intervalj.end)
              || (intervali.start <= intervalj.start && intervali.end >= intervalj.end )){

            int as = intervali.start > intervalj.start ? intervalj.start: intervali.start;
            int ae = intervali.end > intervalj.end ? intervali.end: intervalj.end;


            Interval nn = new Interval(as,ae);
            newIntervals.set(j,nn);
            flag.add(j);
            isHave = true;
          }
        }

        if(flag.size() > 1){
          for (int j = flag.size() -1; j > 0; j--) {
            newIntervals.remove((int)flag.get(j));
          }
        }

        if(!isHave){
          newIntervals.add(intervali);
        }
      }else{
        newIntervals.add(intervali);
      }
    }


    return newIntervals;
  }

}
