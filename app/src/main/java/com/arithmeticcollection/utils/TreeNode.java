package com.arithmeticcollection.utils;

/**
 * 二叉树的节点
 */

public class TreeNode {

  public int val;
  public TreeNode left, right;

  public TreeNode(int val) {
    this.val = val;
    this.left = this.right = null;
  }

  ///**
  // * 从数组中递归创建树
  // *
  // * @return 树的根节点
  // */
  //private static TreeNode create(String[] data) {
  //
  //  if (data.length < 1) return null;
  //
  //  for (int i = 0; i < data.length; i++) {
  //
  //    if (!data[i].equals("#")) {
  //      TreeNode root = new TreeNode(0);
  //      root.val = data[i];
  //      // root 对应数组下标为0
  //      root.left = create(data, (i << 1) + 1);
  //      root.right = create(data, (i << 1) + 2);
  //      return root;
  //    }
  //  }
  //
  //  return null;
  //}



}