import java.util.Arrays;
import java.util.Scanner;

/**
 * Crtated with IntelliJ IDEA.
 * Destcription:
 * User: hp
 * Date: 2021-04-20
 * Time: 20:26
 */
public class Day9 {
    /*

    求阶乘的末尾0的个数
    import java.util.*;
public class Main{
    public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
        //10由2和5相乘得来，只要统计2和5的个数即可
        //但5的个数少，所以末尾0的个数就等于5的个数
        int count=0;//统计出现的5的个数
        while(n>0){
            count+=n/5;
            n/=5;
        }
        System.out.println(count);
    }
}
     */

   /*
   将输入的整数，逆序的字符串输出，如，输入123004，输出400321；
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //如果n小于10，直接输出并返回
        if (n <= 9) {
            System.out.println(n);
            return;
        }
        //不断地取余拼接字符串
        StringBuffer ret = new StringBuffer();
        while (n > 9) {
            ret.append(n % 10);
            n /= 10;
        }
        //退出循环时，n为一个个位数，继续拼接在后面
        ret.append(n);
        System.out.println(ret);
    }
}
