package com.arithmeticcollection;

import com.arithmeticcollection.utils.ListNode;
import java.util.ArrayList;

/**
 * 链表倒数第n个节点
 *
 *
 * 找到单链表倒数第n个节点，保证链表中节点的最少数量为n。
 *
 * 样例
 * 给出链表 3->2->1->5->null和n = 2，返回倒数第二个节点的值1.
 */

public class NodeToLastClass {

  /**
   * @param head: The first node of linked list.
   * @param n: An integer.
   * @return: Nth to last node of a singly linked list.
   */
  ListNode nthToLast(ListNode head, int n) {
    // write your code here
    if (head == null) {
      return null;
    }

    ArrayList<ListNode> list = new ArrayList<>();

    while (head != null){
      list.add(head);
      head = head.next;
    }

    ListNode listNode = null;
    for (int i = list.size() - 1; i >= 0; i--,n--) {
      if(n == 1){
        listNode = list.get(i);
        break;
      }
    }
    return listNode;
  }
}
