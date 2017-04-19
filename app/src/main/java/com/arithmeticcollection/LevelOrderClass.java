package com.arithmeticcollection;

import com.arithmeticcollection.utils.TreeNode;
import java.util.ArrayList;

/**
 * 二叉树的层次遍历
 *
 * 给出一棵二叉树，返回其节点值的层次遍历（逐层从左往右访问）
 *
 *
 * 样例
 * 给一棵二叉树 {3,9,20,#,#,15,7} ：
 *
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回他的分层遍历结果：
 *
 * [
 * [3],
 * [9,20],
 * [15,7]
 * ]
 *
 *
 *
 * 思路：
 * 1，标记第几层，根为0层，很重要；
 * 2.list的集合；
 * 3.二叉树；
 *
 *
 * 然后通过递归的方式，每深一层，则通过标记获取list的集合，如果有数据则更新，没有数据则表明为更深的层次，
 * 直接添加数据即可。
 *
 *
 *
 */

public class LevelOrderClass {

  /**
   * @param root: The root of binary tree.
   * @return: Level order a list of lists of integer
   */
  public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {

    ArrayList<ArrayList<Integer>> allList = new ArrayList<>();
    addList(0, allList, root);
    return allList;
  }

  private void addList(int tt, ArrayList<ArrayList<Integer>> allList, TreeNode root) {

    if (root == null) {
      return ;
    }

    if (allList.size() > tt) {
      ArrayList<Integer> list = allList.get(tt);
      list.add(root.val);
      allList.set(tt, list);
    } else {
      ArrayList<Integer> list = new ArrayList<>();
      list.add(root.val);
      allList.add(tt, list);
    }

    tt = tt + 1;
    addList(tt, allList, root.left);
    addList(tt, allList, root.right);

  }
}
