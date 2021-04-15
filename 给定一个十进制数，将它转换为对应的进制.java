给定一个十进制数，将它转换为对应的进制
import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        //定义进制数组
        char [] ret=new char[]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        StringBuffer sb=new StringBuffer();
        boolean flag = false;//正负数的标记位
        while(a!=0){
            //如果a为负数，将它变为整数，标志位为true
            if(a < 0) {
                a = -a;
                flag = true;
            }
            sb.append(ret[a%b]);
            a/=b;
        }
        if(flag){
            sb.append("-");
        }
        sb.reverse();
        System.out.println(sb.toString());
    }
}