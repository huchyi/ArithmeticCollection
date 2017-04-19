package com.arithmeticcollection;

import android.util.Log;
import com.arithmeticcollection.utils.ListNode;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 你有两个用链表代表的整数，其中每个节点包含一个数字。数字存储按照在原来整数中相反的顺序，使得第一个数字位于链表
 * 的开头。写出一个函数将两个整数相加，用链表形式返回和。
 * 样例
 * 给出两个链表 3->1->5->null 和 5->9->2->null，返回 8->0->8->null
 *
 *
 *
 *
 * 思路：
 * 所谓的单链表即是后进先出，先进后出。类似进出栈的原理（理论上应该是先进先出，不解？）。也是利用了递归的思想，
 * 把自己赋值给了自己内部的next对象。
 *
 *
 *
 *
 *
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */

public class AddListsClass {

  /**
   * @param l1: the first list
   * @param l2: the second list
   * @return: the sum list of l1 and l2
   */
  public ListNode addLists(ListNode l1, ListNode l2) {
    // write your code here

    String sumStr = sumLists(l1, l2);
    //ListNode headNew = new ListNode(-1);
    //headNew.next = null;

    ListNode head = new ListNode(-1);
    //head.next = headNew;
    head.next = null;
    ListNode newNode;
    for (int i = 0; i < sumStr.length(); i++) {
      int x = Integer.parseInt(sumStr.substring(i, i + 1));
      newNode = new ListNode(x);
      newNode.next = head.next;
      head.next = newNode;
    }
    return head.next;
  }

  public void getData(ListNode listNode) {
    StringBuilder ss = new StringBuilder();
    while (listNode.next != null) {
      ss.append(listNode.val);
      listNode = listNode.next;
    }
    Log.i("hcy", "val:" + listNode.val);

    Log.i("hcy", "getData:" + ss);
  }

  public static String sumLists(ListNode l1, ListNode l2) {
    ArrayList<String> list1 = new ArrayList<>();
    ArrayList<String> list2 = new ArrayList<>();
    while (l1 != null) {
      list1.add(String.valueOf(l1.val));
      l1 = l1.next;
    }
    while (l2 != null) {
      list2.add(String.valueOf(l2.val));
      l2 = l2.next;
    }

    ArrayList<String> list3 = new ArrayList<>();
    StringBuilder sb4 = new StringBuilder();

    int num1 = list1.size();
    int num2 = list2.size();
    int maxNum = (num1 > num2 ? num1:num2) + 1;
    for (int i = 0; i < maxNum; i++) {
      list3.add("-1");
    }

    int i = 0;
    while (i < maxNum){
      int a = 0;
      if(i < num1){
        a = Integer.valueOf(list1.get(i));
      }

      int b = 0;
      if(i < num2){
        b = Integer.valueOf(list2.get(i));
      }

      int sum = a+ b;
      if(!list3.get(i).equals("-1")){
        sum +=1;
      }
      if(sum < 10){
        sb4.append(sum);
      }else{
        sb4.append(sum % 10);
        list3.set(i+1,"1");
      }

      i++;
    }


    String str = sb4.reverse().toString();
    if(str.startsWith("0")){
      str = str.substring(1);
    }


    return str;
  }


  ////单链表
  //public class LinkList {
  //  public ListNode first; // 定义一个头结点
  //  private int pos = 0;// 节点的位置
  //
  //  public LinkList() {
  //    this. first = null;
  //  }
  //
  //  // 插入一个头节点
  //  public void addFirstNode( int data) {
  //    ListNode ListNode = new ListNode(data);
  //    ListNode. next = first;
  //    first = ListNode;
  //  }
  //
  //  // 删除一个头结点,并返回头结点
  //  public ListNode deleteFirstNode() {
  //    ListNode tempNode = first;
  //    first = tempNode. next;
  //    return tempNode;
  //  }
  //
  //  // 在任意位置插入节点 在index的后面插入
  //  public void add(int index, int data) {
  //    ListNode ListNode = new ListNode(data);
  //    ListNode current = first;
  //    ListNode previous = first;
  //    while ( pos != index) {
  //      previous = current;
  //      current = current. next;
  //      pos++;
  //    }
  //    ListNode. next = current;
  //    previous. next = ListNode;
  //    pos = 0;
  //  }
  //
  //  // 删除任意位置的节点
  //  public ListNode deleteByPos( int index) {
  //    ListNode current = first;
  //    ListNode previous = first;
  //    while ( pos != index) {
  //      pos++;
  //      previous = current;
  //      current = current. next;
  //    }
  //    if(current == first) {
  //      first = first. next;
  //    } else {
  //      pos = 0;
  //      previous. next = current. next;
  //    }
  //    return current;
  //  }
  //
  //  // 根据节点的data删除节点(仅仅删除第一个)
  //  public ListNode deleteByData( int data) {
  //    ListNode current = first;
  //    ListNode previous = first; //记住上一个节点
  //    while (current. val != data) {
  //      if (current. next == null) {
  //        return null;
  //      }
  //      previous = current;
  //      current = current. next;
  //    }
  //    if(current == first) {
  //      first = first. next;
  //    } else {
  //      previous. next = current. next;
  //    }
  //    return current;
  //  }
  //
  //  // 显示出所有的节点信息
  //  public void displayAllNodes() {
  //    ListNode current = first;
  //    while (current != null) {
  //      current.display();
  //      current = current. next;
  //    }
  //    System. out.println();
  //  }
  //
  //  // 根据位置查找节点信息
  //  public ListNode findByPos( int index) {
  //    ListNode current = first;
  //    if ( pos != index) {
  //      current = current. next;
  //      pos++;
  //    }
  //    return current;
  //  }
  //
  //  // 根据数据查找节点信息
  //  public ListNode findByData( int data) {
  //    ListNode current = first;
  //    while (current. val != data) {
  //      if (current. next == null)
  //        return null;
  //      current = current. next;
  //    }
  //    return current;
  //  }
  //}
}
