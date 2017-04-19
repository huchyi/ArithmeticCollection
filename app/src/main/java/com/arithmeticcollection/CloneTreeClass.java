package com.arithmeticcollection;

import com.arithmeticcollection.utils.TreeNode;

/**
 * 克隆二叉树
 *
 * 深度复制一个二叉树。

 给定一个二叉树，返回一个他的 克隆品 。


 样例
 给定一个二叉树：

 1
 /  \
 2    3
 / \
 4   5
 返回其相同结构相同数值的克隆二叉树：

 1
 /  \
 2    3
 / \
 4   5


 思路：
 把根赋值给新树，然后递归左给左，右给右。
 */

public class CloneTreeClass {


  /**
   * @param root: The root of binary tree
   * @return root of new tree
   */
  public TreeNode cloneTree(TreeNode root) {
    // Write your code here

    //如果没有任何要求，这是最简单做法。
    // return oot;
    if(root == null){
      return root;
    }

    TreeNode newRoot = new TreeNode(root.val);
    newRoot.left = cloneTree(root.left);
    newRoot.right = cloneTree(root.right);

    return newRoot;
  }
}
