package com.arithmeticcollection;

import android.util.Log;
import com.arithmeticcollection.utils.ListNode;
import com.arithmeticcollection.utils.TreeNode;
import java.util.ArrayList;

/**
 *  在O(1)时间复杂度删除链表节点
 *
 *
 *  给定一个单链表中的一个等待被删除的节点(非表头或表尾)。请在在O(1)时间复杂度删除该链表节点。
 *
 *  样例
  给定 1->2->3->4，和节点 3，删除 3 之后，链表应该变为 1->2->4。
 *
 *
 */
public class DeleteNodeClass {

  /**
   * @param node: the node in the list should be deleted
   * @return: nothing
   */
  public void deleteNode(ListNode node,int delete) {
    // write your code here

    if(node == null){
      return;
    }

    if(node.val == delete && node.next !=null){
      ListNode newNode = new ListNode(node.next.val);
      newNode.next = node.next.next;
      node.val = newNode.val;
      node.next = newNode.next;
      //deleteNode(node.next);
      //return;
    }
    deleteNode(node.next,delete);
  }





  /**
   *
   * Find the maximum node in a binary tree, return the node.
   *
   * 样例
   Given a binary tree:

   1
   /   \
   -5     2
   / \   /  \
   0   3 -4  -5
   return the node with value 3.
   *
   *
   * **/
  public TreeNode maxNode(TreeNode root) {

    if(root == null ){
      return null;
    }

    TreeNode leftNode = maxNode(root.left);
    TreeNode rightNode = maxNode(root.right);

    if(leftNode != null && rightNode != null){
      if(leftNode.val > rightNode.val){
        return root.val > leftNode.val ? root: leftNode;
      }else{
        return root.val > rightNode.val ? root: rightNode;
      }
    }else if(leftNode != null){
      return root.val > leftNode.val ? root: leftNode;
    }else if(rightNode != null){
      return root.val > rightNode.val ? root: rightNode;
    }else{
      return root;
    }
  }

}
