package com.arithmeticcollection;

import com.arithmeticcollection.utils.TreeNode;
import java.util.ArrayList;

/**
 * 二叉树的中序遍历
 *
 *
 * 给出一棵二叉树,返回其中序遍历；中序遍历的递归定义：先左子树，后根节点，再右子树。
 *
 * 样例
 * 给出二叉树 {1,#,2,3},
 *
 * 1
 * \
 * 2
 * /
 * 3
 * 返回 [1,3,2].
 *
 *
 *
 *
 *思路：
 中序遍历的递归定义：先左子树，后根节点，再右子树。
 然后每个节点递归。注意list的添加顺序。
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

public class InorderTraversalClass {

  /**
   * @param root: The root of binary tree.
   * @return: Inorder in ArrayList which contains node values.
   */
  public ArrayList<Integer> inorderTraversal(TreeNode root) {
    // write your code here
    ArrayList<Integer> lists = new ArrayList<>();

    if(root == null){
      return lists;
    }
    lists.addAll(inorderTraversal(root.left));
    lists.add(root.val);
    lists.addAll(inorderTraversal(root.right));

    return lists;
  }
}
