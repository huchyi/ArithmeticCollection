package com.arithmeticcollection;

import com.arithmeticcollection.utils.TreeNode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 *  二叉树的所有路径
 *
 *给一棵二叉树，找出从根节点到叶子节点的所有路径。
 *
 *
 *
 * 样例
 给出下面这棵二叉树：

 1
 /   \
 2     3
 \
 5
 所有根到叶子的路径为：

 [
 "1->2->5",
 "1->3"
 ]
 *
 *
 *
 * 思路：
 * 和路径和相加思路一样，递归加入数组中。但有一点需要注意，左右两边都没有数据的时候才能称为一个完整的路径，
 * 所以假设左边有数据，但左边的值反悔了false给右边，如果右变有数据继续向下走，如果没有数据则加入list。
 *
 */

public class BinaryTreePathsClass {

  /**
   * @param root the root of the binary tree
   * @return all root-to-leaf paths
   */
  public List<String> binaryTreePaths(TreeNode root) {
    // Write your code here

    List<String> listStr = new ArrayList<>();

    ArrayList<ArrayList<String>> allList =new ArrayList<>();
    addList(allList,new ArrayList<String>(),root,false);

    for (int i = 0; i < allList.size(); i++) {
      StringBuilder stringBuilder = new StringBuilder();

      ArrayList<String> ll = allList.get(i);
      for (int j = ll.size() - 1; j >= 0 ; j--) {
        if(j == 0){
          stringBuilder.append(ll.get(j));
        }else{
          stringBuilder.append(ll.get(j)).append("->");
        }
      }

      listStr.add(stringBuilder.toString());
    }

    return new ArrayList(new HashSet(listStr));
  }

  /**
   *
   * @param allList  总list
   * @param list 分支list
   * @param root 节点
   */
  public boolean addList(ArrayList<ArrayList<String>> allList , ArrayList<String> list ,TreeNode root,boolean hasData){

    if(root == null){
      if(!hasData){
        allList.add(list);
      }
      return false;
    }

    ArrayList<String> listChild = new ArrayList<>();
    listChild.add(String.valueOf(root.val));
    listChild.addAll(list);

    boolean leftb = addList(allList,listChild,root.left,true);
    addList(allList,listChild,root.right,leftb);

    return true;
  }


}
