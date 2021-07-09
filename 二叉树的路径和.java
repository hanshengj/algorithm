
输入一棵二叉树和一个整数，打印出二叉树中节点值的和为输入整数的所有路径。从树的根节点开始往下一直到叶节点所经过
的节点形成一条路径。

class Solution {
    LinkedList<List<Integer>> ret = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
         request(root,target);
         return ret;
    }
    public void request(TreeNode root,int tar){
        if(root == null)
        return ;
        path.add(root.val);
        tar -= root.val;
        if(tar == 0 && root.left ==null && root.right == null){
            ret.add(new LinkedList(path));
        }
            request(root.left,tar);
            request(root.right,tar);
            path.removeLast();
        
    }
}