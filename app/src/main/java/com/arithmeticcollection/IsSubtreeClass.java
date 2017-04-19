package com.arithmeticcollection;

import com.arithmeticcollection.utils.TreeNode;
import java.util.ArrayList;
import java.util.Stack;

/**
 * 子树
 *
 *有两个不同大小的二进制树： T1 有上百万的节点； T2 有好几百的节点。请设计一种算法，判定 T2 是否为 T1的子树。

 注意事项

 若 T1 中存在从节点 n 开始的子树与 T2 相同，我们称 T2 是 T1 的子树。也就是说，如果在 T1 节点 n 处将树砍断，砍断的部分将与 T2 完全相同。


 样例
 下面的例子中 T2 是 T1 的子树：

            1                3
           / \              /
     T1 = 2   3      T2 =  4
              /
             4
 下面的例子中 T2 不是 T1 的子树：

            1               3
           / \               \
     T1 = 2   3       T2 =    4
             /
            4

 *
 *
 *
 *
 *
 *
 *
 *
 */

public class IsSubtreeClass {

  /**
   * @param T1, T2: The roots of binary tree.
   * @return: True if T2 is a subtree of T1, or false.
   */
  public boolean isSubtree(TreeNode t1, TreeNode t2) {

    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();

    getData(list1, t1);
    getData(list2, t2);

    boolean isCommon = false;
    for (int i = 0; i < list1.size() - list2.size(); i++) {
      isCommon = true;
      for (int j = 0; j < list2.size(); j++) {
        if (list1.get(i) != list2.get(j)) {
          isCommon = false;
          break;
        }
      }
      if (isCommon) {
        break;
      }
    }

    return isCommon;
  }


  private void getData(ArrayList<Integer> list,TreeNode t){

    if(t == null){
      return;
    }
    list.add(t.val);
    getData(list,t.left);
    getData(list,t.right);
  }





}
