package com.arithmeticcollection;

import com.arithmeticcollection.utils.ListNode;
import java.util.ArrayList;

/**
 * 删除排序链表中的重复元素
 *
 * 给定一个排序链表，删除所有重复的元素每个元素只留下一个。
 *
 *
 * 样例
 * 给出 1->1->2->null，返回 1->2->null
 *
 * 给出 1->1->2->3->3->null，返回 1->2->3->null
 */

public class DeleteDuplicatesClass {

  /**
   * @param head head is the head of the linked list
   * @return: ListNode head of linked list
   */
  public static ListNode deleteDuplicates(ListNode head) {
    // write your code here
    if (head == null) {
      return null;
    }

    //方法一，但容易StackOverflowError
    //ListNode nd = deleteDuplicates(head.next);
    //if (nd == null) {
    //  head.next = null;
    //} else {
    //  if (nd.val == head.val) {
    //    head.next = nd.next;
    //  } else {
    //    head.next = nd;
    //  }
    //}
    //
    //return head;


    //方法二，循环
    ArrayList<ListNode> list = new ArrayList<>();
    ListNode nd = new ListNode(head.val);
    list.add(nd);
    head = head.next;
    while (head != null){
      int tt = list.size();
      if(list.get(tt - 1).val != head.val){
        ListNode nd1 = new ListNode(head.val);
        list.add(nd1);
      }
      head = head.next;
    }

    ListNode listNode = null;
    for (int i = list.size() - 1; i >= 0; i--) {
      ListNode ndd = list.get(i);
      ndd.next = listNode;
      listNode = ndd;
    }

    return listNode;
  }
}
