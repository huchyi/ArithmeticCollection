package com.arithmeticcollection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import com.arithmeticcollection.middle.HouseRobberClass;
import com.arithmeticcollection.utils.Interval;
import com.arithmeticcollection.utils.ListNode;
import com.arithmeticcollection.utils.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

  private String TAG = "hcy";

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    TextView tv = (TextView) findViewById(R.id.main_tv);



    AnagramClass anagramClass = new AnagramClass();
    anagramClass.anagram("aaabcd","cbdaaa");

    //HouseRobberClass houseRobberClass = new HouseRobberClass();
    //houseRobberClass.houseRobber(new int[]{3,8,4,3,4,5,5,6,6,7, 8,7,4,3,5,6,7,8,9,3, 5,4,2});

    //FirstWillWin2Class firstWillWin2Class = new FirstWillWin2Class();
    //firstWillWin2Class.firstWillWin(new int[]{100,200,400,300,400,800,500,600,1200});



    //TrailingZerosClass trailingZerosClass = new TrailingZerosClass();
    //trailingZerosClass.trailingZeros(105);


    //StringPermutationClass stringPermutationClass = new StringPermutationClass();
    //stringPermutationClass.stringPermutation("lliinnttccooddee", "lintcodelintcode");

    ////[[1,3,5,7],[10,11,16,20],[23,30,34,50]], 7
    //SearchMatrixClass searchMatrixClass = new SearchMatrixClass();
    //searchMatrixClass.searchMatrix(new int[][]{
    //    {1,3,5,7},
    //    {10,11,16,20},
    //    {23,30,34,50}
    //},7);


    //ReverseIntegerClass reverseIntegerClass = new ReverseIntegerClass();
    //reverseIntegerClass.reverseInteger(1232314211);


    //*************************************二叉树
    //TreeNode tt = new TreeNode(1);
    //
    //TreeNode tt3 = new TreeNode(3);
    //TreeNode tt22 = new TreeNode(2);
    //
    //TreeNode tt2 = new TreeNode(2);
    //tt2.left = tt22;
    //tt2.right = tt22;
    //
    //tt.left = tt2;
    //
    //TreeNode tt4 = new TreeNode(4);
    //tt4.left = tt3;
    //tt4.right = tt3;
    //
    //tt.right = tt4;
    //
    //FlattenClass aa = new FlattenClass();
    //aa.flatten(tt);



    //
    //PostorderTraversalClass ccc = new PostorderTraversalClass();
    //ArrayList<Integer> aaa = ccc.postorderTraversal(tt);
    //Log.i(TAG,"输出:" + aaa.size());
    ////tv.setText(aaa.val+"");



    //CountAndSayClass tt = new CountAndSayClass();
    //Log.i(TAG,"输出:" + tt.countAndSay(5));

    //**************************************添加数据
    //List<Interval> list = new ArrayList<>();
    //list.add(new Interval(2,3));
    //list.add(new Interval(4,5));
    //list.add(new Interval(6,7));
    //list.add(new Interval(8,9));
    //list.add(new Interval(1,10));
    //MergeIntervalsClass mergeIntervalsClass = new MergeIntervalsClass();
    //mergeIntervalsClass.merge(list);

    /******************链表******************/
    //int[] aa = new int[]{1,3,8,11,15};
    //ListNode head1 = new ListNode(-1);
    //head1.next = null;
    //for (int i = aa.length - 1; i >= 0; i--) {
    //  ListNode listNode = new ListNode(aa[i]);
    //  listNode.next = head1;
    //  head1 = listNode;
    //}
    //
    //int[] bb = new int[]{2};
    //ListNode head2 = new ListNode(-1);
    //head2.next = null;
    //for (int i = bb.length - 1; i >= 0; i--) {
    //  ListNode listNode = new ListNode(bb[i]);
    //  listNode.next = head2;
    //  head2 = listNode;
    //}
    //
    //MergeTwoListsClass mergeTwoListsClass = new MergeTwoListsClass();
    //mergeTwoListsClass.mergeTwoLists(head1,head2);

    /*******************二维数组*********************/

    //int[][] aa = new int[][]{
    //    //{1,2},
    //    //{1,1}
    //
    //    {1,3,1},
    //    {1,5,1},
    //    {4,2,1}
    //
    //    //{1,4,8,6,2,2,1,7},
    //    //{4,7,3,1,4,5,5,1},
    //    //{8,8,2,1,1,8,0,1},
    //    //{8,9,2,9,8,0,8,9},
    //    //{5,7,5,7,1,8,5,5},
    //    //{7,0,9,4,5,6,5,6},
    //    //{4,9,9,7,9,1,9,0}
    //};
    //
    //MinPathSumClass minPathSumClass = new MinPathSumClass();
    //minPathSumClass.minPathSum(aa);

    //MinSubArrayClass minSubArrayClass = new MinSubArrayClass();
    //ArrayList<Integer> list = new ArrayList<>();
    //list.add(1);
    //list.add(-2);
    //list.add(-1);
    //list.add(1);
    //list.add(3);
    //list.add(4);
    //list.add(-3);
    //list.add(-2);
    //list.add(-5);
    //list.add(8);
    ////1,-2,-1,1,3,4,-3,-2,-5,8
    //minSubArrayClass.minSubArray(list);

    //CheckPowerOf2Class checkPowerOf2Class = new CheckPowerOf2Class();
    //checkPowerOf2Class.checkPowerOf2(-512);

    //NumWaysClass numWaysClass = new NumWaysClass();
    //Log.i("hcy","ttt:" + numWaysClass.numWays(3,5));
    //
    //PlusOneClass plusOneClass = new PlusOneClass();
    //plusOneClass.plusOne(new int[]{1,0});

    //RemoveElementClass removeElementClass = new RemoveElementClass();
    //removeElementClass.removeElement(new int[]{0,4,4,0,4,4,4,0,2},4);
  }
}
