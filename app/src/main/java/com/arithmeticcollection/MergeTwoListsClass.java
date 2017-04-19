package com.arithmeticcollection;

import android.util.Log;
import com.arithmeticcollection.utils.ListNode;
import java.util.ArrayList;

/**
 * 合并两个排序链表
 *
 * 将两个排序链表合并为一个新的排序链表
 *
 * 样例
 * 给出 1->3->8->11->15->null，2->null， 返回 1->2->3->8->11->15->null。
 */

public class MergeTwoListsClass {

  /**
   * @param l1 l1 is the head of the linked list
   * @param l2 l2 is the head of the linked list
   * @return: ListNode head of linked list
   */
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    // write your code here
    if (l1 == null) {
      return l2;
    }
    if (l2 == null) {
      return l1;
    }

    ArrayList<Integer> list = new ArrayList<>();
    while (l1 != null && l2 != null) {
      if (l1.val < l2.val) {
        list.add(l1.val);
        l1 = l1.next;
      }else {
        list.add(l2.val);
        l2 = l2.next;
      }
    }
    while (l1 != null) {
      list.add(l1.val);
      l1 = l1.next;
    }
    while (l2 != null) {
      list.add(l2.val);
      l2 = l2.next;
    }

    ListNode head = null;
    for (int i = list.size() - 1; i >= 0; i--) {
      ListNode listNode = new ListNode(list.get(i));
      listNode.next = head;
      head = listNode;
    }

    return head;
  }
}
