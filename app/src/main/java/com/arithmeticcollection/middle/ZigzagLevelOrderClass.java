package com.arithmeticcollection.middle;

import com.arithmeticcollection.utils.TreeNode;
import java.util.ArrayList;

/**
 * 二叉树的锯齿形层次遍历
 *
 *
 * 给出一棵二叉树，返回其节点值的锯齿形层次遍历（先从左往右，下一层再从右往左，层与层之间交替进行）
 *
 *
 *
 * 样例
 * 给出一棵二叉树 {3,9,20,#,#,15,7},
 *
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回其锯齿形的层次遍历为：
 *
 * [
 * [3],
 * [20,9],
 * [15,7]
 * ]
 */

public class ZigzagLevelOrderClass {

  /**
   * @param root: The root of binary tree.
   * @return: A list of lists of integer include
   * the zigzag level order traversal of its nodes' values
   */
  public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
    // write your code here

    if (root == null) {
      return new ArrayList<>();
    }

    ArrayList<ArrayList<Integer>> allList = new ArrayList<>();
    int num = 0;
    getData(allList, root, num);

    //ArrayList<ArrayList<Integer>> newAllList = new ArrayList<>();
    //for (int i = allList.size() - 1; i >= 0; i--) {
    //  newAllList.add(allList.get(i));
    //}

    for (int i = 0; i < allList.size(); i++) {
      ArrayList<Integer> list = allList.get(i);
      ArrayList<Integer> newList = new ArrayList<>();
      if (i % 2 == 0) {
        for (int j = list.size() - 1; j >= 0; j--) {
          newList.add(list.get(j));
        }
        allList.set(i,newList);
      }
    }

    return allList;
  }

  private void getData(ArrayList<ArrayList<Integer>> allList, TreeNode root, int num) {
    if (root == null) {
      return;
    }
    if (allList.size() - 1 >= num) {
      ArrayList<Integer> list2 = allList.get(num);
      list2.add(root.val);
      allList.set(num, list2);
    } else {
      ArrayList<Integer> list = new ArrayList<>();
      list.add(root.val);
      allList.add(num, list);
    }

    getData(allList, root.left, num + 1);
    getData(allList, root.right, num + 1);
  }
}
