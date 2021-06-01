字符串计数

题目描述
求字典序在s1和s2之间的，长度在len1到len2的字符串的个数，结果mod1000007.
输入描述:
每组数据包函s1（长度小于100) ,s2（长度小于100）， len1（小于100000 ) , len2
(大于1en1，小于100000)


import java.util.*;
public class Main{
 public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String s = scan.nextLine();
            String[] array = s.split(" ");
         
            int min = Integer.parseInt(array[2]);
            int max = Integer.parseInt(array[3]);
            char[] ar = array[0].toCharArray();
            char[] br = array[1].toCharArray();
            long sum = 0;//统计总的个数
            for (int i = min; i <= max; i++) {
                //先分别取出第一个字符
                char a=ar[0];
                char b=br[0];
               sum  += (long)Math.pow(26,i-1)*(b-a);
                long suma = 0;
                long sumb = 0;
                for (int j = 1; j < ar.length; j++)// 找到比ar剩余字符串小的字符串个数
                {
                    suma = suma + (ar[j] - 'a') * (long) Math.pow(26, i- 1 - j);
                }
                for (int j = 1; j < br.length; j++)// 找到比br剩余字符串小的字符串个数
                {
                    sumb = sumb + (br[j] - 'a') * (long) Math.pow(26, i - 1 - j);
                }
             
                sum = sum + sumb-suma;
            }
            sum--;
            System.out.println(sum % 1000007);
        }
 
    }
 
}
