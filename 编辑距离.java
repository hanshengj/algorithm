给定两个单词word1和word2，请计算将word1转换为word2至少需要多少步操作。
你可以对一个单词执行以下3种操作：
a）在单词中插入一个字符
b）删除单词中的一个字符
c）替换单词中的一个字符


import java.util.*;
public class Solution {
    /**
     * 
     * @param word1 string字符串 
     * @param word2 string字符串 
     * @return int整型
     */
    public int minDistance (String word1, String word2) {
        
        // write code here
        int len1 = word1.length();
        int len2 = word2.length();
        if(word1.isEmpty() || word2.isEmpty()){
            return Math.max(len1,len2);
        }
        int [][]ret = new int[len1+1][len2+1];
        
        //初始化
        for(int i =0;i<=len1;i++){
            ret[i][0] = i;
        }
        for (int j =0;j<=len2;j++){
            ret[0][j]=j;
        }
        
        for (int i=1;i<=len1;i++){
            for (int j=1;j<=len2;j++){
                //选取通过插入或者删除选择最小的步数
                ret[i][j] = Math.min(ret[i-1][j],ret[i][j-1]) + 1;
                
                //替换时分两种情况 一是相等不需要替换，而是真的需要替换
                // 判断word1的第i个字符是否与word2的第j个字符相等
                if(word1.charAt(i-1) == word2.charAt(j-1)){
//                     // 字符相等，F(i-1,j-1)编辑距离不变
                    ret[i][j] = Math.min(ret[i][j],ret[i-1][j-1]);
                }else{
                    // 字符不相等，F(i-1,j-1)编辑距离 + 1
                    ret[i][j] = Math.min(ret[i][j],ret[i-1][j-1]+1);
                }
            }
        }
        return ret[len1][len2];
    }
}