给定两个只包含小写字母的字符串，计算两个字符串的最大公共子串的长度。

注：子串的定义指一个字符串删掉其部分前缀和后缀（也可以不删）后形成的字符串。


import java.util.*;
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            System.out.println(maxlength(s1,s2));
        }
    }
    
   public static int maxlength(String s1,String s2){
        char[] ret1 = s1.toCharArray();
        char[] ret2 = s2.toCharArray();
        int len1 = ret1.length;
        int len2 = ret2.length;
        int max =0;
        int [][] lenmax = new int[len1+1][len2+1];
        for(int i = 1; i<= len1 ;i++){
            for(int j = 1; j<= len2 ;j++){
                if(ret1[i-1] == ret2[j-1]){
  //这里-1是因为我们的状态数组是从【1】【1】开始的，而字符串的下标是从0开始的
                    lenmax[i][j] = lenmax[i-1][j-1] +1;
                         if(lenmax[i][j] > max){
                           max = lenmax[i][j];
                              }
                }
            }

        }
        return max;
    }
}