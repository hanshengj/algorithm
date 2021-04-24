import java.util.Arrays;

/**
 * Crtated with IntelliJ IDEA.
 * Destcription:
 * User: hp
 * Date: 2021-04-24
 * Time: 15:45
 */
public class Day3 {

/*


读入一个字符串str，输出字符串str中的连续最长的数字串

方法一


import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String ss=sc.nextLine();
        StringBuffer cur=new StringBuffer();//当前的数字字符串
        StringBuffer ret=new StringBuffer();//最大长度的数字字符串

        for(int i=0;i<ss.length();i++){
            //如果是数字则加到当前的串中
            if(ss.charAt(i)>='0'&&ss.charAt(i)<='9'){
                cur.append(ss.charAt(i));
            }else{
                //不是数字的话表示当前的拼接已经完成，选取最长字符串
                if(cur.length()>ret.length()){
                    ret=cur;
                }
                //每一个数字字符串的子串找完后就将其置空，便于下一个子串的拼接
                cur=new StringBuffer();
            }
        }
        //判断最后一个子串是不是最长的，因为最后i跳出循环后，最后的一个子串还没有进行比较
        if(cur.length()>ret.length()){
            ret=cur;
        }
        //输出最长的子串
        System.out.println(ret.toString());
    }
}

方法二
import java.util .*;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String ret = sc.nextLine();
            int n = ret.length();
            int[] ary = new int[n];//用于存数字字符串的起始位置和结束位置
            int start = 0; //遍历字符串，找出所有的数字字符串的起始位置对
            for (int i = 0; i < n; i++) {
                if (Character.isDigit(ret.charAt(i))) {
                    ary[start] = i;//如果是数字，则将开始下标保存
                    start++;
                    while (i < n && Character.isDigit(ret.charAt(i))) {
                        i++;
                    }

                //while循环结束，指向数字字符串后的第一个字符，所以下别保存结束位置要-1
                ary[start] = i - 1;//将结束位置保存

                 start++;

                 }
        }
        //for循环结束，则将所有的起始位置都存在ary数组中
        // 求最大长度数字字符串的开始下标
        //
        int max = 0; //记录最长子串的长度
        for(int i = 0;i<ary.length-1;i++){
            if ((ary[i + 1] - ary[i]) > max) {
                max = ary[i + 1] - ary[i];
                start = i;//记录最长子串的开始位置
            }
            i++;
        }

        String s = ret.substring(ary[start], ary[start + 1] + 1);//因为该函数截取是左开右闭的，即最后的一个字符取不到，所以要+1
        System.out.println(s);
    }
}


数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，
超过数组长度的一半，因此输出2。如果不存在则输出0。


方法一，投票法
import java.util.*;
public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array==null ||array.length==0){
            return 0;
        }

        int number=1;//表示票数
        int most=array[0];//表示为众数
        for(int i=1;i<array.length;i++){
            //number==0表示当前没有众数
            if(number==0){
                most=array[i];
                number=1;
            }else{
                if(array[i]==most){
                    number++;//票数加1
                }else{
                    number--;//票数减1
                }
            }
        }
        //退出循环是，如果众数存在，则假设的那个众数就是众数，但也可能原本就没有众数
        //所以要进一步的确认
        number=0;
        for(int x:array){
            if(x==most){
                number++;
            }
        }
        return number>array.length/2 ?most:0;

    }
}


方法二，
先将数组排序，如果众数存在，则排序后数组中间的那个数就是众数，但有可能众数就不存在，所以要进行统计
import java.util .*;

    public class Solution {
        public int MoreThanHalfNum_Solution(int[] array) {
            if (array == null || array.length == 0) {
                return 0;
            }
            Arrays.sort(array);
            int len = array.length;
            int midNum = array[len / 2];//求得排序后，数组中间的那个数
            int count = 0;//统计中间的这个数出现的次数
            for (int i = 0; i < len; i++) {
                if (array[i] == midNum) {
                    count++;
                }
            }
            //如果次数大于数组长度的一半，表名这个数就是众数
            if (count > len / 2) {
                return midNum;
            }
            return 0;
        }
    }

 */

}
