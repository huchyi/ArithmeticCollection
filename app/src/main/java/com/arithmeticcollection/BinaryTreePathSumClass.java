package com.arithmeticcollection;

import android.util.Log;
import com.arithmeticcollection.utils.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的路径和
 *
 * 给定一个二叉树，找出所有路径中各节点相加总和等于给定 目标值 的路径。一个有效的路径，指的是从根节点到叶节点的路径。
 *
 *
 * 样例
 * 给定一个二叉树，和 目标值 = 5:
 *
 * 1
 * / \
 * 2   4
 * / \
 * 2   3
 * 返回：
 *
 * [
 * [1, 2, 2],
 * [1, 4]
 * ]
 *
 *
 *
 *
 * 思路：
 * 每条路径全部记录在一个list里（直到没有分支，为一个完整的路径），和求层次之和类似，通过需要把每个
 * 分支的list和总list层层向下传递，直到root为空，则加入到总的list集合中。但是有一个问题，会有重复的数据
 * 出现，此时应判断是左分支和右分支。否者判断左右分支为root==null后会得到重复的数据。所有左右分支标记一下，
 * 去其中一个分支，就可解决这个问题。
 *
 *
 *
 */

public class BinaryTreePathSumClass {

  /**
   * @param root the root of binary tree
   * @param target an integer
   * @return all valid paths
   */
  public List<List<Integer>> binaryTreePathSum(TreeNode root, int target) {
    // Write your code here

    List<List<Integer>> ll2 = new ArrayList<>();

    ArrayList<ArrayList<Integer>> allList = new ArrayList<>();
    addList(allList, new ArrayList<Integer>(), root, 1);

    for (int i = 0; i < allList.size(); i++) {
      ArrayList<Integer> ll = allList.get(i);
      int sum = 0;
      for (int j = 0; j < ll.size(); j++) {
        sum = sum + ll.get(j);
      }
      if (sum == target) {
        ArrayList<Integer> ll22 = new ArrayList<>();
        for (int j = ll.size() - 1; j >= 0; j--) {
          ll22.add(ll.get(j));
        }
        ll2.add(ll22);
      }
    }

    return ll2;
  }

  private void addList(ArrayList<ArrayList<Integer>> allList, ArrayList<Integer> list,
      TreeNode root, int num) {
    if (root == null) {
      if (num == 1) {
        allList.add(list);
      }
      //Log.i("hcy","----------allList:" + allList.size());
      //Log.i("hcy","list:" + list.size());
      return;
    }

    ArrayList<Integer> listaa = new ArrayList<>();
    listaa.add(root.val);
    listaa.addAll(list);

    //allList.add(listaa);

    addList(allList, listaa, root.left, 1);
    addList(allList, listaa, root.right, 0);
  }
}
