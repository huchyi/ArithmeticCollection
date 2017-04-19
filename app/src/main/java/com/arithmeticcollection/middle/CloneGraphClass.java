package com.arithmeticcollection.middle;

import com.arithmeticcollection.utils.UndirectedGraphNode;
import java.util.ArrayList;

/**
 * C克隆图
 *
 *
 * 克隆一张无向图，图中的每个节点包含一个 label 和一个列表 neighbors。
 *
 * 数据中如何表示一个无向图？http://www.lintcode.com/help/graph/
 *
 * 你的程序需要返回一个经过深度拷贝的新图。这个新图和原图具有同样的结构，并且对新图的任何改动不会对原图造成任何影响。
 *
 *
 *
 *
 *
 *
 * 样例
 * 比如，序列化图 {0,1,2#1,2#2,2} 共有三个节点, 因此包含两个个分隔符#。
 *
 * 第一个节点label为0，存在边从节点0链接到节点1和节点2
 * 第二个节点label为1，存在边从节点1连接到节点2
 * 第三个节点label为2，存在边从节点2连接到节点2(本身),从而形成自环。
 * 我们能看到如下的图：
 *
 * 1
 * / \
 * /   \
 * 0 --- 2
 * / \
 * \_/
 */

public class CloneGraphClass {

  /**
   * @param node: A undirected graph node
   * @return: A undirected graph node
   */
  public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
    // write your code here
    if(node == null){
      return null;
    }
    UndirectedGraphNode newNode = new UndirectedGraphNode(node.label);
    newNode.neighbors = setData(node.neighbors);
    return newNode;
  }

  private ArrayList<UndirectedGraphNode> setData(ArrayList<UndirectedGraphNode> list){
    if(list.size() <= 0){
      return new ArrayList<>();
    }
    ArrayList<UndirectedGraphNode> newList = new ArrayList<>();
    for (int i = 0; i < list.size(); i++) {
      UndirectedGraphNode node = list.get(i);
      System.out.print(node.label);
      UndirectedGraphNode newNode = new UndirectedGraphNode(node.label);
      newNode.neighbors = setData(node.neighbors);
      newList.add(newNode);
    }
    System.out.println();
    return newList;
  }
}
