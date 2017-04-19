package com.arithmeticcollection.middle;

import com.arithmeticcollection.utils.ListNode;
import com.arithmeticcollection.utils.TreeNode;
import java.util.ArrayList;

/**
 * 排序列表转换为二分查找树
 *
 *
 *
 * 给出一个所有元素以升序排序的单链表，将它转换成一棵高度平衡的二分查找树
 *
 * 样例
 * 2
 * 1->2->3  =>   / \
 * 1   3
 */

public class SortedListToBSTClass {

  /**
   * @param head: The first node of linked list.
   * @return: a tree node
   */
  public TreeNode sortedListToBST(ListNode head) {
    // write your code here
    ArrayList<Integer> list = new ArrayList<>();

    while (head != null) {
      list.add(head.val);
      head = head.next;
    }


    TreeNode leftNode = new TreeNode(-1);
    int len = 0;
    if(list.size() % 2 == 0){
      len = list.size() / 2;

      TreeNode left = new TreeNode(-1);
      if(len % 2 == 0){
      }else{
      }


    }


    return null;
  }
}
