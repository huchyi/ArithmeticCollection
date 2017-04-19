package com.arithmeticcollection;

import com.arithmeticcollection.utils.TreeNode;

/**
 * 在二叉查找树中插入节点
 *
 *
 *
 * 给定一棵二叉查找树和一个新的树节点，将节点插入到树中。

 你需要保证该树仍然是一棵二叉查找树。

 注意事项

 You can assume there is no duplicate values in this tree + node.
 *
 *
 *样例
 给出如下一棵二叉查找树，在插入节点6之后这棵二叉查找树可以是这样的：

 2             2
 / \           / \
 1   4   -->   1   4
 /             / \
 3             3   6
 *
 *
 *
 *
 * 思路：
 * 如果在查询二叉树中能够找到该节点，则直接返回，否则，一层层向下找，知道找到大于或者小于新数字的最后一个节点。
 *
 * 二叉排序树或者是一棵空树，或者是具有下列性质的二叉树：
 （1）若左子树不空，则左子树上所有结点的值均小于或等于它的根结点的值；
 （2）若右子树不空，则右子树上所有结点的值均大于或等于它的根结点的值；
 （3）左、右子树也分别为二叉排序树；
 *
 *
 */

public class InsertNodeClass {

  /**
   * @param root: The root of the binary search tree.
   * @param node: insert this node into the binary search tree
   * @return: The root of the new binary search tree.
   */
  public TreeNode insertNode(TreeNode root, TreeNode node) {
    // write your code here

    if(root == null && node == null){
      return null;
    }else if(root == null && node != null){
      return node;
    }
    addTree(root,node);
    return root;
  }

  private void addTree(TreeNode root, TreeNode node){
    if(root == null){
      return;
    }

    if(root.val > node.val){
      if(root.left != null){
        addTree(root.left,node);
      }else{
        root.left = node;
      }
    }else if(root.val < node.val){
      if(root.right != null){
        addTree(root.right,node);
      }else{
        root.right = node;
      }
    }
  }
}
