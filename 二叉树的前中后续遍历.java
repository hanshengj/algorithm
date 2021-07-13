
分别按照二叉树先序，中序和后序打印所有的节点。

import java.util.*;

/*
 * public class TreeNode {
 *   int val = 0;
 *   TreeNode left = null;
 *   TreeNode right = null;
 * }
 */

public class Solution {
    /**
     * 
     * @param root TreeNode类 the root of binary tree
     * @return int整型二维数组
     */
        int n = 0;
    int [][] ret;
    public int[][] threeOrders (TreeNode root) {
        // write code here
        n = count(root);
        ret =new int[3][n];
        preOrder(root);
        midOrder(root);
        lastOrder(root);
        return ret;
        
    }
    //求树的节点 个数
    public int count(TreeNode root){
        if(root == null){
            return n;
        }else{
            n++;
            count(root.left);
            count(root.right);
        }
        return n;
        
    }
    //前序遍历
    int prev = 0;
    public void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        ret[0][prev++] = root.val;
        preOrder(root.left);
        preOrder(root.right);
    }
    //中序遍历
    int or = 0;
    public void midOrder(TreeNode root){
        if(root == null){
            return;
        }
        midOrder(root.left);
        ret[1][or++] = root.val;
        midOrder(root.right);
    }
    //后续遍历
    int last = 0;
    public void lastOrder(TreeNode root){
        if(root == null){
            return ;
        }
        lastOrder(root.left);
        lastOrder(root.right);
        ret[2][last++]  = root.val;
    }
}