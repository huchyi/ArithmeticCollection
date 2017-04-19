package com.arithmeticcollection;

import com.arithmeticcollection.utils.NestedInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * 平面列表
 *
 * 给定一个列表，该列表中的每个要素要么是个列表，要么是整数。将其变成一个只包含整数的简单列表。
 *
 * 注意事项
 *
 * 如果给定的列表中的要素本身也是一个列表，那么它也可以包含列表。
 *
 *
 *
 * 样例
 * 给定 [1,2,[1,2]]，返回 [1,2,1,2]。
 *
 * 给定 [4,[3,[2,[1]]]]，返回 [4,3,2,1]。
 *
 *
 *
 *
 * 思路：
 * 递归的思想，进入递归类进行循环调用，如果判断为数字则直接加入list否则再次递归方法。
 *
 *
 *
 *
 */

public class Flatten2Class {

  // @param nestedList a list of NestedInteger
  // @return a list of integer
  public List<Integer> flatten(List<NestedInteger> nestedList) {
    // Write your code here

    ArrayList<Integer> list = new ArrayList<>();
    addList(list, nestedList);

    return list;
  }

  private void addList(ArrayList<Integer> list, List<NestedInteger> nestedList) {
    if (nestedList == null) {
      return;
    }
    if (nestedList.size() <= 0) {
      return;
    }

    for (int i = 0; i < nestedList.size(); i++) {
      NestedInteger nn = nestedList.get(i);
      if (nn.isInteger()) {
        list.add(nn.getInteger());
      } else {
        addList(list, nn.getList());
      }
    }
  }
}
