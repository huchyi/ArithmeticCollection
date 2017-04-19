package com.arithmeticcollection;

import com.arithmeticcollection.utils.ListNode;

/**
 * 两两交换链表中的节点
 *
 *
 * 给一个链表，两两交换其中的节点，然后返回交换后的链表。
 *
 *
 * 样例
 * 给出 1->2->3->4, 你应该返回的链表是 2->1->4->3。
 *
 * 挑战
 * 你的算法只能使用常数的额外空间，并且不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 */

public class SwapPairsClass {

  /**
   * @param head a ListNode
   * @return a ListNode
   */
  public ListNode swapPairs(ListNode head) {
    // Write your code here

    ListNode listNode = null;

    while (head != null) {
      ListNode head1 = head.next;
      if(head1 != null){
        ListNode ln = new ListNode(head1.val);
        ln.next = listNode;
        listNode = ln;

        ListNode ln2 = new ListNode(head.val);
        ln2.next = listNode;
        listNode = ln2;

        head = head1.next;
      }else{
        ListNode ln2 = new ListNode(head.val);
        ln2.next = listNode;
        listNode = ln2;

        head = null;
      }
    }


    while (listNode != null){
      ListNode ln2 = new ListNode(listNode.val);
      ln2.next = head;
      head = ln2;

      listNode = listNode.next;
    }

    return head;
  }
}
