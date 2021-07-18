练习一（二分查找，有重复值）在普通二分查找的基础上，当找到时，需要再继续往前遍历找到第一个值
请实现有重复数字的升序数组的二分查找
给定一个 元素有序的（升序）整型数组 nums 和一个目标值 target  ，
写一个函数搜索 nums 中的第一个出现的target，如果目标值存在返回下标，否则返回 -1
public class Solution {
 
    public int search (int[] nums, int target) {
        // write code here
        int right = nums.length -1;
        int left = 0;
         int mid = 0;
        while (left <= right){
         mid = (left + right) / 2;
        if(nums[mid] == target){
            //因为有重复值，需要找到第一个
            while(mid != 0 && (nums[mid-1] == nums[mid])){
                mid--;
            }
            return mid;//返回找到的第一个相等下标
           }
            if(nums[mid] < target){
                left = mid +1;
            }
            if( nums[mid] > target){
                right = mid -1;
            }
        }
        return -1;
    }
}

练习二（最近公共祖先）判断这两个节点是否有一个为根节点，直接返回，如果不是，则递归在左右孩子找公共节点
若左右都找到了，返回根，否则哪一个找到了返回哪一个，都没找到返回null

给定一棵二叉树(保证非空)以及这棵树上的两个节点对应的val值 o1 和 o2，
请找到 o1 和 o2 的最近公共祖先节点。
注：本题保证二叉树中每个节点的val值均不相同。
import java.util.*;

public class Solution {
  
    public int lowestCommonAncestor (TreeNode root, int o1, int o2) {
       TreeNode root1 = findFather(root,o1,o2);
        if(root1 == null){
            return -1;
        }else{
            return root1.val;
        }
       
        // write code here
        
    }
    //寻找最近公共祖先，返回节点
    public TreeNode findFather(TreeNode root, int o1, int o2){
        if(root == null){
            return null;
        }
        //若父节点就是其中一个节点直接而返回父节点
        if( root.val == o1 || root.val == o2){
            return root;
        }
        //在左右孩子中找公共节点
        TreeNode left1 = findFather(root.left,o1,o2);
        TreeNode right1 = findFather(root.right,o1,o2);
        //若左右都找到了，则返回父节点，否则哪一个找到了返回哪一个，都没找到返回null
        if(left1 != null && right1 != null){
            return root;
        }else if(left1 == null){
            return right1;
        }else if(right1 == null){
            return left1;
        }else{
            return null;
        }
    }
}

练习三（字符串反转）
写出一个程序，接受一个字符串，然后输出该字符串反转后的字符串。（字符串长度不超过1000）
import java.util.*;
public class Solution {

    public String solve (String str) {
        // write code here
        int len = str.length();
        StringBuilder ret = new StringBuilder();
        for (int i= len -1; i  >= 0 ; i--){
            ret.append(str.charAt(i));
        }
        return new String(ret);
    }
}

练习四（最长无重复子数组）利用set，如果集合中包含了子序列的最右边的值，则从左开始删set的值，值到set中不含子序列的最右边的值
import java.util.*;


public class Solution {
    public int maxLength (int[] arr) {
//         Queue<Integer> queue  = new LinkedList<>();
//         int res = 0;
//         for(int c : arr){
//             while(queue.contains(c)){
//                 queue.poll();
//             }
//             //添加到队尾
//             queue.add(c);
//             res = Math.max(res,queue.size());
//         }
//         return res;
        
        Set<Integer> set = new HashSet<>();
        int left = 0 ,right = 0 ,max = 0;
        //left表示子序列的左边，right表示右边
        //从前往后遍历数组，若集合中已经有值，则开始从子序列的左边开始删值，
        //直到集合中没有这个值
        while ( right < arr.length){
            if( set.contains(arr[right])){
                set.remove(arr[left++]);
            }else{
                set.add(arr[right++]);
                max =Math.max(max,set.size());
            }
        }
        return max;
    }
}
联系五（最长回文字串）

import java.util.*;

public class Solution {
    public int getLongestPalindrome(String A, int n) {
        // write code here
        int max = 0;//最长子串的长度
        for (int i =0 ; i< n ;i++){
            //i表示起点，j表示重点
            for(int j =i ; j < n ; j++){
            String s = A.substring(i,j + 1);
                if(rev(s)){
                    max = Math.max(max,j -i + 1);
                }
        }
        }
        return max;
    }
    
    public boolean rev(String A){
        StringBuffer ret = new StringBuffer(A);
        return A.equals(new String(ret.reverse()));
    }
}

练习六
请你查找各个部门当前领导的薪水详情以及其对应部门编号dept_no，输出结果以salaries.emp_no升序排序，
并且请注意输出结果里面dept_no列是最后一列，以上例子输出如下:
select s.emp_no, s.salary, s.from_date, s.to_date, d.dept_no
from dept_manager d, salaries s
where d.emp_no=s.emp_no
order by s.emp_no;

select s.*, d.dept_no
from salaries s inner join dept_manager d on s.emp_no=d.emp_no
order by s.emp_no

练习七

请你查找所有已经分配部门的员工的last_name和first_name以及dept_no，未分配的部门的员工不显示，以上例子如下:
select e.last_name ,e.first_name , d.dept_no 
from employees e,dept_emp d
where e.emp_no = d.emp_no