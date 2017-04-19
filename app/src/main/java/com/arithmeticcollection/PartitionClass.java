package com.arithmeticcollection;

import com.arithmeticcollection.utils.ListNode;
import java.util.ArrayList;

/**
 * 链表划分
 *
 *给定一个单链表和数值x，划分链表使得所有小于x的节点排在大于等于x的节点之前。

 你应该保留两部分内链表节点原有的相对顺序。

 *样例
 给定链表 1->4->3->2->5->2->null，并且 x=3

 返回 1->2->2->4->3->5->null
 *
 *
 *
 *
 *
 *
 *
 */

public class PartitionClass {

  /**
   * @param head: The first node of linked list.
   * @param x: an integer
   * @return: a ListNode
   */
  public ListNode partition(ListNode head, int x) {
    // write your code here

    ArrayList<ListNode> lowListNodes = new ArrayList<>();
    ArrayList<ListNode> hightListNodes = new ArrayList<>();

    while (head != null){
      if(head.val < x){
        lowListNodes.add(head);
      }else{
        hightListNodes.add(head);
      }
      head = head.next;
    }

    ListNode listNode = null;

    for (int i = hightListNodes.size() - 1; i >= 0; i--) {
      ListNode nd = hightListNodes.get(i);
      nd.next = listNode;
      listNode = nd;
    }

    for (int i = lowListNodes.size() - 1; i >= 0; i--) {
      ListNode nd = lowListNodes.get(i);
      nd.next = listNode;
      listNode = nd;
    }

    return listNode;
  }
}
