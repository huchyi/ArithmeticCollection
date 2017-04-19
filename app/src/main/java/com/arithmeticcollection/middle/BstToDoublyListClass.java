package com.arithmeticcollection.middle;

import com.arithmeticcollection.utils.DoublyListNode;
import com.arithmeticcollection.utils.TreeNode;
import java.util.ArrayList;

/**
 * 将二叉查找树转换成双链表
 * 将一个二叉查找树按照中序遍历转换成双向链表。
 *
 *
 *
 * 样例
 * 给定一个二叉查找树：
 *
 * 4
 * /  \
 * 2   5
 * / \
 * 1   3
 * 返回 1<->2<->3<->4<->5。
 */

public class BstToDoublyListClass {

  /**
   * @param root: The root of tree
   * @return: the head of doubly list node
   */
  public DoublyListNode bstToDoublyList(TreeNode root) {
    // Write your code here

    if(root == null){
      return null;
    }


    ArrayList<Integer> list = new ArrayList<>();
    getTreeNode(list, root.left);
    list.add(root.val);
    getTreeNode(list, root.right);

    int i = list.size() - 1;
    DoublyListNode doublyListNodePre = null;
    DoublyListNode doublyListNodeNow = null;
    DoublyListNode doublyListNodeNext = null;

    if(list.size() == 0){
      return null;
    }else if(list.size() == 1){
      return new DoublyListNode(list.get(0));
    }

    while (i >= 0) {

      if (i == list.size() - 1) {

        doublyListNodeNow = new DoublyListNode(list.get(i));
        doublyListNodePre = new DoublyListNode(list.get(i - 1));
        doublyListNodeNow.prev = doublyListNodePre;
        doublyListNodeNow.next = doublyListNodeNext;

      } else if (i == 0) {
        doublyListNodePre = doublyListNodeNow;

        doublyListNodeNow = new DoublyListNode(list.get(i));
        doublyListNodeNow.prev = null;
        doublyListNodeNow.next = doublyListNodePre;

      } else {
        doublyListNodeNext = doublyListNodeNow;

        doublyListNodeNow = new DoublyListNode(list.get(i));
        doublyListNodePre = new DoublyListNode(list.get(i - 1));
        doublyListNodeNow.prev = doublyListNodePre;
        doublyListNodeNow.next = doublyListNodeNext;
      }

      i--;
    }

    return doublyListNodeNow;
  }

  private void getTreeNode(ArrayList<Integer> list, TreeNode root) {

    if (root == null) {
      return;
    }
    getTreeNode(list, root.left);
    list.add(root.val);
    getTreeNode(list, root.right);
  }
}
