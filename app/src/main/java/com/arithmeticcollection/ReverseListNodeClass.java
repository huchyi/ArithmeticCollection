package com.arithmeticcollection;

import com.arithmeticcollection.utils.ListNode;

/**
 * 翻转链表
 *
 *翻转一个链表
 *
 *样例
 给出一个链表1->2->3->null，这个翻转后的链表为3->2->1->null

 挑战
 在原地一次翻转完成
 *
 *
 *
 *
 *
 *
 */

public class ReverseListNodeClass {

  /**
   * @param head: The head of linked list.
   * @return: The new head of reversed linked list.
   */
  public ListNode reverse(ListNode head) {
    // write your code here
    ListNode head2 = null;
    while (head != null){
      ListNode listNode = new ListNode(head.val);
      listNode.next = head2;
      head2 = listNode;
      head = head.next;
    }
    return head2;

  }
}
