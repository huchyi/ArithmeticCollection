package com.arithmeticcollection;

import com.arithmeticcollection.utils.TreeNode;

/**
 * 等价二叉树
 *
 * 检查两棵二叉树是否等价。等价的意思是说，首先两棵二叉树必须拥有相同的结构，并且每个对应位置上的节点上的数都相等。
 *
 *
 *
 *
 *
 * 样例
 * 1             1
 * / \           / \
 * 2   2   and   2   2
 * /             /
 * 4             4
 * 就是两棵等价的二叉树。
 *
 * 1             1
 * / \           / \
 * 2   3   and   2   3
 * /               \
 * 4                 4
 * 就不是等价的。
 */

public class IsIdenticalTreeClass {

  /**
   * @param a, b, the root of binary trees.
   * @return true if they are identical, or false.
   */
  public boolean isIdentical(TreeNode a, TreeNode b) {
    // Write your code here
    if (a == null && b == null) {
      return true;
    }
    return isEqual(a, b);
  }

  private boolean isEqual(TreeNode a, TreeNode b) {

    if (a == null && b != null) {
      return false;
    } else if (a != null && b == null) {
      return false;
    } else if (a == null && b == null) {
      return true;
    }
    return a.val == b.val && isEqual(a.left, b.left) && isEqual(a.right, b.right);
  }
}















