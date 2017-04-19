package com.arithmeticcollection.utils;

/**
 * Created by huangchuanyi on 4/17/17.
 */
public class DoublyListNode {

  int val;
  public DoublyListNode next, prev;
  public DoublyListNode(int val) {
    this.val = val;
    this.next = this.prev = null;
  }
}
