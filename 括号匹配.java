括号匹配问题
给定一个字符串A和其长度n，请返回一个bool值代表它是否为一个合法的括号串（只能由括号组成）。


import java.util.*;

public class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        // write code here
        //括号不是成对出现
        if( n % 2 != 0){
            return false;
        }
        //定义一个站来存储数据
        Stack<Character> ret=new Stack<>();
        for (char c:A.toCharArray()){
            //1、如果是左括号，就入栈
            if( c =='('){
                ret.push(c);

            }else if(c==')'){
                //2、如果为右括号，看栈是否为空，
                if (ret.isEmpty()){
                    return false;//右括号比左括号多,或者右括号比左括号先出现
                }else if(ret.peek()== '('){
                    ret.pop();//栈不为空，且栈顶元素为左括号，出栈
                }
            }else {
                return false;//出现了不是括号的字符
            }
        }

        //当字符串遍历完时，如果栈不为空，则说明左括号比右括号多，为空说明刚好匹配完
        return ret.isEmpty();
    }
}