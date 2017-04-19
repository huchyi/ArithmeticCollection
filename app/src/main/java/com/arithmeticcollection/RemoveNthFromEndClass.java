package com.arithmeticcollection;

import com.arithmeticcollection.utils.ListNode;
import java.util.ArrayList;

/**
 * 删除链表中倒数第n个节点

 *给定一个链表，删除链表中倒数第n个节点，返回链表的头节点。



 注意事项

 链表中的节点个数大于等于n
 *
 *
 *
 *
 * 样例
 给出链表1->2->3->4->5->null和 n = 2.

 删除倒数第二个节点之后，这个链表将变成1->2->3->5->null.
 *
 *
 *
 *
 *
 *
 */

public class RemoveNthFromEndClass {


  /**
   * @param head: The first node of linked list.
   * @param n: An integer.
   * @return: The head of linked list.
   */
  ListNode removeNthFromEnd(ListNode head, int n) {
    // write your code here
    if(head ==null){
      return null;
    }

    ArrayList<ListNode> listNodes = new ArrayList<>();

    while (head != null){
      listNodes.add(head);
      head = head.next;
    }

    for (int i = listNodes.size() - 1; i >= 0 ; i--,n--) {
      if(n != 1){
        ListNode ll = listNodes.get(i);
        ll.next = head;
        head = ll;
      }
    }

    return head;
  }


}
