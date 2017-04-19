package com.arithmeticcollection.middle;

import com.arithmeticcollection.utils.TreeNode;
import java.util.ArrayList;

/**
 * 二叉树的层次遍历 II
 *
 *给出一棵二叉树，返回其节点值从底向上的层次序遍历（按从叶节点所在层到根节点所在的层遍历，然后逐层从左往右遍历）
 *
 *
 *样例
 给出一棵二叉树 {3,9,20,#,#,15,7},

 3
 / \
 9  20
   /  \
  15   7
 按照从下往上的层次遍历为：

 [
 [15,7],
 [9,20],
 [3]
 ]
 *
 *
 *
 */

public class LevelOrderBottomClass {


  /**
   * @param root: The root of binary tree.
   * @return: buttom-up level order a list of lists of integer
   */
  public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
    // write your code here

    if(root == null){
      return new ArrayList<>();
    }

    ArrayList<ArrayList<Integer>> allList = new ArrayList<>();
    int num = 0;
    getData(allList,root,num);

    ArrayList<ArrayList<Integer>> newAllList = new ArrayList<>();
    for (int i = allList.size() -1; i >= 0; i--) {
      newAllList.add(allList.get(i));
    }

    return newAllList;
  }


  private void getData(ArrayList<ArrayList<Integer>> allList,TreeNode root,int num){
    if(root == null){
      return;
    }
    if(allList.size() - 1 >= num){
      ArrayList<Integer> list2 = allList.get(num);
      list2.add(root.val);
      allList.set(num,list2);
    }else{
      ArrayList<Integer> list = new ArrayList<>();
      list.add(root.val);
      allList.add(num,list);
    }

    getData(allList,root.left,num + 1);
    getData(allList,root.right,num + 1);
  }


}
