
练习一（最小的K个数）
import java.util.*;

public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> ret = new ArrayList<>();
        if (k==0 || k > input.length) return ret;
        //创建优先级队列，实现大根堆，要传入比较器
        PriorityQueue<Integer> bigHeap = new PriorityQueue<>(k,new Comparator<Integer>(){
            public int compare(Integer o1 ,Integer o2){
                return o2 - o1;
            }
        });
        //遍历数组，找到最小的K个数
        for (int i = 0 ;i < input.length ; i++){
            if(bigHeap.size() < k){
                bigHeap.offer(input[i]);
            }else{
                Integer top = bigHeap.peek();
                if(top != null){
                    if(input[i] < top){
                        bigHeap.poll();
                       bigHeap.offer(input[i]);
                    }
                }
            }
        }
       //取出这K个数
        int[] s =new int[k];
        for (int i = k -1; i >= 0 ; i--){
            s[i] = bigHeap.poll();
        }
        //将这K个数加到链表中
        for (int i = 0; i < k ; i++){
            ret.add(s[i]);
        }
        return ret;
    }
}

练习二（接雨水问题）

import java.util.*;


public class Solution {
 

public static long maxWater(int[] arr) {
    if (arr == null || arr.length <= 2) {
        return 0;
    }
    int left = 0, right = arr.length - 1;
    long sum = 0;
    // 找出左右边界的最小值作为水位高度
    int mark = Math.min(arr[left], arr[right]);
    while (left < right) {
        // 如果左边较低，则左边界向右遍历， 否则右边界向左移动
        if (arr[left] < arr[right]) {
            left++;
            // 如果当前标尺小于水位，则水量累加
            if (arr[left] < mark) {
                sum += mark - arr[left];
            } else { // 否则，将此标尺和右边边界高度进行比较，找出剩下数组中的新水位
                mark = Math.min(arr[left], arr[right]);
            }
        } else {
            right--;
            // 同理，如果当前标尺小于水位，则水量累加
            if (arr[right] < mark) {
                sum += mark - arr[right];
            } else { // 否则，将此标尺和左边界的高度进行比较，找出剩余数组中的新水位
                mark = Math.min(arr[right], arr[left]);
            }
        }
    }
    return sum;
}
  
}

练习三（求平方根）
import java.util.*;


public class Solution {
    /**
初始范围为1，x
2.当middle*middle <= x && (middle+1)*(middle+1) > x时，返回结果
3.当middle*middle < x时，到右半部分继续寻找
4.当middle*middle > x时，到左半部分继续寻找
     */
    public int sqrt (int x) {
        // write code here
        if(x <= 0 ){
            return 0;
        }
        int left = 1,right = x;
        while(true){
            int mid  = (left + right) >> 1;
            if(mid <= x / mid && (mid +1) > x / (mid +1)){
                return (int) mid;
            }else if(mid < x / mid){
                left = mid + 1;
                
            }else{
                right = mid - 1;
            }
        }
    }
}

练习四（删除链表中的重复值）
给出一个升序排序的链表，删除链表中的所有重复出现的元素，只保留原链表中只出现一次的元素。
例如：
给出的链表为1 \to 2\to 3\to 3\to 4\to 4\to51→2→3→3→4→4→5, 返回1\to 2\to51→2→5.
给出的链表为1\to1 \to 1\to 2 \to 31→1→1→2→3, 返回2\to 32→3.
import java.util.*;


public class Solution {
   
    public ListNode deleteDuplicates (ListNode head) {
        // write code here
        if(head == null || head.next == null) return head;
        ListNode newhead = new ListNode(-1);
        newhead.next = head;
        ListNode cur = head,pre = newhead;
        while( cur != null){
            //如果链表的下一个节点不为空，且当前节点的值等于下一个节点的值，继续往后遍历
            if(cur.next != null && cur.val == cur.next.val ){
                while(cur.next != null && cur.val == cur.next.val ){
                    cur= cur.next;
                }
                pre.next = cur.next;
                cur = cur.next;
            }else{
                //不相等时，前驱和当前节点都往后遍历
                 pre = cur;
                cur = cur.next;
            }
           
        }
        return newhead.next;
    }
}

练习五（判断一个链表是否为回文结构）

import java.util.*;

public class Solution {
    public boolean isPail (ListNode head) {
        // write code here
        //先快慢指针找到中间节点
        ListNode fast = head ,slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast == null){
            //说明这个列表为偶数个，中间节点需要在往后移一下
            slow = slow.next;
            
        }
        //反转链表的后半部分
        slow = reverse(slow);
        fast = head;
        while(slow != null){
            if(fast.val != slow.val){
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }
    //链表反转
    public ListNode reverse(ListNode root){
        ListNode pre = null ,cur = root;
        while(cur != null){
            ListNode curnext = cur.next;
            cur.next = pre;
            pre = cur ;
            cur = curnext;
        }
        return pre;
    }
}

练习六
请你找出所有员工具体的薪水salary情况，对于相同的薪水只显示一次,并按照逆序显示
select distinct salary from salaries order by salary desc


练习七
请你找出所有非部门领导的员工emp_no，以上例子输出:
select emp_no from employees where emp_no not in (select emp_no from dept_manager)

SELECT e.emp_no FROM employees AS e LEFT JOIN dept_manager AS d
ON e.emp_no=d.emp_no
WHERE dept_no IS NULL;