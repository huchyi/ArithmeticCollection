package com.arithmeticcollection;

import com.arithmeticcollection.utils.TreeNode;
import java.util.ArrayList;

/**
 * 给定一个二叉树，找出其最小深度。

 二叉树的最小深度为根节点到最近叶子节点的距离。
 *
 *样例
 给出一棵如下的二叉树:

      1
    /   \
  2      3
        / \
       4   5

 这个二叉树的最小深度为 2
 *
 *
 *
 *
 */

public class MinDepthClass {

  /**
   * @param root: The root of binary tree.
   * @return: An integer.
   */
  public int minDepth(TreeNode root) {
    // write your code here
    //if(root == null){
    //  return 0;
    //}
    //ArrayList<Integer> allList = new ArrayList<>();
    //getLastDeep(allList,new ArrayList<Integer>(),root);
    //
    //int min = allList.get(0);
    //for (int tt : allList) {
    //  if(tt < min){
    //    min = tt;
    //  }
    //}
    //return min;

    if(root == null)
      return 0;
    if(root.left == null && root.right == null)
      return 1;

    int leftDepth = minDepth(root.left);
    int rightDepth = minDepth(root.right);

    if(leftDepth == 0)
      leftDepth = rightDepth + 1;

    if(rightDepth == 0)
      rightDepth = leftDepth + 1;

    return leftDepth < rightDepth ? (leftDepth + 1) : (rightDepth + 1);

  }

  private void getLastDeep(ArrayList<Integer> allList,ArrayList<Integer> list,TreeNode root){
    if(root == null){
      allList.add(list.size());
      return ;
    }
    list.add(1);
    ArrayList<Integer> newList = new ArrayList<>();
    newList.addAll(list);
    getLastDeep(allList,newList,root.left);
    getLastDeep(allList,newList,root.right);
  }
}
