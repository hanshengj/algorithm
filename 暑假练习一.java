练习一（合并两个有序数组），从数组的左后一个位置往前选最大的值，再将不为空的数组值全部复制过来

输入：
[4,5,6],[1,2,3]
返回值：
[1,2,3,4,5,6]
说明：
A数组为[4,5,6]，B数组为[1,2,3]，后台程序会预先将A扩容为[4,5,6,0,0,0]，B还是为[1,2,3]，m=3，n=3，
传入到函数merge里面，然后请同学完成merge函数，将B的数据合并A里面，最后后台程序输出A数组 

public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        int index,anum = m -1, bnum = n-1;
        for ( index = m + n -1 ; anum >=0 && bnum >=0 ; index--){
            A[index] = A[anum] > B[bnum] ? A[anum--] : B[bnum--];
            //这里执行了哪一个，哪一个--才起效果
        }
        //退出循环可能是A到头了也可能是B大头了，B到头时不用管，A到头时，
        //要将B拷贝到A中
        while(bnum >= 0){
            A[bnum] = B[bnum--];
        }
    }
}

练习二（用量两个栈来实现队链）一个只用来入栈，一个只用来出栈

用两个栈来实现一个队列，分别完成在队列尾部插入整数(push)和在队列头部删除整数(pop)的功能。
 队列中的元素为int类型。保证操作合法，即保证pop操作时队列内已有元素。


import java.util.Stack;

public class Solution {
    //栈1用来入队，栈2用来出队
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    //直接入队
    public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {
        //先判断栈是否为空
        if(empty()){
            return -1;
        }
        //栈为空，将栈1的数据全部放到栈2中
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            } 
        }
        //弹出栈2的栈顶元素
         return stack2.pop();
    }
    public boolean empty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }
}

练习三（连续子数组的最大和）


给定一个数组arr，返回子数组的最大累加和
例如，arr = [1, -2, 3, 5, -2, 6, -1]，所有子数组中，[3, 5, -2, 6]可以累加出最大的和12，所以返回12.
题目保证没有全为负数的数据
[要求]
时间复杂度为O(n)O(n)，空间复杂度为O(1)O(1)
import java.util.*;


public class Solution {
    /**
     * max sum of the subarray
     * @param arr int整型一维数组 the array
     * @return int整型
     */
    public int maxsumofSubarray (int[] arr) {
        // write code here
        int max = 0;
        //只有一个数的时候，直接返回
        if(arr.length == 1){
            return arr[0];
        }
        for (int i = 1; i <arr.length ; i++){
            if(arr[i-1] > 0){
                //如果前一个数大于0，就将这个数加上作为当前下标的新值
                arr[i] += arr[i-1];
            }
            if(arr[i] > max){
                //如果新值比最大和大，则进行交换
                max = arr[i];
            }
        }
        return max;
    }
}

练习四（链表入环的第一个节点）快慢指针法
给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，返回null。


/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if(pHead == null ){
            return null;
        }
        ListNode fast = pHead;
        ListNode slow = pHead;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                break;
            }
        }
        //退出循环可能是因为快慢指针相遇了，这是表示有环，
        //也可能是快指针走完了，没环,所以在这里需要进行判断
        if(fast == null || fast.next == null){
            return null;
        }
        //慢指针从头开始，快指针减慢步伐
        slow = pHead;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }
}
方法二，Set法
Set<ListNode> ret = new HashSet<>();
        while(pHead != null){
            if(ret.contains(pHead)){
                return pHead;
            }
            ret.add(pHead);
            pHead = pHead.next;
        }
        return null;

练习五（括号是否成对匹配）
给出一个仅包含字符'(',')','{','}','['和']',的字符串，判断给出的字符串是否是合法的括号序列
括号必须以正确的顺序关闭，"()"和"()[]{}"都是合法的括号序列，但"(]"和"([)]"不合法。
import java.util.*;


public class Solution {
    /**
     * 
     * @param s string字符串 
     * @return bool布尔型
     */
    public boolean isValid (String s) {
        int index = s.length();
        // write code here
        Stack<Character> stack = new Stack<>();
        char[] ret = s.toCharArray();
        for( int i = 0 ; i< index ; i++){
            if( ret[i] == '(' || ret[i] == '[' || ret[i] == '{'){
                stack.push(ret[i]);
            }
            if(ret[i] == ')' || ret[i] == '}' || ret[i] == ']'){
                if(stack.isEmpty()){
                    return false;
                    //右括号多
                }
                if((ret[i] == ')' && stack.peek()=='(')  || 
                    (ret[i] == '}' && stack.peek()== '{') || 
                    (ret[i] == ']' && stack.peek()== '[') ){
                    stack.pop();
                }
            }
        }
        //栈不为空说明左括号比较多
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}



练习六（SQL查询）
请你查找employees里最晚入职员工的所有信息，以上例子输出如下
# select * from employees 
# where hire_date = (select max(hire_date) from employees);

select * from employees order by hire_date desc limit 1;
练习七
请你查找employees里入职员工时间排名倒数第三的员工所有信息，以上例子输出如下:
select * from employees order by hire_date desc limit 2,1;
（select* from test LIMIT 3;
当 limit后面跟一个参数的时候，该参数表示要取的数据的数量。 表示直接取前三条数据，类似sqlserver里的top语法。
1.select* from test LIMIT 1,3;
当limit后面跟两个参数的时候，第一个数表示要跳过的数量，后一位表示要取的数量。
 2.select * from test LIMIT 3 OFFSET 1;(在mysql 5以后支持这种写法)
当 limit和offset组合使用的时候，limit后面只能有一个参数，表示要取的的数量,offset表示要跳过的数量 。）