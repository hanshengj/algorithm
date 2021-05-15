
链接：https://www.nowcoder.com/questionTerminal/5f3b7bf611764c8ba7868f3ed40d6b2c
来源：牛客网

给定一个字符串s和一组单词dict，判断s是否可以用空格分割成一个单词序列，使得单词序列中所有的单词都是dict中的单词（序列可以包含一个或多个单词）。
例如:
给定s=“nowcode”；
dict=["now", "code"].
返回true，因为"nowcode"可以被分割成"now code".

import java.util.*;
public class Solution {
    public boolean wordBreak(String s, Set<String> dict) {
        if(s == null || s.length()==0){
            return false;
            
        }
        boolean [] canBreak = new boolean[s.length()+1];
        
        //canBreak数组用来存子串是否可以被拆分，下标为0的空间为辅助空间，用不到
        for (int i= 1; i<= s.length(); i++){
            //先来判断整体可不可以
            //[1,i)左闭右开
            if(dict.contains(s.substring(0,i))){
                canBreak[i]=true;
                continue;
            }
            
            //整体不行的话就要看可不可以进行局部划分
            //即满足条件j<i && f(j) && f(j+1,i)
            for (int j=1;j<i ;j++){
                //字符串的截取是从下标0开始的，而我们定义的数组则是从下标1开始的，
                //下标为0的没有用到
                if(dict.contains(s.substring(j,i)) && canBreak[j]){
                    canBreak[i]=true;
                    break;
                }
            }
        }
        return canBreak[s.length()];
    }
}