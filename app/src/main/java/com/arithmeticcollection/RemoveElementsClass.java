package com.arithmeticcollection;

import android.content.Intent;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 删除链表中等于给定值val的所有节点。
 *
 * 样例
 * 给出链表 1->2->3->3->4->5->3, 和 val = 3, 你需要返回删除3之后的链表：1->2->4->5。
 *
 *
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 */

public class RemoveElementsClass {

  /**
   * @param head a ListNode
   * @param val an integer
   * @return a ListNode
   */
  public ListNode removeElements(ListNode head, int val) {
    // Write your code here

    StringBuilder stringBuilder = new StringBuilder();
    String a = String.valueOf(head.val);
    char[] cs = a.toCharArray();
    for (int i = 0; i < cs.length; i++) {
      int aa = (int) cs[i];
      if( aa != val){
        stringBuilder.append(cs[i]);
      }
    }

    head.val = Integer.valueOf(stringBuilder.toString());
    return head;
  }



  public static class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }
}
