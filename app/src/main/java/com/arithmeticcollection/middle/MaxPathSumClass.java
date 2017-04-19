package com.arithmeticcollection.middle;

import com.arithmeticcollection.utils.TreeNode;

/**
 * 二叉树中的最大路径和
 *
 * 给出一棵二叉树，寻找一条路径使其路径和最大，路径可以在任一节点中开始和结束（路径和为两个节点之间所在路径上的节点权值之和）
 *
 *
 *
 * 样例
 * 给出一棵二叉树：
 *
 * 1
 * / \
 * 2   3
 * 返回 6
 */

public class MaxPathSumClass {

  /**
   * @param root: The root of binary tree.
   * @return: An integer.
   */
  public int maxPathSum(TreeNode root) {
    // write your code here
    if (root == null) {
      return 0;
    }

    ret = root.val;
    onePath(root);
    return ret;
  }
  private static int ret;

  private int onePath(TreeNode root) {
    if (root == null) return 0;
    int l = onePath(root.left);
    int r = onePath(root.right);
    ret = Math.max(ret, Math.max(0, l) + Math.max(0, r) + root.val);
    return Math.max(0, Math.max(l, r)) + root.val;
  }
}
