package com.arithmeticcollection.middle;

import com.arithmeticcollection.utils.TreeNode;

/**
 * 中序遍历和后序遍历树构造二叉树

 根据中序遍历和后序遍历树构造二叉树

 注意事项

 你可以假设树中不存在相同数值的节点
 *
 *
 *
 * 样例
 给出树的中序遍历： [1,2,3] 和后序遍历： [1,3,2]

 返回如下的树：

 2

 /  \

 1    3
 *
 *
 *
 *
 *
 *
 *
 */

public class BuildTreeClass {

  /**
   *@param inorder : A list of integers that inorder traversal of a tree
   *@param postorder : A list of integers that postorder traversal of a tree
   *@return : Root of a tree
   */
  public TreeNode buildTree(int[] inorder, int[] postorder) {
    // write your code here

    return buildSubTree(inorder, 0, inorder.length, postorder, 0, postorder.length);
  }



  private TreeNode buildSubTree(int[] inorder, int inBeg, int inEnd, int[] postorder, int postBeg, int postEnd) {
    int inLen = inorder.length;
    int postLen = postorder.length;
    if (inBeg == inEnd || inEnd >inLen || postBeg == postEnd || postEnd >postLen)
    return null;

    TreeNode root = new TreeNode(postorder[postEnd - 1]);
    int pos = getDataIndex(inorder,root.val);

    int leftLen = pos - inBeg - 1;
    root.left =
        buildSubTree(inorder, inBeg, inBeg + leftLen + 1, postorder, postBeg, postBeg + leftLen + 1);
    root.right = buildSubTree(inorder, inBeg + leftLen + 2, inEnd, postorder, postBeg + leftLen + 1,
        postEnd - 1);

    return root;
  }


  private int getDataIndex(int[] inorder, int value){

    for (int i = 0; i < inorder.length; i++) {
      if(value == inorder[i]){
        return i;
      }
    }
    return  -1;
  }

}
