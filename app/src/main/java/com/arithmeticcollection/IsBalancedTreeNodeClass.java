package com.arithmeticcollection;

import com.arithmeticcollection.utils.TreeNode;

/**
 * 给定一个二叉树,确定它是高度平衡的。对于这个问题,一棵高度平衡的二叉树的定义是：一棵二叉树中每个节点的两个子树的深度相差不会超过1。
 *
 * 样例
 * 给出二叉树 A={3,9,20,#,#,15,7}, B={3,#,20,15,7}
 *
 * A)  3            B)    3
 * / \                  \
 * 9  20                 20
 * /  \                / \
 * 15   7              15  7
 * 二叉树A是高度平衡的二叉树，但是B不是
 *
 *
 *
 *
 *
 * 思路：
 * 每个根节点的深度相差不能超过1。那么每个根节点的深度都要算，每个根节点是否都平衡；直到为null，即没有了子节点，给默认的true。
 * 然后每个节点相与，只要有一个为false，则为非平衡二叉树。
 *
 * 注意：
 * 深度相减时需去绝对值。
 *
 *
 *
 *
 *
 * Definition of TreeNode:
 * public class TreeNode {
 * public int val;
 * public TreeNode left, right;
 * public TreeNode(int val) {
 * this.val = val;
 * this.left = this.right = null;
 * }
 * }
 */

public class IsBalancedTreeNodeClass {

  /**
   * @param root: The root of binary tree.
   * @return: True if this Binary tree is Balanced, or false.
   */
  public boolean isBalanced(TreeNode root) {
    // write your code here

    if (root == null) {
      return true;
    }

    int left = getRootCount(root.left);
    int right = getRootCount(root.right);

    boolean leftb = isBalanced(root.left);
    boolean rightb = isBalanced(root.right);

    return Math.abs(left - right) <= 1 && leftb && rightb;
  }

  private int getRootCount(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int left = getRootCount(root.left) + 1;
    int right = getRootCount(root.right) + 1;
    return left > right ? left : right;
  }
}
