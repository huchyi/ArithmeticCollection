package com.arithmeticcollection;

import com.arithmeticcollection.utils.ListNode;

/**
 * 链表插入排序
 *
 *
 *
 *
 * 用插入排序对链表排序
 *
 *
 * 样例
 * Given 1->3->2->0->null, return 0->1->2->3->null
 *
 *
 *
 * 有一个已经有序的数据序列，要求在这个已经排好的数据序列中插入一个数，但要求插入后此数据序列仍然有序，这个时候就要用到
 * 一种新的排序方法——插入排序法,插入排序的基本操作就是将一个数据插入到已经排好序的有序数据中，从而得到一个新的、个数加一
 * 的有序数据，算法适用于少量数据的排序，时间复杂度为O(n^2)。是稳定的排序方法。插入算法把要排序的数组分成两部分：第一部
 * 分包含了这个数组的所有元素，但将最后一个元素除外（让数组多一个空间才有插入的位置），而第二部分就只包含这一个元素（即待插入元素）。
 * 在第一部分排序完成后，再将这个最后元素插入到已排好序的第一部分中。
 */

public class InsertionSortListClass {

  /**
   * @param head: The first node of linked list.
   * @return: The head of linked list.
   */
  public ListNode insertionSortList(ListNode head) {
    // write your code here

    ListNode fakeNode = new ListNode(-1);
    fakeNode.next = head;
    if (head == null) return null;
    ListNode cur = head.next;//从第二个节点开始遍历
    ListNode pre = head;//排好序的最后一个节点
    while (cur != null) {
      if (cur.val < pre.val) {
        ListNode nextNode = cur.next;//保存下一个需要遍历的节点

        //寻找插入的合适位置
        ListNode cur2 = fakeNode.next;
        ListNode temp = fakeNode;//记录cur2前面一个节点
        while (cur.val > cur2.val && cur2 != pre) {
          temp = cur2;
          cur2 = cur2.next;
        }
        //进行插入
        temp.next = cur;
        cur.next = cur2;
        pre.next = nextNode;
        //继续遍历下一个节点
        cur = nextNode;
      } else {
        pre = cur;
        cur = cur.next;
      }
    }

    return fakeNode.next;
  }
}
