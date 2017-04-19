package com.arithmeticcollection.middle;

import com.arithmeticcollection.utils.TreeNode;
import java.util.ArrayList;
import java.util.Stack;

/**
 * 二叉树的序列化和反序列化
 *
 *
 * 设计一个算法，并编写代码来序列化和反序列化二叉树。将树写入一个文件被称为“序列化”，读取文件后重建同样的二叉树被称为“反序列化”。
 *
 * 如何反序列化或序列化二叉树是没有限制的，你只需要确保可以将二叉树序列化为一个字符串，并且可以将字符串反序列化为原来的树结构。
 *
 * 注意事项
 *
 * There is no limit of how you deserialize or serialize a binary tree, LintCode will take your
 * output
 * of serialize as the input of deserialize, it won't check the result of serialize.
 *
 *
 *
 *
 * 样例
 * 给出一个测试数据样例， 二叉树{3,9,20,#,#,15,7}，表示如下的树结构：
 *
 * 3
 * / \
 * 9  20
 *   /  \
 *  15   7
 * 我们的数据是进行BFS遍历得到的。当你测试结果wrong answer时，你可以作为输入调试你的代码。
 *
 * 你可以采用其他的方法进行序列化和反序列化。
 */

public class DeserializeClass {

  /**
   * This method will be invoked first, you should design your own algorithm
   * to serialize a binary tree which denote by a root node to a string which
   * can be easily deserialized by your own "deserialize" method later.
   */
  public String serialize(TreeNode root) {
    // write your code here
    if (root == null) {
      return "#";
    }
    ArrayList<ArrayList<String>> allList = new ArrayList<>();
    int num = 0;
    getData(allList,root,num);


    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < allList.size(); i++) {
      ArrayList<String> list2 = allList.get(i);
      for (int j = 0; j < list2.size(); j++) {
        stringBuilder.append(list2.get(j));
      }
    }


    return stringBuilder.toString();
  }


  private void getData(ArrayList<ArrayList<String>> allList,TreeNode root,int num){
    if(root == null){
      if(allList.size() - 1 >= num){
        ArrayList<String> list2 = allList.get(num);
        list2.add("#");
        allList.set(num,list2);
      }
      return;
    }

    if(allList.size() - 1 >= num){
      ArrayList<String> list2 = allList.get(num);
      list2.add(String.valueOf(root.val));
      allList.set(num,list2);
    }else{
      ArrayList<String> list = new ArrayList<>();
      list.add(String.valueOf(root.val));
      allList.add(num,list);
    }

    getData(allList,root.left,num + 1);
    getData(allList,root.right,num + 1);
  }


  /**
   * This method will be invoked second, the argument data is what exactly
   * you serialized at method "serialize", that means the data is not given by
   * system, it's given by your own serialize method. So the format of data is
   * designed by yourself, and deserialize it here as you serialize it in
   * "serialize" method.
   */
  public TreeNode deserialize(String data) {
    // write your code here

    if (data == null) {
      return null;
    }
    if (data.length() == 1) {
      if (data.equals("#")) {
        return null;
      } else {
        return new TreeNode(Integer.valueOf(data));
      }
    }

    char[] chars = data.toCharArray();
    ArrayList<ArrayList<String>> allList = new ArrayList<>();
    for (int i = 0; i < chars.length; ) {
      ArrayList<String> list = new ArrayList<>();
      if (i == 0) {
        list.add(String.valueOf(chars[0]));
        i++;
      } else {
        int num = allList.get(allList.size() - 1).size();
        for (int j = i; j < chars.length && j < i + num * 2; j++) {
          list.add(String.valueOf(chars[j]));
        }
        i = i + num * 2;
      }
      allList.add(list);
    }

    ArrayList<String> lastList11 = allList.get(allList.size() - 1);
    ArrayList<String> lastList12 = allList.get(allList.size() - 2);
    if (lastList12.size() * 2 > lastList11.size()) {
      for (int i = lastList11.size(); i < lastList12.size() * 2; i++) {
        lastList11.add("#");
      }
      allList.set(allList.size() - 1, lastList11);
    }

    ArrayList<TreeNode> listTree = new ArrayList<>();
    ArrayList<String> lastList1 = allList.get(allList.size() - 1);
    for (int i = 0; i < lastList1.size(); i++) {
      if (lastList1.get(i).equals("#")) {
        listTree.add(null);
      } else {
        listTree.add(new TreeNode(Integer.valueOf(lastList1.get(i))));
      }
    }

    for (int i = allList.size() - 2; i >= 0; i--) {
      ArrayList<String> lastList = allList.get(i);
      for (int j = 0; j < lastList.size(); j++) {
        String str = lastList.get(j);
        if (str.equals("#")) {
          listTree.set(j, null);
        } else {
          TreeNode treeNode = new TreeNode(Integer.valueOf(str));
          treeNode.left = listTree.get(j * 2);
          treeNode.right = listTree.get(j * 2 + 1);
          listTree.set(j, treeNode);
        }
      }
    }

    return listTree.get(0);
  }
}
