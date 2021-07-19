练习一（求和为给定值得路径）
给定一个二叉树和一个值\ sum sum，请找出所有的根节点到叶子节点的节点值之
和等于\ sum sum 的路径，
import java.util.*;


public class Solution {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> pathSum (TreeNode root, int sum) {
        // write code here
        findPath(root,sum);
        return ret;
    }
        public void findPath(TreeNode root ,int sum){
            if(root == null ){
            return ;
             }
            //跟不为空，将值加到路径中
            path.add(root.val);
            sum -= root.val;//和减减
            //如果遍历完，且和变为0，说明是一个符合的路径
            if(sum == 0 && root.left == null && root.right == null){
                ret.add(new ArrayList<>(path));
            }else{
                //没遍历完，递归遍历左右子树
                findPath(root.left,sum);
                findPath(root.right,sum);
            }
            //删除路径的最后值，当递归出去时，path为空，相当于一个新的ArrayList
            path.remove(path.size() - 1); 
           
        }
}

练习二（两个链表生成相加链表） 

假设链表中每一个节点的值都在 0 - 9 之间，那么链表整体就可以代表一个整数。
给定两个这种链表，请生成代表两个整数相加值的结果链表。
例如：链表 1 为 9->3->7，链表 2 为 6->3，最后生成新的结果链表为 1->0->0->0。
import java.util.*;

public class Solution {
   
    public ListNode addInList (ListNode head1, ListNode head2) {
        // write code here
        head1 = reverse(head1);
        head2 = reverse(head2);
        ListNode head = new ListNode(-1);//辅助有节点
        ListNode cur = head;//用于构建要返回的链表
        int carry = 0;//表示进位
        while(head1 != null || head2 != null){
            int val = carry;
            if(head2 != null){
                val += head2.val;
                head2 = head2.next;
            }
            if(head1 != null){
                val += head1.val;
                head1 = head1.next;
            }
            //上面执行完时，val 的值为进位与对应位置的两个数的和
            cur.next = new ListNode(val % 10);
            carry = val / 10;
            cur = cur.next;
        }
        //循环结束时，两个链表都为空，但有可能进位的值还没有加进去
        if(carry != 0){
            cur.next = new ListNode(carry);
        }
        return reverse(head.next);
    }
    public ListNode reverse(ListNode root){
        ListNode cur = root;
        ListNode pre = null;
            while(cur != null){
                ListNode curNext = cur.next;
                cur.next = pre;
                pre = cur ;
                cur = curNext;
            }
        return pre;
    }
}

练习题三（买卖股票的最好时机）
假设你有一个数组，其中第\ i i 个元素是股票在第\ i i 天的价格。
你有一次买入和卖出的机会。（只有买入了股票以后才能卖出）。请你设计一个
算法来计算可以获得的最大收益。
import java.util.*;
public class Solution {
    
    public int maxProfit (int[] prices) {
        // write code here
        int len = prices.length;
        int max = 0;
        //第一天的话不赚也不亏
        if(len <= 1){
            return 0;
        }
        //第一层循环，表示买入时的价格
        for( int i = 0 ; i < len -1; i++){
            int temp = prices[i];
            //第二层循环表示那天要卖出去
            for(int j = i+1 ; j < len ;j++){
                if((prices[j] - temp) > max ){
                    max = prices[j] - temp;
                }
               
            }
        }
        return max;
    }
}

练习四（大数相加）
以字符串的形式读入两个数字，编写一个函数计算它们的和，以字符串形式返回。
（字符串长度不大于100000，保证字符串仅由'0'~'9'这10种字符组成）
import java.util.*;
public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 计算两个数之和
     * @param s string字符串 表示第一个整数
     * @param t string字符串 表示第二个整数
     * @return string字符串
     */
    public String solve (String s, String t) {
        // write code here
        StringBuilder  ret = new StringBuilder();
        int i = s.length() - 1,  j = t.length()- 1;
        int carry = 0;//进位
        int x , y , sum;
        //从后往前遍历两个字符串
        while(i >= 0 || j >= 0){
           x = i < 0 ? 0 : s.charAt(i--) - '0';
           y = j < 0 ? 0 : t.charAt(j--) - '0';
            sum = carry + x + y;
            ret.append(sum % 10);
                carry = sum / 10;
        }
        //退出循环，判断进位
        if(carry > 0){
            ret.append(carry);
        }
        //返回结果
        return new String(ret.reverse());
    }
}


练习五（数组中只出现一次的数字）
给定一个整型数组 arrarr 和一个整数 k(k>1)k(k>1)。
已知 arrarr 中只有 1 个数出现一次，其他的数都出现 kk 次。
请返回只出现了 1 次的数。
import java.util.*;
public class Solution {
    public int foundOnceNumber (int[] arr, int k) {
        // write code here
        Arrays.sort(arr);
        for (int i = 0 ; i< arr.length -1 ; i ++){
            if(arr[i] == arr[i+1]){
                i += k -1;//减1是因为待会for循环也会加1，所以这里要减
            }else{
                return arr[i];
            }
        }
        return arr[arr.length-1];
    }
}

练习六
请你查找所有已经分配部门的员工的last_name和first_name以及dept_no，
也包括暂时没有分配具体部门的员工，以上例子如下
select c.last_name , c.first_name , de.dept_no from employees c 
left join dept_emp de 
on c.emp_no = de.emp_no

练习七
请你查找薪水记录超过15次的员工号emp_no以及其对应的记录次数t，以上例子输出如下:
select c.emp_no , count() as t from salaries c group by c.emp_no having t > 15