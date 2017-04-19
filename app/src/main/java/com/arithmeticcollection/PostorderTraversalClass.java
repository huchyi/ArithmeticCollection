package com.arithmeticcollection;

import android.util.Log;
import com.arithmeticcollection.utils.TreeNode;
import java.util.ArrayList;

/**
 *  二叉树的后序遍历
 *
 *  给出一棵二叉树，返回其节点值的后序遍历。
 *
 *  样例
 给出一棵二叉树 {1,#,2,3},

         1
          \
          2
         /
        3
 返回 [3,2,1]


 *
 *
 *
 *思路：
 * 后续遍历为，左、后、上。从最深的节点开始。
 *
 **/

public class PostorderTraversalClass {



  /**
   * @param root: The root of binary tree.
   * @return: Postorder in ArrayList which contains node values.
   */
  public ArrayList<Integer> postorderTraversal(TreeNode root) {
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

    addList(list,root.left);
    addList(list,root.right);

    list.add(root.val);
  }


}
