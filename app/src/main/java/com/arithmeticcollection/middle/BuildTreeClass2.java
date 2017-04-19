package com.arithmeticcollection.middle;

import com.arithmeticcollection.utils.TreeNode;

/**
 * 前序遍历和中序遍历树构造二叉树
 *
 * 根据前序遍历和中序遍历树构造二叉树.

 注意事项

 你可以假设树中不存在相同数值的节点
 *
 *
 * 样例
 给出中序遍历：[1,2,3]和前序遍历：[2,1,3]. 返回如下的树:

 2
 / \
 1   3
 *
 *
 */

public class BuildTreeClass2 {

  /**
   *@param preorder : A list of integers that preorder traversal of a tree
   *@param inorder : A list of integers that inorder traversal of a tree
   *@return : Root of a tree
   */
  public TreeNode buildTree(int[] preorder, int[] inorder) {
    // write your code here
    if (preorder == null || inorder == null) {
      return null;
    }
    return ConstructCore(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
  }

  public TreeNode ConstructCore(int[] preOrder, int[] inOrder, int startPreorder, int endPreorder,
      int startInorder, int endInorder) {

    if (startPreorder > endPreorder || startInorder > endInorder) {
      return null;
    }
    TreeNode root = new TreeNode(preOrder[startPreorder]);

    int divider = 0;
    while (divider <= endInorder && inOrder[divider] != root.val) {
      divider++;
    }

    int offSet = divider - startInorder - 1;
    root.left = ConstructCore(preOrder, inOrder, startPreorder + 1, startPreorder + 1 + offSet, startInorder,
        startInorder + offSet);
    root.right = ConstructCore(preOrder, inOrder, startPreorder + offSet + 2, endPreorder, divider + 1, endInorder);

    return root;
  }


  //// 中序遍历二叉树
  //public static void inorder(TreeNode root) {
  //  if (root != null) {
  //    preorder(root.left);
  //    System.out.print(root.val + " ");
  //    preorder(root.right);
  //  }
  //}
  //
  //// 先序遍历二叉树
  //public static void preorder(TreeNode root) {
  //  if (root != null) {
  //    System.out.print(root.val + " ");
  //    preorder(root.left);
  //    preorder(root.right);
  //  }
  //}
}
