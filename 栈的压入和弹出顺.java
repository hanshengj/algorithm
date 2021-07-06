输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列
是否为该栈的弹出顺序。假设压入栈的所有数字均不相等。例如，
序列 {1,2,3,4,5} 是某栈的压栈序列，序列 {4,5,3,2,1} 是该压栈序列对应的一个弹出序列，
但 {4,3,5,1,2} 就不可能是该压栈序列的弹出序列。


class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
   
//借助辅助栈
Stack <Integer> stack = new Stack<>();
int i= 0 ;//用来记录弹出栈的顺序
for(int num : pushed){
    stack.push(num);
    while(!stack.isEmpty() && stack.peek() == popped[i]){
        //如果栈顶的元素和出栈顺序相对应，且栈不为空则一直往后遍历出栈的数组，
        //并将辅助栈里的元素弹出
        stack.pop();
        i++;
    }
}
//判断栈是否为空
return stack.isEmpty();
    }
}