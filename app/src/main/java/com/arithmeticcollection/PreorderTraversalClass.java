package com.arithmeticcollection;

import com.arithmeticcollection.utils.TreeNode;
import java.util.ArrayList;

/**
 * 二叉树的前序遍历
 *
 * 给出一棵二叉树，返回其节点值的前序遍历。
 *
 * 样例
 给出一棵二叉树 {1,#,2,3},

 1
 \
 2
 /
 3
 返回 [1,2,3].



 思路：
 上、做、右
 */

public class PreorderTraversalClass {

  /**
   * @param root: The root of binary tree.
   * @return: Preorder in ArrayList which contains node values.
   */
  public ArrayList<Integer> preorderTraversal(TreeNode root) {
    // write your code here
    ArrayList<Integer> list = new ArrayList<>();
    if(root == null ){
      return list;
    }
    addList(list,root);
    return list;
  }


  private void addList(ArrayList<Integer> list,TreeNode root){
    if(root == null ){
      return ;
    }

    list.add(root.val);

    addList(list,root.left);
    addList(list,root.right);

  }
}
