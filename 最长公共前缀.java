
编写一个函数来查找字符串数组中的最长公共前缀。
import java.util.*;
public class Solution {
  
    public String longestCommonPrefix (String[] strs) {
        // write code here
        if(strs == null || strs.length== 0 ){
            return "";
        }
        int i = 1;
        String pre = strs[0];
        while(i < strs.length){
            while(strs[i].indexOf(pre) != 0){
                pre = pre.substring(0,pre.length()-1);
            }
            //退出循环时，pre为前两个字符串的公共最长前缀
            i++;
            //前缀在和下一个字符串进行比较
        }
        return pre;
    }
}