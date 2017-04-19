package com.arithmeticcollection;

import com.arithmeticcollection.utils.TreeNode;

/**
 * 把排序数组转换为高度最小的二叉搜索树
 *
 *
 * 给一个排序数组（从小到大），将其转换为一棵高度最小的排序二叉树。

 注意事项

 There may exist multiple valid solutions, return any of them.


 样例
 给出数组 [1,2,3,4,5,6,7], 返回

 4
 /   \
 2     6
 / \    / \
 1   3  5   7



 思路：
 去中间的值给根节点，然后把剩余左边的数组给做分支，有边的数组给右分支。递归。
 */

public class SortedArrayToBSTClass {

  /**
   * @param A: an integer array
   * @return: a tree node
   */
  public TreeNode sortedArrayToBST(int[] A) {
    // write your code here

    if (A.length <= 0) {
      return null;
    } else if (A.length == 1) {
      TreeNode treeNode = new TreeNode(A[0]);
      treeNode.left = null;
      treeNode.right = null;
      return treeNode;
    }

    int length = A.length;
    boolean is = (length % 2 == 0);
    int t = is ? A[length / 2 - 1] : A[length / 2];

    int[] aa = new int[is? length / 2 - 1 : length / 2];
    if (aa.length > 0) {
      for (int i = 0; i < aa.length; i++) {
        aa[i] = A[i];
      }
    }

    int ttt = length / 2;
    int[] bb = new int[ttt];
    if (bb.length > 0) {
      for (int i = 0; i < bb.length; i++) {
        if (is) {
          bb[i] = A[ttt + i];
        } else {
          bb[i] = A[ttt + 1 + i];
        }
      }
    }

    TreeNode treeNode = new TreeNode(t);
    treeNode.left = sortedArrayToBST(aa);
    treeNode.right = sortedArrayToBST(bb);

    return treeNode;
  }
}
