package com.flexible.ioc;

import com.flexible.TreeNode;

public class Solution {
    static int maxLevel(TreeNode root){
        return root==null?0:(Math.max(maxLevel(root.left),maxLevel(root.right))+1);
    }
 public static void main(String[] args){
    TreeNode root=new TreeNode(5);
    root.left=new TreeNode(4);
    TreeNode right=new TreeNode(3);

    root.right=right;
    right.left=new TreeNode(2);
     right.right=new TreeNode(2);
     int result=maxLevel(root);
     System.out.println(result);
 }
}
