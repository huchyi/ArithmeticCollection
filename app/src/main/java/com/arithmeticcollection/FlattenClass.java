package com.arithmeticcollection;

import android.util.Log;
import com.arithmeticcollection.utils.TreeNode;
import java.util.ArrayList;

/**
 * 将二叉树拆成链表
 *
 *
 * 将一棵二叉树按照前序遍历拆解成为一个假链表。所谓的假链表是说，用二叉树的 right 指针，来表示链表中的 next 指针。
 *
 * 注意事项
 *
 * 不要忘记将左儿子标记为 null，否则你可能会得到空间溢出或是时间溢出。
 *
 *
 *
 *
 * 样例
 * 1
 * \
 * 1             2
 * / \             \
 * 2   5    =>     3
 * / \   \          \
 * 3   4   6        4
 * \
 * 5
 * \
 * 6
 */

public class FlattenClass {

  /**
   * @param root: a TreeNode, the root of the binary tree
   * @return: nothing
   */
  public void flatten(TreeNode root) {
    // write your code here
    if (root == null) {
      return;
    }

    ArrayList<Integer> list = new ArrayList<>();
    addList(list, root);

    root.val = list.get(list.size() - 1);
    root.right = null;
    root.left = null;
    if(list.size() > 1){
      for (int i = list.size() - 2; i >= 0; i--) {
        TreeNode nr = new TreeNode(list.get(i));
        nr.right = root;
        nr.left = null;
        root = nr;
      }
    }


    StringBuilder stringBuilder = new StringBuilder();
    while (root.right != null) {
      stringBuilder.append(root.val);
      root = root.right;
    }
    stringBuilder.append(root.val);
    Log.i("hcy", "stringBuilder:" + stringBuilder.toString());
  }

  private void addList(ArrayList<Integer> list, TreeNode root) {
    if (root == null) {
      return;
    }
    list.add(root.val);
    addList(list, root.left);
    addList(list, root.right);
  }
}
