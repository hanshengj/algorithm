从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。

class Solution {
    public int[] levelOrder(TreeNode root) {
        if (root == null) // 空树则返回空数组
            return new int[0];
        Queue<TreeNode> q = new LinkedList<> (); // 借助一个队列，通过 BFS 实现按层遍历二叉树
        ArrayList<Integer> tmp =new ArrayList<> (); // 申请一个动态数组 ArrayList 动态添加节点值
        
        q.offer(root); // 根结点先入队
        while (q.size() != 0) {
            TreeNode node = q.poll(); // 取出当前队首元素
            tmp.add(node.val); 
            if(node.left != null) q.offer(node.left); // 左子节点入队
            if(node.right != null) q.offer(node.right); // 右子节点入队
        }

        // 将 ArrayList 转为 int数组并返回
        int[] res = new int[tmp.size()];
        for (int i=0; i<res.length; i++) {
            res[i] = tmp.get(i);
        }
        return res;
    }
}
