package com.arithmeticcollection.utils;

import java.util.ArrayList;

/**
 * Created by huangchuanyi on 4/13/17.
 */

public class UndirectedGraphNode {
  public int label;
  public ArrayList<UndirectedGraphNode> neighbors;

  public UndirectedGraphNode(int x) {
    label = x;
    neighbors = new ArrayList<>();
  }
}
