package com.arithmeticcollection;

import com.arithmeticcollection.utils.TreeNode;

/**
 * 翻转二叉树
 *
 *
 *
 *
 * 样例
 1         1
 / \       / \
 2   3  => 3   2
 /       \
 4         4
 *
 *
 */

public class InvertBinaryTreeClass {

  /**
   * @param root: a TreeNode, the root of the binary tree
   * @return: nothing
   */
  public void invertBinaryTree(TreeNode root) {
    // write your code here

    if(root == null){
      return;
    }
    TreeNode right = root.right;

    root.right = root.left;
    root.left = right;
    invertBinaryTree(root.left);
    invertBinaryTree(root.right);

  }
}













